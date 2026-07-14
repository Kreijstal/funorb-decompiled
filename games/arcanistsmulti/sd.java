/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sd {
    private byte[] field_e;
    static String field_g;
    private kb field_b;
    private long field_d;
    private int field_a;
    private long field_h;
    private int field_f;
    private long field_i;
    private byte[] field_j;
    static String field_l;
    private long field_k;
    private long field_m;
    private long field_c;

    private final void a(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          ((sd) this).field_a = 0;
          if ((((sd) this).field_i ^ -1L) == (((sd) this).field_d ^ -1L)) {
            break L0;
          } else {
            ((sd) this).field_b.a((byte) -123, ((sd) this).field_d);
            ((sd) this).field_i = ((sd) this).field_d;
            break L0;
          }
        }
        if (param0 != 0) {
          return;
        } else {
          ((sd) this).field_k = ((sd) this).field_d;
          L1: while (true) {
            L2: {
              if (((sd) this).field_e.length <= ((sd) this).field_a) {
                break L2;
              } else {
                L3: {
                  var2 = -((sd) this).field_a + ((sd) this).field_e.length;
                  if (-200000001 <= (var2 ^ -1)) {
                    break L3;
                  } else {
                    var2 = 200000000;
                    break L3;
                  }
                }
                var3 = ((sd) this).field_b.a(((sd) this).field_e, false, var2, ((sd) this).field_a);
                if (-1 == var3) {
                  break L2;
                } else {
                  ((sd) this).field_i = ((sd) this).field_i + (long)var3;
                  ((sd) this).field_a = ((sd) this).field_a + var3;
                  continue L1;
                }
              }
            }
            return;
          }
        }
    }

    final static eg a(int param0, byte param1) {
        if (param1 < 5) {
            return null;
        }
        return me.a(param0, true, 2097152, false, 1, false);
    }

    final void c(byte param0) throws IOException {
        if (param0 >= -30) {
            ((sd) this).field_f = -28;
        }
        this.a(-1);
        ((sd) this).field_b.c(105);
    }

    final long b(byte param0) {
        if (param0 != -30) {
            eg discarded$0 = sd.a(87, (byte) 121);
        }
        return ((sd) this).field_h;
    }

    final void a(byte param0, int param1, byte[] param2, int param3) throws IOException {
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
                    var10 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((((sd) this).field_h ^ -1L) <= ((long)param3 + ((sd) this).field_d ^ -1L)) {
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
                        ((sd) this).field_h = ((sd) this).field_d - -(long)param3;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((sd) this).field_c == -1L) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((sd) this).field_c ^ -1L) < (((sd) this).field_d ^ -1L)) {
                            statePc = 7;
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
                        if ((((sd) this).field_d ^ -1L) < (((sd) this).field_c - -(long)((sd) this).field_f ^ -1L)) {
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.a(param0 + 52);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0 == -53) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((sd) this).field_f = -91;
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
                        if (((sd) this).field_c == -1L) {
                            statePc = 13;
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
                        if ((((sd) this).field_c - -(long)((sd) this).field_j.length ^ -1L) <= (((sd) this).field_d + (long)param3 ^ -1L)) {
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
                        var5_int = (int)(-((sd) this).field_d + ((sd) this).field_c + (long)((sd) this).field_j.length);
                        sf.a(param2, param1, ((sd) this).field_j, (int)(-((sd) this).field_c + ((sd) this).field_d), var5_int);
                        param3 = param3 - var5_int;
                        param1 = param1 + var5_int;
                        ((sd) this).field_d = ((sd) this).field_d + (long)var5_int;
                        ((sd) this).field_f = ((sd) this).field_j.length;
                        this.a(-1);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (((sd) this).field_j.length >= param3) {
                            statePc = 41;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((sd) this).field_d == ((sd) this).field_i) {
                            statePc = 16;
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
                        ((sd) this).field_b.a((byte) -123, ((sd) this).field_d);
                        ((sd) this).field_i = ((sd) this).field_d;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((sd) this).field_b.a(param0 + 54, param1, param3, param2);
                        ((sd) this).field_i = ((sd) this).field_i + (long)param3;
                        if ((((sd) this).field_i ^ -1L) < (((sd) this).field_m ^ -1L)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((sd) this).field_m = ((sd) this).field_i;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5_long = -1L;
                        var7 = -1L;
                        if ((((sd) this).field_d ^ -1L) > (((sd) this).field_k ^ -1L)) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (((sd) this).field_d < (long)((sd) this).field_a + ((sd) this).field_k) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((((sd) this).field_k ^ -1L) > (((sd) this).field_d ^ -1L)) {
                            statePc = 27;
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
                        if ((long)param3 + ((sd) this).field_d > ((sd) this).field_k) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5_long = ((sd) this).field_k;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5_long = ((sd) this).field_d;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((long)param3 + ((sd) this).field_d <= ((sd) this).field_k) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((long)((sd) this).field_a + ((sd) this).field_k ^ -1L) <= (((sd) this).field_d - -(long)param3 ^ -1L)) {
                            statePc = 34;
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
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((((sd) this).field_d ^ -1L) <= (((sd) this).field_k + (long)((sd) this).field_a ^ -1L)) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((long)((sd) this).field_a + ((sd) this).field_k <= (long)param3 + ((sd) this).field_d) {
                            statePc = 33;
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
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var7 = (long)((sd) this).field_a + ((sd) this).field_k;
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
                        var7 = ((sd) this).field_d + (long)param3;
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
                        if (0L <= (var5_long ^ -1L)) {
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
                        if (var5_long < var7) {
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
                        sf.a(param2, (int)((long)param1 + (var5_long + -((sd) this).field_d)), ((sd) this).field_e, (int)(var5_long + -((sd) this).field_k), var9);
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
                        ((sd) this).field_d = ((sd) this).field_d + (long)param3;
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
                        if (param3 > 0) {
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
                        if (-1L != ((sd) this).field_c) {
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
                        ((sd) this).field_c = ((sd) this).field_d;
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
                        sf.a(param2, param1, ((sd) this).field_j, (int)(-((sd) this).field_c + ((sd) this).field_d), param3);
                        ((sd) this).field_d = ((sd) this).field_d + (long)param3;
                        if ((((sd) this).field_d + -((sd) this).field_c ^ -1L) >= ((long)((sd) this).field_f ^ -1L)) {
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
                        ((sd) this).field_f = (int)(((sd) this).field_d - ((sd) this).field_c);
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
                    ((sd) this).field_i = -1L;
                    throw var5;
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if ((long)param0 != ((sd) this).field_c) {
            L1: {
              if (((sd) this).field_i == ((sd) this).field_c) {
                break L1;
              } else {
                ((sd) this).field_b.a((byte) -123, ((sd) this).field_c);
                ((sd) this).field_i = ((sd) this).field_c;
                break L1;
              }
            }
            L2: {
              ((sd) this).field_b.a(1, 0, ((sd) this).field_f, ((sd) this).field_j);
              ((sd) this).field_i = ((sd) this).field_i + (long)((sd) this).field_f;
              if (((sd) this).field_m >= ((sd) this).field_i) {
                break L2;
              } else {
                ((sd) this).field_m = ((sd) this).field_i;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (((sd) this).field_k > ((sd) this).field_c) {
                  break L4;
                } else {
                  if (((sd) this).field_k + (long)((sd) this).field_a > ((sd) this).field_c) {
                    var2 = ((sd) this).field_c;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((sd) this).field_k < ((sd) this).field_c) {
                break L3;
              } else {
                if (((sd) this).field_k < ((sd) this).field_c + (long)((sd) this).field_f) {
                  var2 = ((sd) this).field_k;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (((sd) this).field_k >= (long)((sd) this).field_f + ((sd) this).field_c) {
                  break L6;
                } else {
                  if (((sd) this).field_k - -(long)((sd) this).field_a < (long)((sd) this).field_f + ((sd) this).field_c) {
                    break L6;
                  } else {
                    var4 = (long)((sd) this).field_f + ((sd) this).field_c;
                    break L5;
                  }
                }
              }
              if (((sd) this).field_c >= (long)((sd) this).field_a + ((sd) this).field_k) {
                break L5;
              } else {
                if ((long)((sd) this).field_a + ((sd) this).field_k <= ((sd) this).field_c - -(long)((sd) this).field_f) {
                  var4 = ((sd) this).field_k + (long)((sd) this).field_a;
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
                if (var2 < var4) {
                  var6 = (int)(-var2 + var4);
                  sf.a(((sd) this).field_j, (int)(-((sd) this).field_c + var2), ((sd) this).field_e, (int)(-((sd) this).field_k + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((sd) this).field_f = 0;
            ((sd) this).field_c = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        ((sd) this).a(param1.length, param1, (byte) -39, 0);
        if (param0 != -13848) {
            ((sd) this).field_c = 25L;
        }
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
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
                    var14 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 - -param0 <= param1.length) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param1.length + (param0 + param3));
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1L == ((sd) this).field_c) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((sd) this).field_c ^ -1L) < (((sd) this).field_d ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((sd) this).field_d + (long)param0 ^ -1L) < ((long)((sd) this).field_f + ((sd) this).field_c ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        sf.a(((sd) this).field_j, (int)(((sd) this).field_d - ((sd) this).field_c), param1, param3, param0);
                        ((sd) this).field_d = ((sd) this).field_d + (long)param0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var5_long = ((sd) this).field_d;
                        if (param2 == -39) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var15 = null;
                        sd.a(10, (String) null, -35, 66, 53, (String) null);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7 = param3;
                        var8 = param0;
                        if (((sd) this).field_d < ((sd) this).field_k) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((((sd) this).field_d ^ -1L) <= ((long)((sd) this).field_a + ((sd) this).field_k ^ -1L)) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9_int = (int)((long)((sd) this).field_a - (-((sd) this).field_k + ((sd) this).field_d));
                        if (var9_int <= param0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = param0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        sf.a(((sd) this).field_e, (int)(((sd) this).field_d - ((sd) this).field_k), param1, param3, var9_int);
                        ((sd) this).field_d = ((sd) this).field_d + (long)var9_int;
                        param3 = param3 + var9_int;
                        param0 = param0 - var9_int;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param0 <= ((sd) this).field_e.length) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((sd) this).field_b.a((byte) -123, ((sd) this).field_d);
                        ((sd) this).field_i = ((sd) this).field_d;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (-1 <= param0) {
                            statePc = 27;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9_int = ((sd) this).field_b.a(param1, false, param0, param3);
                        if (0 != var9_int) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        param3 = param3 + var9_int;
                        param0 = param0 - var9_int;
                        ((sd) this).field_i = ((sd) this).field_i + (long)var9_int;
                        ((sd) this).field_d = ((sd) this).field_d + (long)var9_int;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (param0 > 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.a((byte) 0);
                        var9_int = param0;
                        if (((sd) this).field_a < var9_int) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9_int = ((sd) this).field_a;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        sf.a(((sd) this).field_e, 0, param1, param3, var9_int);
                        param0 = param0 - var9_int;
                        ((sd) this).field_d = ((sd) this).field_d + (long)var9_int;
                        param3 = param3 + var9_int;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((sd) this).field_c ^ -1L) == 0L) {
                            statePc = 56;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((((sd) this).field_d ^ -1L) <= (((sd) this).field_c ^ -1L)) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (0 >= param0) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9_int = param3 + (int)(-((sd) this).field_d + ((sd) this).field_c);
                        if (param3 + param0 < var9_int) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9_int = param0 + param3;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var9_int <= param3) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        param0--;
                        param3++;
                        param1[param3] = (byte) 0;
                        ((sd) this).field_d = ((sd) this).field_d + 1L;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = -1L;
                        if ((((sd) this).field_c ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (((sd) this).field_c >= var5_long - -(long)var8) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = ((sd) this).field_c;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((((sd) this).field_c ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((((sd) this).field_c - -(long)((sd) this).field_f ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var9 = var5_long;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var11 = -1L;
                        if (var5_long >= ((sd) this).field_c + (long)((sd) this).field_f) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((long)var8 + var5_long ^ -1L) <= (((sd) this).field_c - -(long)((sd) this).field_f ^ -1L)) {
                            statePc = 48;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((var5_long + (long)var8 ^ -1L) >= (((sd) this).field_c ^ -1L)) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((long)((sd) this).field_f + ((sd) this).field_c >= var5_long + (long)var8) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var11 = (long)((sd) this).field_f + ((sd) this).field_c;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var9 <= -1L) {
                            statePc = 56;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                            statePc = 56;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var13 = (int)(var11 - var9);
                        sf.a(((sd) this).field_j, (int)(var9 + -((sd) this).field_c), param1, var7 - -(int)(-var5_long + var9), var13);
                        if (var11 > ((sd) this).field_d) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        param0 = (int)((long)param0 - (var11 - ((sd) this).field_d));
                        ((sd) this).field_d = var11;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var5 = (IOException) (Object) caughtException;
                    ((sd) this).field_i = -1L;
                    throw var5;
                }
                case 56: {
                    if (0 < param0) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    return;
                }
                case 58: {
                    throw new EOFException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(long param0, int param1) throws IOException {
        Object var5 = null;
        L0: {
          if (param1 < -85) {
            break L0;
          } else {
            var5 = null;
            sd.a(-98, (String) null, 53, 5, -83, (String) null);
            break L0;
          }
        }
        if (0L > param0) {
          throw new IOException();
        } else {
          ((sd) this).field_d = param0;
          return;
        }
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, String param5) {
        ab var9 = he.field_e;
        var9.b((byte) -58, param3);
        var9.field_g = var9.field_g + 1;
        if (param2 <= 60) {
            Object var8 = null;
            sd.a(-27, (String) null, 28, 54, -6, (String) null);
        }
        int var7 = var9.field_g;
        var9.f(param4, (byte) -71);
        if (!((param4 ^ -1) != -3)) {
            var9.a(param5, 23333);
        }
        if (param1 == null) {
            var9.c(param0, (byte) -119);
        } else {
            int discarded$0 = jh.a((wk) (Object) var9, (byte) 127, param1);
        }
        var9.b(-var7 + var9.field_g, (byte) 43);
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 != -1) {
            return;
        }
        field_l = null;
    }

    sd(kb param0, int param1, int param2) throws IOException {
        ((sd) this).field_k = -1L;
        ((sd) this).field_c = -1L;
        ((sd) this).field_f = 0;
        ((sd) this).field_b = param0;
        ((sd) this).field_m = param0.a(-2775);
        ((sd) this).field_h = param0.a(-2775);
        ((sd) this).field_e = new byte[param1];
        ((sd) this).field_j = new byte[param2];
        ((sd) this).field_d = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Sound: ";
        field_l = "You cannot add yourself!";
    }
}
