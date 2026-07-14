/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jg {
    static long field_k;
    private byte[] field_e;
    private long field_h;
    static String field_p;
    static jp field_a;
    private long field_m;
    private long field_l;
    private long field_i;
    private long field_o;
    static mf field_d;
    private long field_j;
    static String field_q;
    private byte[] field_g;
    private int field_b;
    private rn field_n;
    private int field_f;
    static byte[] field_c;

    final void a(int param0, long param1) throws IOException {
        if (param1 < (long)param0) {
            throw new IOException();
        }
        ((jg) this).field_l = param1;
    }

    final static boolean b(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0;
        int stackOut_5_0;
        if (param0) {
          L0: {
            L1: {
              if (null != sq.field_c) {
                break L1;
              } else {
                if (!nq.field_p) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 200000000) {
          return;
        } else {
          L0: {
            ((jg) this).field_f = 0;
            if (((jg) this).field_j == ((jg) this).field_l) {
              break L0;
            } else {
              ((jg) this).field_n.a(-58, ((jg) this).field_l);
              ((jg) this).field_j = ((jg) this).field_l;
              break L0;
            }
          }
          ((jg) this).field_i = ((jg) this).field_l;
          L1: while (true) {
            L2: {
              if (((jg) this).field_f >= ((jg) this).field_g.length) {
                break L2;
              } else {
                L3: {
                  var2 = ((jg) this).field_g.length - ((jg) this).field_f;
                  if (-200000001 <= (var2 ^ -1)) {
                    break L3;
                  } else {
                    var2 = 200000000;
                    break L3;
                  }
                }
                var3 = ((jg) this).field_n.a(((jg) this).field_f, ((jg) this).field_g, var2, (byte) 123);
                if (var3 != -1) {
                  ((jg) this).field_f = ((jg) this).field_f + var3;
                  ((jg) this).field_j = ((jg) this).field_j + (long)var3;
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

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3.length >= param0 + param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param0 + param1 - param3.length);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((((jg) this).field_o ^ -1L) == 0L) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((jg) this).field_l < ((jg) this).field_o) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((long)((jg) this).field_b + ((jg) this).field_o < ((jg) this).field_l + (long)param0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        pm.a(((jg) this).field_e, (int)(((jg) this).field_l + -((jg) this).field_o), param3, param1, param0);
                        ((jg) this).field_l = ((jg) this).field_l + (long)param0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        if (param2 > 116) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var15 = null;
                        jg.a(36, (j) null, (lj) null, -113, -57, 112);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5_long = ((jg) this).field_l;
                        var7 = param1;
                        var8 = param0;
                        if (((jg) this).field_l < ((jg) this).field_i) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((jg) this).field_l >= ((jg) this).field_i + (long)((jg) this).field_f) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9_int = (int)((long)((jg) this).field_f + (((jg) this).field_i + -((jg) this).field_l));
                        if (var9_int > param0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 54;
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
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        pm.a(((jg) this).field_g, (int)(((jg) this).field_l - ((jg) this).field_i), param3, param1, var9_int);
                        ((jg) this).field_l = ((jg) this).field_l + (long)var9_int;
                        param1 = param1 + var9_int;
                        param0 = param0 - var9_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (((jg) this).field_g.length < param0) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((param0 ^ -1) < -1) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.b(200000000);
                        var9_int = param0;
                        if (var9_int <= ((jg) this).field_f) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9_int = ((jg) this).field_f;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        pm.a(((jg) this).field_g, 0, param3, param1, var9_int);
                        param0 = param0 - var9_int;
                        param1 = param1 + var9_int;
                        ((jg) this).field_l = ((jg) this).field_l + (long)var9_int;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((jg) this).field_n.a(-18, ((jg) this).field_l);
                        ((jg) this).field_j = ((jg) this).field_l;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (-1 <= (param0 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9_int = ((jg) this).field_n.a(param1, param3, param0, (byte) 120);
                        if ((var9_int ^ -1) == 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((jg) this).field_j = ((jg) this).field_j + (long)var9_int;
                        param0 = param0 - var9_int;
                        ((jg) this).field_l = ((jg) this).field_l + (long)var9_int;
                        param1 = param1 + var9_int;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (0L != (((jg) this).field_o ^ -1L)) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((jg) this).field_o <= ((jg) this).field_l) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((param0 ^ -1) < -1) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9_int = (int)(-((jg) this).field_l + ((jg) this).field_o) + param1;
                        if (var9_int <= param0 + param1) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9_int = param1 - -param0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param1 >= var9_int) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        param1++;
                        param3[param1] = (byte) 0;
                        param0--;
                        ((jg) this).field_l = ((jg) this).field_l + 1L;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if ((var5_long ^ -1L) < (((jg) this).field_o ^ -1L)) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (((jg) this).field_o >= var5_long + (long)var8) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = ((jg) this).field_o;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((((jg) this).field_o ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var5_long < (long)((jg) this).field_b + ((jg) this).field_o) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 54;
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
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((long)((jg) this).field_b + ((jg) this).field_o ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var5_long - -(long)var8 ^ -1L) > ((long)((jg) this).field_b + ((jg) this).field_o ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var11 = ((jg) this).field_o - -(long)((jg) this).field_b;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((((jg) this).field_o ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((long)((jg) this).field_b + ((jg) this).field_o >= (long)var8 + var5_long) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (-1L >= var9) {
                            statePc = 55;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var11 <= var9) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var13 = (int)(-var9 + var11);
                        pm.a(((jg) this).field_e, (int)(var9 + -((jg) this).field_o), param3, var7 - -(int)(var9 + -var5_long), var13);
                        if (var11 <= ((jg) this).field_l) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        param0 = (int)((long)param0 - (var11 + -((jg) this).field_l));
                        ((jg) this).field_l = var11;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    var5 = (IOException) (Object) caughtException;
                    ((jg) this).field_j = -1L;
                    throw var5;
                }
                case 55: {
                    if ((param0 ^ -1) < -1) {
                        statePc = 57;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 57: {
                    throw new EOFException();
                }
                case 58: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          if (((jg) this).field_o != (long)param0) {
            L1: {
              if (((jg) this).field_j != ((jg) this).field_o) {
                ((jg) this).field_n.a(-19, ((jg) this).field_o);
                ((jg) this).field_j = ((jg) this).field_o;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((jg) this).field_n.a(0, (byte) -125, ((jg) this).field_e, ((jg) this).field_b);
              ((jg) this).field_j = ((jg) this).field_j + (long)((jg) this).field_b;
              if ((((jg) this).field_j ^ -1L) < (((jg) this).field_h ^ -1L)) {
                ((jg) this).field_h = ((jg) this).field_j;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if ((((jg) this).field_o ^ -1L) > (((jg) this).field_i ^ -1L)) {
                  break L4;
                } else {
                  if ((((jg) this).field_o ^ -1L) > ((long)((jg) this).field_f + ((jg) this).field_i ^ -1L)) {
                    var2 = ((jg) this).field_o;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if ((((jg) this).field_o ^ -1L) < (((jg) this).field_i ^ -1L)) {
                break L3;
              } else {
                if (((jg) this).field_i < (long)((jg) this).field_b + ((jg) this).field_o) {
                  var2 = ((jg) this).field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (((jg) this).field_o + (long)((jg) this).field_b <= ((jg) this).field_i) {
                  break L6;
                } else {
                  if ((long)((jg) this).field_f + ((jg) this).field_i < ((jg) this).field_o + (long)((jg) this).field_b) {
                    break L6;
                  } else {
                    var4 = ((jg) this).field_o - -(long)((jg) this).field_b;
                    break L5;
                  }
                }
              }
              if (((jg) this).field_o >= (long)((jg) this).field_f + ((jg) this).field_i) {
                break L5;
              } else {
                if (((jg) this).field_i + (long)((jg) this).field_f <= ((jg) this).field_o - -(long)((jg) this).field_b) {
                  var4 = (long)((jg) this).field_f + ((jg) this).field_i;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if ((var2 ^ -1L) >= 0L) {
                break L7;
              } else {
                if (var4 > var2) {
                  var6 = (int)(-var2 + var4);
                  pm.a(((jg) this).field_e, (int)(-((jg) this).field_o + var2), ((jg) this).field_g, (int)(var2 - ((jg) this).field_i), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((jg) this).field_b = 0;
            ((jg) this).field_o = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        if (param1 != -29) {
            ((jg) this).field_o = -84L;
        }
        ((jg) this).a(param0.length, 0, 127, param0);
    }

    public static void a(int param0) {
        int var1 = 27 % ((62 - param0) / 62);
        field_q = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_p = null;
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
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
                    var10 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((((jg) this).field_m ^ -1L) > (((jg) this).field_l - -(long)param2 ^ -1L)) {
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
                        ((jg) this).field_m = ((jg) this).field_l - -(long)param2;
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
                        if (((jg) this).field_o == (long)param3) {
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
                        if ((((jg) this).field_l ^ -1L) > (((jg) this).field_o ^ -1L)) {
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
                        if (((jg) this).field_l > (long)((jg) this).field_b + ((jg) this).field_o) {
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
                        this.c(param3 ^ 0);
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
                        if (-1L == ((jg) this).field_o) {
                            statePc = 13;
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
                        if (((long)((jg) this).field_e.length + ((jg) this).field_o ^ -1L) > (((jg) this).field_l - -(long)param2 ^ -1L)) {
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_int = (int)(-((jg) this).field_l - -((jg) this).field_o + (long)((jg) this).field_e.length);
                        pm.a(param0, param1, ((jg) this).field_e, (int)(((jg) this).field_l - ((jg) this).field_o), var5_int);
                        param2 = param2 - var5_int;
                        ((jg) this).field_l = ((jg) this).field_l + (long)var5_int;
                        param1 = param1 + var5_int;
                        ((jg) this).field_b = ((jg) this).field_e.length;
                        this.c(param3 ^ 0);
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
                        if (param2 > ((jg) this).field_e.length) {
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
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((((jg) this).field_l ^ -1L) == (((jg) this).field_j ^ -1L)) {
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
                        ((jg) this).field_n.a(-98, ((jg) this).field_l);
                        ((jg) this).field_j = ((jg) this).field_l;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((jg) this).field_n.a(param1, (byte) -125, param0, param2);
                        ((jg) this).field_j = ((jg) this).field_j + (long)param2;
                        if (((jg) this).field_j > ((jg) this).field_h) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((jg) this).field_h = ((jg) this).field_j;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5_long = -1L;
                        var7 = -1L;
                        if (((jg) this).field_l < ((jg) this).field_i) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (((jg) this).field_i + (long)((jg) this).field_f > ((jg) this).field_l) {
                            statePc = 27;
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
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((((jg) this).field_i ^ -1L) > (((jg) this).field_l ^ -1L)) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (((jg) this).field_l + (long)param2 > ((jg) this).field_i) {
                            statePc = 26;
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
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5_long = ((jg) this).field_i;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var5_long = ((jg) this).field_l;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((((jg) this).field_l + (long)param2 ^ -1L) >= (((jg) this).field_i ^ -1L)) {
                            statePc = 31;
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
                        if ((((jg) this).field_l + (long)param2 ^ -1L) < (((jg) this).field_i - -(long)((jg) this).field_f ^ -1L)) {
                            statePc = 31;
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
                        var7 = (long)param2 + ((jg) this).field_l;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((((jg) this).field_i - -(long)((jg) this).field_f ^ -1L) >= (((jg) this).field_l ^ -1L)) {
                            statePc = 35;
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
                        if (((jg) this).field_i - -(long)((jg) this).field_f <= ((jg) this).field_l + (long)param2) {
                            statePc = 34;
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
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var7 = (long)((jg) this).field_f + ((jg) this).field_i;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-1L >= var5_long) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var5_long ^ -1L) <= (var7 ^ -1L)) {
                            statePc = 38;
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
                        var9 = (int)(var7 + -var5_long);
                        pm.a(param0, (int)(var5_long + ((long)param1 + -((jg) this).field_l)), ((jg) this).field_g, (int)(-((jg) this).field_i + var5_long), var9);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ((jg) this).field_l = ((jg) this).field_l + (long)param2;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return;
                }
                case 40: {
                    try {
                        if ((param2 ^ -1) >= -1) {
                            statePc = 47;
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
                        if (0L != (((jg) this).field_o ^ -1L)) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((jg) this).field_o = ((jg) this).field_l;
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
                        pm.a(param0, param1, ((jg) this).field_e, (int)(((jg) this).field_l - ((jg) this).field_o), param2);
                        ((jg) this).field_l = ((jg) this).field_l + (long)param2;
                        if ((long)((jg) this).field_b >= ((jg) this).field_l - ((jg) this).field_o) {
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
                        ((jg) this).field_b = (int)(((jg) this).field_l - ((jg) this).field_o);
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
                    ((jg) this).field_j = -1L;
                    throw var5;
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) throws IOException {
        this.c(-1);
        if (param0) {
        }
        ((jg) this).field_n.c(-100);
    }

    final long a(byte param0) {
        if (param0 <= 20) {
            field_d = null;
        }
        return ((jg) this).field_m;
    }

    jg(rn param0, int param1, int param2) throws IOException {
        ((jg) this).field_o = -1L;
        ((jg) this).field_i = -1L;
        ((jg) this).field_b = 0;
        ((jg) this).field_n = param0;
        ((jg) this).field_h = param0.d(-122);
        ((jg) this).field_m = param0.d(-122);
        ((jg) this).field_g = new byte[param1];
        ((jg) this).field_e = new byte[param2];
        ((jg) this).field_l = 0L;
    }

    final static void a(int param0, j param1, lj param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        jp var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = BrickABrac.field_J ? 1 : 0;
          var6 = param1.field_mb / (param3 << -638410783) + param0;
          var7 = param1.field_wb / (param3 << -1086848543) + param1.field_wb / (param3 << 1570560707) + param5;
          var8 = gg.field_p[param2.field_o];
          var9 = 96;
          var10 = 512;
          if (param2.field_m < param4) {
            var10 = (param2.field_m << 1189081577) / 25;
            var7 = var7 + (-param2.field_m + 25 << -174657566) / param3;
            var9 = (param2.field_m << -153948473) / 25;
            break L0;
          } else {
            if (50 <= param2.field_m) {
              var9 = (75 + -param2.field_m << -549751161) / 25;
              var10 = (75 + -param2.field_m << 1350351017) / 25;
              var7 = var7 - (param2.field_m + -50 << 529196066) / param3;
              break L0;
            } else {
              var9 = 128;
              break L0;
            }
          }
        }
        var11 = (var10 * var8.field_D >> -1612968089) / param3;
        var12 = (var10 * var8.field_C >> 863296263) / param3;
        var8.b(-(var11 >> -1535437119) + var6, var7 + -(var12 >> 682530657), var11, var12, var9);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0L;
        field_q = "OFF";
        field_p = "Drawn";
    }
}
