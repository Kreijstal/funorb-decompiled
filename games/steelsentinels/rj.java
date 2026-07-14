/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rj {
    private long field_a;
    static int field_j;
    private long field_e;
    private int field_g;
    static cm field_d;
    private long field_i;
    private long field_o;
    private sn field_q;
    private byte[] field_n;
    private long field_l;
    private byte[] field_p;
    static String field_c;
    private long field_f;
    static int field_b;
    static String[] field_m;
    private int field_h;
    static cm field_k;

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
                    var14 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 + param3 > param1.length) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param1.length + (param2 + param3));
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1L == ((rj) this).field_a) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((rj) this).field_l < ((rj) this).field_a) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((long)param2 + ((rj) this).field_l <= (long)((rj) this).field_h + ((rj) this).field_a) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ii.a(((rj) this).field_p, (int)(-((rj) this).field_a + ((rj) this).field_l), param1, param3, param2);
                        ((rj) this).field_l = ((rj) this).field_l + (long)param2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        var5_long = ((rj) this).field_l;
                        var7 = param3;
                        var8 = param2;
                        if ((((rj) this).field_l ^ -1L) > (((rj) this).field_i ^ -1L)) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((long)((rj) this).field_g + ((rj) this).field_i ^ -1L) < (((rj) this).field_l ^ -1L)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = (int)((long)((rj) this).field_g + -((rj) this).field_l - -((rj) this).field_i);
                        if (var9_int > param2) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9_int = param2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ii.a(((rj) this).field_n, (int)(((rj) this).field_l + -((rj) this).field_i), param1, param3, var9_int);
                        param3 = param3 + var9_int;
                        ((rj) this).field_l = ((rj) this).field_l + (long)var9_int;
                        param2 = param2 - var9_int;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param2 > ((rj) this).field_n.length) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((param2 ^ -1) < -1) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.b(-84);
                        var9_int = param2;
                        if (((rj) this).field_g < var9_int) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9_int = ((rj) this).field_g;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ii.a(((rj) this).field_n, 0, param1, param3, var9_int);
                        param3 = param3 + var9_int;
                        param2 = param2 - var9_int;
                        ((rj) this).field_l = ((rj) this).field_l + (long)var9_int;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((rj) this).field_q.a(((rj) this).field_l, -1);
                        ((rj) this).field_e = ((rj) this).field_l;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((param2 ^ -1) >= -1) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var9_int = ((rj) this).field_q.a(param1, param3, param2, false);
                        if (var9_int == -1) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        param2 = param2 - var9_int;
                        param3 = param3 + var9_int;
                        ((rj) this).field_l = ((rj) this).field_l + (long)var9_int;
                        ((rj) this).field_e = ((rj) this).field_e + (long)var9_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((((rj) this).field_a ^ -1L) == 0L) {
                            statePc = 55;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((rj) this).field_l >= ((rj) this).field_a) {
                            statePc = 36;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (param2 <= 0) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9_int = param3 + (int)(-((rj) this).field_l + ((rj) this).field_a);
                        if (param3 - -param2 < var9_int) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9_int = param2 + param3;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (param3 >= var9_int) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param3++;
                        param1[param3] = (byte) 0;
                        param2--;
                        ((rj) this).field_l = ((rj) this).field_l + 1L;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = -1L;
                        if (((rj) this).field_a < var5_long) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (((rj) this).field_a < (long)var8 + var5_long) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((var5_long ^ -1L) > (((rj) this).field_a ^ -1L)) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (((rj) this).field_a - -(long)((rj) this).field_h > var5_long) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var9 = var5_long;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var9 = ((rj) this).field_a;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var11 = -1L;
                        if ((long)((rj) this).field_h + ((rj) this).field_a <= var5_long) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((((rj) this).field_a + (long)((rj) this).field_h ^ -1L) < ((long)var8 + var5_long ^ -1L)) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11 = (long)((rj) this).field_h + ((rj) this).field_a;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var5_long - -(long)var8 <= ((rj) this).field_a) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((((rj) this).field_a + (long)((rj) this).field_h ^ -1L) > (var5_long + (long)var8 ^ -1L)) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (-1L >= var9) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var9 >= var11) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var13 = (int)(-var9 + var11);
                        ii.a(((rj) this).field_p, (int)(var9 + -((rj) this).field_a), param1, var7 - -(int)(-var5_long + var9), var13);
                        if ((((rj) this).field_l ^ -1L) > (var11 ^ -1L)) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        param2 = (int)((long)param2 - (-((rj) this).field_l + var11));
                        ((rj) this).field_l = var11;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (param0 == 115) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        ((rj) this).field_o = -101L;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 58: {
                    var5 = (IOException) (Object) caughtException;
                    ((rj) this).field_e = -1L;
                    throw var5;
                }
                case 59: {
                    if (-1 <= (param2 ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    throw new EOFException();
                }
                case 61: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = SteelSentinels.field_G;
          if ((((rj) this).field_a ^ -1L) != 0L) {
            L1: {
              if ((((rj) this).field_a ^ -1L) != (((rj) this).field_e ^ -1L)) {
                ((rj) this).field_q.a(((rj) this).field_a, -1);
                ((rj) this).field_e = ((rj) this).field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((rj) this).field_q.a(((rj) this).field_h, 1, ((rj) this).field_p, 0);
              ((rj) this).field_e = ((rj) this).field_e + (long)((rj) this).field_h;
              if ((((rj) this).field_f ^ -1L) > (((rj) this).field_e ^ -1L)) {
                ((rj) this).field_f = ((rj) this).field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (((rj) this).field_i > ((rj) this).field_a) {
                  break L4;
                } else {
                  if ((((rj) this).field_a ^ -1L) <= ((long)((rj) this).field_g + ((rj) this).field_i ^ -1L)) {
                    break L4;
                  } else {
                    var2 = ((rj) this).field_a;
                    break L3;
                  }
                }
              }
              if (((rj) this).field_a > ((rj) this).field_i) {
                break L3;
              } else {
                if ((((rj) this).field_i ^ -1L) > (((rj) this).field_a + (long)((rj) this).field_h ^ -1L)) {
                  var2 = ((rj) this).field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if ((long)((rj) this).field_h + ((rj) this).field_a <= ((rj) this).field_i) {
                  break L6;
                } else {
                  if ((long)((rj) this).field_h + ((rj) this).field_a <= (long)((rj) this).field_g + ((rj) this).field_i) {
                    var4 = ((rj) this).field_a - -(long)((rj) this).field_h;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((rj) this).field_i + (long)((rj) this).field_g <= ((rj) this).field_a) {
                break L5;
              } else {
                if (((rj) this).field_a - -(long)((rj) this).field_h < (long)((rj) this).field_g + ((rj) this).field_i) {
                  break L5;
                } else {
                  var4 = (long)((rj) this).field_g + ((rj) this).field_i;
                  break L5;
                }
              }
            }
            L7: {
              if (-1L >= var2) {
                break L7;
              } else {
                if (var2 < var4) {
                  var6 = (int)(var4 + -var2);
                  ii.a(((rj) this).field_p, (int)(-((rj) this).field_a + var2), ((rj) this).field_n, (int)(-((rj) this).field_i + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((rj) this).field_h = 0;
            ((rj) this).field_a = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0 < -43) {
            break L8;
          } else {
            var8 = null;
            rj.a((String) null, (java.applet.Applet) null, (byte) -111);
            break L8;
          }
        }
    }

    final long a(byte param0) {
        int var2 = -54 / ((param0 - 45) / 43);
        return ((rj) this).field_o;
    }

    final static void d(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qd var5_ref = null;
        int var6 = 0;
        qd var6_ref = null;
        int var7_int = 0;
        gh var7 = null;
        qd var8 = null;
        int var8_int = 0;
        gh var9 = null;
        int var10_int = 0;
        gh var10 = null;
        int var11_int = 0;
        gh var11 = null;
        gh var12 = null;
        int var12_int = 0;
        nk var13_ref_nk = null;
        int var13 = 0;
        gh var14 = null;
        int var14_int = 0;
        gh var14_ref = null;
        gh var15 = null;
        gh var16 = null;
        int var16_int = 0;
        int[] var16_array = null;
        int var17 = 0;
        gh var17_ref_gh = null;
        int[] var17_ref_int__ = null;
        String var17_ref = null;
        int var18 = 0;
        int[] var18_ref_int__ = null;
        int var19 = 0;
        int var20_int = 0;
        gh var20 = null;
        gh var21 = null;
        int var21_int = 0;
        lb var23 = null;
        int var25 = 0;
        int var26_int = 0;
        gh var26 = null;
        String var27_ref = null;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int[] var31 = null;
        int var32 = 0;
        qd var34 = null;
        nk var35 = null;
        qd var36 = null;
        kg var37 = null;
        kg var38 = null;
        gh var39 = null;
        gh var40 = null;
        gh var41 = null;
        gh var42 = null;
        gh var43 = null;
        jc var46 = null;
        gh var47 = null;
        gh var48 = null;
        gh var49 = null;
        gh var49_ref = null;
        gh var50 = null;
        jc var51 = null;
        gh var52 = null;
        gh var53 = null;
        gh var54 = null;
        gh var55 = null;
        gh var56 = null;
        gh var57 = null;
        gh var58 = null;
        gh var59 = null;
        kg var61 = null;
        gh var62 = null;
        gh var63 = null;
        gh var64 = null;
        gh var65 = null;
        kg var66 = null;
        gh var67 = null;
        kg var68 = null;
        int[] var77 = null;
        int[] var78 = null;
        int[] var79 = null;
        int[][] var80 = null;
        Object var81 = null;
        Object var82 = null;
        Object var83 = null;
        CharSequence var84 = null;
        CharSequence var85 = null;
        CharSequence var86 = null;
        int stackIn_17_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_171_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_193_0 = 0;
        int stackIn_196_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_216_0 = 0;
        int stackIn_311_0 = 0;
        gh stackIn_348_0 = null;
        int stackIn_361_0 = 0;
        int stackIn_361_1 = 0;
        int stackIn_362_0 = 0;
        int stackIn_362_1 = 0;
        int stackIn_363_0 = 0;
        int stackIn_363_1 = 0;
        int stackIn_363_2 = 0;
        int stackIn_386_0 = 0;
        gh stackIn_461_0 = null;
        int stackIn_461_1 = 0;
        String[] stackIn_461_2 = null;
        String[] stackIn_461_3 = null;
        int stackIn_461_4 = 0;
        gh stackIn_462_0 = null;
        int stackIn_462_1 = 0;
        String[] stackIn_462_2 = null;
        String[] stackIn_462_3 = null;
        int stackIn_462_4 = 0;
        gh stackIn_463_0 = null;
        int stackIn_463_1 = 0;
        String[] stackIn_463_2 = null;
        String[] stackIn_463_3 = null;
        int stackIn_463_4 = 0;
        String stackIn_463_5 = null;
        int stackIn_483_0 = 0;
        gh stackIn_519_0 = null;
        gh stackIn_519_1 = null;
        String stackIn_519_2 = null;
        gh stackIn_520_0 = null;
        gh stackIn_520_1 = null;
        String stackIn_520_2 = null;
        gh stackIn_521_0 = null;
        gh stackIn_521_1 = null;
        String stackIn_521_2 = null;
        gh stackIn_521_3 = null;
        gh stackIn_522_0 = null;
        wk[] stackIn_522_1 = null;
        int stackIn_522_2 = 0;
        gh stackIn_523_0 = null;
        wk[] stackIn_523_1 = null;
        int stackIn_523_2 = 0;
        gh stackIn_524_0 = null;
        wk[] stackIn_524_1 = null;
        int stackIn_524_2 = 0;
        int stackIn_524_3 = 0;
        int stackIn_576_0 = 0;
        gh stackIn_579_0 = null;
        int stackIn_579_1 = 0;
        int stackIn_579_2 = 0;
        int stackIn_579_3 = 0;
        gh stackIn_580_0 = null;
        int stackIn_580_1 = 0;
        int stackIn_580_2 = 0;
        int stackIn_580_3 = 0;
        gh stackIn_581_0 = null;
        int stackIn_581_1 = 0;
        int stackIn_581_2 = 0;
        int stackIn_581_3 = 0;
        int stackIn_581_4 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_215_0 = 0;
        int stackOut_214_0 = 0;
        gh stackOut_460_0 = null;
        int stackOut_460_1 = 0;
        String[] stackOut_460_2 = null;
        String[] stackOut_460_3 = null;
        int stackOut_460_4 = 0;
        gh stackOut_462_0 = null;
        int stackOut_462_1 = 0;
        String[] stackOut_462_2 = null;
        String[] stackOut_462_3 = null;
        int stackOut_462_4 = 0;
        String stackOut_462_5 = null;
        gh stackOut_461_0 = null;
        int stackOut_461_1 = 0;
        String[] stackOut_461_2 = null;
        String[] stackOut_461_3 = null;
        int stackOut_461_4 = 0;
        String stackOut_461_5 = null;
        Object stackOut_347_0 = null;
        gh stackOut_346_0 = null;
        int stackOut_360_0 = 0;
        int stackOut_360_1 = 0;
        int stackOut_362_0 = 0;
        int stackOut_362_1 = 0;
        int stackOut_362_2 = 0;
        int stackOut_361_0 = 0;
        int stackOut_361_1 = 0;
        int stackOut_361_2 = 0;
        int stackOut_385_0 = 0;
        int stackOut_384_0 = 0;
        int stackOut_310_0 = 0;
        int stackOut_309_0 = 0;
        int stackOut_482_0 = 0;
        int stackOut_481_0 = 0;
        int stackOut_575_0 = 0;
        int stackOut_574_0 = 0;
        gh stackOut_578_0 = null;
        int stackOut_578_1 = 0;
        int stackOut_578_2 = 0;
        int stackOut_578_3 = 0;
        gh stackOut_580_0 = null;
        int stackOut_580_1 = 0;
        int stackOut_580_2 = 0;
        int stackOut_580_3 = 0;
        int stackOut_580_4 = 0;
        gh stackOut_579_0 = null;
        int stackOut_579_1 = 0;
        int stackOut_579_2 = 0;
        int stackOut_579_3 = 0;
        int stackOut_579_4 = 0;
        gh stackOut_518_0 = null;
        gh stackOut_518_1 = null;
        String stackOut_518_2 = null;
        gh stackOut_520_0 = null;
        gh stackOut_520_1 = null;
        String stackOut_520_2 = null;
        gh stackOut_520_3 = null;
        gh stackOut_519_0 = null;
        gh stackOut_519_1 = null;
        String stackOut_519_2 = null;
        gh stackOut_519_3 = null;
        gh stackOut_521_0 = null;
        wk[] stackOut_521_1 = null;
        int stackOut_521_2 = 0;
        gh stackOut_523_0 = null;
        wk[] stackOut_523_1 = null;
        int stackOut_523_2 = 0;
        int stackOut_523_3 = 0;
        gh stackOut_522_0 = null;
        wk[] stackOut_522_1 = null;
        int stackOut_522_2 = 0;
        int stackOut_522_3 = 0;
        L0: {
          var81 = null;
          var82 = null;
          var83 = null;
          var32 = SteelSentinels.field_G;
          var1 = 0;
          var2 = 0;
          if (ti.field_B == null) {
            if ((ij.field_Y ^ -1) <= -1) {
              var2 = 16;
              break L0;
            } else {
              break L0;
            }
          } else {
            var2 = 100;
            break L0;
          }
        }
        L1: {
          if (null != bl.field_c) {
            if (bl.field_c.field_Rb <= oh.field_f) {
              if (var2 + bl.field_c.field_Rb + bl.field_c.field_zb > oh.field_f) {
                if (bl.field_c.field_cb <= pi.field_c) {
                  if (bl.field_c.field_Lb + bl.field_c.field_cb > pi.field_c) {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L1;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_17_0 = stackOut_14_0;
                    break L1;
                  }
                } else {
                  stackOut_12_0 = 0;
                  stackIn_17_0 = stackOut_12_0;
                  break L1;
                }
              } else {
                stackOut_10_0 = 0;
                stackIn_17_0 = stackOut_10_0;
                break L1;
              }
            } else {
              stackOut_8_0 = 0;
              stackIn_17_0 = stackOut_8_0;
              break L1;
            }
          } else {
            stackOut_6_0 = 0;
            stackIn_17_0 = stackOut_6_0;
            break L1;
          }
        }
        L2: {
          L3: {
            var3 = stackIn_17_0;
            if (var3 != 0) {
              break L3;
            } else {
              if (sn.field_l) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          kf.field_s = true;
          break L2;
        }
        L4: {
          sn.field_l = var3 != 0;
          if (kk.field_a != null) {
            if (oh.field_f >= kk.field_a.field_Rb) {
              if (kk.field_a.field_zb + kk.field_a.field_Rb > oh.field_f) {
                if (kk.field_a.field_cb <= pi.field_c) {
                  if (kk.field_a.field_Lb + kk.field_a.field_cb <= pi.field_c) {
                    stackOut_31_0 = 0;
                    stackIn_33_0 = stackOut_31_0;
                    break L4;
                  } else {
                    stackOut_30_0 = 1;
                    stackIn_33_0 = stackOut_30_0;
                    break L4;
                  }
                } else {
                  stackOut_28_0 = 0;
                  stackIn_33_0 = stackOut_28_0;
                  break L4;
                }
              } else {
                stackOut_26_0 = 0;
                stackIn_33_0 = stackOut_26_0;
                break L4;
              }
            } else {
              stackOut_24_0 = 0;
              stackIn_33_0 = stackOut_24_0;
              break L4;
            }
          } else {
            stackOut_22_0 = 0;
            stackIn_33_0 = stackOut_22_0;
            break L4;
          }
        }
        L5: {
          L6: {
            var4 = stackIn_33_0;
            if (var4 != 0) {
              break L6;
            } else {
              if (!nl.field_X) {
                break L5;
              } else {
                break L6;
              }
            }
          }
          lg.field_l = true;
          break L5;
        }
        L7: {
          if (-1 >= (dc.field_g ^ -1)) {
            kf.field_s = true;
            lg.field_l = true;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          nl.field_X = var4 != 0;
          if (qa.field_M == 0) {
            break L8;
          } else {
            if (57 != qa.field_M) {
              lg.field_l = true;
              break L8;
            } else {
              break L8;
            }
          }
        }
        L9: {
          if ((fg.field_Ob ^ -1) != -2) {
            qa.field_M = Math.max(qa.field_M - 6, 0);
            break L9;
          } else {
            qa.field_M = Math.min(qa.field_M - -6, 57);
            break L9;
          }
        }
        L10: {
          L11: {
            L12: {
              if (qa.field_M != 0) {
                L13: {
                  if ((qa.field_M ^ -1) != -58) {
                    lg.field_l = true;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                if (null != hl.field_v) {
                  break L12;
                } else {
                  if (-2 != pa.field_e) {
                    break L10;
                  } else {
                    if (lb.field_gc != 1) {
                      break L10;
                    } else {
                      if (he.a((byte) 127)) {
                        var5 = 0;
                        break L11;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
              } else {
                if (null != hl.field_v) {
                  break L12;
                } else {
                  if (-2 != pa.field_e) {
                    break L10;
                  } else {
                    if (lb.field_gc != 1) {
                      break L10;
                    } else {
                      if (he.a((byte) 127)) {
                        var5 = 0;
                        break L11;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
              }
            }
            L14: {
              L15: {
                if (null == kh.field_v) {
                  break L15;
                } else {
                  if (kh.field_v.field_N == hl.field_v.field_N) {
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              var5 = uc.field_b[0];
              var77 = nl.a(var5, (byte) 123);
              var7_int = 0;
              L16: while (true) {
                if (var7_int >= dn.field_bc.length) {
                  kh.field_v = ji.a(var77, (byte) -50, dn.field_bc);
                  break L14;
                } else {
                  dn.field_bc[var7_int] = -1;
                  var7_int++;
                  continue L16;
                }
              }
            }
            if (-2 != pa.field_e) {
              break L10;
            } else {
              if (lb.field_gc != 1) {
                break L10;
              } else {
                if (he.a((byte) 127)) {
                  var5 = 0;
                  break L11;
                } else {
                  break L10;
                }
              }
            }
          }
          L17: while (true) {
            if (var5 >= di.field_c.length) {
              break L10;
            } else {
              di.field_c[var5] = dn.field_bc[var5];
              var5++;
              continue L17;
            }
          }
        }
        L18: {
          L19: {
            if (pa.field_e > -1) {
              break L19;
            } else {
              if (!he.a((byte) 123)) {
                break L19;
              } else {
                if (-3 == lb.field_gc) {
                  if (ij.field_Y <= -1) {
                    lg.field_l = true;
                    ij.field_Y = -1;
                    break L18;
                  } else {
                    di.field_c[pa.field_e] = -1;
                    break L18;
                  }
                } else {
                  if ((lb.field_gc ^ -1) == -2) {
                    L20: {
                      var5 = di.field_c[pa.field_e];
                      di.field_c[pa.field_e] = ij.field_Y;
                      if (fg.field_Ob == 0) {
                        break L20;
                      } else {
                        fg.field_Ob = 0;
                        var1 = 1;
                        kf.field_s = true;
                        lg.field_l = true;
                        break L20;
                      }
                    }
                    if (0 <= ij.field_Y) {
                      ij.field_Y = -1;
                      break L18;
                    } else {
                      ij.field_Y = var5;
                      break L18;
                    }
                  } else {
                    break L18;
                  }
                }
              }
            }
          }
          if (lj.field_h == null) {
            break L18;
          } else {
            L21: {
              if (-2 != lb.field_gc) {
                break L21;
              } else {
                if (!fc.field_e[81]) {
                  break L21;
                } else {
                  if (!he.a((byte) 118)) {
                    break L21;
                  } else {
                    var34 = lj.field_h;
                    var6 = kh.field_v.a((byte) 2, var34);
                    if (-1 < (var6 ^ -1)) {
                      break L18;
                    } else {
                      L22: {
                        if (null == var34.field_d) {
                          break L22;
                        } else {
                          if (var6 != var34.field_d.field_N) {
                            break L22;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L23: {
                        if (null == var34.field_d) {
                          break L23;
                        } else {
                          if (83 == var34.field_d.field_N) {
                            var1 = 1;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                      }
                      L24: {
                        var34.field_d = new nk(ul.a(var6, (byte) 67));
                        var7_int = ub.a(125, var6);
                        if (-1 >= (var7_int ^ -1)) {
                          var8 = hl.field_v.c(0, lj.field_h.field_r);
                          if (var8 == null) {
                            break L24;
                          } else {
                            var8.field_d = new nk(ul.a(var7_int, (byte) 67));
                            break L24;
                          }
                        } else {
                          break L24;
                        }
                      }
                      L25: {
                        if (var6 == 83) {
                          var1 = 1;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      ee.c(param0 + -6996144, 25);
                      break L18;
                    }
                  }
                }
              }
            }
            L26: {
              if ((lb.field_gc ^ -1) != -3) {
                break L26;
              } else {
                if (!he.a((byte) 126)) {
                  break L26;
                } else {
                  if (ti.field_B == null) {
                    L27: {
                      var35 = lj.field_h.field_d;
                      if (var35 == null) {
                        break L27;
                      } else {
                        L28: {
                          if (var35.field_Q == 4) {
                            break L28;
                          } else {
                            if ((var35.field_Q ^ -1) == -2049) {
                              break L28;
                            } else {
                              break L27;
                            }
                          }
                        }
                        var6_ref = hl.field_v.c(0, lj.field_h.field_r);
                        if (var6_ref == null) {
                          break L27;
                        } else {
                          var6_ref.field_d = null;
                          break L27;
                        }
                      }
                    }
                    lj.field_h.field_d = null;
                    if (var35 == null) {
                      break L18;
                    } else {
                      if (-84 != var35.field_N) {
                        break L18;
                      } else {
                        var1 = 1;
                        break L18;
                      }
                    }
                  } else {
                    ti.field_B = null;
                    f.field_A = null;
                    break L18;
                  }
                }
              }
            }
            if (lb.field_gc != 1) {
              break L18;
            } else {
              if (he.a((byte) 126)) {
                L29: {
                  if (-1 == (fg.field_Ob & 16)) {
                    break L29;
                  } else {
                    if (ti.field_B != null) {
                      if (-1 <= (ti.field_B.field_Q & lj.field_h.field_q ^ -1)) {
                        break L18;
                      } else {
                        L30: {
                          if ((ti.field_B.field_N ^ -1) == -84) {
                            var1 = 1;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                        lj.field_h.field_d = new nk(ti.field_B);
                        ee.c(-2483, 25);
                        break L18;
                      }
                    } else {
                      break L29;
                    }
                  }
                }
                if (null == lj.field_h.field_d) {
                  if (null == ti.field_B) {
                    break L18;
                  } else {
                    if ((ti.field_B.field_Q & lj.field_h.field_q) <= 0) {
                      break L18;
                    } else {
                      L31: {
                        lj.field_h.field_d = ti.field_B;
                        if ((ti.field_B.field_N ^ -1) != -84) {
                          break L31;
                        } else {
                          var1 = 1;
                          break L31;
                        }
                      }
                      L32: {
                        ee.c(-2483, 25);
                        if (null == f.field_A) {
                          break L32;
                        } else {
                          break L32;
                        }
                      }
                      ti.field_B = null;
                      f.field_A = null;
                      break L18;
                    }
                  }
                } else {
                  L33: {
                    if (ti.field_B == null) {
                      break L33;
                    } else {
                      if (0 < (ti.field_B.field_Q & lj.field_h.field_q)) {
                        L34: {
                          lj.field_h.field_d = ti.field_B;
                          if ((ti.field_B.field_N ^ -1) != -84) {
                            break L34;
                          } else {
                            var1 = 1;
                            break L34;
                          }
                        }
                        L35: {
                          ee.c(-2483, 25);
                          if (null == f.field_A) {
                            break L35;
                          } else {
                            var5_ref = hl.field_v.c(0, lj.field_h.field_r);
                            if (var5_ref == null) {
                              break L35;
                            } else {
                              var5_ref.field_d = f.field_A;
                              break L35;
                            }
                          }
                        }
                        f.field_A = null;
                        ti.field_B = null;
                        break L18;
                      } else {
                        break L33;
                      }
                    }
                  }
                  if (null == ti.field_B) {
                    L36: {
                      L37: {
                        ti.field_B = lj.field_h.field_d;
                        f.field_A = null;
                        if (4 == ti.field_B.field_Q) {
                          break L37;
                        } else {
                          if (-2049 != (ti.field_B.field_Q ^ -1)) {
                            break L36;
                          } else {
                            break L37;
                          }
                        }
                      }
                      var36 = hl.field_v.c(0, lj.field_h.field_r);
                      if (var36 != null) {
                        f.field_A = var36.field_d;
                        var36.field_d = null;
                        break L36;
                      } else {
                        f.field_A = null;
                        break L36;
                      }
                    }
                    L38: {
                      if (null == lj.field_h.field_d) {
                        break L38;
                      } else {
                        if (lj.field_h.field_d.field_N != 83) {
                          break L38;
                        } else {
                          var1 = 1;
                          break L38;
                        }
                      }
                    }
                    L39: {
                      if (ti.field_B != null) {
                        break L39;
                      } else {
                        f.field_A = null;
                        ti.field_B = null;
                        break L39;
                      }
                    }
                    lj.field_h.field_d = null;
                    break L18;
                  } else {
                    break L18;
                  }
                }
              } else {
                break L18;
              }
            }
          }
        }
        L40: {
          L41: {
            L42: {
              if (gd.field_jb != null) {
                L43: {
                  L44: {
                    if (null == bi.field_f) {
                      break L44;
                    } else {
                      if (null == bi.field_f.field_Ub) {
                        break L44;
                      } else {
                        stackOut_169_0 = bi.field_f.field_Ub.field_eb;
                        stackIn_171_0 = stackOut_169_0;
                        break L43;
                      }
                    }
                  }
                  stackOut_170_0 = -2147483648;
                  stackIn_171_0 = stackOut_170_0;
                  break L43;
                }
                L45: {
                  L46: {
                    var5 = stackIn_171_0;
                    if (null == vd.field_a) {
                      break L46;
                    } else {
                      if (vd.field_a.field_Ub != null) {
                        stackOut_175_0 = vd.field_a.field_Ub.field_eb;
                        stackIn_176_0 = stackOut_175_0;
                        break L45;
                      } else {
                        break L46;
                      }
                    }
                  }
                  stackOut_174_0 = -2147483648;
                  stackIn_176_0 = stackOut_174_0;
                  break L45;
                }
                L47: {
                  L48: {
                    var6 = stackIn_176_0;
                    gd.field_jb.a((byte) -107, true);
                    if (null == bi.field_f) {
                      break L48;
                    } else {
                      if (bi.field_f.field_Ub != null) {
                        stackOut_180_0 = bi.field_f.field_Ub.field_eb;
                        stackIn_181_0 = stackOut_180_0;
                        break L47;
                      } else {
                        break L48;
                      }
                    }
                  }
                  stackOut_179_0 = -2147483648;
                  stackIn_181_0 = stackOut_179_0;
                  break L47;
                }
                L49: {
                  var7_int = stackIn_181_0;
                  if (var5 == var7_int) {
                    break L49;
                  } else {
                    kf.field_s = true;
                    break L49;
                  }
                }
                L50: {
                  L51: {
                    if (null == vd.field_a) {
                      break L51;
                    } else {
                      if (null == vd.field_a.field_Ub) {
                        break L51;
                      } else {
                        stackOut_185_0 = vd.field_a.field_Ub.field_eb;
                        stackIn_187_0 = stackOut_185_0;
                        break L50;
                      }
                    }
                  }
                  stackOut_186_0 = -2147483648;
                  stackIn_187_0 = stackOut_186_0;
                  break L50;
                }
                L52: {
                  var8_int = stackIn_187_0;
                  if (var8_int == var6) {
                    break L52;
                  } else {
                    lg.field_l = true;
                    break L52;
                  }
                }
                L53: {
                  var37 = bi.field_f;
                  if (var37 == null) {
                    break L53;
                  } else {
                    L54: {
                      if (null != var37.field_Ub) {
                        stackOut_192_0 = var37.field_Ub.field_eb;
                        stackIn_193_0 = stackOut_192_0;
                        break L54;
                      } else {
                        stackOut_191_0 = -2147483648;
                        stackIn_193_0 = stackOut_191_0;
                        break L54;
                      }
                    }
                    L55: {
                      var10_int = stackIn_193_0;
                      var37.a((byte) 96, jj.field_d * 32, 128, false, 32);
                      if (null == var37.field_Ub) {
                        stackOut_195_0 = -2147483648;
                        stackIn_196_0 = stackOut_195_0;
                        break L55;
                      } else {
                        stackOut_194_0 = var37.field_Ub.field_eb;
                        stackIn_196_0 = stackOut_194_0;
                        break L55;
                      }
                    }
                    L56: {
                      var11_int = stackIn_196_0;
                      if (var10_int == var11_int) {
                        break L56;
                      } else {
                        kf.field_s = true;
                        break L56;
                      }
                    }
                    L57: {
                      var12_int = -1;
                      if (-1 == (fg.field_Ob ^ -1)) {
                        var12_int = 3;
                        break L57;
                      } else {
                        if ((fg.field_Ob & 1) != 0) {
                          var12_int = 0;
                          break L57;
                        } else {
                          if ((fg.field_Ob & 2) != 0) {
                            var12_int = 1;
                            break L57;
                          } else {
                            if (0 == (fg.field_Ob & 16)) {
                              break L57;
                            } else {
                              var12_int = 2;
                              break L57;
                            }
                          }
                        }
                      }
                    }
                    if (-1 >= (var12_int ^ -1)) {
                      va.field_k[var12_int] = var37.field_Ub.field_eb;
                      break L53;
                    } else {
                      break L53;
                    }
                  }
                }
                L58: {
                  var38 = vd.field_a;
                  if (var38 == null) {
                    break L58;
                  } else {
                    L59: {
                      if (var38.field_Ub != null) {
                        stackOut_212_0 = var38.field_Ub.field_eb;
                        stackIn_213_0 = stackOut_212_0;
                        break L59;
                      } else {
                        stackOut_211_0 = -2147483648;
                        stackIn_213_0 = stackOut_211_0;
                        break L59;
                      }
                    }
                    L60: {
                      var11_int = stackIn_213_0;
                      var38.a((byte) 96, 32 * jj.field_d, 128, false, 32);
                      if (null != var38.field_Ub) {
                        stackOut_215_0 = var38.field_Ub.field_eb;
                        stackIn_216_0 = stackOut_215_0;
                        break L60;
                      } else {
                        stackOut_214_0 = -2147483648;
                        stackIn_216_0 = stackOut_214_0;
                        break L60;
                      }
                    }
                    var12_int = stackIn_216_0;
                    if (var11_int == var12_int) {
                      break L58;
                    } else {
                      lg.field_l = true;
                      break L58;
                    }
                  }
                }
                L61: {
                  if (lb.field_gc == 1) {
                    L62: {
                      var11_int = fg.field_Ob;
                      var39 = wc.field_h[0];
                      var49 = var39;
                      var49 = var39;
                      if (var39 == null) {
                        break L62;
                      } else {
                        if (var39.field_kb) {
                          fg.field_Ob = 1;
                          var1 = 1;
                          break L62;
                        } else {
                          break L62;
                        }
                      }
                    }
                    L63: {
                      var40 = wc.field_h[1];
                      var49 = var40;
                      var49 = var40;
                      if (var40 == null) {
                        break L63;
                      } else {
                        if (var40.field_kb) {
                          fg.field_Ob = 2062;
                          var1 = 1;
                          break L63;
                        } else {
                          break L63;
                        }
                      }
                    }
                    L64: {
                      var41 = wc.field_h[2];
                      var49 = var41;
                      var49 = var41;
                      if (var41 == null) {
                        break L64;
                      } else {
                        if (!var41.field_kb) {
                          break L64;
                        } else {
                          fg.field_Ob = 1008;
                          var1 = 1;
                          break L64;
                        }
                      }
                    }
                    L65: {
                      var42 = wc.field_h[3];
                      var49 = var42;
                      var49 = var42;
                      if (var42 == null) {
                        break L65;
                      } else {
                        if (var42.field_kb) {
                          var1 = 1;
                          fg.field_Ob = 0;
                          break L65;
                        } else {
                          break L65;
                        }
                      }
                    }
                    if (var11_int == fg.field_Ob) {
                      break L61;
                    } else {
                      L66: {
                        if (var37 != null) {
                          L67: {
                            var13 = -1;
                            if (0 == (var11_int & 1)) {
                              break L67;
                            } else {
                              var13 = 0;
                              break L67;
                            }
                          }
                          L68: {
                            if (-1 == (2 & var11_int ^ -1)) {
                              break L68;
                            } else {
                              var13 = 1;
                              break L68;
                            }
                          }
                          L69: {
                            if ((16 & var11_int) == 0) {
                              break L69;
                            } else {
                              var13 = 2;
                              break L69;
                            }
                          }
                          L70: {
                            if (var11_int == 0) {
                              var13 = 3;
                              break L70;
                            } else {
                              break L70;
                            }
                          }
                          if (0 > var13) {
                            break L66;
                          } else {
                            va.field_k[var13] = var37.field_Ub.field_eb;
                            break L66;
                          }
                        } else {
                          break L66;
                        }
                      }
                      f.field_A = null;
                      ij.field_Y = -1;
                      ti.field_B = null;
                      ee.c(-2483, 95);
                      break L61;
                    }
                  } else {
                    break L61;
                  }
                }
                L71: {
                  t.field_h = -1;
                  df.field_K = false;
                  f.field_y = null;
                  var11 = rh.field_u;
                  if (var11 == null) {
                    break L71;
                  } else {
                    if (fg.field_Ob == 0) {
                      var12_int = 0;
                      L72: while (true) {
                        if (var12_int >= 35) {
                          break L71;
                        } else {
                          var49_ref = cj.field_a[var12_int];
                          if (var49_ref != null) {
                            if (var49_ref.field_kb) {
                              L73: {
                                var50 = var49_ref.a("engineer", false);
                                if (var50 == null) {
                                  break L73;
                                } else {
                                  if (var50.field_kb) {
                                    df.field_K = true;
                                    break L73;
                                  } else {
                                    break L73;
                                  }
                                }
                              }
                              L74: {
                                L75: {
                                  if (lb.field_gc != 1) {
                                    break L75;
                                  } else {
                                    if (!df.field_K) {
                                      break L75;
                                    } else {
                                      if (he.a((byte) 121)) {
                                        L76: {
                                          L77: {
                                            var15 = null;
                                            if (!t.a(fe.field_D, var12_int, -20370)) {
                                              if (ad.a(var12_int, nk.f((byte) -96), fe.field_D, (byte) 84, ge.field_m, rn.field_D)) {
                                                if (qf.field_h[var12_int] > li.field_v) {
                                                  var15 = (gh) (Object) hd.field_g;
                                                  ln.field_c = b.field_q[2];
                                                  break L77;
                                                } else {
                                                  break L77;
                                                }
                                              } else {
                                                L78: {
                                                  var15 = (gh) (Object) ha.field_R;
                                                  ln.field_c = b.field_q[2];
                                                  var16_int = nm.a(param0 ^ 6985420, var12_int);
                                                  if (-1 < (var16_int ^ -1)) {
                                                    break L78;
                                                  } else {
                                                    if (t.a(fe.field_D, var16_int, -20370)) {
                                                      break L78;
                                                    } else {
                                                      var15 = (gh) (Object) oc.field_e;
                                                      var15 = (gh) (Object) db.a((String) (Object) var15, -65, new String[2]);
                                                      break L78;
                                                    }
                                                  }
                                                }
                                                var17 = var12_int;
                                                if (var17 == 26) {
                                                  var15 = (gh) (Object) b.field_i;
                                                  break L77;
                                                } else {
                                                  if (-24 == (var17 ^ -1)) {
                                                    var15 = (gh) (Object) k.field_Eb;
                                                    break L77;
                                                  } else {
                                                    if (25 != var17) {
                                                      if (var17 == 27) {
                                                        if (var15 == null) {
                                                          if (!ni.b(param0 + -6993613)) {
                                                            sn.field_q = var12_int;
                                                            f.field_v = qf.field_h[var12_int];
                                                            ee.c(-2483, 95);
                                                            break L76;
                                                          } else {
                                                            if (var15 != null) {
                                                              break L76;
                                                            } else {
                                                              if (ni.b(param0 + -6993613)) {
                                                                break L76;
                                                              } else {
                                                                sn.field_q = var12_int;
                                                                f.field_v = qf.field_h[var12_int];
                                                                ee.c(-2483, 95);
                                                                break L76;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          if (var15 != null) {
                                                            break L76;
                                                          } else {
                                                            if (ni.b(param0 + -6993613)) {
                                                              break L76;
                                                            } else {
                                                              sn.field_q = var12_int;
                                                              f.field_v = qf.field_h[var12_int];
                                                              ee.c(-2483, 95);
                                                              break L76;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        if (var15 != null) {
                                                          break L76;
                                                        } else {
                                                          if (!ni.b(param0 + -6993613)) {
                                                            sn.field_q = var12_int;
                                                            f.field_v = qf.field_h[var12_int];
                                                            ee.c(-2483, 95);
                                                            break L76;
                                                          } else {
                                                            if (var15 != null) {
                                                              break L76;
                                                            } else {
                                                              if (ni.b(param0 + -6993613)) {
                                                                break L76;
                                                              } else {
                                                                sn.field_q = var12_int;
                                                                f.field_v = qf.field_h[var12_int];
                                                                ee.c(-2483, 95);
                                                                break L76;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var15 = (gh) (Object) rd.field_c;
                                                      break L77;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              ln.field_c = b.field_q[0];
                                              var15 = (gh) (Object) va.field_i;
                                              break L77;
                                            }
                                          }
                                          if (var15 != null) {
                                            break L76;
                                          } else {
                                            if (ni.b(param0 + -6993613)) {
                                              break L76;
                                            } else {
                                              sn.field_q = var12_int;
                                              f.field_v = qf.field_h[var12_int];
                                              ee.c(-2483, 95);
                                              break L76;
                                            }
                                          }
                                        }
                                        if (var15 != null) {
                                          L79: {
                                            stackOut_460_0 = (gh) var15;
                                            stackOut_460_1 = param0 ^ -6993616;
                                            stackOut_460_2 = new String[1];
                                            stackOut_460_3 = new String[1];
                                            stackOut_460_4 = 0;
                                            stackIn_462_0 = stackOut_460_0;
                                            stackIn_462_1 = stackOut_460_1;
                                            stackIn_462_2 = stackOut_460_2;
                                            stackIn_462_3 = stackOut_460_3;
                                            stackIn_462_4 = stackOut_460_4;
                                            stackIn_461_0 = stackOut_460_0;
                                            stackIn_461_1 = stackOut_460_1;
                                            stackIn_461_2 = stackOut_460_2;
                                            stackIn_461_3 = stackOut_460_3;
                                            stackIn_461_4 = stackOut_460_4;
                                            if ((var12_int ^ -1) == -35) {
                                              stackOut_462_0 = (gh) (Object) stackIn_462_0;
                                              stackOut_462_1 = stackIn_462_1;
                                              stackOut_462_2 = (String[]) (Object) stackIn_462_2;
                                              stackOut_462_3 = (String[]) (Object) stackIn_462_3;
                                              stackOut_462_4 = stackIn_462_4;
                                              stackOut_462_5 = "GODULE";
                                              stackIn_463_0 = stackOut_462_0;
                                              stackIn_463_1 = stackOut_462_1;
                                              stackIn_463_2 = stackOut_462_2;
                                              stackIn_463_3 = stackOut_462_3;
                                              stackIn_463_4 = stackOut_462_4;
                                              stackIn_463_5 = stackOut_462_5;
                                              break L79;
                                            } else {
                                              stackOut_461_0 = (gh) (Object) stackIn_461_0;
                                              stackOut_461_1 = stackIn_461_1;
                                              stackOut_461_2 = (String[]) (Object) stackIn_461_2;
                                              stackOut_461_3 = (String[]) (Object) stackIn_461_3;
                                              stackOut_461_4 = stackIn_461_4;
                                              stackOut_461_5 = field_m[var12_int];
                                              stackIn_463_0 = stackOut_461_0;
                                              stackIn_463_1 = stackOut_461_1;
                                              stackIn_463_2 = stackOut_461_2;
                                              stackIn_463_3 = stackOut_461_3;
                                              stackIn_463_4 = stackOut_461_4;
                                              stackIn_463_5 = stackOut_461_5;
                                              break L79;
                                            }
                                          }
                                          stackIn_463_3[stackIn_463_4] = stackIn_463_5;
                                          km.field_a = db.a((String) (Object) stackIn_463_0, stackIn_463_1, stackIn_463_2);
                                          break L74;
                                        } else {
                                          break L74;
                                        }
                                      } else {
                                        break L75;
                                      }
                                    }
                                  }
                                }
                                if (1 != lb.field_gc) {
                                  break L74;
                                } else {
                                  if (!uc.a(var12_int, -3958)) {
                                    break L74;
                                  } else {
                                    if (he.a((byte) 127)) {
                                      ij.field_Y = var12_int;
                                      ti.field_B = null;
                                      f.field_A = null;
                                      ee.c(-2483, 100);
                                      break L74;
                                    } else {
                                      break L74;
                                    }
                                  }
                                }
                              }
                              t.field_h = var12_int;
                              if (null == f.field_y) {
                                var51 = new jc(var49_ref.field_M);
                                var16 = (gh) (Object) var51.b(2);
                                L80: while (true) {
                                  if (var16 != null) {
                                    L81: {
                                      if (!var16.field_kb) {
                                        break L81;
                                      } else {
                                        if (var16.field_S == null) {
                                          break L81;
                                        } else {
                                          if (!var16.field_S.startsWith("<img=")) {
                                            break L81;
                                          } else {
                                            if (7 == var16.field_S.length()) {
                                              f.field_y = var16;
                                              var12_int++;
                                              continue L72;
                                            } else {
                                              break L81;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var16 = (gh) (Object) var51.d(2);
                                    continue L80;
                                  } else {
                                    var12_int++;
                                    continue L72;
                                  }
                                }
                              } else {
                                var12_int++;
                                continue L72;
                              }
                            } else {
                              var12_int++;
                              continue L72;
                            }
                          } else {
                            var12_int++;
                            continue L72;
                          }
                        }
                      }
                    } else {
                      var12_int = 0;
                      var13_ref_nk = (nk) (Object) ao.field_H.e(13058);
                      L82: while (true) {
                        if (var13_ref_nk == null) {
                          L83: {
                            if ((fg.field_Ob ^ -1) != -2) {
                              break L83;
                            } else {
                              var13 = 0;
                              L84: while (true) {
                                if (ue.field_c.length <= var13) {
                                  break L83;
                                } else {
                                  L85: {
                                    var14_int = var13 + 101;
                                    if (null == ue.field_c[var13]) {
                                      stackOut_347_0 = null;
                                      stackIn_348_0 = (gh) (Object) stackOut_347_0;
                                      break L85;
                                    } else {
                                      stackOut_346_0 = cj.field_a[var14_int];
                                      stackIn_348_0 = stackOut_346_0;
                                      break L85;
                                    }
                                  }
                                  var47 = stackIn_348_0;
                                  var15 = var47;
                                  if (var15 != null) {
                                    if (var47.field_kb) {
                                      if ((lb.field_gc ^ -1) == -2) {
                                        L86: {
                                          var48 = var15.a("bin", false);
                                          if (var48 == null) {
                                            break L86;
                                          } else {
                                            if (var48.field_kb) {
                                              ue.field_c[var13] = null;
                                              var17 = var13;
                                              L87: while (true) {
                                                if (ue.field_c.length - 1 <= var17) {
                                                  ue.field_c[ue.field_c.length + -1] = null;
                                                  ue.field_g[ue.field_c.length - 1] = null;
                                                  var1 = 1;
                                                  var13++;
                                                  continue L84;
                                                } else {
                                                  ue.field_c[var17] = ue.field_c[1 + var17];
                                                  ue.field_g[var17] = ue.field_g[1 + var17];
                                                  var17++;
                                                  continue L87;
                                                }
                                              }
                                            } else {
                                              break L86;
                                            }
                                          }
                                        }
                                        L88: {
                                          var17 = 0;
                                          if (nk.f((byte) -46)) {
                                            break L88;
                                          } else {
                                            var18 = 0;
                                            L89: while (true) {
                                              if (var18 >= ue.field_c[var13].length) {
                                                break L88;
                                              } else {
                                                L90: {
                                                  stackOut_360_0 = ue.field_c[var13][var18];
                                                  stackOut_360_1 = -109;
                                                  stackIn_362_0 = stackOut_360_0;
                                                  stackIn_362_1 = stackOut_360_1;
                                                  stackIn_361_0 = stackOut_360_0;
                                                  stackIn_361_1 = stackOut_360_1;
                                                  if (var18 < -8 + ue.field_c[var13].length) {
                                                    stackOut_362_0 = stackIn_362_0;
                                                    stackOut_362_1 = stackIn_362_1;
                                                    stackOut_362_2 = 0;
                                                    stackIn_363_0 = stackOut_362_0;
                                                    stackIn_363_1 = stackOut_362_1;
                                                    stackIn_363_2 = stackOut_362_2;
                                                    break L90;
                                                  } else {
                                                    stackOut_361_0 = stackIn_361_0;
                                                    stackOut_361_1 = stackIn_361_1;
                                                    stackOut_361_2 = 1;
                                                    stackIn_363_0 = stackOut_361_0;
                                                    stackIn_363_1 = stackOut_361_1;
                                                    stackIn_363_2 = stackOut_361_2;
                                                    break L90;
                                                  }
                                                }
                                                if (oc.a(stackIn_363_0, stackIn_363_1, stackIn_363_2 == 0)) {
                                                  var18++;
                                                  continue L89;
                                                } else {
                                                  var17 = 1;
                                                  break L88;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (var17 == 0) {
                                          ee.c(-2483, 99);
                                          di.field_c = new int[8];
                                          var12_int = 1;
                                          var18 = 0;
                                          L91: while (true) {
                                            if (var18 >= 8) {
                                              L92: {
                                                var18_ref_int__ = ue.field_c[var13];
                                                ij.field_Y = -1;
                                                if (var18_ref_int__ != null) {
                                                  uc.field_b = var18_ref_int__;
                                                  break L92;
                                                } else {
                                                  break L92;
                                                }
                                              }
                                              ti.field_B = null;
                                              var13++;
                                              continue L84;
                                            } else {
                                              di.field_c[var18] = -1;
                                              var18++;
                                              continue L91;
                                            }
                                          }
                                        } else {
                                          var13++;
                                          continue L84;
                                        }
                                      } else {
                                        var13++;
                                        continue L84;
                                      }
                                    } else {
                                      var13++;
                                      continue L84;
                                    }
                                  } else {
                                    var13++;
                                    continue L84;
                                  }
                                }
                              }
                            }
                          }
                          if (var12_int != 0) {
                            hl.field_v = ji.a(uc.field_b, (byte) -53, di.field_c);
                            hl.field_v.b(6993661, 113);
                            break L71;
                          } else {
                            L93: {
                              if (-3 != (lb.field_gc ^ -1)) {
                                break L93;
                              } else {
                                if (!he.a((byte) 126)) {
                                  break L93;
                                } else {
                                  ij.field_Y = -1;
                                  ti.field_B = null;
                                  f.field_A = null;
                                  break L93;
                                }
                              }
                            }
                            L94: {
                              if (ti.field_B != null) {
                                stackOut_385_0 = ti.field_B.field_N;
                                stackIn_386_0 = stackOut_385_0;
                                break L94;
                              } else {
                                stackOut_384_0 = -1;
                                stackIn_386_0 = stackOut_384_0;
                                break L94;
                              }
                            }
                            L95: {
                              var5 = stackIn_386_0;
                              if (-1 >= (var5 ^ -1)) {
                                break L95;
                              } else {
                                if ((ij.field_Y ^ -1) > -1) {
                                  break L95;
                                } else {
                                  var5 = ij.field_Y;
                                  break L95;
                                }
                              }
                            }
                            L96: {
                              if (param0 == 6993661) {
                                break L96;
                              } else {
                                field_j = -1;
                                break L96;
                              }
                            }
                            L97: {
                              if (var5 != fl.field_a) {
                                lg.field_l = true;
                                fl.field_a = var5;
                                ad.field_h = true;
                                kf.field_s = true;
                                break L97;
                              } else {
                                break L97;
                              }
                            }
                            L98: {
                              if (var1 == 0) {
                                break L98;
                              } else {
                                if (gd.field_jb == null) {
                                  break L98;
                                } else {
                                  vn.d(-95);
                                  break L98;
                                }
                              }
                            }
                            if (gd.field_jb != null) {
                              break L40;
                            } else {
                              var6 = 0;
                              L99: while (true) {
                                if (var6 >= jg.field_h.length) {
                                  break L41;
                                } else {
                                  jg.field_h[var6] = null;
                                  var6++;
                                  continue L99;
                                }
                              }
                            }
                          }
                        } else {
                          L100: {
                            var14 = null;
                            if (0 > var13_ref_nk.field_N) {
                              break L100;
                            } else {
                              if (var13_ref_nk.field_N >= cj.field_a.length) {
                                break L100;
                              } else {
                                if (0 == (fg.field_Ob & var13_ref_nk.field_Q)) {
                                  break L100;
                                } else {
                                  var14_ref = cj.field_a[var13_ref_nk.field_N];
                                  break L100;
                                }
                              }
                            }
                          }
                          L101: {
                            if (var14_ref == null) {
                              break L101;
                            } else {
                              if (!var14_ref.field_kb) {
                                break L101;
                              } else {
                                L102: {
                                  L103: {
                                    L104: {
                                      var43 = var14_ref.a("engineer", false);
                                      if (var43 != null) {
                                        if (var43.field_kb) {
                                          df.field_K = true;
                                          if (1 != lb.field_gc) {
                                            break L103;
                                          } else {
                                            if (!df.field_K) {
                                              break L103;
                                            } else {
                                              if (!he.a((byte) 117)) {
                                                break L103;
                                              } else {
                                                var16_int = 0;
                                                break L104;
                                              }
                                            }
                                          }
                                        } else {
                                          if (1 != lb.field_gc) {
                                            break L103;
                                          } else {
                                            if (!df.field_K) {
                                              break L103;
                                            } else {
                                              if (!he.a((byte) 117)) {
                                                break L103;
                                              } else {
                                                var16_int = 0;
                                                break L104;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if (1 != lb.field_gc) {
                                          break L103;
                                        } else {
                                          if (!df.field_K) {
                                            break L103;
                                          } else {
                                            if (!he.a((byte) 117)) {
                                              break L103;
                                            } else {
                                              var16_int = 0;
                                              break L104;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L105: {
                                      if (1 == var13_ref_nk.field_Q) {
                                        var17_ref_int__ = ki.b(var13_ref_nk.field_N, (byte) -85);
                                        var18_ref_int__ = ne.a(var13_ref_nk.field_N, (byte) 28);
                                        var78 = var17_ref_int__;
                                        var20_int = 0;
                                        L106: while (true) {
                                          if (var78.length <= var20_int) {
                                            var79 = var18_ref_int__;
                                            var20_int = 0;
                                            L107: while (true) {
                                              if (var20_int >= var79.length) {
                                                break L105;
                                              } else {
                                                var21_int = var79[var20_int];
                                                if (!t.a(rn.field_D, var21_int, param0 + -7014031)) {
                                                  var16_int = var16_int + sj.field_v[var21_int];
                                                  var20_int++;
                                                  continue L107;
                                                } else {
                                                  var20_int++;
                                                  continue L107;
                                                }
                                              }
                                            }
                                          } else {
                                            var21_int = var78[var20_int];
                                            if (!t.a(fe.field_D, var21_int, param0 + -7014031)) {
                                              var16_int = var16_int + qf.field_h[var21_int];
                                              var20_int++;
                                              continue L106;
                                            } else {
                                              var20_int++;
                                              continue L106;
                                            }
                                          }
                                        }
                                      } else {
                                        var16_int = sj.field_v[var13_ref_nk.field_N];
                                        break L105;
                                      }
                                    }
                                    L108: {
                                      var17_ref_int__ = null;
                                      if (t.a(rn.field_D, var13_ref_nk.field_N, -20370)) {
                                        var17_ref = qi.field_e;
                                        ln.field_c = b.field_q[0];
                                        break L108;
                                      } else {
                                        if (var16_int > li.field_v) {
                                          ln.field_c = b.field_q[2];
                                          var17_ref = bj.field_a;
                                          break L108;
                                        } else {
                                          break L108;
                                        }
                                      }
                                    }
                                    L109: {
                                      if (var17_ref != null) {
                                        break L109;
                                      } else {
                                        if (!ni.b(88)) {
                                          f.field_v = var16_int;
                                          sn.field_q = var13_ref_nk.field_N + 128;
                                          ee.c(-2483, 95);
                                          break L109;
                                        } else {
                                          break L109;
                                        }
                                      }
                                    }
                                    if (var17_ref == null) {
                                      break L102;
                                    } else {
                                      km.field_a = db.a(var17_ref, param0 + -6993681, new String[1]);
                                      break L102;
                                    }
                                  }
                                  if (lb.field_gc != 1) {
                                    break L102;
                                  } else {
                                    if (!mm.a(-16242, var13_ref_nk)) {
                                      break L102;
                                    } else {
                                      L110: {
                                        if (-2 == var13_ref_nk.field_Q) {
                                          break L110;
                                        } else {
                                          if (!he.a((byte) 116)) {
                                            break L102;
                                          } else {
                                            if (!hl.field_v.f(var13_ref_nk.field_Q, -1)) {
                                              break L102;
                                            } else {
                                              break L110;
                                            }
                                          }
                                        }
                                      }
                                      L111: {
                                        if (-2 != var13_ref_nk.field_Q) {
                                          break L111;
                                        } else {
                                          if (var13_ref_nk.field_N == 55) {
                                            break L111;
                                          } else {
                                            if ((4 & dm.field_a) != -1) {
                                              break L111;
                                            } else {
                                              if (he.a((byte) 120)) {
                                                break L111;
                                              } else {
                                                L112: {
                                                  if (-58 == var13_ref_nk.field_N) {
                                                    stackOut_310_0 = 6;
                                                    stackIn_311_0 = stackOut_310_0;
                                                    break L112;
                                                  } else {
                                                    stackOut_309_0 = 10;
                                                    stackIn_311_0 = stackOut_309_0;
                                                    break L112;
                                                  }
                                                }
                                                if (stackIn_311_0 > fm.field_f[0]) {
                                                  km.field_a = dj.field_i;
                                                  dm.field_a = dm.field_a | 4;
                                                  if (!ni.b(param0 + -6993572)) {
                                                    um.f((byte) 3);
                                                    break L102;
                                                  } else {
                                                    break L102;
                                                  }
                                                } else {
                                                  break L111;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var13_ref_nk.field_Q != 1) {
                                        L113: {
                                          ee.c(param0 ^ -6995792, 100);
                                          t.field_h = var13_ref_nk.field_N;
                                          ti.field_B = new nk(var13_ref_nk);
                                          f.field_A = null;
                                          var16_int = ub.a(119, var13_ref_nk.field_N);
                                          if ((var16_int ^ -1) <= -1) {
                                            f.field_A = new nk(ul.a(var16_int, (byte) 67));
                                            break L113;
                                          } else {
                                            break L113;
                                          }
                                        }
                                        ij.field_Y = -1;
                                        break L102;
                                      } else {
                                        ee.c(-2483, 99);
                                        di.field_c = new int[8];
                                        qh.field_Wb = true;
                                        var16_int = 0;
                                        L114: while (true) {
                                          if ((var16_int ^ -1) <= -9) {
                                            L115: {
                                              var12_int = 1;
                                              var16_array = nl.a(var13_ref_nk.field_N, (byte) 123);
                                              if (var16_array != null) {
                                                uc.field_b = var16_array;
                                                break L115;
                                              } else {
                                                var12_int = 0;
                                                hl.field_v = new nk(var13_ref_nk);
                                                break L115;
                                              }
                                            }
                                            ij.field_Y = -1;
                                            ti.field_B = null;
                                            break L102;
                                          } else {
                                            di.field_c[var16_int] = -1;
                                            var16_int++;
                                            continue L114;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                t.field_h = var13_ref_nk.field_N;
                                if (null == f.field_y) {
                                  var46 = new jc(var14_ref.field_M);
                                  var17_ref_gh = (gh) (Object) var46.b(2);
                                  L116: while (true) {
                                    if (var17_ref_gh == null) {
                                      break L101;
                                    } else {
                                      L117: {
                                        if (!var17_ref_gh.field_kb) {
                                          break L117;
                                        } else {
                                          if (null == var17_ref_gh.field_S) {
                                            break L117;
                                          } else {
                                            L118: {
                                              if (var17_ref_gh.field_S.startsWith("<img=6>")) {
                                                break L118;
                                              } else {
                                                if (var17_ref_gh.field_S.startsWith("<img=2>")) {
                                                  break L118;
                                                } else {
                                                  if (var17_ref_gh.field_S.startsWith("<img=3>")) {
                                                    break L118;
                                                  } else {
                                                    if (-8 != (var17_ref_gh.field_S.length() ^ -1)) {
                                                      break L117;
                                                    } else {
                                                      if (var17_ref_gh.field_S.startsWith("<img=")) {
                                                        break L118;
                                                      } else {
                                                        break L117;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            f.field_y = var17_ref_gh;
                                            break L101;
                                          }
                                        }
                                      }
                                      var17_ref_gh = (gh) (Object) var46.d(2);
                                      continue L116;
                                    }
                                  }
                                } else {
                                  var13_ref_nk = (nk) (Object) ao.field_H.a((byte) -27);
                                  continue L82;
                                }
                              }
                            }
                          }
                          var13_ref_nk = (nk) (Object) ao.field_H.a((byte) -27);
                          continue L82;
                        }
                      }
                    }
                  }
                }
                if (-3 != (lb.field_gc ^ -1)) {
                  break L42;
                } else {
                  if (!he.a((byte) 126)) {
                    break L42;
                  } else {
                    ij.field_Y = -1;
                    ti.field_B = null;
                    f.field_A = null;
                    break L42;
                  }
                }
              } else {
                break L42;
              }
            }
            L119: {
              if (ti.field_B != null) {
                stackOut_482_0 = ti.field_B.field_N;
                stackIn_483_0 = stackOut_482_0;
                break L119;
              } else {
                stackOut_481_0 = -1;
                stackIn_483_0 = stackOut_481_0;
                break L119;
              }
            }
            L120: {
              var5 = stackIn_483_0;
              if (-1 >= (var5 ^ -1)) {
                break L120;
              } else {
                if ((ij.field_Y ^ -1) > -1) {
                  break L120;
                } else {
                  var5 = ij.field_Y;
                  break L120;
                }
              }
            }
            L121: {
              if (param0 == 6993661) {
                break L121;
              } else {
                field_j = -1;
                break L121;
              }
            }
            L122: {
              if (var5 != fl.field_a) {
                lg.field_l = true;
                fl.field_a = var5;
                ad.field_h = true;
                kf.field_s = true;
                break L122;
              } else {
                break L122;
              }
            }
            L123: {
              if (var1 == 0) {
                break L123;
              } else {
                if (gd.field_jb == null) {
                  break L123;
                } else {
                  vn.d(-95);
                  break L123;
                }
              }
            }
            if (gd.field_jb != null) {
              break L40;
            } else {
              var6 = 0;
              L124: while (true) {
                if (var6 >= jg.field_h.length) {
                  break L41;
                } else {
                  jg.field_h[var6] = null;
                  var6++;
                  continue L124;
                }
              }
            }
          }
          L125: {
            L126: {
              var6 = jj.field_e.field_z;
              jj.field_e.d();
              pb.a(0, 0, var6, var6, 0);
              var7_int = ul.a((byte) 105, uc.field_b[0]);
              if (-1 < (var7_int ^ -1)) {
                break L126;
              } else {
                if (si.field_E.length <= var7_int) {
                  break L126;
                } else {
                  break L125;
                }
              }
            }
            var7_int = 0;
            break L125;
          }
          si.field_E[var7_int].c(0, 0, 4 * var6, 4 * var6);
          sb.field_bb.b((byte) 122);
          var6 = hj.field_w;
          hj.field_w = 4096;
          var7 = new gh();
          var7.field_I = wd.field_a;
          var7.field_Kb = 1;
          var7.field_nb = 16777215;
          var7.field_L = (mi) (Object) fk.field_d;
          var7.field_Fb = 1;
          var8 = (qd) (Object) new gh("", var7);
          ((gh) (Object) var8).field_I = km.field_e;
          kh.field_s = new gh("", var7);
          kh.field_s.field_Kb = 0;
          kh.field_s.field_Fb = 0;
          kh.field_s.field_ub = 4;
          kh.field_s.field_I = null;
          kh.field_s.field_nb = 16777215;
          kh.field_s.field_Ib = 17;
          var9 = new gh("", var7);
          var9.field_I = vh.field_b;
          dg.field_g = new gh("", var7);
          dg.field_g.field_I = ng.field_p;
          dg.field_g.field_Ab = cm.field_b;
          var10 = new gh("", var7);
          var10.field_Ab = ta.field_c;
          var10.field_nb = 16777215;
          var10.field_I = wc.field_k;
          var10.field_V = 192;
          var11 = new gh("", var7);
          var11.field_V = 192;
          var11.field_I = ta.field_c;
          var11.field_nb = 16777215;
          var12 = new gh("", var7);
          var12.field_Ab = ta.field_c;
          var12.field_I = wc.field_k;
          var52 = new gh("", var7);
          var52.field_I = bm.field_Y;
          var14 = new gh("", var7);
          var14.field_I = sb.field_X;
          var14.field_Ab = oe.field_f;
          ei.field_n = new gh("", var7);
          ei.field_n.field_I = co.field_d;
          sb.field_Y = new gh("", var7);
          sb.field_Y.field_I = be.field_f;
          dd.field_b = new gh("", var7);
          dd.field_b.field_I = lj.field_b;
          dd.field_b.field_Kb = 0;
          var54 = new gh("", var7);
          var54.field_I = nn.field_a;
          var63 = new gh("", var7);
          var63.field_L = (mi) (Object) fk.field_d;
          var63.field_ub = 4;
          var63.field_I = pa.field_g;
          var63.field_Fb = 0;
          var63.field_Ib = 15;
          var63.field_Kb = 1;
          var63.field_nb = 0;
          gd.field_jb = new gh();
          gd.field_jb.a(0, 0, 480, 0, 640);
          var17 = am.field_d.length;
          var18 = 204 / var17;
          var19 = 10;
          var20_int = 0;
          L127: while (true) {
            if (var17 <= var20_int) {
              bl.field_c = new gh("Listselectpane", var54);
              bl.field_c.a(0, 84, 349, 10, 204);
              gd.field_jb.a(bl.field_c, 118);
              bi.field_d = 15;
              pf.field_n = 4;
              bg.field_y = 4;
              var55 = new gh();
              var55.field_db = sj.field_x[1];
              var55.field_Pb = sj.field_x[0];
              var20 = new gh();
              var20.field_db = ah.field_Zb[1];
              var20.field_Pb = ah.field_Zb[0];
              var21 = new gh();
              var21.field_I = qi.field_a;
              var56 = new gh();
              var56.field_I = jn.field_f;
              var23 = new lb("", var55, var20, var21, var56);
              var57 = new gh("Dataview", (gh) null);
              rh.field_u = var57;
              var25 = 0;
              L128: while (true) {
                if (var25 >= cj.field_a.length) {
                  L129: {
                    var25 = bl.field_c.field_zb + (-(2 * pf.field_n) - bi.field_d) - bg.field_y;
                    qa.field_O = var25;
                    var26_int = -2;
                    if (fg.field_Ob != 0) {
                      var26_int = te.a(var57, var26_int, true, -1);
                      break L129;
                    } else {
                      var26_int = pi.a((byte) -46, var57, var26_int, true);
                      break L129;
                    }
                  }
                  L130: {
                    var27_ref = null;
                    if (1 != fg.field_Ob) {
                      if (!he.a((byte) 124)) {
                        var27_ref = ai.field_v;
                        break L130;
                      } else {
                        if ((2 & fg.field_Ob) != 0) {
                          var27_ref = li.field_E;
                          break L130;
                        } else {
                          if ((fg.field_Ob & 16) != 0) {
                            var27_ref = re.field_hb;
                            break L130;
                          } else {
                            if (fg.field_Ob != 0) {
                              break L130;
                            } else {
                              var27_ref = bg.field_D;
                              break L130;
                            }
                          }
                        }
                      }
                    } else {
                      var27_ref = kc.field_u;
                      break L130;
                    }
                  }
                  L131: {
                    if (var27_ref == null) {
                      break L131;
                    } else {
                      var58 = new gh(-1L, kh.field_s);
                      var29 = fk.field_d.a(var27_ref, -(2 * var58.field_ub) + var25 + -(var58.field_qb * 2), kh.field_s.field_Ib);
                      var59 = new gh(-1L, (gh) null);
                      var26_int += 2;
                      var57.a(var59, 127);
                      var59.a(0, var26_int, var29, 0, var25);
                      var58.field_S = var27_ref;
                      var58.a(0, 0, var29, 0, var25 - 2 * var58.field_qb);
                      var59.a(var58, 125);
                      var26_int = var26_int + var29;
                      var26_int -= 2;
                      var26_int += 8;
                      break L131;
                    }
                  }
                  L132: {
                    hb.field_d = var26_int;
                    if (fg.field_Ob == 0) {
                      var26_int = pi.a((byte) -70, var57, var26_int, false);
                      break L132;
                    } else {
                      var26_int = te.a(var57, var26_int, false, -1);
                      break L132;
                    }
                  }
                  L133: {
                    var28 = 0;
                    if (1 == fg.field_Ob) {
                      var80 = ue.field_c;
                      var30 = 0;
                      L134: while (true) {
                        if (var80.length <= var30) {
                          if (-1 > (var28 ^ -1)) {
                            var26_int = si.a(var57, true, var26_int + 4);
                            break L133;
                          } else {
                            break L133;
                          }
                        } else {
                          var31 = var80[var30];
                          if (var31 != null) {
                            var28++;
                            var30++;
                            continue L134;
                          } else {
                            var30++;
                            continue L134;
                          }
                        }
                      }
                    } else {
                      break L133;
                    }
                  }
                  L135: {
                    if (var27_ref != null) {
                      var26_int += 2;
                      break L135;
                    } else {
                      break L135;
                    }
                  }
                  L136: {
                    var57.a(0, 0, var26_int, 0, 0);
                    var84 = (CharSequence) (Object) "Scrollingview";
                    var61 = new kg(ke.a(var84, (byte) -48), var57, (gh) null, var23);
                    bi.field_f = var61;
                    var61.a(bl.field_c.field_zb + -(2 * pf.field_n), -2048, bi.field_d, bl.field_c.field_Lb + -(pf.field_n * 2), bg.field_y, pf.field_n, pf.field_n);
                    bl.field_c.a((gh) (Object) var61, 124);
                    var30 = -1;
                    if (fg.field_Ob == 0) {
                      var30 = 3;
                      break L136;
                    } else {
                      if (-1 == (1 & fg.field_Ob)) {
                        if (0 != (16 & fg.field_Ob)) {
                          var30 = 2;
                          break L136;
                        } else {
                          if (-1 == (fg.field_Ob & 2)) {
                            break L136;
                          } else {
                            var30 = 1;
                            break L136;
                          }
                        }
                      } else {
                        var30 = 0;
                        break L136;
                      }
                    }
                  }
                  L137: {
                    if (0 <= var30) {
                      var61.field_Ub.field_eb = va.field_k[var30];
                      var61.field_Sb.a(var61.field_Tb.field_Lb, -va.field_k[var30], var61.field_Ub.field_Lb, -1);
                      break L137;
                    } else {
                      break L137;
                    }
                  }
                  L138: {
                    hj.field_w = var6;
                    kk.field_a = new gh("Itempane", kh.field_s);
                    kk.field_a.a(0, 64, 280, 518, 110);
                    gd.field_jb.a(kk.field_a, param0 + -6993534);
                    var62 = new gh(-1L, (gh) null);
                    var62.field_I = tk.field_t;
                    var62.a(0, 20, 257, 0, 110);
                    kk.field_a.a(var62, 126);
                    if (fg.field_Ob == 1) {
                      kk.field_a.field_S = "";
                      break L138;
                    } else {
                      if ((2 & fg.field_Ob) < -1) {
                        var67 = new gh("", var63);
                        var67.field_S = mc.field_b;
                        var67.a(0, 0, 18, 0, 110);
                        kk.field_a.a(var67, param0 ^ 6993543);
                        var26 = new gh("DataListView", (gh) null);
                        hm.field_a = var26;
                        var27 = 4 + oc.a(4, var26);
                        var26.field_I = tk.field_t;
                        var26.a(0, 20, var27, 0, 110);
                        if (var27 > 284) {
                          var86 = (CharSequence) (Object) "Scrollingview2";
                          var68 = new kg(ke.a(var86, (byte) -48), var26, (gh) null, var23);
                          vd.field_a = var68;
                          var68.a(110, -2048, bi.field_d, 301, bg.field_y, 0, 21);
                          kk.field_a.a((gh) (Object) var68, 119);
                          break L138;
                        } else {
                          var62.field_I = null;
                          kk.field_a.a(var26, 125);
                          break L138;
                        }
                      } else {
                        if (-1 >= (fg.field_Ob & 16)) {
                          if (fg.field_Ob == 0) {
                            vb.a(kk.field_a, (byte) 19);
                            break L138;
                          } else {
                            break L138;
                          }
                        } else {
                          L139: {
                            var64 = new gh("", var63);
                            var64.field_S = kf.field_B;
                            var64.a(0, 0, 18, 0, 110);
                            kk.field_a.a(var64, 119);
                            var26_int = og.a(true);
                            var27 = 254;
                            if (var27 >= var26_int) {
                              stackOut_575_0 = 0;
                              stackIn_576_0 = stackOut_575_0;
                              break L139;
                            } else {
                              stackOut_574_0 = 1;
                              stackIn_576_0 = stackOut_574_0;
                              break L139;
                            }
                          }
                          L140: {
                            kc.field_r = stackIn_576_0 != 0;
                            var65 = new gh("DataListView", (gh) null);
                            if (kc.field_r) {
                              break L140;
                            } else {
                              var65.field_I = tk.field_t;
                              break L140;
                            }
                          }
                          L141: {
                            hm.field_a = var65;
                            var29 = ak.a(var65, 112);
                            lg.field_l = true;
                            stackOut_578_0 = (gh) var65;
                            stackOut_578_1 = 0;
                            stackOut_578_2 = 20;
                            stackOut_578_3 = var29;
                            stackIn_580_0 = stackOut_578_0;
                            stackIn_580_1 = stackOut_578_1;
                            stackIn_580_2 = stackOut_578_2;
                            stackIn_580_3 = stackOut_578_3;
                            stackIn_579_0 = stackOut_578_0;
                            stackIn_579_1 = stackOut_578_1;
                            stackIn_579_2 = stackOut_578_2;
                            stackIn_579_3 = stackOut_578_3;
                            if (kc.field_r) {
                              stackOut_580_0 = (gh) (Object) stackIn_580_0;
                              stackOut_580_1 = stackIn_580_1;
                              stackOut_580_2 = stackIn_580_2;
                              stackOut_580_3 = stackIn_580_3;
                              stackOut_580_4 = bi.field_d / 2 - -2;
                              stackIn_581_0 = stackOut_580_0;
                              stackIn_581_1 = stackOut_580_1;
                              stackIn_581_2 = stackOut_580_2;
                              stackIn_581_3 = stackOut_580_3;
                              stackIn_581_4 = stackOut_580_4;
                              break L141;
                            } else {
                              stackOut_579_0 = (gh) (Object) stackIn_579_0;
                              stackOut_579_1 = stackIn_579_1;
                              stackOut_579_2 = stackIn_579_2;
                              stackOut_579_3 = stackIn_579_3;
                              stackOut_579_4 = 0;
                              stackIn_581_0 = stackOut_579_0;
                              stackIn_581_1 = stackOut_579_1;
                              stackIn_581_2 = stackOut_579_2;
                              stackIn_581_3 = stackOut_579_3;
                              stackIn_581_4 = stackOut_579_4;
                              break L141;
                            }
                          }
                          ((gh) (Object) stackIn_581_0).a(stackIn_581_1, stackIn_581_2, stackIn_581_3, stackIn_581_4, 110);
                          if (kc.field_r) {
                            var85 = (CharSequence) (Object) "Scrollingview2";
                            var66 = new kg(ke.a(var85, (byte) -48), var65, (gh) null, var23);
                            vd.field_a = var66;
                            var66.a(107, -2048, bi.field_d, -2 + var27, bg.field_y, 0, 23);
                            kk.field_a.a((gh) (Object) var66, 121);
                            break L138;
                          } else {
                            var62.field_I = null;
                            kk.field_a.a(var65, 120);
                            break L138;
                          }
                        }
                      }
                    }
                  }
                  if (fg.field_Ob == 1) {
                    var62.field_I = null;
                    break L40;
                  } else {
                    break L40;
                  }
                } else {
                  cj.field_a[var25] = null;
                  var25++;
                  continue L128;
                }
              }
            } else {
              L142: {
                var21_int = 0;
                if (var20_int != -1) {
                  break L142;
                } else {
                  if (fg.field_Ob == 1) {
                    var21_int = 1;
                    break L142;
                  } else {
                    break L142;
                  }
                }
              }
              L143: {
                if (1 != var20_int) {
                  break L143;
                } else {
                  if (-1 < (fg.field_Ob & 2)) {
                    var21_int = 1;
                    break L143;
                  } else {
                    break L143;
                  }
                }
              }
              L144: {
                if (2 != var20_int) {
                  break L144;
                } else {
                  if (0 >= (16 & fg.field_Ob)) {
                    break L144;
                  } else {
                    var21_int = 1;
                    break L144;
                  }
                }
              }
              L145: {
                if (-4 != (var20_int ^ -1)) {
                  break L145;
                } else {
                  if (fg.field_Ob != 0) {
                    break L145;
                  } else {
                    var21_int = 1;
                    break L145;
                  }
                }
              }
              L146: {
                stackOut_518_0 = null;
                stackOut_518_1 = null;
                stackOut_518_2 = am.field_d[var20_int];
                stackIn_520_0 = stackOut_518_0;
                stackIn_520_1 = stackOut_518_1;
                stackIn_520_2 = stackOut_518_2;
                stackIn_519_0 = stackOut_518_0;
                stackIn_519_1 = stackOut_518_1;
                stackIn_519_2 = stackOut_518_2;
                if (var21_int != 0) {
                  stackOut_520_0 = null;
                  stackOut_520_1 = null;
                  stackOut_520_2 = (String) (Object) stackIn_520_2;
                  stackOut_520_3 = (gh) var52;
                  stackIn_521_0 = stackOut_520_0;
                  stackIn_521_1 = stackOut_520_1;
                  stackIn_521_2 = stackOut_520_2;
                  stackIn_521_3 = stackOut_520_3;
                  break L146;
                } else {
                  stackOut_519_0 = null;
                  stackOut_519_1 = null;
                  stackOut_519_2 = (String) (Object) stackIn_519_2;
                  stackOut_519_3 = (gh) var14;
                  stackIn_521_0 = stackOut_519_0;
                  stackIn_521_1 = stackOut_519_1;
                  stackIn_521_2 = stackOut_519_2;
                  stackIn_521_3 = stackOut_519_3;
                  break L146;
                }
              }
              L147: {
                new gh(stackIn_521_2, stackIn_521_3);
                var53 = stackIn_521_0;
                wc.field_h[var20_int] = var53;
                stackOut_521_0 = (gh) var53;
                stackOut_521_1 = da.field_e;
                stackOut_521_2 = var20_int;
                stackIn_523_0 = stackOut_521_0;
                stackIn_523_1 = stackOut_521_1;
                stackIn_523_2 = stackOut_521_2;
                stackIn_522_0 = stackOut_521_0;
                stackIn_522_1 = stackOut_521_1;
                stackIn_522_2 = stackOut_521_2;
                if (var21_int != 0) {
                  stackOut_523_0 = (gh) (Object) stackIn_523_0;
                  stackOut_523_1 = (wk[]) (Object) stackIn_523_1;
                  stackOut_523_2 = stackIn_523_2;
                  stackOut_523_3 = 0;
                  stackIn_524_0 = stackOut_523_0;
                  stackIn_524_1 = stackOut_523_1;
                  stackIn_524_2 = stackOut_523_2;
                  stackIn_524_3 = stackOut_523_3;
                  break L147;
                } else {
                  stackOut_522_0 = (gh) (Object) stackIn_522_0;
                  stackOut_522_1 = (wk[]) (Object) stackIn_522_1;
                  stackOut_522_2 = stackIn_522_2;
                  stackOut_522_3 = 4;
                  stackIn_524_0 = stackOut_522_0;
                  stackIn_524_1 = stackOut_522_1;
                  stackIn_524_2 = stackOut_522_2;
                  stackIn_524_3 = stackOut_522_3;
                  break L147;
                }
              }
              stackIn_524_0.field_Pb = stackIn_524_1[stackIn_524_2 - -stackIn_524_3];
              var53.a(param0 ^ 6993661, 59, 25, var19, var18);
              gd.field_jb.a(var53, 126);
              vb.field_a[var20_int] = var53;
              var19 = var19 + var18;
              var20_int++;
              continue L127;
            }
          }
        }
        on.b(param0 + -6993611);
    }

    final void a(int param0, byte[] param1) throws IOException {
        ((rj) this).a((byte) 115, param1, param1.length, 0);
        if (param0 >= -45) {
            rj.a(-54);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        rm.field_g = param2;
        ig.field_e = param0;
        ck.field_e = param3;
        if (param4 != -89) {
            field_k = null;
        }
        jk.field_d = param1;
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
            java.net.URL var3 = new java.net.URL(param1.getCodeBase(), param0);
            var3 = ge.a(param2 ^ -47, var3, param1);
            if (param2 != -47) {
                return;
            }
            try {
                be.a(true, (byte) 26, var3.toString(), param1);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = SteelSentinels.field_G;
        ((rj) this).field_g = 0;
        if (!(((rj) this).field_e == ((rj) this).field_l)) {
            ((rj) this).field_q.a(((rj) this).field_l, -1);
            ((rj) this).field_e = ((rj) this).field_l;
        }
        if (param0 != -84) {
            return;
        }
        ((rj) this).field_i = ((rj) this).field_l;
        while (((rj) this).field_g < ((rj) this).field_n.length) {
            var2 = -((rj) this).field_g + ((rj) this).field_n.length;
            if (!(200000000 >= var2)) {
                var2 = 200000000;
            }
            var3 = ((rj) this).field_q.a(((rj) this).field_n, ((rj) this).field_g, var2, false);
            if (0 == (var3 ^ -1)) {
                break;
            }
            ((rj) this).field_e = ((rj) this).field_e + (long)var3;
            ((rj) this).field_g = ((rj) this).field_g + var3;
        }
    }

    final void a(int param0, long param1) throws IOException {
        if ((param1 ^ -1L) > -1L) {
            throw new IOException();
        }
        ((rj) this).field_l = param1;
        if (param0 > -88) {
            ((rj) this).field_i = 68L;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((rj) this).field_o >= ((rj) this).field_l - -(long)param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((rj) this).field_o = (long)param1 + ((rj) this).field_l;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((((rj) this).field_a ^ -1L) == 0L) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((rj) this).field_l ^ -1L) <= (((rj) this).field_a ^ -1L)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.b((byte) -104);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((((rj) this).field_l ^ -1L) >= (((rj) this).field_a - -(long)((rj) this).field_h ^ -1L)) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.b((byte) -104);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((((rj) this).field_a ^ -1L) == 0L) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((((rj) this).field_a + (long)((rj) this).field_p.length ^ -1L) <= (((rj) this).field_l + (long)param1 ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int = (int)((long)((rj) this).field_p.length + -((rj) this).field_l - -((rj) this).field_a);
                        ii.a(param3, param0, ((rj) this).field_p, (int)(((rj) this).field_l + -((rj) this).field_a), var5_int);
                        param0 = param0 + var5_int;
                        param1 = param1 - var5_int;
                        ((rj) this).field_l = ((rj) this).field_l + (long)var5_int;
                        ((rj) this).field_h = ((rj) this).field_p.length;
                        this.b((byte) -118);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param1 > ((rj) this).field_p.length) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((((rj) this).field_l ^ -1L) == (((rj) this).field_e ^ -1L)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((rj) this).field_q.a(((rj) this).field_l, -1);
                        ((rj) this).field_e = ((rj) this).field_l;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((rj) this).field_q.a(param1, 1, param3, param0);
                        ((rj) this).field_e = ((rj) this).field_e + (long)param1;
                        if (((rj) this).field_e > ((rj) this).field_f) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((rj) this).field_f = ((rj) this).field_e;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5_long = -1L;
                        var7 = -1L;
                        if ((((rj) this).field_l ^ -1L) > (((rj) this).field_i ^ -1L)) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((long)((rj) this).field_g + ((rj) this).field_i > ((rj) this).field_l) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (((rj) this).field_i < ((rj) this).field_l) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (((long)param1 + ((rj) this).field_l ^ -1L) < (((rj) this).field_i ^ -1L)) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5_long = ((rj) this).field_i;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5_long = ((rj) this).field_l;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (((rj) this).field_l - -(long)param1 <= ((rj) this).field_i) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((long)param1 + ((rj) this).field_l <= (long)((rj) this).field_g + ((rj) this).field_i) {
                            statePc = 37;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (((long)((rj) this).field_g + ((rj) this).field_i ^ -1L) >= (((rj) this).field_l ^ -1L)) {
                            statePc = 38;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((((rj) this).field_i + (long)((rj) this).field_g ^ -1L) >= ((long)param1 + ((rj) this).field_l ^ -1L)) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var5_long <= -1L) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((var5_long ^ -1L) <= (var7 ^ -1L)) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = (int)(var7 - var5_long);
                        ii.a(param3, (int)(var5_long + ((long)param0 + -((rj) this).field_l)), ((rj) this).field_n, (int)(var5_long - ((rj) this).field_i), var9);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ((rj) this).field_l = ((rj) this).field_l + (long)param1;
                        return;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var7 = (long)((rj) this).field_g + ((rj) this).field_i;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var7 = (long)param1 + ((rj) this).field_l;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var5_long <= -1L) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((var5_long ^ -1L) <= (var7 ^ -1L)) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var9 = (int)(var7 - var5_long);
                        ii.a(param3, (int)(var5_long + ((long)param0 + -((rj) this).field_l)), ((rj) this).field_n, (int)(var5_long - ((rj) this).field_i), var9);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ((rj) this).field_l = ((rj) this).field_l + (long)param1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 42: {
                    return;
                }
                case 43: {
                    try {
                        if (param1 > 0) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (((rj) this).field_a != -1L) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((rj) this).field_a = ((rj) this).field_l;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ii.a(param3, param0, ((rj) this).field_p, (int)(((rj) this).field_l - ((rj) this).field_a), param1);
                        ((rj) this).field_l = ((rj) this).field_l + (long)param1;
                        if (-((rj) this).field_a + ((rj) this).field_l <= (long)((rj) this).field_h) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ((rj) this).field_h = (int)(((rj) this).field_l - ((rj) this).field_a);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    return;
                }
                case 50: {
                    var5 = (IOException) (Object) caughtException;
                    ((rj) this).field_e = -1L;
                    throw var5;
                }
                case 51: {
                    if (param2 > 17) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var11 = null;
                    rj.a((String) null, (java.applet.Applet) null, (byte) -7);
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    rj(sn param0, int param1, int param2) throws IOException {
        ((rj) this).field_a = -1L;
        ((rj) this).field_i = -1L;
        ((rj) this).field_h = 0;
        ((rj) this).field_q = param0;
        ((rj) this).field_f = param0.d(0);
        ((rj) this).field_o = param0.d(0);
        ((rj) this).field_p = new byte[param2];
        ((rj) this).field_n = new byte[param1];
        ((rj) this).field_l = 0L;
    }

    final void c(int param0) throws IOException {
        if (param0 >= -122) {
            ((rj) this).field_n = null;
        }
        this.b((byte) -97);
        ((rj) this).field_q.a(true);
    }

    public static void a(int param0) {
        field_k = null;
        field_c = null;
        field_d = null;
        if (param0 != 83) {
            return;
        }
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_c = "Send private message to <%0>";
        field_m = new String[]{"Light reactor", "Core reactor", "Dual reactor", "Heavy reactor", "Fusion reactor", "Light capacitor", "Base capacitor", "Heavy capacitor", "Ring capacitor", "Magnon capacitor", "Haze energy shield", "Electron energy shield", "Plasma energy shield", "Dragon energy shield", "Solar energy shield", "EMP bomb", "Targeter", "AMARDS", "Missile scrambler", "Repair system", "Experimental reactor", "Scanner", "Speed loader", "Coolant array", "Emergency displacement deployment", "High-energy amplifier", "Energised armour", "EMP hardening", "Gravity pods", "Aeruak stabilisers", "Walton mirage device", "Siege stabilisation system", "Reinforced armour", "Reactive armour"};
        field_b = 66;
    }
}
