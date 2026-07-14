/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bn {
    private int field_m;
    private byte[] field_d;
    private long field_i;
    private ee field_j;
    static String field_n;
    private long field_f;
    static int field_p;
    static bd field_o;
    private int field_a;
    private long field_g;
    private long field_k;
    static bd field_l;
    private byte[] field_e;
    private long field_h;
    static int[] field_b;
    private long field_c;

    final long d(int param0) {
        int var2 = 76 % ((param0 - 55) / 48);
        return ((bn) this).field_f;
    }

    final static String b(int param0) {
        int var1 = -119 % ((25 - param0) / 59);
        String var2 = "";
        if (null != ib.field_e) {
            var2 = ib.field_e.k(80);
        }
        if (!(var2.length() != 0)) {
            var2 = aj.b(-30519);
        }
        if (0 == var2.length()) {
            var2 = vg.field_g;
        }
        return var2;
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
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
                    var10 = HostileSpawn.field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((bn) this).field_f < ((bn) this).field_h - -(long)param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((bn) this).field_f = (long)param0 + ((bn) this).field_h;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param3 >= 32) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (0L == (((bn) this).field_i ^ -1L)) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((bn) this).field_h < ((bn) this).field_i) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((((bn) this).field_i - -(long)((bn) this).field_m ^ -1L) > (((bn) this).field_h ^ -1L)) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.e(-1);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((((bn) this).field_i ^ -1L) == 0L) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((long)param0 + ((bn) this).field_h ^ -1L) >= (((bn) this).field_i + (long)((bn) this).field_e.length ^ -1L)) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5_int = (int)(-((bn) this).field_h + (((bn) this).field_i + (long)((bn) this).field_e.length));
                        kf.a(param2, param1, ((bn) this).field_e, (int)(((bn) this).field_h - ((bn) this).field_i), var5_int);
                        param1 = param1 + var5_int;
                        ((bn) this).field_h = ((bn) this).field_h + (long)var5_int;
                        param0 = param0 - var5_int;
                        ((bn) this).field_m = ((bn) this).field_e.length;
                        this.e(-1);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param0 <= ((bn) this).field_e.length) {
                            statePc = 38;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((bn) this).field_k == ((bn) this).field_h) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((bn) this).field_j.a(-18127, ((bn) this).field_h);
                        ((bn) this).field_k = ((bn) this).field_h;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((bn) this).field_j.a(0, param2, param1, param0);
                        ((bn) this).field_k = ((bn) this).field_k + (long)param0;
                        if ((((bn) this).field_g ^ -1L) > (((bn) this).field_k ^ -1L)) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((bn) this).field_g = ((bn) this).field_k;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5_long = -1L;
                        if (((bn) this).field_c > ((bn) this).field_h) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (((bn) this).field_c - -(long)((bn) this).field_a <= ((bn) this).field_h) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5_long = ((bn) this).field_h;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((((bn) this).field_h ^ -1L) < (((bn) this).field_c ^ -1L)) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((((bn) this).field_c ^ -1L) <= ((long)param0 + ((bn) this).field_h ^ -1L)) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5_long = ((bn) this).field_c;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7 = -1L;
                        if ((((bn) this).field_c ^ -1L) <= ((long)param0 + ((bn) this).field_h ^ -1L)) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (((long)((bn) this).field_a + ((bn) this).field_c ^ -1L) > (((bn) this).field_h - -(long)param0 ^ -1L)) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var7 = (long)param0 + ((bn) this).field_h;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((((bn) this).field_h ^ -1L) <= (((bn) this).field_c - -(long)((bn) this).field_a ^ -1L)) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((((bn) this).field_h - -(long)param0 ^ -1L) > ((long)((bn) this).field_a + ((bn) this).field_c ^ -1L)) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var7 = (long)((bn) this).field_a + ((bn) this).field_c;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (-1L >= var5_long) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var7 > var5_long) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = (int)(-var5_long + var7);
                        kf.a(param2, (int)(-((bn) this).field_h + ((long)param1 + var5_long)), ((bn) this).field_d, (int)(var5_long + -((bn) this).field_c), var9);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ((bn) this).field_h = ((bn) this).field_h + (long)param0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return;
                }
                case 38: {
                    try {
                        if (-1 <= (param0 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (0L != (((bn) this).field_i ^ -1L)) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((bn) this).field_i = ((bn) this).field_h;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        kf.a(param2, param1, ((bn) this).field_e, (int)(((bn) this).field_h + -((bn) this).field_i), param0);
                        ((bn) this).field_h = ((bn) this).field_h + (long)param0;
                        if (((long)((bn) this).field_m ^ -1L) > (((bn) this).field_h - ((bn) this).field_i ^ -1L)) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((bn) this).field_m = (int)(((bn) this).field_h - ((bn) this).field_i);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    return;
                }
                case 45: {
                    var5 = (IOException) (Object) caughtException;
                    ((bn) this).field_k = -1L;
                    throw var5;
                }
                case 46: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void f(int param0) throws IOException {
        this.e(-1);
        ((bn) this).field_j.c(-1);
        if (param0 != 0) {
            bn.a(true);
        }
    }

    private final void e(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          if (((bn) this).field_i != (long)param0) {
            L1: {
              if ((((bn) this).field_i ^ -1L) != (((bn) this).field_k ^ -1L)) {
                ((bn) this).field_j.a(-18127, ((bn) this).field_i);
                ((bn) this).field_k = ((bn) this).field_i;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((bn) this).field_j.a(0, ((bn) this).field_e, 0, ((bn) this).field_m);
              ((bn) this).field_k = ((bn) this).field_k + (long)((bn) this).field_m;
              if (((bn) this).field_g >= ((bn) this).field_k) {
                break L2;
              } else {
                ((bn) this).field_g = ((bn) this).field_k;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if ((((bn) this).field_c ^ -1L) < (((bn) this).field_i ^ -1L)) {
                  break L4;
                } else {
                  if (((bn) this).field_i < ((bn) this).field_c + (long)((bn) this).field_a) {
                    var2 = ((bn) this).field_i;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((bn) this).field_c < ((bn) this).field_i) {
                break L3;
              } else {
                if ((long)((bn) this).field_m + ((bn) this).field_i > ((bn) this).field_c) {
                  var2 = ((bn) this).field_c;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if ((((bn) this).field_c ^ -1L) <= (((bn) this).field_i + (long)((bn) this).field_m ^ -1L)) {
                  break L6;
                } else {
                  if ((((bn) this).field_c + (long)((bn) this).field_a ^ -1L) > (((bn) this).field_i - -(long)((bn) this).field_m ^ -1L)) {
                    break L6;
                  } else {
                    var4 = (long)((bn) this).field_m + ((bn) this).field_i;
                    break L5;
                  }
                }
              }
              if (((bn) this).field_i >= (long)((bn) this).field_a + ((bn) this).field_c) {
                break L5;
              } else {
                if (((bn) this).field_i - -(long)((bn) this).field_m >= ((bn) this).field_c + (long)((bn) this).field_a) {
                  var4 = (long)((bn) this).field_a + ((bn) this).field_c;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (var2 <= -1L) {
                break L7;
              } else {
                if ((var2 ^ -1L) <= (var4 ^ -1L)) {
                  break L7;
                } else {
                  var6 = (int)(-var2 + var4);
                  kf.a(((bn) this).field_e, (int)(-((bn) this).field_i + var2), ((bn) this).field_d, (int)(-((bn) this).field_c + var2), var6);
                  break L7;
                }
              }
            }
            ((bn) this).field_m = 0;
            ((bn) this).field_i = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        if (param1 >= -65) {
            return;
        }
        ((bn) this).a(param0, (byte) -75, 0, param0.length);
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        ((bn) this).field_a = 0;
        if (param0 != 13740) {
            ((bn) this).field_c = -22L;
        }
        if (((bn) this).field_h != ((bn) this).field_k) {
            ((bn) this).field_j.a(param0 + -31867, ((bn) this).field_h);
            ((bn) this).field_k = ((bn) this).field_h;
        }
        ((bn) this).field_c = ((bn) this).field_h;
        while (((bn) this).field_a < ((bn) this).field_d.length) {
            var2 = ((bn) this).field_d.length + -((bn) this).field_a;
            if (-200000001 > (var2 ^ -1)) {
                var2 = 200000000;
            }
            var3 = ((bn) this).field_j.a(((bn) this).field_d, false, var2, ((bn) this).field_a);
            if ((var3 ^ -1) == 0) {
                break;
            }
            ((bn) this).field_a = ((bn) this).field_a + var3;
            ((bn) this).field_k = ((bn) this).field_k + (long)var3;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_b = null;
        field_l = null;
        field_n = null;
        field_o = null;
    }

    final static void a(boolean param0, int param1, p param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        L0: {
          var29 = HostileSpawn.field_I ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            field_n = null;
            break L0;
          }
        }
        var12 = uj.field_p.field_e + 32;
        var13 = uj.field_p.field_g + 12;
        var14 = -var12 + am.field_e;
        var15 = jg.field_l + -var13;
        var4 = var14 << 444801026;
        var7 = param1 << 303437250;
        var10 = 1;
        var6 = param3 << -1506850590;
        var5 = var15 << 301346338;
        var8 = 8;
        var11 = 1;
        var9 = 16;
        var16 = (32 + -param2.field_e) * 200 / 32;
        var17 = (int)((double)var8 / 1.0);
        var18 = (int)((double)var9 / 1.2);
        var19 = 62.83185307179586 + param2.field_c;
        var21 = 12.0;
        var23 = 3.141592653589793 * var19 / 128.0;
        var25 = (int)(Math.sin(var23) * -var21);
        var26 = (int)(-var21 * Math.cos(var23));
        var27 = 0;
        L1: while (true) {
          if (var27 >= 255) {
            km.a((byte) var10, var26 + var7, var5 + var26, ni.field_c, var9, var25 + var6, (byte) var11, 85, var4 - -var25, var16, var8);
            bh.a((byte) var10, cn.field_e, (byte) var11, var17, var4 - -var25, var5 - -var26, var7 - -var26, var18, var16, var6 - -var25, 9233);
            km.a((byte) var10, -var26 + var7, var5 + -var26, ni.field_c, var9, var6 - var25, (byte) var11, 117, -var25 + var4, var16, var8);
            bh.a((byte) var10, cn.field_e, (byte) var11, var17, var4 + -var25, -var26 + var5, -var26 + var7, var18, var16, -var25 + var6, 9233);
            return;
          } else {
            L2: {
              var28 = 3 * (var27 + -128);
              if (var28 < -256) {
                var28 = 255;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-1 > var28) {
                var28 = 0;
                break L3;
              } else {
                break L3;
              }
            }
            cn.field_e[var27] = 256 * var27 - -var28;
            var27++;
            continue L1;
          }
        }
    }

    final static java.applet.Applet c(int param0) {
        if (param0 != -1) {
            field_n = null;
        }
        if (p.field_a != null) {
            return p.field_a;
        }
        return (java.applet.Applet) (Object) te.field_E;
    }

    final static void a(int param0, oj param1) {
        if (param0 != 3) {
            Object var3 = null;
            bn.a(false, -123, (p) null, 64);
        }
        ue.a(param1.field_M, false);
        param1.field_M = 0;
    }

    final void a(long param0, byte param1) throws IOException {
        if (!(param0 >= 0L)) {
            throw new IOException();
        }
        if (param1 < 83) {
            Object var5 = null;
            bn.a(false, 118, (p) null, 42);
        }
        ((bn) this).field_h = param0;
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
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
                    var14 = HostileSpawn.field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 + param2 > param0.length) {
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
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param0.length + param3 + param2);
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((bn) this).field_i ^ -1L) == 0L) {
                            statePc = 9;
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
                        if (((bn) this).field_h < ((bn) this).field_i) {
                            statePc = 9;
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
                        if ((long)param3 + ((bn) this).field_h > ((bn) this).field_i + (long)((bn) this).field_m) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        kf.a(((bn) this).field_e, (int)(-((bn) this).field_i + ((bn) this).field_h), param0, param2, param3);
                        ((bn) this).field_h = ((bn) this).field_h + (long)param3;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var5_long = ((bn) this).field_h;
                        var7 = param2;
                        var8 = param3;
                        if ((((bn) this).field_c ^ -1L) < (((bn) this).field_h ^ -1L)) {
                            statePc = 14;
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
                        if ((((bn) this).field_c + (long)((bn) this).field_a ^ -1L) >= (((bn) this).field_h ^ -1L)) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9_int = (int)(-((bn) this).field_h + ((bn) this).field_c + (long)((bn) this).field_a);
                        if (param3 >= var9_int) {
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
                        var9_int = param3;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        kf.a(((bn) this).field_d, (int)(((bn) this).field_h - ((bn) this).field_c), param0, param2, var9_int);
                        param2 = param2 + var9_int;
                        ((bn) this).field_h = ((bn) this).field_h + (long)var9_int;
                        param3 = param3 - var9_int;
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
                        if (param3 <= ((bn) this).field_d.length) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((bn) this).field_j.a(-18127, ((bn) this).field_h);
                        ((bn) this).field_k = ((bn) this).field_h;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param3 <= 0) {
                            statePc = 23;
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
                        var9_int = ((bn) this).field_j.a(param0, false, param3, param2);
                        if ((var9_int ^ -1) == 0) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((bn) this).field_k = ((bn) this).field_k + (long)var9_int;
                        ((bn) this).field_h = ((bn) this).field_h + (long)var9_int;
                        param2 = param2 + var9_int;
                        param3 = param3 - var9_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (param3 <= 0) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.a(13740);
                        var9_int = param3;
                        if (((bn) this).field_a >= var9_int) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9_int = ((bn) this).field_a;
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
                        kf.a(((bn) this).field_d, 0, param0, param2, var9_int);
                        param3 = param3 - var9_int;
                        ((bn) this).field_h = ((bn) this).field_h + (long)var9_int;
                        param2 = param2 + var9_int;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (-1L == ((bn) this).field_i) {
                            statePc = 53;
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
                        if (((bn) this).field_h >= ((bn) this).field_i) {
                            statePc = 32;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 56;
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
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9_int = (int)(-((bn) this).field_h + ((bn) this).field_i) + param2;
                        if (var9_int > param2 - -param3) {
                            statePc = 29;
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
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9_int = param3 + param2;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (param2 >= var9_int) {
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
                        param2++;
                        param0[param2] = (byte) 0;
                        param3--;
                        ((bn) this).field_h = ((bn) this).field_h + 1L;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9 = -1L;
                        if (((bn) this).field_i < var5_long) {
                            statePc = 35;
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
                        if (((bn) this).field_i < var5_long + (long)var8) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((((bn) this).field_i ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 40;
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
                        if ((var5_long ^ -1L) > (((bn) this).field_i - -(long)((bn) this).field_m ^ -1L)) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 56;
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
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var9 = ((bn) this).field_i;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var11 = -1L;
                        if (var5_long >= (long)((bn) this).field_m + ((bn) this).field_i) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((((bn) this).field_i + (long)((bn) this).field_m ^ -1L) >= (var5_long - -(long)var8 ^ -1L)) {
                            statePc = 47;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((((bn) this).field_i ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                            statePc = 48;
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
                        if (((bn) this).field_i + (long)((bn) this).field_m >= var5_long - -(long)var8) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11 = var5_long + (long)var8;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11 = (long)((bn) this).field_m + ((bn) this).field_i;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (0L <= (var9 ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var11 > var9) {
                            statePc = 51;
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
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var13 = (int)(var11 + -var9);
                        kf.a(((bn) this).field_e, (int)(var9 + -((bn) this).field_i), param0, var7 - -(int)(-var5_long + var9), var13);
                        if ((((bn) this).field_h ^ -1L) <= (var11 ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        param3 = (int)((long)param3 - (-((bn) this).field_h + var11));
                        ((bn) this).field_h = var11;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (param1 < -17) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        bn.a(false);
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
                    ((bn) this).field_k = -1L;
                    throw var5;
                }
                case 57: {
                    if (-1 > (param3 ^ -1)) {
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

    bn(ee param0, int param1, int param2) throws IOException {
        ((bn) this).field_m = 0;
        ((bn) this).field_i = -1L;
        ((bn) this).field_c = -1L;
        ((bn) this).field_j = param0;
        ((bn) this).field_g = param0.a(-1);
        ((bn) this).field_f = param0.a(-1);
        ((bn) this).field_e = new byte[param2];
        ((bn) this).field_d = new byte[param1];
        ((bn) this).field_h = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "This rocket launcher will help me get past blast doors and turrets.";
    }
}
