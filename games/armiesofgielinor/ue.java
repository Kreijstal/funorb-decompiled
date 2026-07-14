/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ue {
    private long field_i;
    private ei field_j;
    private long field_n;
    private byte[] field_b;
    private long field_l;
    private long field_m;
    private int field_c;
    static String field_a;
    private byte[] field_f;
    private long field_g;
    static String field_e;
    private long field_h;
    private int field_d;
    static wk[] field_k;

    final static int a(long param0, long param1, byte param2) {
        if (param2 != 97) {
            field_a = null;
        }
        return (int)((param0 << -1208926000) / param1);
    }

    final static boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        if (0 > param3) {
          return true;
        } else {
          if (-1 < (ve.field_a[param0][param3] ^ -1)) {
            return false;
          } else {
            if (!param2) {
              L0: {
                if (param4 == -1208926000) {
                  break L0;
                } else {
                  field_a = null;
                  break L0;
                }
              }
              if (param1 >= el.field_f[param0][param3]) {
                if ((ve.field_a[param0][param3] ^ -1) <= -1) {
                  if (ve.field_a[param0][param3] == (param5 & ve.field_a[param0][param3])) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    final long a(boolean param0) {
        if (!param0) {
            ue.a((byte) 77);
        }
        return ((ue) this).field_g;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
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
                    var10 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((long)param0 + ((ue) this).field_h <= ((ue) this).field_g) {
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
                        ((ue) this).field_g = (long)param0 + ((ue) this).field_h;
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
                        if ((((ue) this).field_m ^ -1L) == 0L) {
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
                        if (((ue) this).field_h < ((ue) this).field_m) {
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
                        if ((((ue) this).field_m + (long)((ue) this).field_c ^ -1L) > (((ue) this).field_h ^ -1L)) {
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
                        this.d((byte) 111);
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
                        if (0L == (((ue) this).field_m ^ -1L)) {
                            statePc = 11;
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
                        if (((ue) this).field_m + (long)((ue) this).field_b.length >= ((ue) this).field_h + (long)param0) {
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
                        var5_int = (int)(-((ue) this).field_h + ((ue) this).field_m + (long)((ue) this).field_b.length);
                        vm.a(param3, param1, ((ue) this).field_b, (int)(-((ue) this).field_m + ((ue) this).field_h), var5_int);
                        param1 = param1 + var5_int;
                        ((ue) this).field_h = ((ue) this).field_h + (long)var5_int;
                        param0 = param0 - var5_int;
                        ((ue) this).field_c = ((ue) this).field_b.length;
                        this.d((byte) 111);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param0 > ((ue) this).field_b.length) {
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
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (((ue) this).field_h == ((ue) this).field_l) {
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
                        ((ue) this).field_j.a(((ue) this).field_h, 113);
                        ((ue) this).field_l = ((ue) this).field_h;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((ue) this).field_j.a(1, param1, param0, param3);
                        ((ue) this).field_l = ((ue) this).field_l + (long)param0;
                        if (((ue) this).field_l <= ((ue) this).field_n) {
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
                        ((ue) this).field_n = ((ue) this).field_l;
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
                        var5_long = -1L;
                        if (((ue) this).field_i > ((ue) this).field_h) {
                            statePc = 20;
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
                        if (((ue) this).field_h < ((ue) this).field_i + (long)((ue) this).field_d) {
                            statePc = 24;
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
                        if ((((ue) this).field_i ^ -1L) > (((ue) this).field_h ^ -1L)) {
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
                        if ((((ue) this).field_i ^ -1L) > ((long)param0 + ((ue) this).field_h ^ -1L)) {
                            statePc = 23;
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
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5_long = ((ue) this).field_i;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5_long = ((ue) this).field_h;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7 = -1L;
                        if ((((ue) this).field_h - -(long)param0 ^ -1L) >= (((ue) this).field_i ^ -1L)) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((long)((ue) this).field_d + ((ue) this).field_i < (long)param0 + ((ue) this).field_h) {
                            statePc = 28;
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
                        var7 = (long)param0 + ((ue) this).field_h;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((ue) this).field_h >= (long)((ue) this).field_d + ((ue) this).field_i) {
                            statePc = 32;
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
                        if ((((ue) this).field_i - -(long)((ue) this).field_d ^ -1L) >= ((long)param0 + ((ue) this).field_h ^ -1L)) {
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
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var7 = ((ue) this).field_i - -(long)((ue) this).field_d;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (0L <= (var5_long ^ -1L)) {
                            statePc = 35;
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
                        if ((var5_long ^ -1L) <= (var7 ^ -1L)) {
                            statePc = 35;
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
                        var9 = (int)(-var5_long + var7);
                        vm.a(param3, (int)(-((ue) this).field_h + ((long)param1 - -var5_long)), ((ue) this).field_f, (int)(var5_long + -((ue) this).field_i), var9);
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
                        ((ue) this).field_h = ((ue) this).field_h + (long)param0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return;
                }
                case 37: {
                    try {
                        if (0 >= param0) {
                            statePc = 44;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((((ue) this).field_m ^ -1L) != 0L) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ((ue) this).field_m = ((ue) this).field_h;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        vm.a(param3, param1, ((ue) this).field_b, (int)(-((ue) this).field_m + ((ue) this).field_h), param0);
                        ((ue) this).field_h = ((ue) this).field_h + (long)param0;
                        if ((((ue) this).field_h - ((ue) this).field_m ^ -1L) < ((long)((ue) this).field_c ^ -1L)) {
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
                        ((ue) this).field_c = (int)(-((ue) this).field_m + ((ue) this).field_h);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return;
                }
                case 44: {
                    try {
                        if (param2 > 0) {
                            statePc = 48;
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
                        ue.a((byte) -46);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    var5 = (IOException) (Object) caughtException;
                    ((ue) this).field_l = -1L;
                    throw var5;
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static nc a(kl param0, int param1, kl param2, byte param3, int param4) {
        if (param3 < -10) {
          if (!kp.a(false, param1, param0, param4)) {
            return null;
          } else {
            return lq.a(param2.a((byte) 103, param4, param1), 0);
          }
        } else {
          return null;
        }
    }

    public static void b(byte param0) {
        if (param0 <= 40) {
            field_k = null;
        }
        field_a = null;
        field_k = null;
        field_e = null;
    }

    final void a(int param0, byte[] param1) throws IOException {
        ((ue) this).a(param0, param1, (byte) -103, param1.length);
    }

    final void c(byte param0) throws IOException {
        if (param0 != 81) {
            ((ue) this).field_c = 28;
        }
        this.d((byte) 111);
        ((ue) this).field_j.b(param0 + 702);
    }

    final static wk[] a(int param0, int param1, int param2, int param3) {
        if (param2 != 1) {
            ue.b((byte) 15);
        }
        return cq.a(param1, 1, param0, (byte) 58, param3);
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 + param3 <= param1.length) {
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
                        throw new ArrayIndexOutOfBoundsException(-param1.length + param0 + param3);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (0L == (((ue) this).field_m ^ -1L)) {
                            statePc = 8;
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
                        if (((ue) this).field_m > ((ue) this).field_h) {
                            statePc = 8;
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
                        if (((long)((ue) this).field_c + ((ue) this).field_m ^ -1L) > ((long)param3 + ((ue) this).field_h ^ -1L)) {
                            statePc = 8;
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
                        vm.a(((ue) this).field_b, (int)(-((ue) this).field_m + ((ue) this).field_h), param1, param0, param3);
                        ((ue) this).field_h = ((ue) this).field_h + (long)param3;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var5_long = ((ue) this).field_h;
                        var7 = param0;
                        var8 = param3;
                        if (((ue) this).field_h < ((ue) this).field_i) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((long)((ue) this).field_d + ((ue) this).field_i ^ -1L) < (((ue) this).field_h ^ -1L)) {
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
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9_int = (int)(((ue) this).field_i + -((ue) this).field_h + (long)((ue) this).field_d);
                        if (param3 >= var9_int) {
                            statePc = 13;
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
                        var9_int = param3;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        vm.a(((ue) this).field_f, (int)(-((ue) this).field_i + ((ue) this).field_h), param1, param0, var9_int);
                        param0 = param0 + var9_int;
                        param3 = param3 - var9_int;
                        ((ue) this).field_h = ((ue) this).field_h + (long)var9_int;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((ue) this).field_f.length < param3) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (0 >= param3) {
                            statePc = 23;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.e((byte) -42);
                        var9_int = param3;
                        if (((ue) this).field_d >= var9_int) {
                            statePc = 18;
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
                        var9_int = ((ue) this).field_d;
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
                        vm.a(((ue) this).field_f, 0, param1, param0, var9_int);
                        param3 = param3 - var9_int;
                        param0 = param0 + var9_int;
                        ((ue) this).field_h = ((ue) this).field_h + (long)var9_int;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((ue) this).field_j.a(((ue) this).field_h, 112);
                        ((ue) this).field_l = ((ue) this).field_h;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (-1 <= (param3 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9_int = ((ue) this).field_j.a(param3, -78, param1, param0);
                        if ((var9_int ^ -1) == 0) {
                            statePc = 23;
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
                        ((ue) this).field_l = ((ue) this).field_l + (long)var9_int;
                        param0 = param0 + var9_int;
                        ((ue) this).field_h = ((ue) this).field_h + (long)var9_int;
                        param3 = param3 - var9_int;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (((ue) this).field_m == -1L) {
                            statePc = 54;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((((ue) this).field_m ^ -1L) >= (((ue) this).field_h ^ -1L)) {
                            statePc = 32;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((param3 ^ -1) < -1) {
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
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9_int = param0 + (int)(((ue) this).field_m + -((ue) this).field_h);
                        if (param3 + param0 < var9_int) {
                            statePc = 29;
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
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9_int = param3 + param0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (param0 >= var9_int) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        param0++;
                        param1[param0] = (byte) 0;
                        param3--;
                        ((ue) this).field_h = ((ue) this).field_h + 1L;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9 = -1L;
                        if (((ue) this).field_m < var5_long) {
                            statePc = 35;
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
                        if ((long)var8 + var5_long > ((ue) this).field_m) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (((ue) this).field_m > var5_long) {
                            statePc = 39;
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
                        if (var5_long >= ((ue) this).field_m - -(long)((ue) this).field_c) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = var5_long;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = ((ue) this).field_m;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var11 = -1L;
                        if (var5_long >= ((ue) this).field_m - -(long)((ue) this).field_c) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((((ue) this).field_m - -(long)((ue) this).field_c ^ -1L) >= (var5_long + (long)var8 ^ -1L)) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((long)var8 + var5_long <= ((ue) this).field_m) {
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
                        if ((((ue) this).field_m + (long)((ue) this).field_c ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11 = (long)((ue) this).field_c + ((ue) this).field_m;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((var9 ^ -1L) >= 0L) {
                            statePc = 54;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((var11 ^ -1L) < (var9 ^ -1L)) {
                            statePc = 50;
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
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var13 = (int)(-var9 + var11);
                        vm.a(((ue) this).field_b, (int)(-((ue) this).field_m + var9), param1, (int)(-var5_long + var9) + var7, var13);
                        if ((var11 ^ -1L) >= (((ue) this).field_h ^ -1L)) {
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
                        param3 = (int)((long)param3 - (var11 + -((ue) this).field_h));
                        ((ue) this).field_h = var11;
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
                    ((ue) this).field_l = -1L;
                    throw var5;
                }
                case 54: {
                    if (-1 > (param3 ^ -1)) {
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
                    if (param2 == -103) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    field_e = null;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != -1) {
            return;
        }
        if (!(0L <= param1)) {
            throw new IOException();
        }
        ((ue) this).field_h = param1;
    }

    private final void e(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((ue) this).field_d = 0;
        if (param0 != -42) {
            Object var5 = null;
            nc discarded$0 = ue.a((kl) null, 70, (kl) null, (byte) -40, 15);
        }
        if ((((ue) this).field_l ^ -1L) != (((ue) this).field_h ^ -1L)) {
            ((ue) this).field_j.a(((ue) this).field_h, 110);
            ((ue) this).field_l = ((ue) this).field_h;
        }
        ((ue) this).field_i = ((ue) this).field_h;
        while (((ue) this).field_f.length > ((ue) this).field_d) {
            var2 = ((ue) this).field_f.length - ((ue) this).field_d;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            var3 = ((ue) this).field_j.a(var2, -118, ((ue) this).field_f, ((ue) this).field_d);
            // ifeq L173
            ((ue) this).field_l = ((ue) this).field_l + (long)var3;
            ((ue) this).field_d = ((ue) this).field_d + var3;
        }
    }

    final static void a(byte param0) {
        t.field_c = kv.k(5);
        if (param0 < 78) {
            wk[] discarded$0 = ue.a(59, -15, 35, -65);
        }
        ee.field_v = new gk();
        ci.h((byte) 74);
    }

    private final void d(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 111) {
            break L0;
          } else {
            field_k = null;
            break L0;
          }
        }
        L1: {
          if (((ue) this).field_m != -1L) {
            L2: {
              if ((((ue) this).field_m ^ -1L) == (((ue) this).field_l ^ -1L)) {
                break L2;
              } else {
                ((ue) this).field_j.a(((ue) this).field_m, 114);
                ((ue) this).field_l = ((ue) this).field_m;
                break L2;
              }
            }
            L3: {
              ((ue) this).field_j.a(1, 0, ((ue) this).field_c, ((ue) this).field_b);
              ((ue) this).field_l = ((ue) this).field_l + (long)((ue) this).field_c;
              if ((((ue) this).field_l ^ -1L) < (((ue) this).field_n ^ -1L)) {
                ((ue) this).field_n = ((ue) this).field_l;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                var2 = -1L;
                if ((((ue) this).field_i ^ -1L) < (((ue) this).field_m ^ -1L)) {
                  break L5;
                } else {
                  if (((long)((ue) this).field_d + ((ue) this).field_i ^ -1L) < (((ue) this).field_m ^ -1L)) {
                    var2 = ((ue) this).field_m;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if ((((ue) this).field_i ^ -1L) > (((ue) this).field_m ^ -1L)) {
                break L4;
              } else {
                if (((ue) this).field_m + (long)((ue) this).field_c > ((ue) this).field_i) {
                  var2 = ((ue) this).field_i;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                var4 = -1L;
                if ((((ue) this).field_i ^ -1L) <= ((long)((ue) this).field_c + ((ue) this).field_m ^ -1L)) {
                  break L7;
                } else {
                  if (((ue) this).field_i - -(long)((ue) this).field_d < (long)((ue) this).field_c + ((ue) this).field_m) {
                    break L7;
                  } else {
                    var4 = (long)((ue) this).field_c + ((ue) this).field_m;
                    break L6;
                  }
                }
              }
              if ((((ue) this).field_m ^ -1L) <= ((long)((ue) this).field_d + ((ue) this).field_i ^ -1L)) {
                break L6;
              } else {
                if ((((ue) this).field_m - -(long)((ue) this).field_c ^ -1L) <= ((long)((ue) this).field_d + ((ue) this).field_i ^ -1L)) {
                  var4 = ((ue) this).field_i + (long)((ue) this).field_d;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if ((var2 ^ -1L) >= 0L) {
                break L8;
              } else {
                if ((var4 ^ -1L) < (var2 ^ -1L)) {
                  var6 = (int)(var4 + -var2);
                  vm.a(((ue) this).field_b, (int)(-((ue) this).field_m + var2), ((ue) this).field_f, (int)(var2 - ((ue) this).field_i), var6);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            ((ue) this).field_m = -1L;
            ((ue) this).field_c = 0;
            break L1;
          } else {
            break L1;
          }
        }
    }

    ue(ei param0, int param1, int param2) throws IOException {
        ((ue) this).field_m = -1L;
        ((ue) this).field_i = -1L;
        ((ue) this).field_c = 0;
        ((ue) this).field_j = param0;
        ((ue) this).field_n = param0.a(true);
        ((ue) this).field_g = param0.a(true);
        ((ue) this).field_f = new byte[param1];
        ((ue) this).field_b = new byte[param2];
        ((ue) this).field_h = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "The '<%0>' setting needs to be changed.";
    }
}
