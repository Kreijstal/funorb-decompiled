/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class p {
    static int field_m;
    private long field_k;
    private int field_j;
    private byte[] field_e;
    private byte[] field_l;
    private long field_g;
    static String field_c;
    private sa field_h;
    private long field_a;
    private long field_b;
    private int field_f;
    private long field_i;
    private long field_d;

    final long b(int param0) {
        if (param0 != -200000001) {
            ((p) this).field_d = 63L;
        }
        return ((p) this).field_i;
    }

    final void a(int param0) throws IOException {
        this.a((byte) 66);
        ((p) this).field_h.b(0);
        if (param0 != -1) {
            ((p) this).field_f = -5;
        }
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
                    var10 = TetraLink.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((long)param3 + ((p) this).field_k <= ((p) this).field_i) {
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
                        ((p) this).field_i = ((p) this).field_k - -(long)param3;
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
                        if (((p) this).field_b == -1L) {
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
                        if (((p) this).field_b > ((p) this).field_k) {
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
                        if (((p) this).field_b - -(long)((p) this).field_f < ((p) this).field_k) {
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
                        this.a((byte) 66);
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
                        if (param0 == -19735) {
                            statePc = 10;
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
                        p.b((byte) -23);
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
                        if (0L == (((p) this).field_b ^ -1L)) {
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
                        if (((p) this).field_b - -(long)((p) this).field_e.length >= ((p) this).field_k - -(long)param3) {
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
                        var5_int = (int)((long)((p) this).field_e.length - (-((p) this).field_b + ((p) this).field_k));
                        rd.a(param1, param2, ((p) this).field_e, (int)(-((p) this).field_b + ((p) this).field_k), var5_int);
                        ((p) this).field_k = ((p) this).field_k + (long)var5_int;
                        param2 = param2 + var5_int;
                        param3 = param3 - var5_int;
                        ((p) this).field_f = ((p) this).field_e.length;
                        this.a((byte) 66);
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
                        if (((p) this).field_e.length < param3) {
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
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((p) this).field_k == ((p) this).field_g) {
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
                        ((p) this).field_h.a(((p) this).field_k, false);
                        ((p) this).field_g = ((p) this).field_k;
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
                        ((p) this).field_h.a(param0 + 19649, param2, param1, param3);
                        ((p) this).field_g = ((p) this).field_g + (long)param3;
                        if (((p) this).field_g > ((p) this).field_a) {
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
                        ((p) this).field_a = ((p) this).field_g;
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
                        if ((((p) this).field_d ^ -1L) < (((p) this).field_k ^ -1L)) {
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
                        if ((((p) this).field_d + (long)((p) this).field_j ^ -1L) < (((p) this).field_k ^ -1L)) {
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
                        if ((((p) this).field_d ^ -1L) > (((p) this).field_k ^ -1L)) {
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
                        if (((long)param3 + ((p) this).field_k ^ -1L) < (((p) this).field_d ^ -1L)) {
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
                        var5_long = ((p) this).field_d;
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
                        var5_long = ((p) this).field_k;
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
                        if ((((p) this).field_d ^ -1L) <= (((p) this).field_k - -(long)param3 ^ -1L)) {
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
                        if ((long)((p) this).field_j + ((p) this).field_d < (long)param3 + ((p) this).field_k) {
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
                        var7 = (long)param3 + ((p) this).field_k;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (((p) this).field_k >= (long)((p) this).field_j + ((p) this).field_d) {
                            statePc = 35;
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
                        if ((long)param3 + ((p) this).field_k >= (long)((p) this).field_j + ((p) this).field_d) {
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
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var7 = (long)((p) this).field_j + ((p) this).field_d;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-1L >= var5_long) {
                            statePc = 39;
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
                        if (var5_long < var7) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = (int)(-var5_long + var7);
                        rd.a(param1, (int)(var5_long + ((long)param2 + -((p) this).field_k)), ((p) this).field_l, (int)(-((p) this).field_d + var5_long), var9);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ((p) this).field_k = ((p) this).field_k + (long)param3;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return;
                }
                case 41: {
                    try {
                        if (param3 <= 0) {
                            statePc = 48;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((((p) this).field_b ^ -1L) != 0L) {
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
                        ((p) this).field_b = ((p) this).field_k;
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
                        rd.a(param1, param2, ((p) this).field_e, (int)(-((p) this).field_b + ((p) this).field_k), param3);
                        ((p) this).field_k = ((p) this).field_k + (long)param3;
                        if ((-((p) this).field_b + ((p) this).field_k ^ -1L) >= ((long)((p) this).field_f ^ -1L)) {
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
                        ((p) this).field_f = (int)(((p) this).field_k - ((p) this).field_b);
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
                    ((p) this).field_g = -1L;
                    throw var5;
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = TetraLink.field_J;
        ((p) this).field_j = 0;
        if (!((((p) this).field_g ^ -1L) == (((p) this).field_k ^ -1L))) {
            ((p) this).field_h.a(((p) this).field_k, false);
            ((p) this).field_g = ((p) this).field_k;
        }
        if (!param0) {
            ((p) this).field_i = -73L;
        }
        ((p) this).field_d = ((p) this).field_k;
        while (((p) this).field_l.length > ((p) this).field_j) {
            var2 = ((p) this).field_l.length - ((p) this).field_j;
            if (!(var2 >= -200000001)) {
                var2 = 200000000;
            }
            var3 = ((p) this).field_h.a(var2, ((p) this).field_j, ((p) this).field_l, (byte) 115);
            if (0 == var3) {
                break;
            }
            ((p) this).field_j = ((p) this).field_j + var3;
            ((p) this).field_g = ((p) this).field_g + (long)var3;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 > -80) {
            field_m = 19;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = la.a(il.a(-23718, param0), true);
        if (var2 == null) {
            var2 = "";
        }
        if (param1 != 43) {
            field_m = 25;
        }
        return var2;
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        if (param0 == 66) {
          L0: {
            if (0L != (((p) this).field_b ^ -1L)) {
              L1: {
                if ((((p) this).field_b ^ -1L) == (((p) this).field_g ^ -1L)) {
                  break L1;
                } else {
                  ((p) this).field_h.a(((p) this).field_b, false);
                  ((p) this).field_g = ((p) this).field_b;
                  break L1;
                }
              }
              L2: {
                ((p) this).field_h.a(-128, 0, ((p) this).field_e, ((p) this).field_f);
                ((p) this).field_g = ((p) this).field_g + (long)((p) this).field_f;
                if ((((p) this).field_g ^ -1L) < (((p) this).field_a ^ -1L)) {
                  ((p) this).field_a = ((p) this).field_g;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  if ((((p) this).field_b ^ -1L) > (((p) this).field_d ^ -1L)) {
                    break L4;
                  } else {
                    if ((((p) this).field_b ^ -1L) <= (((p) this).field_d - -(long)((p) this).field_j ^ -1L)) {
                      break L4;
                    } else {
                      var2 = ((p) this).field_b;
                      break L3;
                    }
                  }
                }
                if (((p) this).field_b > ((p) this).field_d) {
                  break L3;
                } else {
                  if ((((p) this).field_b - -(long)((p) this).field_f ^ -1L) >= (((p) this).field_d ^ -1L)) {
                    break L3;
                  } else {
                    var2 = ((p) this).field_d;
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  var4 = -1L;
                  if (((long)((p) this).field_f + ((p) this).field_b ^ -1L) >= (((p) this).field_d ^ -1L)) {
                    break L6;
                  } else {
                    if (((p) this).field_d - -(long)((p) this).field_j >= ((p) this).field_b + (long)((p) this).field_f) {
                      var4 = (long)((p) this).field_f + ((p) this).field_b;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((((p) this).field_d - -(long)((p) this).field_j ^ -1L) >= (((p) this).field_b ^ -1L)) {
                  break L5;
                } else {
                  if (((p) this).field_b + (long)((p) this).field_f >= (long)((p) this).field_j + ((p) this).field_d) {
                    var4 = ((p) this).field_d + (long)((p) this).field_j;
                    break L5;
                  } else {
                    L7: {
                      if (-1L >= var2) {
                        break L7;
                      } else {
                        if ((var2 ^ -1L) <= (var4 ^ -1L)) {
                          break L7;
                        } else {
                          var6 = (int)(var4 - var2);
                          rd.a(((p) this).field_e, (int)(var2 - ((p) this).field_b), ((p) this).field_l, (int)(var2 - ((p) this).field_d), var6);
                          break L7;
                        }
                      }
                    }
                    ((p) this).field_f = 0;
                    ((p) this).field_b = -1L;
                    break L0;
                  }
                }
              }
              L8: {
                if (-1L >= var2) {
                  break L8;
                } else {
                  if ((var2 ^ -1L) <= (var4 ^ -1L)) {
                    break L8;
                  } else {
                    var6 = (int)(var4 - var2);
                    rd.a(((p) this).field_e, (int)(var2 - ((p) this).field_b), ((p) this).field_l, (int)(var2 - ((p) this).field_d), var6);
                    break L8;
                  }
                }
              }
              ((p) this).field_f = 0;
              ((p) this).field_b = -1L;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        if (param1 != 66) {
            return;
        }
        ((p) this).a(param0, param0.length, 0, (byte) 120);
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
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
                    var14 = TetraLink.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 + param2 <= param0.length) {
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
                        throw new ArrayIndexOutOfBoundsException(param2 - -param1 + -param0.length);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1L == ((p) this).field_b) {
                            statePc = 9;
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
                        if ((((p) this).field_b ^ -1L) < (((p) this).field_k ^ -1L)) {
                            statePc = 9;
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
                        if ((((p) this).field_b - -(long)((p) this).field_f ^ -1L) <= ((long)param1 + ((p) this).field_k ^ -1L)) {
                            statePc = 7;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        rd.a(((p) this).field_e, (int)(((p) this).field_k + -((p) this).field_b), param0, param2, param1);
                        ((p) this).field_k = ((p) this).field_k + (long)param1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var5_long = ((p) this).field_k;
                        var7 = param2;
                        if (param3 > 31) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        field_m = -43;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8 = param1;
                        if ((((p) this).field_d ^ -1L) < (((p) this).field_k ^ -1L)) {
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
                        if (((p) this).field_k >= (long)((p) this).field_j + ((p) this).field_d) {
                            statePc = 16;
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
                        var9_int = (int)(-((p) this).field_k + (((p) this).field_d + (long)((p) this).field_j));
                        if (param1 >= var9_int) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 54;
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
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        rd.a(((p) this).field_l, (int)(((p) this).field_k - ((p) this).field_d), param0, param2, var9_int);
                        param2 = param2 + var9_int;
                        param1 = param1 - var9_int;
                        ((p) this).field_k = ((p) this).field_k + (long)var9_int;
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
                        if (param1 <= ((p) this).field_l.length) {
                            statePc = 21;
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
                        ((p) this).field_h.a(((p) this).field_k, false);
                        ((p) this).field_g = ((p) this).field_k;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((param1 ^ -1) >= -1) {
                            statePc = 26;
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
                        var9_int = ((p) this).field_h.a(param1, param2, param0, (byte) -121);
                        if (-1 == var9_int) {
                            statePc = 26;
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
                        param1 = param1 - var9_int;
                        ((p) this).field_k = ((p) this).field_k + (long)var9_int;
                        param2 = param2 + var9_int;
                        ((p) this).field_g = ((p) this).field_g + (long)var9_int;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (-1 <= (param1 ^ -1)) {
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
                        this.a(true);
                        var9_int = param1;
                        if (var9_int > ((p) this).field_j) {
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
                        var9_int = ((p) this).field_j;
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
                        rd.a(((p) this).field_l, 0, param0, param2, var9_int);
                        ((p) this).field_k = ((p) this).field_k + (long)var9_int;
                        param1 = param1 - var9_int;
                        param2 = param2 + var9_int;
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
                        if (0L == (((p) this).field_b ^ -1L)) {
                            statePc = 55;
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
                        if ((((p) this).field_k ^ -1L) <= (((p) this).field_b ^ -1L)) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((param1 ^ -1) >= -1) {
                            statePc = 33;
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
                        var9_int = param2 - -(int)(((p) this).field_b - ((p) this).field_k);
                        if (var9_int <= param1 + param2) {
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
                        var9_int = param1 + param2;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var9_int <= param2) {
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
                        param2++;
                        param0[param2] = (byte) 0;
                        param1--;
                        ((p) this).field_k = ((p) this).field_k + 1L;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if (var5_long > ((p) this).field_b) {
                            statePc = 36;
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
                        if (var5_long - -(long)var8 > ((p) this).field_b) {
                            statePc = 40;
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
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var5_long < ((p) this).field_b) {
                            statePc = 41;
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
                        if ((long)((p) this).field_f + ((p) this).field_b > var5_long) {
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
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 54;
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
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var9 = ((p) this).field_b;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((var5_long ^ -1L) <= ((long)((p) this).field_f + ((p) this).field_b ^ -1L)) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((long)var8 + var5_long ^ -1L) <= (((p) this).field_b + (long)((p) this).field_f ^ -1L)) {
                            statePc = 48;
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
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((((p) this).field_b ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (((p) this).field_b - -(long)((p) this).field_f >= var5_long + (long)var8) {
                            statePc = 47;
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
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11 = var5_long - -(long)var8;
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
                        var11 = ((p) this).field_b - -(long)((p) this).field_f;
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
                        if (var9 <= -1L) {
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
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
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
                        rd.a(((p) this).field_e, (int)(-((p) this).field_b + var9), param0, var7 + (int)(-var5_long + var9), var13);
                        if ((var11 ^ -1L) >= (((p) this).field_k ^ -1L)) {
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
                        param1 = (int)((long)param1 - (var11 - ((p) this).field_k));
                        ((p) this).field_k = var11;
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
                    ((p) this).field_g = -1L;
                    throw var5;
                }
                case 55: {
                    if (param1 > 0) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    return;
                }
                case 57: {
                    throw new EOFException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (-1L < (param0 ^ -1L)) {
          throw new IOException();
        } else {
          L0: {
            ((p) this).field_k = param0;
            if (param1 == 0) {
              break L0;
            } else {
              ((p) this).field_b = -9L;
              break L0;
            }
          }
          return;
        }
    }

    p(sa param0, int param1, int param2) throws IOException {
        ((p) this).field_b = -1L;
        ((p) this).field_f = 0;
        ((p) this).field_d = -1L;
        ((p) this).field_h = param0;
        ((p) this).field_a = param0.a(-1);
        ((p) this).field_i = param0.a(-1);
        ((p) this).field_l = new byte[param1];
        ((p) this).field_e = new byte[param2];
        ((p) this).field_k = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "The invitation has been withdrawn.";
    }
}
