/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lc {
    private long field_d;
    private long field_r;
    private long field_p;
    static boolean field_q;
    private eg field_c;
    private int field_k;
    static um field_m;
    private int field_j;
    static String field_l;
    static String field_g;
    static int[] field_n;
    static String field_e;
    private byte[] field_i;
    private long field_a;
    private byte[] field_o;
    static ci field_f;
    private long field_h;
    private long field_b;

    final void a(int param0, byte[] param1) throws IOException {
        ((lc) this).a(param1, -19616, param0, param1.length);
    }

    private final void b(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Chess.field_G;
        if (param0 == 17357) {
          L0: {
            if (0L == (((lc) this).field_h ^ -1L)) {
              break L0;
            } else {
              L1: {
                if ((((lc) this).field_p ^ -1L) != (((lc) this).field_h ^ -1L)) {
                  ((lc) this).field_c.a(((lc) this).field_h, -11526);
                  ((lc) this).field_p = ((lc) this).field_h;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                ((lc) this).field_c.a(0, -1036, ((lc) this).field_o, ((lc) this).field_k);
                ((lc) this).field_p = ((lc) this).field_p + (long)((lc) this).field_k;
                if ((((lc) this).field_p ^ -1L) >= (((lc) this).field_b ^ -1L)) {
                  break L2;
                } else {
                  ((lc) this).field_b = ((lc) this).field_p;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  var4 = -1L;
                  if ((((lc) this).field_h ^ -1L) > (((lc) this).field_d ^ -1L)) {
                    break L4;
                  } else {
                    if ((((lc) this).field_d + (long)((lc) this).field_j ^ -1L) >= (((lc) this).field_h ^ -1L)) {
                      break L4;
                    } else {
                      var2 = ((lc) this).field_h;
                      break L3;
                    }
                  }
                }
                if ((((lc) this).field_h ^ -1L) < (((lc) this).field_d ^ -1L)) {
                  break L3;
                } else {
                  if ((long)((lc) this).field_k + ((lc) this).field_h > ((lc) this).field_d) {
                    var2 = ((lc) this).field_d;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  if (((lc) this).field_d >= ((lc) this).field_h - -(long)((lc) this).field_k) {
                    break L6;
                  } else {
                    if ((long)((lc) this).field_k + ((lc) this).field_h > (long)((lc) this).field_j + ((lc) this).field_d) {
                      break L6;
                    } else {
                      var4 = (long)((lc) this).field_k + ((lc) this).field_h;
                      break L5;
                    }
                  }
                }
                if ((((lc) this).field_h ^ -1L) <= ((long)((lc) this).field_j + ((lc) this).field_d ^ -1L)) {
                  break L5;
                } else {
                  if (((long)((lc) this).field_j + ((lc) this).field_d ^ -1L) >= ((long)((lc) this).field_k + ((lc) this).field_h ^ -1L)) {
                    var4 = (long)((lc) this).field_j + ((lc) this).field_d;
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
                  if (var4 <= var2) {
                    break L7;
                  } else {
                    var6 = (int)(-var2 + var4);
                    ne.a(((lc) this).field_o, (int)(-((lc) this).field_h + var2), ((lc) this).field_i, (int)(-((lc) this).field_d + var2), var6);
                    break L7;
                  }
                }
              }
              ((lc) this).field_k = 0;
              ((lc) this).field_h = -1L;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static String d(byte param0) {
        L0: {
          if (uk.field_e) {
            break L0;
          } else {
            if (be.field_f > ei.field_u) {
              break L0;
            } else {
              if (ei.field_u < be.field_f + sj.field_n) {
                return eg.field_j;
              } else {
                break L0;
              }
            }
          }
        }
        if (param0 == 60) {
          return null;
        } else {
          String discarded$2 = lc.d((byte) 67);
          return null;
        }
    }

    final static void a(int param0) {
        cd.field_x = new w(ki.field_P, dc.field_s, gd.field_b, qn.field_P, (ci) (Object) kj.field_g, sj.field_k);
        int var1 = -28 % ((param0 - 15) / 59);
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
                    var10 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((long)param1 + ((lc) this).field_a > ((lc) this).field_r) {
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
                        ((lc) this).field_r = ((lc) this).field_a - -(long)param1;
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
                        if (0L == (((lc) this).field_h ^ -1L)) {
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
                        if (((lc) this).field_h > ((lc) this).field_a) {
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
                        if ((long)((lc) this).field_k + ((lc) this).field_h < ((lc) this).field_a) {
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
                        this.b(17357);
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
                        if ((long)param2 == ((lc) this).field_h) {
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
                        if (((long)param1 + ((lc) this).field_a ^ -1L) >= ((long)((lc) this).field_o.length + ((lc) this).field_h ^ -1L)) {
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
                        var5_int = (int)(((lc) this).field_h - (((lc) this).field_a - (long)((lc) this).field_o.length));
                        ne.a(param3, param0, ((lc) this).field_o, (int)(-((lc) this).field_h + ((lc) this).field_a), var5_int);
                        param0 = param0 + var5_int;
                        param1 = param1 - var5_int;
                        ((lc) this).field_a = ((lc) this).field_a + (long)var5_int;
                        ((lc) this).field_k = ((lc) this).field_o.length;
                        this.b(17357);
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
                        if (((lc) this).field_o.length < param1) {
                            statePc = 14;
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
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((((lc) this).field_p ^ -1L) == (((lc) this).field_a ^ -1L)) {
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
                        ((lc) this).field_c.a(((lc) this).field_a, -11526);
                        ((lc) this).field_p = ((lc) this).field_a;
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
                        ((lc) this).field_c.a(param0, -1036, param3, param1);
                        ((lc) this).field_p = ((lc) this).field_p + (long)param1;
                        if (((lc) this).field_p > ((lc) this).field_b) {
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
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((lc) this).field_b = ((lc) this).field_p;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5_long = -1L;
                        if ((((lc) this).field_a ^ -1L) > (((lc) this).field_d ^ -1L)) {
                            statePc = 22;
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
                        if (((long)((lc) this).field_j + ((lc) this).field_d ^ -1L) >= (((lc) this).field_a ^ -1L)) {
                            statePc = 22;
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
                        var5_long = ((lc) this).field_a;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((((lc) this).field_d ^ -1L) > (((lc) this).field_a ^ -1L)) {
                            statePc = 25;
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
                        if (((lc) this).field_d >= ((lc) this).field_a + (long)param1) {
                            statePc = 25;
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
                        var5_long = ((lc) this).field_d;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7 = -1L;
                        if (((lc) this).field_d >= ((lc) this).field_a - -(long)param1) {
                            statePc = 28;
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
                        if (((long)param1 + ((lc) this).field_a ^ -1L) >= (((lc) this).field_d - -(long)((lc) this).field_j ^ -1L)) {
                            statePc = 32;
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
                        if (((lc) this).field_a >= (long)((lc) this).field_j + ((lc) this).field_d) {
                            statePc = 33;
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
                        if ((((lc) this).field_a - -(long)param1 ^ -1L) <= (((lc) this).field_d + (long)((lc) this).field_j ^ -1L)) {
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
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var7 = ((lc) this).field_d - -(long)((lc) this).field_j;
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
                        var7 = ((lc) this).field_a - -(long)param1;
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
                        if (-1L >= var5_long) {
                            statePc = 37;
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
                        if (var5_long < var7) {
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
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = (int)(var7 - var5_long);
                        ne.a(param3, (int)(var5_long + (long)param0 + -((lc) this).field_a), ((lc) this).field_i, (int)(var5_long + -((lc) this).field_d), var9);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((lc) this).field_a = ((lc) this).field_a + (long)param1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return;
                }
                case 39: {
                    try {
                        if (param1 <= 0) {
                            statePc = 47;
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
                        if (-1L != ((lc) this).field_h) {
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
                        ((lc) this).field_h = ((lc) this).field_a;
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
                        ne.a(param3, param0, ((lc) this).field_o, (int)(-((lc) this).field_h + ((lc) this).field_a), param1);
                        ((lc) this).field_a = ((lc) this).field_a + (long)param1;
                        if ((long)((lc) this).field_k < ((lc) this).field_a - ((lc) this).field_h) {
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
                        ((lc) this).field_k = (int)(-((lc) this).field_h + ((lc) this).field_a);
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
                    ((lc) this).field_p = -1L;
                    throw var5;
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String param0, String param1, int param2, int param3, String param4, boolean param5) {
        ld var6 = new ld(param2, param0, param3, param1, param4);
        if (param5) {
            field_n = null;
        }
        ml.a((byte) 29, var6);
    }

    final long c(byte param0) {
        if (param0 != 109) {
            return 91L;
        }
        return ((lc) this).field_r;
    }

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
                    var14 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0.length >= param2 - -param3) {
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
                        throw new ArrayIndexOutOfBoundsException(param3 + param2 - param0.length);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1L == ((lc) this).field_h) {
                            statePc = 9;
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
                        if (((lc) this).field_a < ((lc) this).field_h) {
                            statePc = 9;
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
                        if (((lc) this).field_a + (long)param3 <= ((lc) this).field_h - -(long)((lc) this).field_k) {
                            statePc = 7;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ne.a(((lc) this).field_o, (int)(-((lc) this).field_h + ((lc) this).field_a), param0, param2, param3);
                        ((lc) this).field_a = ((lc) this).field_a + (long)param3;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        if (param1 == -19616) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        var5_long = ((lc) this).field_a;
                        var7 = param2;
                        var8 = param3;
                        if ((((lc) this).field_a ^ -1L) > (((lc) this).field_d ^ -1L)) {
                            statePc = 16;
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
                        if (((long)((lc) this).field_j + ((lc) this).field_d ^ -1L) >= (((lc) this).field_a ^ -1L)) {
                            statePc = 16;
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
                        var9_int = (int)(((lc) this).field_d + -((lc) this).field_a + (long)((lc) this).field_j);
                        if (var9_int <= param3) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = param3;
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
                        ne.a(((lc) this).field_i, (int)(-((lc) this).field_d + ((lc) this).field_a), param0, param2, var9_int);
                        param3 = param3 - var9_int;
                        param2 = param2 + var9_int;
                        ((lc) this).field_a = ((lc) this).field_a + (long)var9_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (((lc) this).field_i.length >= param3) {
                            statePc = 21;
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
                        ((lc) this).field_c.a(((lc) this).field_a, -11526);
                        ((lc) this).field_p = ((lc) this).field_a;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((param3 ^ -1) >= -1) {
                            statePc = 25;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9_int = ((lc) this).field_c.a(param2, param0, param3, (byte) 104);
                        if (-1 == var9_int) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        param3 = param3 - var9_int;
                        ((lc) this).field_a = ((lc) this).field_a + (long)var9_int;
                        param2 = param2 + var9_int;
                        ((lc) this).field_p = ((lc) this).field_p + (long)var9_int;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (param3 <= 0) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.c(0);
                        var9_int = param3;
                        if (((lc) this).field_j >= var9_int) {
                            statePc = 24;
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
                        var9_int = ((lc) this).field_j;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ne.a(((lc) this).field_i, 0, param0, param2, var9_int);
                        ((lc) this).field_a = ((lc) this).field_a + (long)var9_int;
                        param3 = param3 - var9_int;
                        param2 = param2 + var9_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-1L != ((lc) this).field_h) {
                            statePc = 27;
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
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((lc) this).field_h ^ -1L) >= (((lc) this).field_a ^ -1L)) {
                            statePc = 34;
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
                        if ((param3 ^ -1) >= -1) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9_int = param2 - -(int)(-((lc) this).field_a + ((lc) this).field_h);
                        if (param2 + param3 < var9_int) {
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
                        var9_int = param2 + param3;
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
                        if (var9_int <= param2) {
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
                        param3--;
                        param2++;
                        param0[param2] = (byte) 0;
                        ((lc) this).field_a = ((lc) this).field_a + 1L;
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
                        if ((var5_long ^ -1L) < (((lc) this).field_h ^ -1L)) {
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
                        if (((long)var8 + var5_long ^ -1L) < (((lc) this).field_h ^ -1L)) {
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
                        if (((lc) this).field_h > var5_long) {
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
                        if (var5_long >= ((lc) this).field_h + (long)((lc) this).field_k) {
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
                        var9 = ((lc) this).field_h;
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
                        var11 = -1L;
                        if (var5_long >= (long)((lc) this).field_k + ((lc) this).field_h) {
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
                        if (((lc) this).field_h + (long)((lc) this).field_k <= var5_long + (long)var8) {
                            statePc = 47;
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
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((((lc) this).field_h ^ -1L) <= (var5_long + (long)var8 ^ -1L)) {
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
                        if ((long)var8 + var5_long > (long)((lc) this).field_k + ((lc) this).field_h) {
                            statePc = 48;
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
                        var11 = (long)var8 + var5_long;
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
                        var11 = ((lc) this).field_h - -(long)((lc) this).field_k;
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
                        if (0L <= (var9 ^ -1L)) {
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
                        var13 = (int)(var11 - var9);
                        ne.a(((lc) this).field_o, (int)(var9 - ((lc) this).field_h), param0, (int)(var9 - var5_long) + var7, var13);
                        if (((lc) this).field_a >= var11) {
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
                        param3 = (int)((long)param3 - (-((lc) this).field_a + var11));
                        ((lc) this).field_a = var11;
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
                    ((lc) this).field_p = -1L;
                    throw var5;
                }
                case 54: {
                    if (0 < param3) {
                        statePc = 56;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 56: {
                    throw new EOFException();
                }
                case 57: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(byte param0) {
        field_n = null;
        field_g = null;
        if (param0 != -9) {
            field_q = false;
        }
        field_l = null;
        field_e = null;
        field_m = null;
        field_f = null;
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Chess.field_G;
        ((lc) this).field_j = param0;
        if (!((((lc) this).field_p ^ -1L) == (((lc) this).field_a ^ -1L))) {
            ((lc) this).field_c.a(((lc) this).field_a, -11526);
            ((lc) this).field_p = ((lc) this).field_a;
        }
        ((lc) this).field_d = ((lc) this).field_a;
        while (((lc) this).field_j < ((lc) this).field_i.length) {
            var2 = ((lc) this).field_i.length - ((lc) this).field_j;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            var3 = ((lc) this).field_c.a(((lc) this).field_j, ((lc) this).field_i, var2, (byte) 50);
            // if_icmpeq L143
            ((lc) this).field_p = ((lc) this).field_p + (long)var3;
            ((lc) this).field_j = ((lc) this).field_j + var3;
        }
    }

    final void a(byte param0) throws IOException {
        if (param0 != -87) {
            field_m = null;
        }
        this.b(param0 ^ -17308);
        ((lc) this).field_c.a(10992);
    }

    final void a(long param0, int param1) throws IOException {
        if ((long)param1 > param0) {
            throw new IOException();
        }
        ((lc) this).field_a = param0;
    }

    lc(eg param0, int param1, int param2) throws IOException {
        ((lc) this).field_d = -1L;
        ((lc) this).field_k = 0;
        ((lc) this).field_h = -1L;
        ((lc) this).field_c = param0;
        ((lc) this).field_b = param0.a((byte) -89);
        ((lc) this).field_r = param0.a((byte) -89);
        ((lc) this).field_o = new byte[param2];
        ((lc) this).field_a = 0L;
        ((lc) this).field_i = new byte[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "RuneScape clan";
        field_n = new int[128];
        field_l = "Public chat is unavailable while setting up a rated game.";
    }
}
