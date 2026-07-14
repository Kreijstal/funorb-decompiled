/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ud {
    private long field_f;
    private byte[] field_k;
    private long field_b;
    private long field_i;
    private byte[] field_l;
    private long field_m;
    private int field_e;
    static String field_q;
    private bg field_g;
    static go[] field_h;
    private int field_c;
    static uf field_o;
    static volatile boolean field_n;
    static String field_j;
    private long field_p;
    private long field_a;
    static int field_d;

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        if (param0 != -1) {
          return;
        } else {
          L0: {
            ((ud) this).field_e = 0;
            if ((((ud) this).field_m ^ -1L) != (((ud) this).field_b ^ -1L)) {
              ((ud) this).field_g.a((byte) 102, ((ud) this).field_m);
              ((ud) this).field_b = ((ud) this).field_m;
              break L0;
            } else {
              break L0;
            }
          }
          ((ud) this).field_p = ((ud) this).field_m;
          L1: while (true) {
            L2: {
              if (((ud) this).field_e >= ((ud) this).field_k.length) {
                break L2;
              } else {
                L3: {
                  var2 = ((ud) this).field_k.length - ((ud) this).field_e;
                  if (var2 < -200000001) {
                    var2 = 200000000;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = ((ud) this).field_g.b(((ud) this).field_e, ((ud) this).field_k, var2, 11812);
                if (0 != var3) {
                  ((ud) this).field_e = ((ud) this).field_e + var3;
                  ((ud) this).field_b = ((ud) this).field_b + (long)var3;
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

    final static void a(int param0, int param1, int param2, byte param3, int[] param4) {
        int[] var10 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = HoldTheLine.field_D;
        if (param3 != -85) {
            Object var9 = null;
            ud.a(78, -120, -127, (byte) -20, (int[]) null);
        }
        while (true) {
            param0--;
            if (-1 < (param0 ^ -1)) {
                break;
            }
            var10 = param4;
            int[] var5 = var10;
            var6 = param1;
            var7 = param2;
            var10[var6] = var7 + pk.a(8355711, var10[var6] >> 531943681);
            param1++;
        }
    }

    private final void b(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = HoldTheLine.field_D;
          if (param0 == -1) {
            break L0;
          } else {
            ((ud) this).field_i = -96L;
            break L0;
          }
        }
        L1: {
          if (0L != (((ud) this).field_a ^ -1L)) {
            L2: {
              if (((ud) this).field_a != ((ud) this).field_b) {
                ((ud) this).field_g.a((byte) 66, ((ud) this).field_a);
                ((ud) this).field_b = ((ud) this).field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((ud) this).field_g.a(((ud) this).field_c, ((ud) this).field_l, 0, param0 ^ 17173);
              ((ud) this).field_b = ((ud) this).field_b + (long)((ud) this).field_c;
              if (((ud) this).field_i >= ((ud) this).field_b) {
                break L3;
              } else {
                ((ud) this).field_i = ((ud) this).field_b;
                break L3;
              }
            }
            L4: {
              L5: {
                var2 = -1L;
                var4 = -1L;
                if ((((ud) this).field_p ^ -1L) < (((ud) this).field_a ^ -1L)) {
                  break L5;
                } else {
                  if ((long)((ud) this).field_e + ((ud) this).field_p > ((ud) this).field_a) {
                    var2 = ((ud) this).field_a;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if ((((ud) this).field_p ^ -1L) > (((ud) this).field_a ^ -1L)) {
                break L4;
              } else {
                if (((ud) this).field_p < ((ud) this).field_a + (long)((ud) this).field_c) {
                  var2 = ((ud) this).field_p;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                if (((ud) this).field_a - -(long)((ud) this).field_c <= ((ud) this).field_p) {
                  break L7;
                } else {
                  if ((long)((ud) this).field_e + ((ud) this).field_p < ((ud) this).field_a + (long)((ud) this).field_c) {
                    break L7;
                  } else {
                    var4 = (long)((ud) this).field_c + ((ud) this).field_a;
                    break L6;
                  }
                }
              }
              if (((ud) this).field_p + (long)((ud) this).field_e <= ((ud) this).field_a) {
                break L6;
              } else {
                if ((((ud) this).field_p - -(long)((ud) this).field_e ^ -1L) < (((ud) this).field_a - -(long)((ud) this).field_c ^ -1L)) {
                  break L6;
                } else {
                  var4 = (long)((ud) this).field_e + ((ud) this).field_p;
                  break L6;
                }
              }
            }
            L8: {
              if (var2 <= -1L) {
                break L8;
              } else {
                if (var2 >= var4) {
                  break L8;
                } else {
                  var6 = (int)(var4 + -var2);
                  bc.a(((ud) this).field_l, (int)(-((ud) this).field_a + var2), ((ud) this).field_k, (int)(-((ud) this).field_p + var2), var6);
                  break L8;
                }
              }
            }
            ((ud) this).field_c = 0;
            ((ud) this).field_a = -1L;
            break L1;
          } else {
            break L1;
          }
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
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
                    var10 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((long)param1 + ((ud) this).field_m <= ((ud) this).field_f) {
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
                        ((ud) this).field_f = (long)param1 + ((ud) this).field_m;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1L == ((ud) this).field_a) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((ud) this).field_a ^ -1L) < (((ud) this).field_m ^ -1L)) {
                            statePc = 7;
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
                        if ((((ud) this).field_m ^ -1L) < (((ud) this).field_a - -(long)((ud) this).field_c ^ -1L)) {
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.b(-1);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (((ud) this).field_a == -1L) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((long)param1 + ((ud) this).field_m > ((ud) this).field_a - -(long)((ud) this).field_l.length) {
                            statePc = 11;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int = (int)(((ud) this).field_a - (((ud) this).field_m - (long)((ud) this).field_l.length));
                        bc.a(param3, param2, ((ud) this).field_l, (int)(((ud) this).field_m + -((ud) this).field_a), var5_int);
                        param1 = param1 - var5_int;
                        ((ud) this).field_m = ((ud) this).field_m + (long)var5_int;
                        param2 = param2 + var5_int;
                        ((ud) this).field_c = ((ud) this).field_l.length;
                        this.b(-1);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param0 >= 124) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((ud) this).field_l.length >= param1) {
                            statePc = 39;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((((ud) this).field_m ^ -1L) == (((ud) this).field_b ^ -1L)) {
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
                        ((ud) this).field_g.a((byte) 84, ((ud) this).field_m);
                        ((ud) this).field_b = ((ud) this).field_m;
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
                        ((ud) this).field_g.a(param1, param3, param2, -17174);
                        ((ud) this).field_b = ((ud) this).field_b + (long)param1;
                        if ((((ud) this).field_b ^ -1L) >= (((ud) this).field_i ^ -1L)) {
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
                        ((ud) this).field_i = ((ud) this).field_b;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5_long = -1L;
                        var7 = -1L;
                        if ((((ud) this).field_p ^ -1L) < (((ud) this).field_m ^ -1L)) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((long)((ud) this).field_e + ((ud) this).field_p > ((ud) this).field_m) {
                            statePc = 25;
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
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((((ud) this).field_p ^ -1L) > (((ud) this).field_m ^ -1L)) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((long)param1 + ((ud) this).field_m <= ((ud) this).field_p) {
                            statePc = 26;
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
                        var5_long = ((ud) this).field_p;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5_long = ((ud) this).field_m;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((((ud) this).field_m - -(long)param1 ^ -1L) >= (((ud) this).field_p ^ -1L)) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (((ud) this).field_p - -(long)((ud) this).field_e >= ((ud) this).field_m + (long)param1) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((((ud) this).field_m ^ -1L) <= (((ud) this).field_p - -(long)((ud) this).field_e ^ -1L)) {
                            statePc = 33;
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
                        if (((ud) this).field_p + (long)((ud) this).field_e > (long)param1 + ((ud) this).field_m) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var7 = (long)((ud) this).field_e + ((ud) this).field_p;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var7 = ((ud) this).field_m - -(long)param1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((var5_long ^ -1L) >= 0L) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var5_long ^ -1L) > (var7 ^ -1L)) {
                            statePc = 36;
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
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = (int)(var7 + -var5_long);
                        bc.a(param3, (int)((long)param2 + (var5_long - ((ud) this).field_m)), ((ud) this).field_k, (int)(var5_long - ((ud) this).field_p), var9);
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
                        ((ud) this).field_m = ((ud) this).field_m + (long)param1;
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
                        if ((param1 ^ -1) >= -1) {
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
                        if (-1L == ((ud) this).field_a) {
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
                        ((ud) this).field_a = ((ud) this).field_m;
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
                        bc.a(param3, param2, ((ud) this).field_l, (int)(-((ud) this).field_a + ((ud) this).field_m), param1);
                        ((ud) this).field_m = ((ud) this).field_m + (long)param1;
                        if ((long)((ud) this).field_c < ((ud) this).field_m - ((ud) this).field_a) {
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
                        ((ud) this).field_c = (int)(-((ud) this).field_a + ((ud) this).field_m);
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
                    ((ud) this).field_b = -1L;
                    throw var5;
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final long c(int param0) {
        if (param0 != -32261) {
            field_n = false;
        }
        return ((ud) this).field_f;
    }

    final void a(byte[] param0, int param1) throws IOException {
        ((ud) this).a(-1, param1, param0.length, param0);
    }

    final void d(int param0) throws IOException {
        this.b(param0);
        ((ud) this).field_g.a((byte) 20);
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 - -param2 > param3.length) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param3.length + (param1 + param2));
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((ud) this).field_a == (long)param0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((ud) this).field_a ^ -1L) < (((ud) this).field_m ^ -1L)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((long)((ud) this).field_c + ((ud) this).field_a ^ -1L) <= ((long)param2 + ((ud) this).field_m ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        bc.a(((ud) this).field_l, (int)(-((ud) this).field_a + ((ud) this).field_m), param3, param1, param2);
                        ((ud) this).field_m = ((ud) this).field_m + (long)param2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        var5_long = ((ud) this).field_m;
                        var7 = param1;
                        var8 = param2;
                        if ((((ud) this).field_m ^ -1L) > (((ud) this).field_p ^ -1L)) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((ud) this).field_p - -(long)((ud) this).field_e > ((ud) this).field_m) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = (int)((long)((ud) this).field_e + (((ud) this).field_p + -((ud) this).field_m));
                        if (var9_int > param2) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9_int = param2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        bc.a(((ud) this).field_k, (int)(((ud) this).field_m + -((ud) this).field_p), param3, param1, var9_int);
                        ((ud) this).field_m = ((ud) this).field_m + (long)var9_int;
                        param1 = param1 + var9_int;
                        param2 = param2 - var9_int;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (((ud) this).field_k.length < param2) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-1 <= (param2 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.a(-1);
                        var9_int = param2;
                        if (var9_int <= ((ud) this).field_e) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9_int = ((ud) this).field_e;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        bc.a(((ud) this).field_k, 0, param3, param1, var9_int);
                        param1 = param1 + var9_int;
                        param2 = param2 - var9_int;
                        ((ud) this).field_m = ((ud) this).field_m + (long)var9_int;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((ud) this).field_g.a((byte) 47, ((ud) this).field_m);
                        ((ud) this).field_b = ((ud) this).field_m;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param2 <= 0) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9_int = ((ud) this).field_g.b(param1, param3, param2, 11812);
                        if (-1 != var9_int) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param1 = param1 + var9_int;
                        ((ud) this).field_m = ((ud) this).field_m + (long)var9_int;
                        ((ud) this).field_b = ((ud) this).field_b + (long)var9_int;
                        param2 = param2 - var9_int;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((ud) this).field_a ^ -1L) != 0L) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((((ud) this).field_m ^ -1L) <= (((ud) this).field_a ^ -1L)) {
                            statePc = 36;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (0 < param2) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9_int = param1 - -(int)(((ud) this).field_a - ((ud) this).field_m);
                        if (var9_int <= param2 + param1) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9_int = param2 + param1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var9_int <= param1) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param1++;
                        param3[param1] = (byte) 0;
                        param2--;
                        ((ud) this).field_m = ((ud) this).field_m + 1L;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = -1L;
                        if ((var5_long ^ -1L) < (((ud) this).field_a ^ -1L)) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var5_long - -(long)var8 > ((ud) this).field_a) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((((ud) this).field_a ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (((ud) this).field_a + (long)((ud) this).field_c <= var5_long) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9 = var5_long;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var9 = ((ud) this).field_a;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var11 = -1L;
                        if (((long)((ud) this).field_c + ((ud) this).field_a ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (((long)var8 + var5_long ^ -1L) > (((ud) this).field_a - -(long)((ud) this).field_c ^ -1L)) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var11 = ((ud) this).field_a + (long)((ud) this).field_c;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((((ud) this).field_a ^ -1L) <= (var5_long - -(long)var8 ^ -1L)) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (((ud) this).field_a - -(long)((ud) this).field_c >= var5_long + (long)var8) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var11 = var5_long + (long)var8;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((var9 ^ -1L) >= 0L) {
                            statePc = 58;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var11 > var9) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var13 = (int)(-var9 + var11);
                        bc.a(((ud) this).field_l, (int)(var9 + -((ud) this).field_a), param3, var7 + (int)(-var5_long + var9), var13);
                        if (((ud) this).field_m < var11) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        param2 = (int)((long)param2 - (-((ud) this).field_m + var11));
                        ((ud) this).field_m = var11;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    var5 = (IOException) (Object) caughtException;
                    ((ud) this).field_b = -1L;
                    throw var5;
                }
                case 58: {
                    if ((param2 ^ -1) < -1) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    return;
                }
                case 60: {
                    throw new EOFException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        } else {
          L0: {
            if (param0 == 25971) {
              break L0;
            } else {
              break L0;
            }
          }
          ((ud) this).field_m = param1;
          return;
        }
    }

    public static void a(byte param0) {
        field_o = null;
        if (param0 != 121) {
            field_j = null;
        }
        field_h = null;
        field_q = null;
        field_j = null;
    }

    ud(bg param0, int param1, int param2) throws IOException {
        ((ud) this).field_c = 0;
        ((ud) this).field_p = -1L;
        ((ud) this).field_a = -1L;
        ((ud) this).field_g = param0;
        ((ud) this).field_i = param0.a(false);
        ((ud) this).field_f = param0.a(false);
        ((ud) this).field_l = new byte[param2];
        ((ud) this).field_m = 0L;
        ((ud) this).field_k = new byte[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Visit the Account Management section on the main site to view.";
        field_n = false;
        field_j = "That name is not available";
        field_d = 1;
    }
}
