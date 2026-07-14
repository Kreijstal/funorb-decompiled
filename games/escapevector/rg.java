/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rg {
    private long field_f;
    private long field_d;
    static String field_c;
    private long field_i;
    private long field_k;
    private long field_a;
    private byte[] field_h;
    private long field_e;
    private byte[] field_g;
    private int field_l;
    private int field_j;
    private ma field_b;

    final void a(boolean param0, int param1, byte[] param2, int param3) throws IOException {
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
                    var10 = EscapeVector.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((((rg) this).field_e ^ -1L) > (((rg) this).field_d + (long)param3 ^ -1L)) {
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
                        ((rg) this).field_e = (long)param3 + ((rg) this).field_d;
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
                        if (0L == (((rg) this).field_a ^ -1L)) {
                            statePc = 10;
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
                        if ((((rg) this).field_a ^ -1L) >= (((rg) this).field_d ^ -1L)) {
                            statePc = 7;
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
                        this.b(118);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((long)((rg) this).field_l + ((rg) this).field_a ^ -1L) <= (((rg) this).field_d ^ -1L)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
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
                        this.b(118);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((rg) this).field_a == -1L) {
                            statePc = 13;
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
                        if (((rg) this).field_d - -(long)param3 <= ((rg) this).field_a + (long)((rg) this).field_h.length) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_int = (int)(((rg) this).field_a + -((rg) this).field_d + (long)((rg) this).field_h.length);
                        qg.a(param2, param1, ((rg) this).field_h, (int)(((rg) this).field_d - ((rg) this).field_a), var5_int);
                        param1 = param1 + var5_int;
                        ((rg) this).field_d = ((rg) this).field_d + (long)var5_int;
                        param3 = param3 - var5_int;
                        ((rg) this).field_l = ((rg) this).field_h.length;
                        this.b(115);
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
                        if (((rg) this).field_h.length < param3) {
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
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((((rg) this).field_k ^ -1L) != (((rg) this).field_d ^ -1L)) {
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
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((rg) this).field_b.a(((rg) this).field_d, 1);
                        ((rg) this).field_k = ((rg) this).field_d;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((rg) this).field_b.a(param2, param3, param1, -15814);
                        ((rg) this).field_k = ((rg) this).field_k + (long)param3;
                        if ((((rg) this).field_i ^ -1L) <= (((rg) this).field_k ^ -1L)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((rg) this).field_i = ((rg) this).field_k;
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
                        if (((rg) this).field_f > ((rg) this).field_d) {
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
                        if (((rg) this).field_f + (long)((rg) this).field_j > ((rg) this).field_d) {
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
                        if ((((rg) this).field_f ^ -1L) > (((rg) this).field_d ^ -1L)) {
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
                        if ((((rg) this).field_f ^ -1L) > ((long)param3 + ((rg) this).field_d ^ -1L)) {
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
                        var5_long = ((rg) this).field_f;
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
                        var5_long = ((rg) this).field_d;
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
                        var7 = -1L;
                        if ((((rg) this).field_d + (long)param3 ^ -1L) >= (((rg) this).field_f ^ -1L)) {
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
                        if (((long)((rg) this).field_j + ((rg) this).field_f ^ -1L) > (((rg) this).field_d + (long)param3 ^ -1L)) {
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
                        var7 = (long)param3 + ((rg) this).field_d;
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
                        if ((((rg) this).field_f + (long)((rg) this).field_j ^ -1L) >= (((rg) this).field_d ^ -1L)) {
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
                        if (((long)((rg) this).field_j + ((rg) this).field_f ^ -1L) < ((long)param3 + ((rg) this).field_d ^ -1L)) {
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
                        var7 = ((rg) this).field_f + (long)((rg) this).field_j;
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
                        if (var5_long <= -1L) {
                            statePc = 37;
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
                        if (var5_long >= var7) {
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
                        var9 = (int)(var7 - var5_long);
                        qg.a(param2, (int)(var5_long + (long)param1 + -((rg) this).field_d), ((rg) this).field_g, (int)(var5_long + -((rg) this).field_f), var9);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((rg) this).field_d = ((rg) this).field_d + (long)param3;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return;
                }
                case 39: {
                    try {
                        if (-1 <= (param3 ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (0L == (((rg) this).field_a ^ -1L)) {
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
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((rg) this).field_a = ((rg) this).field_d;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        qg.a(param2, param1, ((rg) this).field_h, (int)(((rg) this).field_d - ((rg) this).field_a), param3);
                        ((rg) this).field_d = ((rg) this).field_d + (long)param3;
                        if (((rg) this).field_d + -((rg) this).field_a > (long)((rg) this).field_l) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ((rg) this).field_l = (int)(((rg) this).field_d + -((rg) this).field_a);
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
                    ((rg) this).field_k = -1L;
                    throw var5;
                }
                case 48: {
                    if (param0) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    ((rg) this).field_g = null;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0) throws IOException {
        if (param0 != -111) {
            field_c = null;
        }
        this.b(125);
        ((rg) this).field_b.a(0);
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = EscapeVector.field_A;
          if ((((rg) this).field_a ^ -1L) != 0L) {
            L1: {
              if (((rg) this).field_a != ((rg) this).field_k) {
                ((rg) this).field_b.a(((rg) this).field_a, 1);
                ((rg) this).field_k = ((rg) this).field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((rg) this).field_b.a(((rg) this).field_h, ((rg) this).field_l, 0, -15814);
              ((rg) this).field_k = ((rg) this).field_k + (long)((rg) this).field_l;
              if (((rg) this).field_i >= ((rg) this).field_k) {
                break L2;
              } else {
                ((rg) this).field_i = ((rg) this).field_k;
                break L2;
              }
            }
            L3: {
              L4: {
                var2_long = -1L;
                if (((rg) this).field_a < ((rg) this).field_f) {
                  break L4;
                } else {
                  if (((rg) this).field_f - -(long)((rg) this).field_j <= ((rg) this).field_a) {
                    break L4;
                  } else {
                    var2_long = ((rg) this).field_a;
                    break L3;
                  }
                }
              }
              if ((((rg) this).field_f ^ -1L) > (((rg) this).field_a ^ -1L)) {
                break L3;
              } else {
                if ((((rg) this).field_f ^ -1L) > (((rg) this).field_a + (long)((rg) this).field_l ^ -1L)) {
                  var2_long = ((rg) this).field_f;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (((long)((rg) this).field_l + ((rg) this).field_a ^ -1L) >= (((rg) this).field_f ^ -1L)) {
                  break L6;
                } else {
                  if ((long)((rg) this).field_j + ((rg) this).field_f < ((rg) this).field_a - -(long)((rg) this).field_l) {
                    break L6;
                  } else {
                    var4 = (long)((rg) this).field_l + ((rg) this).field_a;
                    break L5;
                  }
                }
              }
              if ((((rg) this).field_a ^ -1L) <= (((rg) this).field_f + (long)((rg) this).field_j ^ -1L)) {
                break L5;
              } else {
                if ((((rg) this).field_f + (long)((rg) this).field_j ^ -1L) < (((rg) this).field_a + (long)((rg) this).field_l ^ -1L)) {
                  break L5;
                } else {
                  var4 = ((rg) this).field_f + (long)((rg) this).field_j;
                  break L5;
                }
              }
            }
            L7: {
              if ((var2_long ^ -1L) >= 0L) {
                break L7;
              } else {
                if ((var2_long ^ -1L) > (var4 ^ -1L)) {
                  var6 = (int)(-var2_long + var4);
                  qg.a(((rg) this).field_h, (int)(-((rg) this).field_a + var2_long), ((rg) this).field_g, (int)(-((rg) this).field_f + var2_long), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((rg) this).field_l = 0;
            ((rg) this).field_a = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        var2 = 81 / ((56 - param0) / 50);
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != 0) {
            return;
        }
        if (!(-1L >= (param1 ^ -1L))) {
            throw new IOException();
        }
        ((rg) this).field_d = param1;
    }

    final long a(int param0) {
        if (param0 != 16034) {
            rg.b((byte) -75);
        }
        return ((rg) this).field_e;
    }

    private final void a(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        ((rg) this).field_j = 0;
        if (!(((rg) this).field_d == ((rg) this).field_k)) {
            ((rg) this).field_b.a(((rg) this).field_d, 1);
            ((rg) this).field_k = ((rg) this).field_d;
        }
        ((rg) this).field_f = ((rg) this).field_d;
        if (!param0) {
            return;
        }
        while (((rg) this).field_g.length > ((rg) this).field_j) {
            var2 = ((rg) this).field_g.length + -((rg) this).field_j;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            var3 = ((rg) this).field_b.a(var2, (byte) 127, ((rg) this).field_g, ((rg) this).field_j);
            if (0 == (var3 ^ -1)) {
                break;
            }
            ((rg) this).field_j = ((rg) this).field_j + var3;
            ((rg) this).field_k = ((rg) this).field_k + (long)var3;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        int var1 = -78 / ((-11 - param0) / 41);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
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
                    var14 = EscapeVector.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == 101) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (param0 - -param1 > param3.length) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param1 + (param0 + -param3.length));
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (0L == (((rg) this).field_a ^ -1L)) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((((rg) this).field_d ^ -1L) > (((rg) this).field_a ^ -1L)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((long)((rg) this).field_l + ((rg) this).field_a < (long)param1 + ((rg) this).field_d) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        qg.a(((rg) this).field_h, (int)(-((rg) this).field_a + ((rg) this).field_d), param3, param0, param1);
                        ((rg) this).field_d = ((rg) this).field_d + (long)param1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        var5_long = ((rg) this).field_d;
                        var7 = param0;
                        var8 = param1;
                        if ((((rg) this).field_f ^ -1L) < (((rg) this).field_d ^ -1L)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((rg) this).field_d >= ((rg) this).field_f - -(long)((rg) this).field_j) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = (int)(-((rg) this).field_d - -((rg) this).field_f + (long)((rg) this).field_j);
                        if (param1 >= var9_int) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 52;
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
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        qg.a(((rg) this).field_g, (int)(((rg) this).field_d - ((rg) this).field_f), param3, param0, var9_int);
                        param0 = param0 + var9_int;
                        param1 = param1 - var9_int;
                        ((rg) this).field_d = ((rg) this).field_d + (long)var9_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param1 > ((rg) this).field_g.length) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((param1 ^ -1) >= -1) {
                            statePc = 26;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.a(true);
                        var9_int = param1;
                        if (var9_int > ((rg) this).field_j) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9_int = ((rg) this).field_j;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        qg.a(((rg) this).field_g, 0, param3, param0, var9_int);
                        ((rg) this).field_d = ((rg) this).field_d + (long)var9_int;
                        param1 = param1 - var9_int;
                        param0 = param0 + var9_int;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((rg) this).field_b.a(((rg) this).field_d, 1);
                        ((rg) this).field_k = ((rg) this).field_d;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (-1 <= param1) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9_int = ((rg) this).field_b.a(param1, (byte) 125, param3, param0);
                        if (0 == var9_int) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        param0 = param0 + var9_int;
                        ((rg) this).field_d = ((rg) this).field_d + (long)var9_int;
                        param1 = param1 - var9_int;
                        ((rg) this).field_k = ((rg) this).field_k + (long)var9_int;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (((rg) this).field_a == -1L) {
                            statePc = 53;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((rg) this).field_a ^ -1L) >= (((rg) this).field_d ^ -1L)) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (0 >= param1) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9_int = param0 + (int)(((rg) this).field_a + -((rg) this).field_d);
                        if (var9_int <= param0 + param1) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9_int = param1 + param0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param0 >= var9_int) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        param0++;
                        param3[param0] = (byte) 0;
                        param1--;
                        ((rg) this).field_d = ((rg) this).field_d + 1L;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if (var5_long > ((rg) this).field_a) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (((rg) this).field_a < var5_long + (long)var8) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((((rg) this).field_a ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var5_long ^ -1L) <= ((long)((rg) this).field_l + ((rg) this).field_a ^ -1L)) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = var5_long;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var9 = ((rg) this).field_a;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var5_long ^ -1L) <= ((long)((rg) this).field_l + ((rg) this).field_a ^ -1L)) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (((rg) this).field_a + (long)((rg) this).field_l > var5_long + (long)var8) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var11 = (long)((rg) this).field_l + ((rg) this).field_a;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var5_long + (long)var8 <= ((rg) this).field_a) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((((rg) this).field_a - -(long)((rg) this).field_l ^ -1L) > ((long)var8 + var5_long ^ -1L)) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var11 = var5_long - -(long)var8;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((var9 ^ -1L) >= 0L) {
                            statePc = 53;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((var11 ^ -1L) < (var9 ^ -1L)) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var13 = (int)(var11 + -var9);
                        qg.a(((rg) this).field_h, (int)(-((rg) this).field_a + var9), param3, var7 + (int)(var9 - var5_long), var13);
                        if ((((rg) this).field_d ^ -1L) <= (var11 ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        param1 = (int)((long)param1 - (var11 + -((rg) this).field_d));
                        ((rg) this).field_d = var11;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    var5 = (IOException) (Object) caughtException;
                    ((rg) this).field_k = -1L;
                    throw var5;
                }
                case 53: {
                    if (param1 > 0) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    throw new EOFException();
                }
                case 56: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static short[] a(c param0, int param1, short[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        var4 = param0.j(param1, 8);
        if ((var4 ^ -1) != param3) {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (var4 != param2.length) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param2 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param0.j(4, 8);
            var6 = (short)param0.j(16, 8);
            if (0 < var5) {
              var7 = 0;
              L3: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param2[var7] = (short)(var6 + param0.j(var5, 8));
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param2[var7] = (short)var6;
                  var7++;
                  continue L4;
                }
              }
            }
          }
          return param2;
        } else {
          return null;
        }
    }

    final static boolean a(int[] param0, int param1) {
        long var2 = 0L;
        dm var4_ref_dm = null;
        int var4 = 0;
        int var5_int = 0;
        dm var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = EscapeVector.field_A;
        if (ck.field_t != al.field_d) {
          return false;
        } else {
          var2 = td.b(128);
          if (param1 >= 101) {
            L0: {
              if (vj.field_a == 0) {
                break L0;
              } else {
                if ((eh.field_a ^ -1) > -1) {
                  var4_ref_dm = (dm) (Object) bb.field_L.a(false);
                  if (var4_ref_dm == null) {
                    break L0;
                  } else {
                    if ((var4_ref_dm.field_g ^ -1L) > (var2 ^ -1L)) {
                      var4_ref_dm.c((byte) -67);
                      hi.field_r = var4_ref_dm.field_j.length;
                      om.field_g.field_m = 0;
                      var5_int = 0;
                      L1: while (true) {
                        if (var5_int >= hi.field_r) {
                          g.field_q = f.field_t;
                          f.field_t = jj.field_b;
                          jj.field_b = cd.field_v;
                          cd.field_v = var4_ref_dm.field_i;
                          return true;
                        } else {
                          om.field_g.field_g[var5_int] = var4_ref_dm.field_j[var5_int];
                          var5_int++;
                          continue L1;
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if ((eh.field_a ^ -1) <= -1) {
                  break L3;
                } else {
                  om.field_g.field_m = 0;
                  if (bo.a(30000, 1)) {
                    eh.field_a = om.field_g.k(8);
                    om.field_g.field_m = 0;
                    hi.field_r = param0[eh.field_a];
                    break L3;
                  } else {
                    return false;
                  }
                }
              }
              if (ll.d(10550)) {
                if (vj.field_a != 0) {
                  L4: {
                    var4 = vj.field_a;
                    if (pd.field_a == 0.0) {
                      break L4;
                    } else {
                      var4 = (int)((double)var4 + gk.field_a.nextGaussian() * pd.field_a);
                      if (-1 >= (var4 ^ -1)) {
                        break L4;
                      } else {
                        var4 = 0;
                        break L4;
                      }
                    }
                  }
                  var5 = new dm(var2 - -(long)var4, eh.field_a, new byte[hi.field_r]);
                  var6 = 0;
                  L5: while (true) {
                    if (var6 >= hi.field_r) {
                      bb.field_L.a(-12328, (hg) (Object) var5);
                      eh.field_a = -1;
                      continue L2;
                    } else {
                      var5.field_j[var6] = om.field_g.field_g[var6];
                      var6++;
                      continue L5;
                    }
                  }
                } else {
                  g.field_q = f.field_t;
                  f.field_t = jj.field_b;
                  jj.field_b = cd.field_v;
                  cd.field_v = eh.field_a;
                  eh.field_a = -1;
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        if (param0 < 31) {
        }
        ((rg) this).a(0, param1.length, (byte) 101, param1);
    }

    rg(ma param0, int param1, int param2) throws IOException {
        ((rg) this).field_f = -1L;
        ((rg) this).field_a = -1L;
        ((rg) this).field_l = 0;
        ((rg) this).field_b = param0;
        ((rg) this).field_i = param0.c(-26510);
        ((rg) this).field_e = param0.c(-26510);
        ((rg) this).field_d = 0L;
        ((rg) this).field_g = new byte[param1];
        ((rg) this).field_h = new byte[param2];
    }

    final static lm a(String[] args, byte param1) {
        if (param1 > -53) {
            return null;
        }
        lm var2 = new lm(false);
        var2.field_c = args;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Names cannot contain consecutive spaces";
    }
}
