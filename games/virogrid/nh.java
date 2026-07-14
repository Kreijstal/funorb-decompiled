/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nh {
    private byte[] field_e;
    static String field_a;
    private long field_g;
    static int field_o;
    private int field_p;
    static String[] field_d;
    private byte[] field_i;
    private long field_f;
    private long field_b;
    private long field_m;
    static String field_r;
    private long field_q;
    static String field_l;
    static String field_n;
    private ji field_h;
    private long field_j;
    static int[] field_s;
    private int field_k;
    static int field_c;

    final void b(byte param0) throws IOException {
        if (param0 != 14) {
            ((nh) this).field_f = -101L;
        }
        this.a(-1);
        ((nh) this).field_h.b(0);
    }

    final long a(byte param0) {
        if (param0 < 124) {
            return 75L;
        }
        return ((nh) this).field_b;
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if (((nh) this).field_m == (long)param0) {
            break L0;
          } else {
            L1: {
              if (((nh) this).field_g != ((nh) this).field_m) {
                ((nh) this).field_h.a(param0 + 110, ((nh) this).field_m);
                ((nh) this).field_g = ((nh) this).field_m;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((nh) this).field_h.a(((nh) this).field_p, ((nh) this).field_i, 0, false);
              ((nh) this).field_g = ((nh) this).field_g + (long)((nh) this).field_p;
              if ((((nh) this).field_g ^ -1L) >= (((nh) this).field_q ^ -1L)) {
                break L2;
              } else {
                ((nh) this).field_q = ((nh) this).field_g;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (((nh) this).field_m < ((nh) this).field_f) {
                  break L4;
                } else {
                  if ((((nh) this).field_m ^ -1L) <= (((nh) this).field_f - -(long)((nh) this).field_k ^ -1L)) {
                    break L4;
                  } else {
                    var2 = ((nh) this).field_m;
                    break L3;
                  }
                }
              }
              if (((nh) this).field_f < ((nh) this).field_m) {
                break L3;
              } else {
                if ((long)((nh) this).field_p + ((nh) this).field_m <= ((nh) this).field_f) {
                  break L3;
                } else {
                  var2 = ((nh) this).field_f;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if ((((nh) this).field_f ^ -1L) <= ((long)((nh) this).field_p + ((nh) this).field_m ^ -1L)) {
                  break L6;
                } else {
                  if ((long)((nh) this).field_k + ((nh) this).field_f >= (long)((nh) this).field_p + ((nh) this).field_m) {
                    var4 = (long)((nh) this).field_p + ((nh) this).field_m;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if ((((nh) this).field_m ^ -1L) <= (((nh) this).field_f + (long)((nh) this).field_k ^ -1L)) {
                break L5;
              } else {
                if (((nh) this).field_f + (long)((nh) this).field_k > ((nh) this).field_m - -(long)((nh) this).field_p) {
                  break L5;
                } else {
                  var4 = (long)((nh) this).field_k + ((nh) this).field_f;
                  break L5;
                }
              }
            }
            L7: {
              if (var2 <= -1L) {
                break L7;
              } else {
                if ((var4 ^ -1L) < (var2 ^ -1L)) {
                  var6 = (int)(var4 + -var2);
                  ek.a(((nh) this).field_i, (int)(var2 + -((nh) this).field_m), ((nh) this).field_e, (int)(var2 + -((nh) this).field_f), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((nh) this).field_m = -1L;
            ((nh) this).field_p = 0;
            break L0;
          }
        }
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
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
                    var14 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 + param0 <= param2.length) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param2.length + param0 - -param1);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((nh) this).field_m == -1L) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((nh) this).field_j ^ -1L) > (((nh) this).field_m ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((long)param1 + ((nh) this).field_j ^ -1L) < (((nh) this).field_m - -(long)((nh) this).field_p ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ek.a(((nh) this).field_i, (int)(-((nh) this).field_m + ((nh) this).field_j), param2, param0, param1);
                        ((nh) this).field_j = ((nh) this).field_j + (long)param1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var5_long = ((nh) this).field_j;
                        if (param3 >= 122) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        var7 = param0;
                        var8 = param1;
                        if (((nh) this).field_j < ((nh) this).field_f) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((nh) this).field_j >= ((nh) this).field_f - -(long)((nh) this).field_k) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9_int = (int)(-((nh) this).field_j + (((nh) this).field_f + (long)((nh) this).field_k));
                        if (param1 >= var9_int) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = param1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ek.a(((nh) this).field_e, (int)(((nh) this).field_j + -((nh) this).field_f), param2, param0, var9_int);
                        param0 = param0 + var9_int;
                        ((nh) this).field_j = ((nh) this).field_j + (long)var9_int;
                        param1 = param1 - var9_int;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((nh) this).field_e.length < param1) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-1 <= (param1 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.b(17460);
                        var9_int = param1;
                        if (var9_int > ((nh) this).field_k) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9_int = ((nh) this).field_k;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ek.a(((nh) this).field_e, 0, param2, param0, var9_int);
                        ((nh) this).field_j = ((nh) this).field_j + (long)var9_int;
                        param0 = param0 + var9_int;
                        param1 = param1 - var9_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((nh) this).field_h.a(-119, ((nh) this).field_j);
                        ((nh) this).field_g = ((nh) this).field_j;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param1 <= 0) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var9_int = ((nh) this).field_h.a(param1, param0, 1, param2);
                        if (var9_int == -1) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((nh) this).field_g = ((nh) this).field_g + (long)var9_int;
                        param1 = param1 - var9_int;
                        ((nh) this).field_j = ((nh) this).field_j + (long)var9_int;
                        param0 = param0 + var9_int;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-1L == ((nh) this).field_m) {
                            statePc = 54;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (((nh) this).field_m <= ((nh) this).field_j) {
                            statePc = 34;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (-1 > (param1 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9_int = (int)(-((nh) this).field_j + ((nh) this).field_m) + param0;
                        if (param0 + param1 < var9_int) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9_int = param1 + param0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var9_int <= param0) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        param0++;
                        param2[param0] = (byte) 0;
                        param1--;
                        ((nh) this).field_j = ((nh) this).field_j + 1L;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if ((var5_long ^ -1L) < (((nh) this).field_m ^ -1L)) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (((nh) this).field_m < (long)var8 + var5_long) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((((nh) this).field_m ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((((nh) this).field_m + (long)((nh) this).field_p ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var9 = var5_long;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var9 = ((nh) this).field_m;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (((nh) this).field_m + (long)((nh) this).field_p <= var5_long) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((nh) this).field_m + (long)((nh) this).field_p > var5_long - -(long)var8) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var11 = (long)((nh) this).field_p + ((nh) this).field_m;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (((nh) this).field_m >= var5_long + (long)var8) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((long)((nh) this).field_p + ((nh) this).field_m >= (long)var8 + var5_long) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11 = var5_long + (long)var8;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((var9 ^ -1L) >= 0L) {
                            statePc = 54;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var13 = (int)(-var9 + var11);
                        ek.a(((nh) this).field_i, (int)(-((nh) this).field_m + var9), param2, var7 + (int)(var9 - var5_long), var13);
                        if ((((nh) this).field_j ^ -1L) <= (var11 ^ -1L)) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        param1 = (int)((long)param1 - (var11 - ((nh) this).field_j));
                        ((nh) this).field_j = var11;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    var5 = (IOException) (Object) caughtException;
                    ((nh) this).field_g = -1L;
                    throw var5;
                }
                case 54: {
                    if ((param1 ^ -1) < -1) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    return;
                }
                case 56: {
                    throw new EOFException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        ((nh) this).a(0, param1.length, param1, (byte) 124);
        if (param0 != -102) {
            ((nh) this).field_m = 89L;
        }
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        ((nh) this).field_k = 0;
        if ((((nh) this).field_j ^ -1L) != (((nh) this).field_g ^ -1L)) {
            ((nh) this).field_h.a(-100, ((nh) this).field_j);
            ((nh) this).field_g = ((nh) this).field_j;
        }
        if (param0 != 17460) {
            ((nh) this).field_i = null;
        }
        ((nh) this).field_f = ((nh) this).field_j;
        while (((nh) this).field_k < ((nh) this).field_e.length) {
            var2 = -((nh) this).field_k + ((nh) this).field_e.length;
            if (!(-200000001 <= (var2 ^ -1))) {
                var2 = 200000000;
            }
            var3 = ((nh) this).field_h.a(var2, ((nh) this).field_k, 1, ((nh) this).field_e);
            if ((var3 ^ -1) == 0) {
                break;
            }
            ((nh) this).field_k = ((nh) this).field_k + var3;
            ((nh) this).field_g = ((nh) this).field_g + (long)var3;
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 != 0) {
        }
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        ((nh) this).field_j = param0;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
                    var10 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((long)param2 + ((nh) this).field_j <= ((nh) this).field_b) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((nh) this).field_b = (long)param2 + ((nh) this).field_j;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((((nh) this).field_m ^ -1L) == 0L) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((nh) this).field_m <= ((nh) this).field_j) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.a(-1);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((nh) this).field_m + (long)((nh) this).field_p >= ((nh) this).field_j) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.a(-1);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((nh) this).field_m == -1L) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((nh) this).field_j + (long)param2 <= ((nh) this).field_m + (long)((nh) this).field_i.length) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int = (int)((long)((nh) this).field_i.length - ((nh) this).field_j - -((nh) this).field_m);
                        ek.a(param1, param0, ((nh) this).field_i, (int)(((nh) this).field_j + -((nh) this).field_m), var5_int);
                        param2 = param2 - var5_int;
                        ((nh) this).field_j = ((nh) this).field_j + (long)var5_int;
                        param0 = param0 + var5_int;
                        ((nh) this).field_p = ((nh) this).field_i.length;
                        this.a(param3 + -1);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param2 > ((nh) this).field_i.length) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((nh) this).field_g == ((nh) this).field_j) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((nh) this).field_h.a(81, ((nh) this).field_j);
                        ((nh) this).field_g = ((nh) this).field_j;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((nh) this).field_h.a(param2, param1, param0, false);
                        ((nh) this).field_g = ((nh) this).field_g + (long)param2;
                        if (((nh) this).field_g <= ((nh) this).field_q) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((nh) this).field_q = ((nh) this).field_g;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5_long = -1L;
                        if ((((nh) this).field_j ^ -1L) > (((nh) this).field_f ^ -1L)) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((long)((nh) this).field_k + ((nh) this).field_f > ((nh) this).field_j) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((((nh) this).field_j ^ -1L) < (((nh) this).field_f ^ -1L)) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((((nh) this).field_f ^ -1L) <= ((long)param2 + ((nh) this).field_j ^ -1L)) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5_long = ((nh) this).field_f;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5_long = ((nh) this).field_j;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7 = -1L;
                        if ((((nh) this).field_j - -(long)param2 ^ -1L) >= (((nh) this).field_f ^ -1L)) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (((nh) this).field_j + (long)param2 > (long)((nh) this).field_k + ((nh) this).field_f) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7 = (long)param2 + ((nh) this).field_j;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((nh) this).field_f + (long)((nh) this).field_k <= ((nh) this).field_j) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((nh) this).field_f - -(long)((nh) this).field_k > ((nh) this).field_j + (long)param2) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7 = ((nh) this).field_f + (long)((nh) this).field_k;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((var5_long ^ -1L) >= 0L) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 44;
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
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9 = (int)(-var5_long + var7);
                        ek.a(param1, (int)(var5_long + ((long)param0 + -((nh) this).field_j)), ((nh) this).field_e, (int)(var5_long - ((nh) this).field_f), var9);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((nh) this).field_j = ((nh) this).field_j + (long)param2;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return;
                }
                case 36: {
                    try {
                        if (param2 > param3) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (0L == (((nh) this).field_m ^ -1L)) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((nh) this).field_m = ((nh) this).field_j;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ek.a(param1, param0, ((nh) this).field_i, (int)(-((nh) this).field_m + ((nh) this).field_j), param2);
                        ((nh) this).field_j = ((nh) this).field_j + (long)param2;
                        if (-((nh) this).field_m + ((nh) this).field_j <= (long)((nh) this).field_p) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((nh) this).field_p = (int)(((nh) this).field_j - ((nh) this).field_m);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return;
                }
                case 44: {
                    var5 = (IOException) (Object) caughtException;
                    ((nh) this).field_g = -1L;
                    throw var5;
                }
                case 45: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        field_s = null;
        if (param0) {
            field_r = null;
        }
        field_n = null;
        field_d = null;
        field_a = null;
        field_l = null;
        field_r = null;
    }

    nh(ji param0, int param1, int param2) throws IOException {
        ((nh) this).field_m = -1L;
        ((nh) this).field_f = -1L;
        ((nh) this).field_p = 0;
        ((nh) this).field_h = param0;
        ((nh) this).field_q = param0.a((byte) 104);
        ((nh) this).field_b = param0.a((byte) 104);
        ((nh) this).field_i = new byte[param2];
        ((nh) this).field_e = new byte[param1];
        ((nh) this).field_j = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Loading music";
        field_l = "Passwords must be between 5 and 20 characters long";
        field_a = "Spectate";
        field_n = "Message lobby";
    }
}
