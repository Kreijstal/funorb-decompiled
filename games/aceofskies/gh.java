/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gh {
    private long field_e;
    private long field_k;
    private long field_h;
    static String field_o;
    private byte[] field_g;
    private byte[] field_n;
    private long field_d;
    private long field_l;
    static ia field_i;
    private int field_c;
    private int field_a;
    static vb field_f;
    private long field_b;
    static gb field_j;
    private fs field_m;

    private final void a(int param0) throws IOException {
        int var2 = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = AceOfSkies.field_G ? 1 : 0;
          var2 = -57 / ((83 - param0) / 41);
          if (((gh) this).field_e != -1L) {
            L1: {
              if ((((gh) this).field_d ^ -1L) == (((gh) this).field_e ^ -1L)) {
                break L1;
              } else {
                ((gh) this).field_m.a(((gh) this).field_e, true);
                ((gh) this).field_d = ((gh) this).field_e;
                break L1;
              }
            }
            L2: {
              ((gh) this).field_m.a(((gh) this).field_g, 0, 66, ((gh) this).field_c);
              ((gh) this).field_d = ((gh) this).field_d + (long)((gh) this).field_c;
              if ((((gh) this).field_d ^ -1L) < (((gh) this).field_h ^ -1L)) {
                ((gh) this).field_h = ((gh) this).field_d;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                var5 = -1L;
                if (((gh) this).field_e < ((gh) this).field_l) {
                  break L4;
                } else {
                  if (((long)((gh) this).field_a + ((gh) this).field_l ^ -1L) < (((gh) this).field_e ^ -1L)) {
                    var3 = ((gh) this).field_e;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if ((((gh) this).field_l ^ -1L) > (((gh) this).field_e ^ -1L)) {
                break L3;
              } else {
                if ((((gh) this).field_l ^ -1L) > (((gh) this).field_e + (long)((gh) this).field_c ^ -1L)) {
                  var3 = ((gh) this).field_l;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if ((((gh) this).field_l ^ -1L) <= ((long)((gh) this).field_c + ((gh) this).field_e ^ -1L)) {
                  break L6;
                } else {
                  if (((gh) this).field_l - -(long)((gh) this).field_a < (long)((gh) this).field_c + ((gh) this).field_e) {
                    break L6;
                  } else {
                    var5 = ((gh) this).field_e - -(long)((gh) this).field_c;
                    break L5;
                  }
                }
              }
              if (((gh) this).field_e >= (long)((gh) this).field_a + ((gh) this).field_l) {
                break L5;
              } else {
                if ((((gh) this).field_l - -(long)((gh) this).field_a ^ -1L) >= (((gh) this).field_e + (long)((gh) this).field_c ^ -1L)) {
                  var5 = ((gh) this).field_l - -(long)((gh) this).field_a;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (0L <= (var3 ^ -1L)) {
                break L7;
              } else {
                if ((var3 ^ -1L) > (var5 ^ -1L)) {
                  var7 = (int)(-var3 + var5);
                  au.a(((gh) this).field_g, (int)(-((gh) this).field_e + var3), ((gh) this).field_n, (int)(var3 + -((gh) this).field_l), var7);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((gh) this).field_e = -1L;
            ((gh) this).field_c = 0;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final void a(byte param0) throws IOException {
        if (param0 != 106) {
            return;
        }
        this.a(param0 ^ 22);
        ((gh) this).field_m.a(19260);
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
                    var14 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 + param3 > param2.length) {
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
                        throw new ArrayIndexOutOfBoundsException(param3 - (-param1 - -param2.length));
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((gh) this).field_e == -1L) {
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
                        if ((((gh) this).field_e ^ -1L) < (((gh) this).field_k ^ -1L)) {
                            statePc = 9;
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
                        if ((long)((gh) this).field_c + ((gh) this).field_e < ((gh) this).field_k - -(long)param1) {
                            statePc = 9;
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
                        au.a(((gh) this).field_g, (int)(-((gh) this).field_e + ((gh) this).field_k), param2, param3, param1);
                        ((gh) this).field_k = ((gh) this).field_k + (long)param1;
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
                        var5_long = ((gh) this).field_k;
                        if (param0 == 0) {
                            statePc = 11;
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
                        ((gh) this).field_n = (byte[]) null;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = param3;
                        var8 = param1;
                        if (((gh) this).field_k < ((gh) this).field_l) {
                            statePc = 17;
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
                        if ((long)((gh) this).field_a + ((gh) this).field_l > ((gh) this).field_k) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = (int)(-((gh) this).field_k + (((gh) this).field_l + (long)((gh) this).field_a));
                        if (var9_int <= param1) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9_int = param1;
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
                        au.a(((gh) this).field_n, (int)(-((gh) this).field_l + ((gh) this).field_k), param2, param3, var9_int);
                        param3 = param3 + var9_int;
                        param1 = param1 - var9_int;
                        ((gh) this).field_k = ((gh) this).field_k + (long)var9_int;
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
                        if (((gh) this).field_n.length >= param1) {
                            statePc = 23;
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
                        ((gh) this).field_m.a(((gh) this).field_k, true);
                        ((gh) this).field_d = ((gh) this).field_k;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((param1 ^ -1) >= -1) {
                            statePc = 28;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9_int = ((gh) this).field_m.a(param1, (byte) 53, param3, param2);
                        if (var9_int != -1) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param1 = param1 - var9_int;
                        ((gh) this).field_k = ((gh) this).field_k + (long)var9_int;
                        param3 = param3 + var9_int;
                        ((gh) this).field_d = ((gh) this).field_d + (long)var9_int;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (0 >= param1) {
                            statePc = 28;
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
                        this.d(0);
                        var9_int = param1;
                        if (var9_int > ((gh) this).field_a) {
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
                        var9_int = ((gh) this).field_a;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        au.a(((gh) this).field_n, 0, param2, param3, var9_int);
                        param1 = param1 - var9_int;
                        ((gh) this).field_k = ((gh) this).field_k + (long)var9_int;
                        param3 = param3 + var9_int;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((gh) this).field_e != -1L) {
                            statePc = 30;
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
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (((gh) this).field_e <= ((gh) this).field_k) {
                            statePc = 37;
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
                        if (param1 <= 0) {
                            statePc = 37;
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
                        var9_int = (int)(-((gh) this).field_k + ((gh) this).field_e) + param3;
                        if (var9_int > param3 + param1) {
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
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9_int = param3 - -param1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (param3 >= var9_int) {
                            statePc = 37;
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
                        param1--;
                        param3++;
                        param2[param3] = (byte) 0;
                        ((gh) this).field_k = ((gh) this).field_k + 1L;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if (((gh) this).field_e < var5_long) {
                            statePc = 40;
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
                        if ((((gh) this).field_e ^ -1L) > ((long)var8 + var5_long ^ -1L)) {
                            statePc = 44;
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
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((((gh) this).field_e ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 45;
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
                        if (((long)((gh) this).field_c + ((gh) this).field_e ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 56;
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
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var9 = ((gh) this).field_e;
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
                        if (((long)((gh) this).field_c + ((gh) this).field_e ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 48;
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
                        if (((gh) this).field_e + (long)((gh) this).field_c > (long)var8 + var5_long) {
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
                        var11 = ((gh) this).field_e - -(long)((gh) this).field_c;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (((long)var8 + var5_long ^ -1L) >= (((gh) this).field_e ^ -1L)) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((long)var8 + var5_long > (long)((gh) this).field_c + ((gh) this).field_e) {
                            statePc = 51;
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
                        var11 = var5_long - -(long)var8;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (0L <= (var9 ^ -1L)) {
                            statePc = 57;
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
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
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
                        au.a(((gh) this).field_g, (int)(var9 + -((gh) this).field_e), param2, (int)(-var5_long + var9) + var7, var13);
                        if (((gh) this).field_k >= var11) {
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
                        param1 = (int)((long)param1 - (var11 + -((gh) this).field_k));
                        ((gh) this).field_k = var11;
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
                    ((gh) this).field_d = -1L;
                    throw var5;
                }
                case 57: {
                    if (-1 > (param1 ^ -1)) {
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

    final static boolean a(int param0, boolean param1, int param2) {
        if (param1) {
            return true;
        }
        return 0 != (65536 & param2) ? true : false;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 16 / ((param3 - 21) / 45);
                        if (((gh) this).field_b < ((gh) this).field_k + (long)param0) {
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
                        ((gh) this).field_b = (long)param0 + ((gh) this).field_k;
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
                        if (((gh) this).field_e == -1L) {
                            statePc = 10;
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
                        if ((((gh) this).field_e ^ -1L) >= (((gh) this).field_k ^ -1L)) {
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
                        this.a(-125);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((((gh) this).field_e + (long)((gh) this).field_c ^ -1L) <= (((gh) this).field_k ^ -1L)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
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
                        this.a(-125);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (0L == (((gh) this).field_e ^ -1L)) {
                            statePc = 13;
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
                        if (((long)param0 + ((gh) this).field_k ^ -1L) >= (((gh) this).field_e - -(long)((gh) this).field_g.length ^ -1L)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6_int = (int)(((gh) this).field_e - (((gh) this).field_k - (long)((gh) this).field_g.length));
                        au.a(param1, param2, ((gh) this).field_g, (int)(((gh) this).field_k + -((gh) this).field_e), var6_int);
                        ((gh) this).field_k = ((gh) this).field_k + (long)var6_int;
                        param2 = param2 + var6_int;
                        param0 = param0 - var6_int;
                        ((gh) this).field_c = ((gh) this).field_g.length;
                        this.a(-39);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (((gh) this).field_g.length >= param0) {
                            statePc = 38;
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
                        if (((gh) this).field_d == ((gh) this).field_k) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((gh) this).field_m.a(((gh) this).field_k, true);
                        ((gh) this).field_d = ((gh) this).field_k;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((gh) this).field_m.a(param1, param2, 80, param0);
                        ((gh) this).field_d = ((gh) this).field_d + (long)param0;
                        if (((gh) this).field_d <= ((gh) this).field_h) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((gh) this).field_h = ((gh) this).field_d;
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
                        var6 = -1L;
                        var8 = -1L;
                        if ((((gh) this).field_k ^ -1L) > (((gh) this).field_l ^ -1L)) {
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
                        if ((((gh) this).field_l + (long)((gh) this).field_a ^ -1L) >= (((gh) this).field_k ^ -1L)) {
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
                        var6 = ((gh) this).field_k;
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
                        if (((gh) this).field_l < ((gh) this).field_k) {
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
                        if ((((gh) this).field_k - -(long)param0 ^ -1L) >= (((gh) this).field_l ^ -1L)) {
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
                        var6 = ((gh) this).field_l;
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
                        if (((gh) this).field_l >= ((gh) this).field_k - -(long)param0) {
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
                        if ((long)param0 + ((gh) this).field_k <= (long)((gh) this).field_a + ((gh) this).field_l) {
                            statePc = 31;
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
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((gh) this).field_l - -(long)((gh) this).field_a ^ -1L) >= (((gh) this).field_k ^ -1L)) {
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
                        if ((long)((gh) this).field_a + ((gh) this).field_l <= (long)param0 + ((gh) this).field_k) {
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
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var8 = ((gh) this).field_l + (long)((gh) this).field_a;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var8 = ((gh) this).field_k + (long)param0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (-1L >= var6) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var8 > var6) {
                            statePc = 35;
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
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var10 = (int)(var8 + -var6);
                        au.a(param1, (int)(-((gh) this).field_k + var6 + (long)param2), ((gh) this).field_n, (int)(-((gh) this).field_l + var6), var10);
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
                        ((gh) this).field_k = ((gh) this).field_k + (long)param0;
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
                        if (-1 <= (param0 ^ -1)) {
                            statePc = 47;
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
                        if (0L == (((gh) this).field_e ^ -1L)) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ((gh) this).field_e = ((gh) this).field_k;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        au.a(param1, param2, ((gh) this).field_g, (int)(((gh) this).field_k + -((gh) this).field_e), param0);
                        ((gh) this).field_k = ((gh) this).field_k + (long)param0;
                        if ((-((gh) this).field_e + ((gh) this).field_k ^ -1L) < ((long)((gh) this).field_c ^ -1L)) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((gh) this).field_c = (int)(-((gh) this).field_e + ((gh) this).field_k);
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
                    ((gh) this).field_d = -1L;
                    throw var5;
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, long param1) throws IOException {
        if (!(0L <= param1)) {
            throw new IOException();
        }
        ((gh) this).field_k = param1;
        if (!param0) {
            gk var5 = (gk) null;
            boolean discarded$0 = gh.a((byte) 37, (gk) null);
        }
    }

    public static void b(int param0) {
        field_o = null;
        if (param0 != 0) {
            field_i = (ia) null;
        }
        field_i = null;
        field_j = null;
    }

    final void a(byte[] param0, int param1) throws IOException {
        if (param1 != 13541) {
            return;
        }
        ((gh) this).a(0, param0.length, param0, 0);
    }

    final static boolean a(byte param0, gk param1) {
        if (param0 != 15) {
            gk var3 = (gk) null;
            boolean discarded$0 = gh.a((byte) 52, (gk) null);
        }
        return param1.b(0);
    }

    final long c(int param0) {
        int var2 = 54 % ((param0 - -8) / 45);
        return ((gh) this).field_b;
    }

    private final void d(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        ((gh) this).field_a = param0;
        if (!(((gh) this).field_k == ((gh) this).field_d)) {
            ((gh) this).field_m.a(((gh) this).field_k, true);
            ((gh) this).field_d = ((gh) this).field_k;
        }
        ((gh) this).field_l = ((gh) this).field_k;
        while (((gh) this).field_n.length > ((gh) this).field_a) {
            var2 = -((gh) this).field_a + ((gh) this).field_n.length;
            if (!(-200000001 <= (var2 ^ -1))) {
                var2 = 200000000;
            }
            var3 = ((gh) this).field_m.a(var2, (byte) 53, ((gh) this).field_a, ((gh) this).field_n);
            if (var3 == -1) {
                break;
            }
            ((gh) this).field_a = ((gh) this).field_a + var3;
            ((gh) this).field_d = ((gh) this).field_d + (long)var3;
        }
    }

    gh(fs param0, int param1, int param2) throws IOException {
        ((gh) this).field_l = -1L;
        ((gh) this).field_c = 0;
        ((gh) this).field_e = -1L;
        ((gh) this).field_m = param0;
        ((gh) this).field_h = param0.a(false);
        ((gh) this).field_b = param0.a(false);
        ((gh) this).field_n = new byte[param1];
        ((gh) this).field_g = new byte[param2];
        ((gh) this).field_k = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Email is valid";
        field_i = new ia();
        field_f = null;
        field_j = new gb(2.0, 15, 0, 100, 2, 6.0, 12.0, 16, 0);
    }
}
