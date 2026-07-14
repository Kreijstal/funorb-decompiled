/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ak {
    static String field_c;
    static String field_g;
    static int field_q;
    private int field_n;
    private long field_h;
    static int field_e;
    private long field_p;
    private long field_o;
    private b field_d;
    private int field_m;
    private byte[] field_a;
    static String field_f;
    private byte[] field_k;
    static String field_j;
    private long field_l;
    private long field_i;
    private long field_b;

    final void b(byte param0) throws IOException {
        this.a(0);
        if (param0 > -5) {
            ak.a(false);
        }
        ((ak) this).field_d.a(118);
    }

    final static void b(int param0) {
        int var1 = -86 / ((4 - param0) / 52);
        rd.field_k = new jj();
    }

    final long a(byte param0) {
        int var2 = 36 % ((-70 - param0) / 40);
        return ((ak) this).field_i;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_f = null;
        field_j = null;
        if (param0) {
            field_c = null;
        }
        field_g = null;
    }

    private final void c(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Terraphoenix.field_V;
        ((ak) this).field_m = 0;
        if (((ak) this).field_p != ((ak) this).field_h) {
            ((ak) this).field_d.a(((ak) this).field_p, (byte) 89);
            ((ak) this).field_h = ((ak) this).field_p;
        }
        if (param0 > -86) {
            field_g = null;
        }
        ((ak) this).field_b = ((ak) this).field_p;
        while (((ak) this).field_m < ((ak) this).field_a.length) {
            var2 = ((ak) this).field_a.length - ((ak) this).field_m;
            if (!(-200000001 <= var2)) {
                var2 = 200000000;
            }
            var3 = ((ak) this).field_d.a(((ak) this).field_a, var2, ((ak) this).field_m, 12955);
            if (0 == var3) {
                break;
            }
            ((ak) this).field_m = ((ak) this).field_m + var3;
            ((ak) this).field_h = ((ak) this).field_h + (long)var3;
        }
    }

    final void a(boolean param0, long param1) throws IOException {
        if (param0) {
            return;
        }
        if (!((param1 ^ -1L) <= -1L)) {
            throw new IOException();
        }
        ((ak) this).field_p = param1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = Terraphoenix.field_V;
        if (param5 != 116) {
          return;
        } else {
          L0: {
            if (param14 > param4) {
              if (param8 > param14) {
                dl.a(true, param1, param0, l.field_i, param14, param6, param9, param12, param3, param11, param8, param13, param4, param10, param15, param2, param7);
                break L0;
              } else {
                if (param4 < param8) {
                  dl.a(true, param11, param10, l.field_i, param8, param12, param9, param6, param13, param1, param14, param3, param4, param0, param15, param2, param7);
                  break L0;
                } else {
                  dl.a(true, param11, param10, l.field_i, param4, param7, param0, param6, param13, param15, param14, param2, param8, param9, param1, param3, param12);
                  break L0;
                }
              }
            } else {
              if (param4 >= param8) {
                if (param14 < param8) {
                  dl.a(true, param15, param9, l.field_i, param8, param12, param10, param7, param2, param1, param4, param3, param14, param0, param11, param13, param6);
                  break L0;
                } else {
                  dl.a(true, param15, param9, l.field_i, param14, param6, param0, param7, param2, param11, param4, param13, param8, param10, param1, param3, param12);
                  break L0;
                }
              } else {
                dl.a(true, param1, param0, l.field_i, param4, param7, param10, param12, param3, param15, param8, param2, param14, param9, param11, param13, param6);
                break L0;
              }
            }
          }
          return;
        }
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Terraphoenix.field_V;
          if (0L == (((ak) this).field_o ^ -1L)) {
            break L0;
          } else {
            L1: {
              if (((ak) this).field_o == ((ak) this).field_h) {
                break L1;
              } else {
                ((ak) this).field_d.a(((ak) this).field_o, (byte) 81);
                ((ak) this).field_h = ((ak) this).field_o;
                break L1;
              }
            }
            L2: {
              ((ak) this).field_d.a(((ak) this).field_n, ((ak) this).field_k, 0, (byte) -73);
              ((ak) this).field_h = ((ak) this).field_h + (long)((ak) this).field_n;
              if (((ak) this).field_h <= ((ak) this).field_l) {
                break L2;
              } else {
                ((ak) this).field_l = ((ak) this).field_h;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (((ak) this).field_b > ((ak) this).field_o) {
                  break L4;
                } else {
                  if (((ak) this).field_o >= (long)((ak) this).field_m + ((ak) this).field_b) {
                    break L4;
                  } else {
                    var2 = ((ak) this).field_o;
                    break L3;
                  }
                }
              }
              if (((ak) this).field_b < ((ak) this).field_o) {
                break L3;
              } else {
                if (((ak) this).field_b >= (long)((ak) this).field_n + ((ak) this).field_o) {
                  break L3;
                } else {
                  var2 = ((ak) this).field_b;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (((ak) this).field_b >= ((ak) this).field_o - -(long)((ak) this).field_n) {
                  break L6;
                } else {
                  if (((long)((ak) this).field_n + ((ak) this).field_o ^ -1L) < ((long)((ak) this).field_m + ((ak) this).field_b ^ -1L)) {
                    break L6;
                  } else {
                    var4 = (long)((ak) this).field_n + ((ak) this).field_o;
                    break L5;
                  }
                }
              }
              if (((ak) this).field_b + (long)((ak) this).field_m <= ((ak) this).field_o) {
                break L5;
              } else {
                if (((long)((ak) this).field_n + ((ak) this).field_o ^ -1L) > (((ak) this).field_b + (long)((ak) this).field_m ^ -1L)) {
                  break L5;
                } else {
                  var4 = (long)((ak) this).field_m + ((ak) this).field_b;
                  break L5;
                }
              }
            }
            L7: {
              if ((var2 ^ -1L) >= 0L) {
                break L7;
              } else {
                if ((var4 ^ -1L) < (var2 ^ -1L)) {
                  var6 = (int)(-var2 + var4);
                  ka.a(((ak) this).field_k, (int)(-((ak) this).field_o + var2), ((ak) this).field_a, (int)(-((ak) this).field_b + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((ak) this).field_o = -1L;
            ((ak) this).field_n = 0;
            break L0;
          }
        }
        L8: {
          if (param0 == 0) {
            break L8;
          } else {
            ak.a(true);
            break L8;
          }
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 + param2 <= param0.length) {
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
                        throw new ArrayIndexOutOfBoundsException(-param0.length + param2 + param3);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((ak) this).field_o == -1L) {
                            statePc = 8;
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
                        if ((((ak) this).field_o ^ -1L) < (((ak) this).field_p ^ -1L)) {
                            statePc = 8;
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
                        if ((((ak) this).field_p + (long)param3 ^ -1L) < (((ak) this).field_o + (long)((ak) this).field_n ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ka.a(((ak) this).field_k, (int)(((ak) this).field_p - ((ak) this).field_o), param0, param2, param3);
                        ((ak) this).field_p = ((ak) this).field_p + (long)param3;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var5_long = ((ak) this).field_p;
                        var7 = -21 / ((param1 - -73) / 52);
                        var8 = param2;
                        var9 = param3;
                        if (((ak) this).field_b > ((ak) this).field_p) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((((ak) this).field_p ^ -1L) <= ((long)((ak) this).field_m + ((ak) this).field_b ^ -1L)) {
                            statePc = 14;
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
                        var10_int = (int)(-((ak) this).field_p - (-((ak) this).field_b - (long)((ak) this).field_m));
                        if (param3 < var10_int) {
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10_int = param3;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ka.a(((ak) this).field_a, (int)(((ak) this).field_p + -((ak) this).field_b), param0, param2, var10_int);
                        param3 = param3 - var10_int;
                        param2 = param2 + var10_int;
                        ((ak) this).field_p = ((ak) this).field_p + (long)var10_int;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param3 > ((ak) this).field_a.length) {
                            statePc = 19;
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
                        if ((param3 ^ -1) >= -1) {
                            statePc = 23;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.c((byte) -127);
                        var10_int = param3;
                        if (var10_int <= ((ak) this).field_m) {
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
                        var10_int = ((ak) this).field_m;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ka.a(((ak) this).field_a, 0, param0, param2, var10_int);
                        param3 = param3 - var10_int;
                        param2 = param2 + var10_int;
                        ((ak) this).field_p = ((ak) this).field_p + (long)var10_int;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((ak) this).field_d.a(((ak) this).field_p, (byte) 93);
                        ((ak) this).field_h = ((ak) this).field_p;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((param3 ^ -1) >= -1) {
                            statePc = 23;
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
                        var10_int = ((ak) this).field_d.a(param0, param3, param2, 12955);
                        if (-1 == var10_int) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param2 = param2 + var10_int;
                        param3 = param3 - var10_int;
                        ((ak) this).field_h = ((ak) this).field_h + (long)var10_int;
                        ((ak) this).field_p = ((ak) this).field_p + (long)var10_int;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (0L == (((ak) this).field_o ^ -1L)) {
                            statePc = 51;
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
                        if ((((ak) this).field_p ^ -1L) <= (((ak) this).field_o ^ -1L)) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (param3 > 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var10_int = (int)(-((ak) this).field_p + ((ak) this).field_o) + param2;
                        if (param2 - -param3 >= var10_int) {
                            statePc = 29;
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
                        var10_int = param2 - -param3;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var10_int <= param2) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        param2++;
                        param0[param2] = (byte) 0;
                        param3--;
                        ((ak) this).field_p = ((ak) this).field_p + 1L;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var10 = -1L;
                        if (((ak) this).field_o < var5_long) {
                            statePc = 34;
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
                        if (((long)var9 + var5_long ^ -1L) >= (((ak) this).field_o ^ -1L)) {
                            statePc = 34;
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
                        var10 = ((ak) this).field_o;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((((ak) this).field_o ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((((ak) this).field_o - -(long)((ak) this).field_n ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
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
                        var10 = var5_long;
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
                        var12 = -1L;
                        if ((long)((ak) this).field_n + ((ak) this).field_o <= var5_long) {
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
                        if ((((ak) this).field_o + (long)((ak) this).field_n ^ -1L) < ((long)var9 + var5_long ^ -1L)) {
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
                        var12 = (long)((ak) this).field_n + ((ak) this).field_o;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (((ak) this).field_o >= (long)var9 + var5_long) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((long)((ak) this).field_n + ((ak) this).field_o ^ -1L) > (var5_long - -(long)var9 ^ -1L)) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var12 = (long)var9 + var5_long;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((var10 ^ -1L) >= 0L) {
                            statePc = 51;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((var10 ^ -1L) <= (var12 ^ -1L)) {
                            statePc = 51;
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
                        var14 = (int)(-var10 + var12);
                        ka.a(((ak) this).field_k, (int)(var10 + -((ak) this).field_o), param0, var8 - -(int)(-var5_long + var10), var14);
                        if ((var12 ^ -1L) < (((ak) this).field_p ^ -1L)) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        param3 = (int)((long)param3 - (-((ak) this).field_p + var12));
                        ((ak) this).field_p = var12;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    var5 = (IOException) (Object) caughtException;
                    ((ak) this).field_h = -1L;
                    throw var5;
                }
                case 51: {
                    if (param3 > 0) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    return;
                }
                case 53: {
                    throw new EOFException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var3 = wa.a((byte) -117, param1);
        if (!param2) {
          L0: {
            if (param0.indexOf(param1) != 0) {
              break L0;
            } else {
              if (0 != param0.indexOf(var3)) {
                break L0;
              } else {
                L1: {
                  L2: {
                    if (param0.startsWith(param1)) {
                      break L2;
                    } else {
                      if (param0.startsWith(var3)) {
                        break L2;
                      } else {
                        if (param0.endsWith(param1)) {
                          break L2;
                        } else {
                          if (!param0.endsWith(var3)) {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L1;
                }
                return stackIn_13_0 != 0;
              }
            }
          }
          return true;
        } else {
          return true;
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        if (param1 != 6605) {
            ((ak) this).field_n = 83;
        }
        ((ak) this).a(param0, (byte) -125, 0, param0.length);
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
                    var10 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((ak) this).field_i < ((ak) this).field_p + (long)param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((ak) this).field_i = ((ak) this).field_p + (long)param1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((ak) this).field_o == -1L) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((ak) this).field_p < ((ak) this).field_o) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((ak) this).field_o - -(long)((ak) this).field_n < ((ak) this).field_p) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.a(param0 + 1);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((ak) this).field_o == (long)param0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((long)param1 + ((ak) this).field_p > ((ak) this).field_o + (long)((ak) this).field_k.length) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_int = (int)((long)((ak) this).field_k.length + ((ak) this).field_o + -((ak) this).field_p);
                        ka.a(param2, param3, ((ak) this).field_k, (int)(-((ak) this).field_o + ((ak) this).field_p), var5_int);
                        param1 = param1 - var5_int;
                        ((ak) this).field_p = ((ak) this).field_p + (long)var5_int;
                        param3 = param3 + var5_int;
                        ((ak) this).field_n = ((ak) this).field_k.length;
                        this.a(0);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param1 > ((ak) this).field_k.length) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((((ak) this).field_h ^ -1L) == (((ak) this).field_p ^ -1L)) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((ak) this).field_d.a(((ak) this).field_p, (byte) 91);
                        ((ak) this).field_h = ((ak) this).field_p;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((ak) this).field_d.a(param1, param2, param3, (byte) -107);
                        ((ak) this).field_h = ((ak) this).field_h + (long)param1;
                        if ((((ak) this).field_h ^ -1L) < (((ak) this).field_l ^ -1L)) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((ak) this).field_l = ((ak) this).field_h;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5_long = -1L;
                        var7 = -1L;
                        if (((ak) this).field_p < ((ak) this).field_b) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (((long)((ak) this).field_m + ((ak) this).field_b ^ -1L) < (((ak) this).field_p ^ -1L)) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((((ak) this).field_p ^ -1L) < (((ak) this).field_b ^ -1L)) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((long)param1 + ((ak) this).field_p > ((ak) this).field_b) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5_long = ((ak) this).field_b;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var5_long = ((ak) this).field_p;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((((ak) this).field_b ^ -1L) <= (((ak) this).field_p - -(long)param1 ^ -1L)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((ak) this).field_b + (long)((ak) this).field_m < (long)param1 + ((ak) this).field_p) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7 = (long)param1 + ((ak) this).field_p;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((long)((ak) this).field_m + ((ak) this).field_b <= ((ak) this).field_p) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (((ak) this).field_b + (long)((ak) this).field_m > ((ak) this).field_p - -(long)param1) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var7 = (long)((ak) this).field_m + ((ak) this).field_b;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (-1L >= var5_long) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var7 > var5_long) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = (int)(var7 - var5_long);
                        ka.a(param2, (int)(-((ak) this).field_p + var5_long + (long)param3), ((ak) this).field_a, (int)(-((ak) this).field_b + var5_long), var9);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ((ak) this).field_p = ((ak) this).field_p + (long)param1;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return;
                }
                case 40: {
                    try {
                        if (-1 > (param1 ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((((ak) this).field_o ^ -1L) != 0L) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((ak) this).field_o = ((ak) this).field_p;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ka.a(param2, param3, ((ak) this).field_k, (int)(-((ak) this).field_o + ((ak) this).field_p), param1);
                        ((ak) this).field_p = ((ak) this).field_p + (long)param1;
                        if ((long)((ak) this).field_n >= ((ak) this).field_p - ((ak) this).field_o) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ((ak) this).field_n = (int)(-((ak) this).field_o + ((ak) this).field_p);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    return;
                }
                case 47: {
                    var5 = (IOException) (Object) caughtException;
                    ((ak) this).field_h = -1L;
                    throw var5;
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ak(b param0, int param1, int param2) throws IOException {
        ((ak) this).field_n = 0;
        ((ak) this).field_o = -1L;
        ((ak) this).field_b = -1L;
        ((ak) this).field_d = param0;
        ((ak) this).field_l = param0.b((byte) 73);
        ((ak) this).field_i = param0.b((byte) 73);
        ((ak) this).field_a = new byte[param1];
        ((ak) this).field_k = new byte[param2];
        ((ak) this).field_p = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Members";
        field_f = "Unable to connect to the data server. Please check any firewall you are using.";
        field_c = "Press the next button";
        field_j = "This password contains repeated characters, and would be easy to guess";
    }
}
