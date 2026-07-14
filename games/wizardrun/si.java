/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class si {
    private long field_m;
    static String field_b;
    private long field_p;
    private byte[] field_k;
    private byte[] field_a;
    static int field_h;
    private long field_n;
    static String field_g;
    static int field_f;
    private long field_d;
    static hi field_q;
    private int field_l;
    static je[] field_j;
    private int field_i;
    private long field_c;
    private ri field_o;
    private long field_e;

    final void a(byte[] param0, int param1) throws IOException {
        ((si) this).a(0, param0, param0.length, (byte) 47);
        if (param1 != 9350) {
            field_j = null;
        }
    }

    final void a(long param0, byte param1) throws IOException {
        int var4 = -121 / ((param1 - -9) / 48);
        if (!(0L <= param0)) {
            throw new IOException();
        }
        ((si) this).field_e = param0;
    }

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        field_j = null;
        if (param0 != -92) {
            kl discarded$0 = si.a(-38, 97);
        }
        field_q = null;
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
                    var10 = wizardrun.field_H;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 18729) {
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
                    return;
                }
                case 3: {
                    try {
                        if (((long)param2 + ((si) this).field_e ^ -1L) < (((si) this).field_n ^ -1L)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((si) this).field_n = (long)param2 + ((si) this).field_e;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (0L == (((si) this).field_m ^ -1L)) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((((si) this).field_e ^ -1L) > (((si) this).field_m ^ -1L)) {
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
                        if ((((si) this).field_m + (long)((si) this).field_i ^ -1L) <= (((si) this).field_e ^ -1L)) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
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
                        this.b(param0 + -24430);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((si) this).field_m == -1L) {
                            statePc = 15;
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
                        if ((long)((si) this).field_k.length + ((si) this).field_m < (long)param2 + ((si) this).field_e) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5_int = (int)(-((si) this).field_e + (((si) this).field_m + (long)((si) this).field_k.length));
                        g.a(param1, param3, ((si) this).field_k, (int)(((si) this).field_e + -((si) this).field_m), var5_int);
                        param2 = param2 - var5_int;
                        ((si) this).field_e = ((si) this).field_e + (long)var5_int;
                        param3 = param3 + var5_int;
                        ((si) this).field_i = ((si) this).field_k.length;
                        this.b(param0 ^ -24430);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((si) this).field_k.length < param2) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (((si) this).field_p == ((si) this).field_e) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((si) this).field_o.a(((si) this).field_e, (byte) -24);
                        ((si) this).field_p = ((si) this).field_e;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((si) this).field_o.a(param2, param1, true, param3);
                        ((si) this).field_p = ((si) this).field_p + (long)param2;
                        if (((si) this).field_d >= ((si) this).field_p) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((si) this).field_d = ((si) this).field_p;
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
                        var7 = -1L;
                        if (((si) this).field_e < ((si) this).field_c) {
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
                        if ((((si) this).field_c - -(long)((si) this).field_l ^ -1L) < (((si) this).field_e ^ -1L)) {
                            statePc = 27;
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
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (((si) this).field_e > ((si) this).field_c) {
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
                        if (((si) this).field_c >= ((si) this).field_e + (long)param2) {
                            statePc = 28;
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
                        var5_long = ((si) this).field_c;
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
                        var5_long = ((si) this).field_e;
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
                        if ((((si) this).field_e - -(long)param2 ^ -1L) >= (((si) this).field_c ^ -1L)) {
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
                        if (((long)param2 + ((si) this).field_e ^ -1L) >= (((si) this).field_c - -(long)((si) this).field_l ^ -1L)) {
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
                        if (((long)((si) this).field_l + ((si) this).field_c ^ -1L) >= (((si) this).field_e ^ -1L)) {
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
                        if ((((si) this).field_c - -(long)((si) this).field_l ^ -1L) >= ((long)param2 + ((si) this).field_e ^ -1L)) {
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
                        var7 = (long)((si) this).field_l + ((si) this).field_c;
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
                        var7 = (long)param2 + ((si) this).field_e;
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
                        var9 = (int)(var7 - var5_long);
                        g.a(param1, (int)(var5_long + (long)param3 - ((si) this).field_e), ((si) this).field_a, (int)(var5_long - ((si) this).field_c), var9);
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
                        ((si) this).field_e = ((si) this).field_e + (long)param2;
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
                        if (0 >= param2) {
                            statePc = 50;
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
                        if (((si) this).field_m == -1L) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ((si) this).field_m = ((si) this).field_e;
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
                        g.a(param1, param3, ((si) this).field_k, (int)(((si) this).field_e + -((si) this).field_m), param2);
                        ((si) this).field_e = ((si) this).field_e + (long)param2;
                        if (((si) this).field_e + -((si) this).field_m <= (long)((si) this).field_i) {
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
                        ((si) this).field_i = (int)(-((si) this).field_m + ((si) this).field_e);
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
                    ((si) this).field_p = -1L;
                    throw var5;
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = wizardrun.field_H;
          if (param0 == -5701) {
            break L0;
          } else {
            kl discarded$1 = si.a(-93, 38);
            break L0;
          }
        }
        L1: {
          if (0L == (((si) this).field_m ^ -1L)) {
            break L1;
          } else {
            L2: {
              if ((((si) this).field_p ^ -1L) != (((si) this).field_m ^ -1L)) {
                ((si) this).field_o.a(((si) this).field_m, (byte) -24);
                ((si) this).field_p = ((si) this).field_m;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((si) this).field_o.a(((si) this).field_i, ((si) this).field_k, true, 0);
              ((si) this).field_p = ((si) this).field_p + (long)((si) this).field_i;
              if (((si) this).field_d >= ((si) this).field_p) {
                break L3;
              } else {
                ((si) this).field_d = ((si) this).field_p;
                break L3;
              }
            }
            L4: {
              L5: {
                var2 = -1L;
                var4 = -1L;
                if ((((si) this).field_c ^ -1L) < (((si) this).field_m ^ -1L)) {
                  break L5;
                } else {
                  if ((((si) this).field_m ^ -1L) <= (((si) this).field_c - -(long)((si) this).field_l ^ -1L)) {
                    break L5;
                  } else {
                    var2 = ((si) this).field_m;
                    break L4;
                  }
                }
              }
              if (((si) this).field_m > ((si) this).field_c) {
                break L4;
              } else {
                if ((((si) this).field_m + (long)((si) this).field_i ^ -1L) >= (((si) this).field_c ^ -1L)) {
                  break L4;
                } else {
                  var2 = ((si) this).field_c;
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                if ((((si) this).field_m + (long)((si) this).field_i ^ -1L) >= (((si) this).field_c ^ -1L)) {
                  break L7;
                } else {
                  if ((long)((si) this).field_i + ((si) this).field_m > (long)((si) this).field_l + ((si) this).field_c) {
                    break L7;
                  } else {
                    var4 = (long)((si) this).field_i + ((si) this).field_m;
                    break L6;
                  }
                }
              }
              if ((((si) this).field_m ^ -1L) <= ((long)((si) this).field_l + ((si) this).field_c ^ -1L)) {
                break L6;
              } else {
                if ((long)((si) this).field_l + ((si) this).field_c <= (long)((si) this).field_i + ((si) this).field_m) {
                  var4 = ((si) this).field_c - -(long)((si) this).field_l;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (0L <= (var2 ^ -1L)) {
                break L8;
              } else {
                if (var4 > var2) {
                  var6 = (int)(var4 - var2);
                  g.a(((si) this).field_k, (int)(var2 + -((si) this).field_m), ((si) this).field_a, (int)(-((si) this).field_c + var2), var6);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            ((si) this).field_i = 0;
            ((si) this).field_m = -1L;
            break L1;
          }
        }
    }

    final long b(byte param0) {
        if (param0 != 79) {
            field_h = -71;
        }
        return ((si) this).field_n;
    }

    private final void c(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = wizardrun.field_H;
        if (param0 >= -85) {
          return;
        } else {
          L0: {
            ((si) this).field_l = 0;
            if (((si) this).field_p == ((si) this).field_e) {
              break L0;
            } else {
              ((si) this).field_o.a(((si) this).field_e, (byte) -24);
              ((si) this).field_p = ((si) this).field_e;
              break L0;
            }
          }
          ((si) this).field_c = ((si) this).field_e;
          L1: while (true) {
            L2: {
              if (((si) this).field_a.length <= ((si) this).field_l) {
                break L2;
              } else {
                L3: {
                  var2 = -((si) this).field_l + ((si) this).field_a.length;
                  if (var2 > 200000000) {
                    var2 = 200000000;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = ((si) this).field_o.a(((si) this).field_a, 4836, ((si) this).field_l, var2);
                if (var3 == -1) {
                  break L2;
                } else {
                  ((si) this).field_p = ((si) this).field_p + (long)var3;
                  ((si) this).field_l = ((si) this).field_l + var3;
                  continue L1;
                }
              }
            }
            return;
          }
        }
    }

    final static kl a(int param0, int param1) {
        int var2 = -72 / ((-23 - param0) / 63);
        return sc.a(param1, 12000, 1, false, false, true);
    }

    final void a(int param0) throws IOException {
        this.b(param0 ^ 5700);
        ((si) this).field_o.a(param0);
    }

    final void a(int param0, byte[] param1, int param2, byte param3) throws IOException {
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
                    var14 = wizardrun.field_H;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 + param0 > param1.length) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param1.length + (param2 + param0));
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((si) this).field_m == -1L) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((si) this).field_m ^ -1L) < (((si) this).field_e ^ -1L)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((((si) this).field_m - -(long)((si) this).field_i ^ -1L) <= (((si) this).field_e - -(long)param2 ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        g.a(((si) this).field_k, (int)(((si) this).field_e + -((si) this).field_m), param1, param0, param2);
                        ((si) this).field_e = ((si) this).field_e + (long)param2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        var5_long = ((si) this).field_e;
                        var7 = param0;
                        var8 = param2;
                        if ((((si) this).field_e ^ -1L) > (((si) this).field_c ^ -1L)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((si) this).field_e >= (long)((si) this).field_l + ((si) this).field_c) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9_int = (int)(-((si) this).field_e + ((si) this).field_c + (long)((si) this).field_l);
                        if (var9_int <= param2) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = param2;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        g.a(((si) this).field_a, (int)(-((si) this).field_c + ((si) this).field_e), param1, param0, var9_int);
                        ((si) this).field_e = ((si) this).field_e + (long)var9_int;
                        param2 = param2 - var9_int;
                        param0 = param0 + var9_int;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((si) this).field_a.length >= param2) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((si) this).field_o.a(((si) this).field_e, (byte) -24);
                        ((si) this).field_p = ((si) this).field_e;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (0 >= param2) {
                            statePc = 27;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9_int = ((si) this).field_o.a(param1, param3 ^ 4811, param0, param2);
                        if ((var9_int ^ -1) != 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((si) this).field_e = ((si) this).field_e + (long)var9_int;
                        param0 = param0 + var9_int;
                        param2 = param2 - var9_int;
                        ((si) this).field_p = ((si) this).field_p + (long)var9_int;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((param2 ^ -1) < -1) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.c((byte) -121);
                        var9_int = param2;
                        if (((si) this).field_l < var9_int) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9_int = ((si) this).field_l;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        g.a(((si) this).field_a, 0, param1, param0, var9_int);
                        param0 = param0 + var9_int;
                        ((si) this).field_e = ((si) this).field_e + (long)var9_int;
                        param2 = param2 - var9_int;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param3 == 47) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        si.a((byte) -46);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (0L != (((si) this).field_m ^ -1L)) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (((si) this).field_m <= ((si) this).field_e) {
                            statePc = 39;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (param2 > 0) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9_int = param0 - -(int)(-((si) this).field_e + ((si) this).field_m);
                        if (var9_int > param0 + param2) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9_int = param0 + param2;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (param0 >= var9_int) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        param0++;
                        param1[param0] = (byte) 0;
                        param2--;
                        ((si) this).field_e = ((si) this).field_e + 1L;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var9 = -1L;
                        if ((((si) this).field_m ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var5_long - -(long)var8 > ((si) this).field_m) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((((si) this).field_m ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var5_long ^ -1L) > (((si) this).field_m - -(long)((si) this).field_i ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var9 = var5_long;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var9 = ((si) this).field_m;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11 = -1L;
                        if ((long)((si) this).field_i + ((si) this).field_m <= var5_long) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (((long)var8 + var5_long ^ -1L) > ((long)((si) this).field_i + ((si) this).field_m ^ -1L)) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var11 = ((si) this).field_m - -(long)((si) this).field_i;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (((long)var8 + var5_long ^ -1L) >= (((si) this).field_m ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((long)((si) this).field_i + ((si) this).field_m < (long)var8 + var5_long) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (-1L >= var9) {
                            statePc = 60;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var9 >= var11) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var13 = (int)(-var9 + var11);
                        g.a(((si) this).field_k, (int)(var9 + -((si) this).field_m), param1, (int)(-var5_long + var9) + var7, var13);
                        if ((((si) this).field_e ^ -1L) > (var11 ^ -1L)) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        param2 = (int)((long)param2 - (-((si) this).field_e + var11));
                        ((si) this).field_e = var11;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    var5 = (IOException) (Object) caughtException;
                    ((si) this).field_p = -1L;
                    throw var5;
                }
                case 60: {
                    if (-1 > (param2 ^ -1)) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    return;
                }
                case 62: {
                    throw new EOFException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    si(ri param0, int param1, int param2) throws IOException {
        ((si) this).field_m = -1L;
        ((si) this).field_i = 0;
        ((si) this).field_c = -1L;
        ((si) this).field_o = param0;
        ((si) this).field_d = param0.b(0);
        ((si) this).field_n = param0.b(0);
        ((si) this).field_a = new byte[param1];
        ((si) this).field_e = 0L;
        ((si) this).field_k = new byte[param2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_g = "Level not yet reached";
        field_b = "From only <%0>/month";
        field_j = new je[31];
    }
}
