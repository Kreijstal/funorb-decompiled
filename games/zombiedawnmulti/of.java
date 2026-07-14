/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class of {
    private long field_m;
    static ja[] field_e;
    private long field_j;
    private byte[] field_i;
    private long field_b;
    private int field_n;
    private long field_c;
    private mc field_o;
    static ja field_k;
    private int field_a;
    static ma field_d;
    private long field_h;
    private byte[] field_f;
    static String field_p;
    static int field_g;
    private long field_l;

    final void a(long param0, byte param1) throws IOException {
        Object var5 = null;
        L0: {
          if (param1 == -70) {
            break L0;
          } else {
            var5 = null;
            of.a(-66, (java.awt.Component) null);
            break L0;
          }
        }
        if ((param0 ^ -1L) > -1L) {
          throw new IOException();
        } else {
          ((of) this).field_h = param0;
          return;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var6 = 0L;
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
                    var15 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2.length >= param0 + param1) {
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
                        throw new ArrayIndexOutOfBoundsException(param1 - (-param0 + param2.length));
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1L == ((of) this).field_m) {
                            statePc = 8;
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
                        if ((((of) this).field_m ^ -1L) < (((of) this).field_h ^ -1L)) {
                            statePc = 8;
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
                        if (((of) this).field_h - -(long)param0 > (long)((of) this).field_a + ((of) this).field_m) {
                            statePc = 8;
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
                        d.a(((of) this).field_f, (int)(((of) this).field_h - ((of) this).field_m), param2, param1, param0);
                        ((of) this).field_h = ((of) this).field_h + (long)param0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var5_int = -124 / ((param3 - -37) / 57);
                        var6 = ((of) this).field_h;
                        var8 = param1;
                        var9 = param0;
                        if ((((of) this).field_h ^ -1L) > (((of) this).field_l ^ -1L)) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((((of) this).field_l + (long)((of) this).field_n ^ -1L) < (((of) this).field_h ^ -1L)) {
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10_int = (int)(-((of) this).field_h + (((of) this).field_l + (long)((of) this).field_n));
                        if (param0 < var10_int) {
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
                        var10_int = param0;
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
                        d.a(((of) this).field_i, (int)(-((of) this).field_l + ((of) this).field_h), param2, param1, var10_int);
                        ((of) this).field_h = ((of) this).field_h + (long)var10_int;
                        param1 = param1 + var10_int;
                        param0 = param0 - var10_int;
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
                        if (((of) this).field_i.length < param0) {
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
                        if (0 < param0) {
                            statePc = 18;
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
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.b(-8855);
                        var10_int = param0;
                        if (var10_int <= ((of) this).field_n) {
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
                        var10_int = ((of) this).field_n;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        d.a(((of) this).field_i, 0, param2, param1, var10_int);
                        param0 = param0 - var10_int;
                        param1 = param1 + var10_int;
                        ((of) this).field_h = ((of) this).field_h + (long)var10_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((of) this).field_o.a((byte) -127, ((of) this).field_h);
                        ((of) this).field_c = ((of) this).field_h;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param0 <= 0) {
                            statePc = 25;
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
                        var10_int = ((of) this).field_o.a(param0, param2, -1, param1);
                        if ((var10_int ^ -1) == 0) {
                            statePc = 25;
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
                        param0 = param0 - var10_int;
                        ((of) this).field_h = ((of) this).field_h + (long)var10_int;
                        ((of) this).field_c = ((of) this).field_c + (long)var10_int;
                        param1 = param1 + var10_int;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (0L != (((of) this).field_m ^ -1L)) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((of) this).field_m ^ -1L) >= (((of) this).field_h ^ -1L)) {
                            statePc = 34;
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
                    try {
                        if (-1 > (param0 ^ -1)) {
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
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var10_int = param1 + (int)(-((of) this).field_h + ((of) this).field_m);
                        if (param1 + param0 >= var10_int) {
                            statePc = 32;
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
                        var10_int = param1 + param0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var10_int <= param1) {
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
                        param0--;
                        param1++;
                        param2[param1] = (byte) 0;
                        ((of) this).field_h = ((of) this).field_h + 1L;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var10 = -1L;
                        if ((var6 ^ -1L) < (((of) this).field_m ^ -1L)) {
                            statePc = 37;
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
                        if (((of) this).field_m < var6 + (long)var9) {
                            statePc = 41;
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
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var6 ^ -1L) > (((of) this).field_m ^ -1L)) {
                            statePc = 42;
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
                        if (((long)((of) this).field_a + ((of) this).field_m ^ -1L) < (var6 ^ -1L)) {
                            statePc = 40;
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
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var10 = var6;
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
                        var10 = ((of) this).field_m;
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
                        var12 = -1L;
                        if ((var6 ^ -1L) <= (((of) this).field_m - -(long)((of) this).field_a ^ -1L)) {
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
                        if ((long)var9 + var6 < (long)((of) this).field_a + ((of) this).field_m) {
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
                        var12 = (long)((of) this).field_a + ((of) this).field_m;
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
                        if ((((of) this).field_m ^ -1L) <= (var6 + (long)var9 ^ -1L)) {
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
                        if (((long)((of) this).field_a + ((of) this).field_m ^ -1L) <= (var6 + (long)var9 ^ -1L)) {
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
                        var12 = var6 + (long)var9;
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
                        if (-1L >= var10) {
                            statePc = 57;
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
                        if (var12 > var10) {
                            statePc = 52;
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
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var14 = (int)(-var10 + var12);
                        d.a(((of) this).field_f, (int)(-((of) this).field_m + var10), param2, (int)(-var6 + var10) + var8, var14);
                        if (((of) this).field_h < var12) {
                            statePc = 54;
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
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        param0 = (int)((long)param0 - (var12 - ((of) this).field_h));
                        ((of) this).field_h = var12;
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
                    ((of) this).field_c = -1L;
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

    final static void b(byte param0) {
        we.field_k = new th();
        if (param0 < 97) {
            Object var2 = null;
            of.a(116, (java.awt.Component) null);
        }
    }

    final void a(byte param0) throws IOException {
        this.c((byte) -23);
        ((of) this).field_o.b((byte) 38);
        if (param0 >= -84) {
            of.a(-119);
        }
    }

    private final void c(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          if (((of) this).field_m == -1L) {
            break L0;
          } else {
            L1: {
              if ((((of) this).field_c ^ -1L) == (((of) this).field_m ^ -1L)) {
                break L1;
              } else {
                ((of) this).field_o.a((byte) -127, ((of) this).field_m);
                ((of) this).field_c = ((of) this).field_m;
                break L1;
              }
            }
            L2: {
              ((of) this).field_o.a((byte) 74, 0, ((of) this).field_a, ((of) this).field_f);
              ((of) this).field_c = ((of) this).field_c + (long)((of) this).field_a;
              if ((((of) this).field_c ^ -1L) < (((of) this).field_b ^ -1L)) {
                ((of) this).field_b = ((of) this).field_c;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if ((((of) this).field_m ^ -1L) > (((of) this).field_l ^ -1L)) {
                  break L4;
                } else {
                  if ((((of) this).field_m ^ -1L) > ((long)((of) this).field_n + ((of) this).field_l ^ -1L)) {
                    var2 = ((of) this).field_m;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((of) this).field_l < ((of) this).field_m) {
                break L3;
              } else {
                if (((long)((of) this).field_a + ((of) this).field_m ^ -1L) >= (((of) this).field_l ^ -1L)) {
                  break L3;
                } else {
                  var2 = ((of) this).field_l;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if ((((of) this).field_l ^ -1L) <= ((long)((of) this).field_a + ((of) this).field_m ^ -1L)) {
                  break L6;
                } else {
                  if ((long)((of) this).field_n + ((of) this).field_l >= ((of) this).field_m - -(long)((of) this).field_a) {
                    var4 = ((of) this).field_m - -(long)((of) this).field_a;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((of) this).field_l + (long)((of) this).field_n <= ((of) this).field_m) {
                break L5;
              } else {
                if (((of) this).field_m - -(long)((of) this).field_a >= ((of) this).field_l + (long)((of) this).field_n) {
                  var4 = ((of) this).field_l - -(long)((of) this).field_n;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (0L <= (var2 ^ -1L)) {
                break L7;
              } else {
                if (var4 > var2) {
                  var6 = (int)(-var2 + var4);
                  d.a(((of) this).field_f, (int)(-((of) this).field_m + var2), ((of) this).field_i, (int)(-((of) this).field_l + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((of) this).field_a = 0;
            ((of) this).field_m = -1L;
            break L0;
          }
        }
        L8: {
          if (param0 == -23) {
            break L8;
          } else {
            of.a(34);
            break L8;
          }
        }
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
                    var10 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((of) this).field_j < ((of) this).field_h - -(long)param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((of) this).field_j = ((of) this).field_h + (long)param1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (0L == (((of) this).field_m ^ -1L)) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((of) this).field_m <= ((of) this).field_h) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.c((byte) -23);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((((of) this).field_h ^ -1L) >= ((long)((of) this).field_a + ((of) this).field_m ^ -1L)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.c((byte) -23);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((of) this).field_m == (long)param0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((of) this).field_h - -(long)param1 > (long)((of) this).field_f.length + ((of) this).field_m) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5_int = (int)(-((of) this).field_h + (((of) this).field_m + (long)((of) this).field_f.length));
                        d.a(param3, param2, ((of) this).field_f, (int)(((of) this).field_h + -((of) this).field_m), var5_int);
                        param2 = param2 + var5_int;
                        param1 = param1 - var5_int;
                        ((of) this).field_h = ((of) this).field_h + (long)var5_int;
                        ((of) this).field_a = ((of) this).field_f.length;
                        this.c((byte) -23);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param1 > ((of) this).field_f.length) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((((of) this).field_h ^ -1L) == (((of) this).field_c ^ -1L)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((of) this).field_o.a((byte) -126, ((of) this).field_h);
                        ((of) this).field_c = ((of) this).field_h;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((of) this).field_o.a((byte) 110, param2, param1, param3);
                        ((of) this).field_c = ((of) this).field_c + (long)param1;
                        if (((of) this).field_b < ((of) this).field_c) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((of) this).field_b = ((of) this).field_c;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5_long = -1L;
                        if ((((of) this).field_l ^ -1L) < (((of) this).field_h ^ -1L)) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (((of) this).field_h >= ((of) this).field_l + (long)((of) this).field_n) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5_long = ((of) this).field_h;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (((of) this).field_h > ((of) this).field_l) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (((of) this).field_l < (long)param1 + ((of) this).field_h) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var5_long = ((of) this).field_l;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var7 = -1L;
                        if (((of) this).field_l >= (long)param1 + ((of) this).field_h) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((((of) this).field_l - -(long)((of) this).field_n ^ -1L) <= (((of) this).field_h - -(long)param1 ^ -1L)) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (((of) this).field_h >= ((of) this).field_l - -(long)((of) this).field_n) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (((of) this).field_l - -(long)((of) this).field_n <= ((of) this).field_h + (long)param1) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var7 = ((of) this).field_l - -(long)((of) this).field_n;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var7 = (long)param1 + ((of) this).field_h;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var5_long ^ -1L) >= 0L) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var7 > var5_long) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var9 = (int)(var7 + -var5_long);
                        d.a(param3, (int)(-((of) this).field_h + (var5_long + (long)param2)), ((of) this).field_i, (int)(-((of) this).field_l + var5_long), var9);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((of) this).field_h = ((of) this).field_h + (long)param1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return;
                }
                case 42: {
                    try {
                        if (0 < param1) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((((of) this).field_m ^ -1L) != 0L) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ((of) this).field_m = ((of) this).field_h;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        d.a(param3, param2, ((of) this).field_f, (int)(((of) this).field_h - ((of) this).field_m), param1);
                        ((of) this).field_h = ((of) this).field_h + (long)param1;
                        if ((long)((of) this).field_a >= -((of) this).field_m + ((of) this).field_h) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ((of) this).field_a = (int)(((of) this).field_h - ((of) this).field_m);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    return;
                }
                case 49: {
                    var5 = (IOException) (Object) caughtException;
                    ((of) this).field_c = -1L;
                    throw var5;
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        ((of) this).a(param0.length, 0, param0, -117);
        int var3 = -85 % ((70 - param1) / 44);
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ((of) this).field_n = 0;
        if ((((of) this).field_h ^ -1L) != (((of) this).field_c ^ -1L)) {
            ((of) this).field_o.a((byte) -128, ((of) this).field_h);
            ((of) this).field_c = ((of) this).field_h;
        }
        ((of) this).field_l = ((of) this).field_h;
        while (((of) this).field_n < ((of) this).field_i.length) {
            var2 = -((of) this).field_n + ((of) this).field_i.length;
            if (!(-200000001 <= (var2 ^ -1))) {
                var2 = 200000000;
            }
            var3 = ((of) this).field_o.a(var2, ((of) this).field_i, -1, ((of) this).field_n);
            // if_icmpeq L147
            ((of) this).field_c = ((of) this).field_c + (long)var3;
            ((of) this).field_n = ((of) this).field_n + var3;
        }
        if (param0 != -8855) {
            gh discarded$0 = of.d(56);
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            field_g = 68;
        }
        field_k = null;
        field_p = null;
        field_d = null;
        field_e = null;
    }

    final long c(int param0) {
        if (param0 != -1) {
            ((of) this).field_j = -25L;
        }
        return ((of) this).field_j;
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) on.field_Z);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) on.field_Z);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) on.field_Z);
        hh.field_e = 0;
        if (param0 != -1693) {
            field_e = null;
        }
    }

    of(mc param0, int param1, int param2) throws IOException {
        ((of) this).field_m = -1L;
        ((of) this).field_a = 0;
        ((of) this).field_l = -1L;
        ((of) this).field_o = param0;
        ((of) this).field_b = param0.a(-111);
        ((of) this).field_j = param0.a(-111);
        ((of) this).field_f = new byte[param2];
        ((of) this).field_i = new byte[param1];
        ((of) this).field_h = 0L;
    }

    final static gh d(int param0) {
        if (mp.field_b != id.field_B) {
          if (param0 == 0) {
            if (oi.field_j != id.field_B) {
              return null;
            } else {
              id.field_B = mp.field_b;
              return iq.field_c;
            }
          } else {
            return null;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ja[5];
        field_p = "Friends";
        field_d = new ma();
    }
}
