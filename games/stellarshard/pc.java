/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pc {
    private long field_c;
    private long field_l;
    private byte[] field_h;
    private kb field_f;
    private long field_b;
    private int field_d;
    private long field_e;
    private byte[] field_k;
    private long field_a;
    static int field_g;
    private long field_i;
    private int field_j;
    static boolean field_m;

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
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
                    var14 = stellarshard.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 + param2 > param3.length) {
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
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param2 + param0 - param3.length);
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (0L == (((pc) this).field_l ^ -1L)) {
                            statePc = 10;
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
                        if (((pc) this).field_c < ((pc) this).field_l) {
                            statePc = 10;
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
                        if ((long)param0 + ((pc) this).field_c <= (long)((pc) this).field_d + ((pc) this).field_l) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ri.a(((pc) this).field_k, (int)(((pc) this).field_c - ((pc) this).field_l), param3, param2, param0);
                        ((pc) this).field_c = ((pc) this).field_c + (long)param0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        var5_long = ((pc) this).field_c;
                        var7 = param2;
                        var8 = param0;
                        if (((pc) this).field_b > ((pc) this).field_c) {
                            statePc = 16;
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
                        if (((pc) this).field_c < ((pc) this).field_b - -(long)((pc) this).field_j) {
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = (int)(((pc) this).field_b - ((pc) this).field_c + (long)((pc) this).field_j);
                        if (var9_int <= param0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = param0;
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
                        ri.a(((pc) this).field_h, (int)(-((pc) this).field_b + ((pc) this).field_c), param3, param2, var9_int);
                        param2 = param2 + var9_int;
                        ((pc) this).field_c = ((pc) this).field_c + (long)var9_int;
                        param0 = param0 - var9_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param0 > ((pc) this).field_h.length) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (0 >= param0) {
                            statePc = 27;
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
                        this.b(param1 ^ -5);
                        var9_int = param0;
                        if (((pc) this).field_j < var9_int) {
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
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9_int = ((pc) this).field_j;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ri.a(((pc) this).field_h, 0, param3, param2, var9_int);
                        param0 = param0 - var9_int;
                        ((pc) this).field_c = ((pc) this).field_c + (long)var9_int;
                        param2 = param2 + var9_int;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((pc) this).field_f.a(((pc) this).field_c, param1 + 2298);
                        ((pc) this).field_i = ((pc) this).field_c;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((param0 ^ -1) >= -1) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9_int = ((pc) this).field_f.a(param0, param2, param3, 1);
                        if ((var9_int ^ -1) != 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ((pc) this).field_i = ((pc) this).field_i + (long)var9_int;
                        ((pc) this).field_c = ((pc) this).field_c + (long)var9_int;
                        param2 = param2 + var9_int;
                        param0 = param0 - var9_int;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param1 == -93) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return;
                }
                case 29: {
                    try {
                        if (0L == (((pc) this).field_l ^ -1L)) {
                            statePc = 57;
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
                        if (((pc) this).field_l <= ((pc) this).field_c) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((param0 ^ -1) >= -1) {
                            statePc = 36;
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
                        var9_int = (int)(((pc) this).field_l - ((pc) this).field_c) + param2;
                        if (param2 + param0 >= var9_int) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9_int = param2 - -param0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var9_int <= param2) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param0--;
                        param2++;
                        param3[param2] = (byte) 0;
                        ((pc) this).field_c = ((pc) this).field_c + 1L;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if (((pc) this).field_l < var5_long) {
                            statePc = 39;
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
                        if ((var5_long + (long)var8 ^ -1L) >= (((pc) this).field_l ^ -1L)) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = ((pc) this).field_l;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var5_long < ((pc) this).field_l) {
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
                        if (var5_long >= ((pc) this).field_l + (long)((pc) this).field_d) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9 = var5_long;
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
                        if (((pc) this).field_l + (long)((pc) this).field_d <= var5_long) {
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
                        if (var5_long - -(long)var8 >= (long)((pc) this).field_d + ((pc) this).field_l) {
                            statePc = 49;
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
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((((pc) this).field_l ^ -1L) <= (var5_long + (long)var8 ^ -1L)) {
                            statePc = 50;
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
                        if ((long)var8 + var5_long <= (long)((pc) this).field_d + ((pc) this).field_l) {
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
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var11 = (long)((pc) this).field_d + ((pc) this).field_l;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (0L <= (var9 ^ -1L)) {
                            statePc = 57;
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
                        if ((var9 ^ -1L) > (var11 ^ -1L)) {
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
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var13 = (int)(-var9 + var11);
                        ri.a(((pc) this).field_k, (int)(var9 + -((pc) this).field_l), param3, (int)(var9 - var5_long) + var7, var13);
                        if ((((pc) this).field_c ^ -1L) <= (var11 ^ -1L)) {
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
                        param0 = (int)((long)param0 - (-((pc) this).field_c + var11));
                        ((pc) this).field_c = var11;
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
                    ((pc) this).field_i = -1L;
                    throw var5;
                }
                case 57: {
                    if ((param0 ^ -1) < -1) {
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
        L0: {
          var7 = stellarshard.field_B;
          if (((pc) this).field_l != -1L) {
            L1: {
              if ((((pc) this).field_i ^ -1L) == (((pc) this).field_l ^ -1L)) {
                break L1;
              } else {
                ((pc) this).field_f.a(((pc) this).field_l, 2205);
                ((pc) this).field_i = ((pc) this).field_l;
                break L1;
              }
            }
            L2: {
              ((pc) this).field_f.a(((pc) this).field_k, false, 0, ((pc) this).field_d);
              ((pc) this).field_i = ((pc) this).field_i + (long)((pc) this).field_d;
              if ((((pc) this).field_e ^ -1L) > (((pc) this).field_i ^ -1L)) {
                ((pc) this).field_e = ((pc) this).field_i;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if ((((pc) this).field_b ^ -1L) < (((pc) this).field_l ^ -1L)) {
                  break L4;
                } else {
                  if ((((pc) this).field_l ^ -1L) > ((long)((pc) this).field_j + ((pc) this).field_b ^ -1L)) {
                    var2 = ((pc) this).field_l;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if ((((pc) this).field_l ^ -1L) < (((pc) this).field_b ^ -1L)) {
                break L3;
              } else {
                if (((pc) this).field_l + (long)((pc) this).field_d <= ((pc) this).field_b) {
                  break L3;
                } else {
                  var2 = ((pc) this).field_b;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (((pc) this).field_b >= ((pc) this).field_l - -(long)((pc) this).field_d) {
                  break L6;
                } else {
                  if ((((pc) this).field_l - -(long)((pc) this).field_d ^ -1L) < (((pc) this).field_b - -(long)((pc) this).field_j ^ -1L)) {
                    break L6;
                  } else {
                    var4 = ((pc) this).field_l - -(long)((pc) this).field_d;
                    break L5;
                  }
                }
              }
              if (((pc) this).field_b + (long)((pc) this).field_j <= ((pc) this).field_l) {
                break L5;
              } else {
                if (((long)((pc) this).field_d + ((pc) this).field_l ^ -1L) > (((pc) this).field_b + (long)((pc) this).field_j ^ -1L)) {
                  break L5;
                } else {
                  var4 = ((pc) this).field_b + (long)((pc) this).field_j;
                  break L5;
                }
              }
            }
            L7: {
              if (var2 <= -1L) {
                break L7;
              } else {
                if ((var2 ^ -1L) <= (var4 ^ -1L)) {
                  break L7;
                } else {
                  var6 = (int)(var4 - var2);
                  ri.a(((pc) this).field_k, (int)(var2 - ((pc) this).field_l), ((pc) this).field_h, (int)(var2 - ((pc) this).field_b), var6);
                  break L7;
                }
              }
            }
            ((pc) this).field_l = -1L;
            ((pc) this).field_d = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0 >= 92) {
            break L8;
          } else {
            field_g = 104;
            break L8;
          }
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        if (param1 != 0) {
            return;
        }
        ((pc) this).field_c = param0;
    }

    final long c(int param0) {
        if (param0 < 54) {
            ((pc) this).field_k = null;
        }
        return ((pc) this).field_a;
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = stellarshard.field_B;
        ((pc) this).field_j = 0;
        if (!(((pc) this).field_c == ((pc) this).field_i)) {
            ((pc) this).field_f.a(((pc) this).field_c, 2205);
            ((pc) this).field_i = ((pc) this).field_c;
        }
        ((pc) this).field_b = ((pc) this).field_c;
        if (param0 <= 84) {
            ((pc) this).field_f = null;
        }
        while (((pc) this).field_j < ((pc) this).field_h.length) {
            var2 = ((pc) this).field_h.length - ((pc) this).field_j;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            var3 = ((pc) this).field_f.a(var2, ((pc) this).field_j, ((pc) this).field_h, 1);
            if (0 == (var3 ^ -1)) {
                break;
            }
            ((pc) this).field_i = ((pc) this).field_i + (long)var3;
            ((pc) this).field_j = ((pc) this).field_j + var3;
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        ((pc) this).a(param1.length, (byte) -93, param0, param1);
    }

    final static ub a(int param0, pf param1, pf param2, byte param3, int param4) {
        if (param3 == -39) {
          if (!tl.a(param2, (byte) -5, param0, param4)) {
            return null;
          } else {
            return we.a(param1.a(param4, 16, param0), 1);
          }
        } else {
          return null;
        }
    }

    final void a(int param0) throws IOException {
        if (param0 != -4506) {
            ((pc) this).field_f = null;
        }
        this.a((byte) 101);
        ((pc) this).field_f.a(param0 ^ 4590);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
                    var10 = stellarshard.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((long)param0 + ((pc) this).field_c ^ -1L) >= (((pc) this).field_a ^ -1L)) {
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
                        ((pc) this).field_a = ((pc) this).field_c + (long)param0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (0L == (((pc) this).field_l ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((pc) this).field_l > ((pc) this).field_c) {
                            statePc = 7;
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
                        if ((((pc) this).field_c ^ -1L) < ((long)((pc) this).field_d + ((pc) this).field_l ^ -1L)) {
                            statePc = 7;
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.a((byte) 108);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (0L == (((pc) this).field_l ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((long)((pc) this).field_k.length + ((pc) this).field_l ^ -1L) > ((long)param0 + ((pc) this).field_c ^ -1L)) {
                            statePc = 11;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int = (int)(-((pc) this).field_c + (((pc) this).field_l + (long)((pc) this).field_k.length));
                        ri.a(param3, param1, ((pc) this).field_k, (int)(-((pc) this).field_l + ((pc) this).field_c), var5_int);
                        param1 = param1 + var5_int;
                        ((pc) this).field_c = ((pc) this).field_c + (long)var5_int;
                        param0 = param0 - var5_int;
                        ((pc) this).field_d = ((pc) this).field_k.length;
                        this.a((byte) 108);
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
                        if (param0 <= ((pc) this).field_k.length) {
                            statePc = 38;
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
                        if (((pc) this).field_i == ((pc) this).field_c) {
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
                        ((pc) this).field_f.a(((pc) this).field_c, param2 ^ -2206);
                        ((pc) this).field_i = ((pc) this).field_c;
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
                        ((pc) this).field_f.a(param3, false, param1, param0);
                        ((pc) this).field_i = ((pc) this).field_i + (long)param0;
                        if ((((pc) this).field_e ^ -1L) > (((pc) this).field_i ^ -1L)) {
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
                        ((pc) this).field_e = ((pc) this).field_i;
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
                        if ((((pc) this).field_c ^ -1L) > (((pc) this).field_b ^ -1L)) {
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
                        if (((long)((pc) this).field_j + ((pc) this).field_b ^ -1L) < (((pc) this).field_c ^ -1L)) {
                            statePc = 25;
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
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (((pc) this).field_c > ((pc) this).field_b) {
                            statePc = 26;
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
                        if ((((pc) this).field_b ^ -1L) > (((pc) this).field_c + (long)param0 ^ -1L)) {
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
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5_long = ((pc) this).field_b;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5_long = ((pc) this).field_c;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7 = -1L;
                        if ((((pc) this).field_b ^ -1L) <= ((long)param0 + ((pc) this).field_c ^ -1L)) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((long)param0 + ((pc) this).field_c <= (long)((pc) this).field_j + ((pc) this).field_b) {
                            statePc = 32;
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
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((pc) this).field_b + (long)((pc) this).field_j <= ((pc) this).field_c) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((long)((pc) this).field_j + ((pc) this).field_b > (long)param0 + ((pc) this).field_c) {
                            statePc = 33;
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
                        var7 = ((pc) this).field_b + (long)((pc) this).field_j;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var7 = ((pc) this).field_c - -(long)param0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var5_long <= -1L) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var5_long >= var7) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = (int)(-var5_long + var7);
                        ri.a(param3, (int)(-((pc) this).field_c + ((long)param1 + var5_long)), ((pc) this).field_h, (int)(var5_long + -((pc) this).field_b), var9);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ((pc) this).field_c = ((pc) this).field_c + (long)param0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return;
                }
                case 38: {
                    try {
                        if ((param0 ^ -1) < param2) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((((pc) this).field_l ^ -1L) == 0L) {
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
                        ((pc) this).field_l = ((pc) this).field_c;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ri.a(param3, param1, ((pc) this).field_k, (int)(((pc) this).field_c + -((pc) this).field_l), param0);
                        ((pc) this).field_c = ((pc) this).field_c + (long)param0;
                        if (((long)((pc) this).field_d ^ -1L) <= (-((pc) this).field_l + ((pc) this).field_c ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((pc) this).field_d = (int)(((pc) this).field_c - ((pc) this).field_l);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    return;
                }
                case 46: {
                    var5 = (IOException) (Object) caughtException;
                    ((pc) this).field_i = -1L;
                    throw var5;
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    pc(kb param0, int param1, int param2) throws IOException {
        ((pc) this).field_b = -1L;
        ((pc) this).field_l = -1L;
        ((pc) this).field_d = 0;
        ((pc) this).field_f = param0;
        ((pc) this).field_e = param0.b(-106);
        ((pc) this).field_a = param0.b(-106);
        ((pc) this).field_h = new byte[param1];
        ((pc) this).field_k = new byte[param2];
        ((pc) this).field_c = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 50;
    }
}
