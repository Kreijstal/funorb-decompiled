/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class o {
    private byte[] field_a;
    private long field_k;
    private long field_l;
    private long field_e;
    private long field_h;
    private byte[] field_g;
    private long field_f;
    private int field_b;
    private long field_i;
    static String field_c;
    private int field_j;
    private ue field_d;

    private final void c(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Torquing.field_u;
          if ((((o) this).field_e ^ -1L) != 0L) {
            L1: {
              if ((((o) this).field_e ^ -1L) != (((o) this).field_h ^ -1L)) {
                ((o) this).field_d.a(-2, ((o) this).field_e);
                ((o) this).field_h = ((o) this).field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((o) this).field_d.a(((o) this).field_b, 2, 0, ((o) this).field_g);
              ((o) this).field_h = ((o) this).field_h + (long)((o) this).field_b;
              if ((((o) this).field_k ^ -1L) > (((o) this).field_h ^ -1L)) {
                ((o) this).field_k = ((o) this).field_h;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (((o) this).field_e < ((o) this).field_f) {
                  break L4;
                } else {
                  if (((o) this).field_e < (long)((o) this).field_j + ((o) this).field_f) {
                    var2 = ((o) this).field_e;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((o) this).field_e > ((o) this).field_f) {
                break L3;
              } else {
                if (((o) this).field_f < ((o) this).field_e + (long)((o) this).field_b) {
                  var2 = ((o) this).field_f;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if ((((o) this).field_f ^ -1L) <= ((long)((o) this).field_b + ((o) this).field_e ^ -1L)) {
                  break L6;
                } else {
                  if ((((o) this).field_e - -(long)((o) this).field_b ^ -1L) < (((o) this).field_f + (long)((o) this).field_j ^ -1L)) {
                    break L6;
                  } else {
                    var4 = ((o) this).field_e - -(long)((o) this).field_b;
                    break L5;
                  }
                }
              }
              if (((o) this).field_f - -(long)((o) this).field_j <= ((o) this).field_e) {
                break L5;
              } else {
                if ((((o) this).field_e - -(long)((o) this).field_b ^ -1L) <= ((long)((o) this).field_j + ((o) this).field_f ^ -1L)) {
                  var4 = ((o) this).field_f + (long)((o) this).field_j;
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
                if (var2 < var4) {
                  var6 = (int)(var4 + -var2);
                  dk.a(((o) this).field_g, (int)(var2 - ((o) this).field_e), ((o) this).field_a, (int)(-((o) this).field_f + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((o) this).field_b = 0;
            ((o) this).field_e = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0 > 45) {
            break L8;
          } else {
            o.b(77);
            break L8;
          }
        }
    }

    final long b(boolean param0) {
        if (!param0) {
            return -35L;
        }
        return ((o) this).field_l;
    }

    final void a(boolean param0) throws IOException {
        this.c(116);
        ((o) this).field_d.a((byte) -118);
        if (param0) {
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
                    var10 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((o) this).field_i + (long)param1 > ((o) this).field_l) {
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
                        ((o) this).field_l = (long)param1 + ((o) this).field_i;
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
                        if ((((o) this).field_e ^ -1L) == 0L) {
                            statePc = 10;
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
                        if (((o) this).field_i >= ((o) this).field_e) {
                            statePc = 7;
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
                        this.c(100);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((o) this).field_e + (long)((o) this).field_b >= ((o) this).field_i) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
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
                        this.c(100);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (0L == (((o) this).field_e ^ -1L)) {
                            statePc = 14;
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
                        if ((((o) this).field_i + (long)param1 ^ -1L) < ((long)((o) this).field_g.length + ((o) this).field_e ^ -1L)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5_int = (int)((long)((o) this).field_g.length - (((o) this).field_i + -((o) this).field_e));
                        dk.a(param3, param2, ((o) this).field_g, (int)(((o) this).field_i - ((o) this).field_e), var5_int);
                        param1 = param1 - var5_int;
                        ((o) this).field_i = ((o) this).field_i + (long)var5_int;
                        param2 = param2 + var5_int;
                        ((o) this).field_b = ((o) this).field_g.length;
                        this.c(55);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((o) this).field_g.length >= param1) {
                            statePc = 41;
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
                        if (((o) this).field_i != ((o) this).field_h) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((o) this).field_d.a(-2, ((o) this).field_i);
                        ((o) this).field_h = ((o) this).field_i;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((o) this).field_d.a(param1, 2, param2, param3);
                        ((o) this).field_h = ((o) this).field_h + (long)param1;
                        if ((((o) this).field_h ^ -1L) < (((o) this).field_k ^ -1L)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((o) this).field_k = ((o) this).field_h;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5_long = -1L;
                        if (((o) this).field_i < ((o) this).field_f) {
                            statePc = 24;
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
                        if ((((o) this).field_f + (long)((o) this).field_j ^ -1L) >= (((o) this).field_i ^ -1L)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5_long = ((o) this).field_i;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (((o) this).field_i > ((o) this).field_f) {
                            statePc = 28;
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
                        if ((((o) this).field_i + (long)param1 ^ -1L) < (((o) this).field_f ^ -1L)) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
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
                        var5_long = ((o) this).field_f;
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
                        var7 = -1L;
                        if (((o) this).field_i - -(long)param1 <= ((o) this).field_f) {
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
                        if (((long)param1 + ((o) this).field_i ^ -1L) >= ((long)((o) this).field_j + ((o) this).field_f ^ -1L)) {
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
                        if (((o) this).field_f + (long)((o) this).field_j <= ((o) this).field_i) {
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
                        if ((long)param1 + ((o) this).field_i < ((o) this).field_f + (long)((o) this).field_j) {
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
                        var7 = (long)((o) this).field_j + ((o) this).field_f;
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
                        var7 = (long)param1 + ((o) this).field_i;
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
                        if (var5_long <= -1L) {
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
                        if ((var5_long ^ -1L) > (var7 ^ -1L)) {
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
                        var9 = (int)(var7 + -var5_long);
                        dk.a(param3, (int)((long)param2 - -var5_long + -((o) this).field_i), ((o) this).field_a, (int)(-((o) this).field_f + var5_long), var9);
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
                        ((o) this).field_i = ((o) this).field_i + (long)param1;
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
                        if (param1 > 0) {
                            statePc = 43;
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
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (((o) this).field_e != -1L) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((o) this).field_e = ((o) this).field_i;
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
                        dk.a(param3, param2, ((o) this).field_g, (int)(-((o) this).field_e + ((o) this).field_i), param1);
                        ((o) this).field_i = ((o) this).field_i + (long)param1;
                        if (((long)((o) this).field_b ^ -1L) <= (-((o) this).field_e + ((o) this).field_i ^ -1L)) {
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
                        ((o) this).field_b = (int)(((o) this).field_i - ((o) this).field_e);
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
                    ((o) this).field_h = -1L;
                    throw var5;
                }
                case 49: {
                    if (param0 == -1) {
                        statePc = 51;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        if (param0 != -1) {
            field_c = null;
        }
        field_c = null;
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Torquing.field_u;
        ((o) this).field_j = 0;
        if (!(((o) this).field_i == ((o) this).field_h)) {
            ((o) this).field_d.a(-2, ((o) this).field_i);
            ((o) this).field_h = ((o) this).field_i;
        }
        ((o) this).field_f = ((o) this).field_i;
        if (param0 >= -54) {
        }
        while (((o) this).field_a.length > ((o) this).field_j) {
            var2 = -((o) this).field_j + ((o) this).field_a.length;
            if (!((var2 ^ -1) >= -200000001)) {
                var2 = 200000000;
            }
            var3 = ((o) this).field_d.a(var2, ((o) this).field_j, ((o) this).field_a, 15389);
            if ((var3 ^ -1) == 0) {
                break;
            }
            ((o) this).field_h = ((o) this).field_h + (long)var3;
            ((o) this).field_j = ((o) this).field_j + var3;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
                    var15 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1.length < param2 + param0) {
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
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param1.length + param2 + param0);
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1L == ((o) this).field_e) {
                            statePc = 10;
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
                        if (((o) this).field_i < ((o) this).field_e) {
                            statePc = 10;
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
                        if (((o) this).field_e - -(long)((o) this).field_b >= ((o) this).field_i - -(long)param2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        dk.a(((o) this).field_g, (int)(-((o) this).field_e + ((o) this).field_i), param1, param0, param2);
                        ((o) this).field_i = ((o) this).field_i + (long)param2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        var8 = 76 / ((param3 - 1) / 44);
                        var5_long = ((o) this).field_i;
                        var7 = param0;
                        var9 = param2;
                        if ((((o) this).field_f ^ -1L) < (((o) this).field_i ^ -1L)) {
                            statePc = 15;
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
                        if ((long)((o) this).field_j + ((o) this).field_f <= ((o) this).field_i) {
                            statePc = 15;
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
                        var10_int = (int)(((o) this).field_f + -((o) this).field_i + (long)((o) this).field_j);
                        if (var10_int <= param2) {
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
                        var10_int = param2;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        dk.a(((o) this).field_a, (int)(-((o) this).field_f + ((o) this).field_i), param1, param0, var10_int);
                        ((o) this).field_i = ((o) this).field_i + (long)var10_int;
                        param2 = param2 - var10_int;
                        param0 = param0 + var10_int;
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
                        if (((o) this).field_a.length >= param2) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((o) this).field_d.a(-2, ((o) this).field_i);
                        ((o) this).field_h = ((o) this).field_i;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param2 >= -1) {
                            statePc = 26;
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
                        var10_int = ((o) this).field_d.a(param2, param0, param1, 15389);
                        if (0 != var10_int) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        param0 = param0 + var10_int;
                        ((o) this).field_i = ((o) this).field_i + (long)var10_int;
                        param2 = param2 - var10_int;
                        ((o) this).field_h = ((o) this).field_h + (long)var10_int;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (0 >= param2) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.a(-70);
                        var10_int = param2;
                        if (var10_int > ((o) this).field_j) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var10_int = ((o) this).field_j;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        dk.a(((o) this).field_a, 0, param1, param0, var10_int);
                        param2 = param2 - var10_int;
                        ((o) this).field_i = ((o) this).field_i + (long)var10_int;
                        param0 = param0 + var10_int;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (((o) this).field_e != -1L) {
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
                        if (((o) this).field_i >= ((o) this).field_e) {
                            statePc = 36;
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
                        if (-1 > (param2 ^ -1)) {
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
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var10_int = (int)(((o) this).field_e - ((o) this).field_i) + param0;
                        if (param2 + param0 < var10_int) {
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
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var10_int = param2 + param0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var10_int <= param0) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param2--;
                        param0++;
                        param1[param0] = (byte) 0;
                        ((o) this).field_i = ((o) this).field_i + 1L;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var10 = -1L;
                        var12 = -1L;
                        if (var5_long > ((o) this).field_e) {
                            statePc = 39;
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
                        if ((((o) this).field_e ^ -1L) <= ((long)var9 + var5_long ^ -1L)) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var10 = ((o) this).field_e;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var5_long < ((o) this).field_e) {
                            statePc = 42;
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
                        if ((var5_long ^ -1L) <= (((o) this).field_e + (long)((o) this).field_b ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var10 = var5_long;
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
                        if ((((o) this).field_e - -(long)((o) this).field_b ^ -1L) >= (var5_long ^ -1L)) {
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
                        if (((o) this).field_e + (long)((o) this).field_b <= var5_long - -(long)var9) {
                            statePc = 48;
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
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((long)var9 + var5_long <= ((o) this).field_e) {
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
                        if ((long)((o) this).field_b + ((o) this).field_e < var5_long + (long)var9) {
                            statePc = 49;
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
                        var12 = var5_long + (long)var9;
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
                        var12 = ((o) this).field_e - -(long)((o) this).field_b;
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
                        if ((var10 ^ -1L) >= 0L) {
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
                        if (var10 >= var12) {
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
                        var14 = (int)(-var10 + var12);
                        dk.a(((o) this).field_g, (int)(-((o) this).field_e + var10), param1, var7 - -(int)(var10 - var5_long), var14);
                        if (((o) this).field_i >= var12) {
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
                        param2 = (int)((long)param2 - (-((o) this).field_i + var12));
                        ((o) this).field_i = var12;
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
                    ((o) this).field_h = -1L;
                    throw var5;
                }
                case 55: {
                    if ((param2 ^ -1) < -1) {
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

    final void a(boolean param0, long param1) throws IOException {
        if (!((param1 ^ -1L) <= -1L)) {
            throw new IOException();
        }
        ((o) this).field_i = param1;
        if (param0) {
            o.b(116);
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        if (param0 != -1) {
            field_c = null;
        }
        ((o) this).a(0, param1, param1.length, -78);
    }

    o(ue param0, int param1, int param2) throws IOException {
        ((o) this).field_e = -1L;
        ((o) this).field_f = -1L;
        ((o) this).field_b = 0;
        ((o) this).field_d = param0;
        ((o) this).field_k = param0.b((byte) 94);
        ((o) this).field_l = param0.b((byte) 94);
        ((o) this).field_i = 0L;
        ((o) this).field_g = new byte[param2];
        ((o) this).field_a = new byte[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Your email address is used to identify this account";
    }
}
