/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class we {
    private long field_g;
    private int field_a;
    private byte[] field_e;
    private long field_c;
    private long field_i;
    private di field_k;
    static String field_b;
    private int field_m;
    private long field_f;
    static dk field_j;
    private long field_n;
    static nf[] field_l;
    private byte[] field_d;
    private long field_h;

    final void a(long param0, byte param1) throws IOException {
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        if (param1 > -119) {
            return;
        }
        ((we) this).field_f = param0;
    }

    final void a(byte param0) throws IOException {
        if (param0 > -24) {
            return;
        }
        this.a(false);
        ((we) this).field_k.a(false);
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int[] param8, byte param9, int param10) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var20 = Transmogrify.field_A ? 1 : 0;
          if (param9 == -53) {
            break L0;
          } else {
            String discarded$2 = we.a(false, true, -95, true);
            break L0;
          }
        }
        var11 = 16711935 & param1;
        var12 = 65280 & param1;
        var13 = -param2;
        L1: while (true) {
          if ((var13 ^ -1) <= -1) {
            return;
          } else {
            var14 = -param6;
            L2: while (true) {
              if (var14 >= 0) {
                param0 = param0 + param4;
                param10 = param10 + param5;
                var13++;
                continue L1;
              } else {
                param0++;
                param7 = param3[param0];
                if (0 == param7) {
                  param10++;
                  var14++;
                  continue L2;
                } else {
                  var15 = param7 & 255;
                  var16 = -var15 + 256;
                  var17 = param8[param10];
                  var18 = var17 & 16711935;
                  var19 = var17 & 65280;
                  param10++;
                  param8[param10] = cl.b(vg.c(16711708, var19 * var16 + var12 * var15) >> 1660158088, vg.c(var15 * var11 + var18 * var16 >> -1652834968, 16711935));
                  var14++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        if (param0 != -11509) {
            we.a(45);
        }
        field_b = null;
    }

    final long b(byte param0) {
        if (param0 != 36) {
            return 67L;
        }
        return ((we) this).field_n;
    }

    private final void b(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Transmogrify.field_A ? 1 : 0;
        ((we) this).field_a = 0;
        if (param0) {
            return;
        }
        if (!((((we) this).field_f ^ -1L) == (((we) this).field_i ^ -1L))) {
            ((we) this).field_k.a(false, ((we) this).field_f);
            ((we) this).field_i = ((we) this).field_f;
        }
        ((we) this).field_h = ((we) this).field_f;
        while (((we) this).field_a < ((we) this).field_e.length) {
            var2 = -((we) this).field_a + ((we) this).field_e.length;
            if (200000000 < var2) {
                var2 = 200000000;
            }
            var3 = ((we) this).field_k.a(((we) this).field_e, !param0 ? true : false, var2, ((we) this).field_a);
            if (0 == (var3 ^ -1)) {
                break;
            }
            ((we) this).field_i = ((we) this).field_i + (long)var3;
            ((we) this).field_a = ((we) this).field_a + var3;
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (param1) {
            var4 += 4;
        }
        if (param2 >= -79) {
            field_b = null;
        }
        if (!(!param3)) {
            var4 += 2;
        }
        if (param0) {
            var4++;
        }
        return og.field_c[var4];
    }

    final static ti[] a(int param0, int param1, int param2, int param3) {
        if (param1 <= 110) {
            we.a(49);
        }
        return ad.a(param0, param3, param2, 127, 1);
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
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
                    var10 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((we) this).field_n < ((we) this).field_f + (long)param1) {
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
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((we) this).field_n = ((we) this).field_f + (long)param1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((we) this).field_c == -1L) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((we) this).field_c > ((we) this).field_f) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((((we) this).field_c + (long)((we) this).field_m ^ -1L) > (((we) this).field_f ^ -1L)) {
                            statePc = 8;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.a(false);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param2 > 52) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        we.a(48);
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
                        if (-1L == ((we) this).field_c) {
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
                        if (((we) this).field_f - -(long)param1 > ((we) this).field_c + (long)((we) this).field_d.length) {
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
                        var5_int = (int)(-((we) this).field_f + (((we) this).field_c + (long)((we) this).field_d.length));
                        ji.a(param0, param3, ((we) this).field_d, (int)(-((we) this).field_c + ((we) this).field_f), var5_int);
                        param1 = param1 - var5_int;
                        ((we) this).field_f = ((we) this).field_f + (long)var5_int;
                        param3 = param3 + var5_int;
                        ((we) this).field_m = ((we) this).field_d.length;
                        this.a(false);
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
                        if (((we) this).field_d.length < param1) {
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
                        if ((((we) this).field_i ^ -1L) == (((we) this).field_f ^ -1L)) {
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
                        ((we) this).field_k.a(false, ((we) this).field_f);
                        ((we) this).field_i = ((we) this).field_f;
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
                        ((we) this).field_k.a((byte) 63, param0, param1, param3);
                        ((we) this).field_i = ((we) this).field_i + (long)param1;
                        if ((((we) this).field_i ^ -1L) >= (((we) this).field_g ^ -1L)) {
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
                        ((we) this).field_g = ((we) this).field_i;
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
                        if (((we) this).field_h > ((we) this).field_f) {
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
                        if ((long)((we) this).field_a + ((we) this).field_h > ((we) this).field_f) {
                            statePc = 28;
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
                        if ((((we) this).field_f ^ -1L) < (((we) this).field_h ^ -1L)) {
                            statePc = 29;
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
                        if (((long)param1 + ((we) this).field_f ^ -1L) < (((we) this).field_h ^ -1L)) {
                            statePc = 27;
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
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var5_long = ((we) this).field_h;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var5_long = ((we) this).field_f;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((we) this).field_f - -(long)param1 <= ((we) this).field_h) {
                            statePc = 32;
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
                        if ((long)((we) this).field_a + ((we) this).field_h >= ((we) this).field_f + (long)param1) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((long)((we) this).field_a + ((we) this).field_h <= ((we) this).field_f) {
                            statePc = 36;
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
                        if (((long)param1 + ((we) this).field_f ^ -1L) > ((long)((we) this).field_a + ((we) this).field_h ^ -1L)) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var7 = ((we) this).field_h + (long)((we) this).field_a;
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
                        var7 = ((we) this).field_f - -(long)param1;
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
                        if ((var7 ^ -1L) < (var5_long ^ -1L)) {
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
                        var9 = (int)(-var5_long + var7);
                        ji.a(param0, (int)(-((we) this).field_f + (var5_long + (long)param3)), ((we) this).field_e, (int)(var5_long - ((we) this).field_h), var9);
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
                        ((we) this).field_f = ((we) this).field_f + (long)param1;
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
                        if (-1 <= (param1 ^ -1)) {
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
                        if (-1L != ((we) this).field_c) {
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
                        ((we) this).field_c = ((we) this).field_f;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ji.a(param0, param3, ((we) this).field_d, (int)(((we) this).field_f - ((we) this).field_c), param1);
                        ((we) this).field_f = ((we) this).field_f + (long)param1;
                        if (-((we) this).field_c + ((we) this).field_f > (long)((we) this).field_m) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ((we) this).field_m = (int)(-((we) this).field_c + ((we) this).field_f);
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
                    ((we) this).field_i = -1L;
                    throw var5;
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        if (!param0) {
          L0: {
            if (0L == (((we) this).field_c ^ -1L)) {
              break L0;
            } else {
              L1: {
                if ((((we) this).field_i ^ -1L) == (((we) this).field_c ^ -1L)) {
                  break L1;
                } else {
                  ((we) this).field_k.a(false, ((we) this).field_c);
                  ((we) this).field_i = ((we) this).field_c;
                  break L1;
                }
              }
              L2: {
                ((we) this).field_k.a((byte) 71, ((we) this).field_d, ((we) this).field_m, 0);
                ((we) this).field_i = ((we) this).field_i + (long)((we) this).field_m;
                if ((((we) this).field_i ^ -1L) >= (((we) this).field_g ^ -1L)) {
                  break L2;
                } else {
                  ((we) this).field_g = ((we) this).field_i;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  var4 = -1L;
                  if (((we) this).field_h > ((we) this).field_c) {
                    break L4;
                  } else {
                    if (((we) this).field_h - -(long)((we) this).field_a <= ((we) this).field_c) {
                      break L4;
                    } else {
                      var2 = ((we) this).field_c;
                      break L3;
                    }
                  }
                }
                if (((we) this).field_c > ((we) this).field_h) {
                  break L3;
                } else {
                  if ((((we) this).field_h ^ -1L) <= ((long)((we) this).field_m + ((we) this).field_c ^ -1L)) {
                    break L3;
                  } else {
                    var2 = ((we) this).field_h;
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  if ((long)((we) this).field_m + ((we) this).field_c <= ((we) this).field_h) {
                    break L6;
                  } else {
                    if ((long)((we) this).field_a + ((we) this).field_h >= (long)((we) this).field_m + ((we) this).field_c) {
                      var4 = ((we) this).field_c - -(long)((we) this).field_m;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((((we) this).field_c ^ -1L) <= ((long)((we) this).field_a + ((we) this).field_h ^ -1L)) {
                  break L5;
                } else {
                  if (((long)((we) this).field_m + ((we) this).field_c ^ -1L) <= ((long)((we) this).field_a + ((we) this).field_h ^ -1L)) {
                    var4 = (long)((we) this).field_a + ((we) this).field_h;
                    break L5;
                  } else {
                    L7: {
                      if (var2 <= -1L) {
                        break L7;
                      } else {
                        if (var4 <= var2) {
                          break L7;
                        } else {
                          var6 = (int)(var4 - var2);
                          ji.a(((we) this).field_d, (int)(-((we) this).field_c + var2), ((we) this).field_e, (int)(-((we) this).field_h + var2), var6);
                          break L7;
                        }
                      }
                    }
                    ((we) this).field_c = -1L;
                    ((we) this).field_m = 0;
                    break L0;
                  }
                }
              }
              L8: {
                if (var2 <= -1L) {
                  break L8;
                } else {
                  if (var4 <= var2) {
                    break L8;
                  } else {
                    var6 = (int)(var4 - var2);
                    ji.a(((we) this).field_d, (int)(-((we) this).field_c + var2), ((we) this).field_e, (int)(-((we) this).field_h + var2), var6);
                    break L8;
                  }
                }
              }
              ((we) this).field_c = -1L;
              ((we) this).field_m = 0;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
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
                    var14 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2.length >= param1 + param0) {
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
                        throw new ArrayIndexOutOfBoundsException(param1 + param0 - param2.length);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1L == ((we) this).field_c) {
                            statePc = 9;
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
                        if ((((we) this).field_c ^ -1L) < (((we) this).field_f ^ -1L)) {
                            statePc = 9;
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
                        if (((we) this).field_c + (long)((we) this).field_m >= ((we) this).field_f - -(long)param1) {
                            statePc = 7;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ji.a(((we) this).field_d, (int)(-((we) this).field_c + ((we) this).field_f), param2, param0, param1);
                        ((we) this).field_f = ((we) this).field_f + (long)param1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var5_long = ((we) this).field_f;
                        var7 = param0;
                        if (param3 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        var8 = param1;
                        if ((((we) this).field_f ^ -1L) > (((we) this).field_h ^ -1L)) {
                            statePc = 17;
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
                        if ((long)((we) this).field_a + ((we) this).field_h <= ((we) this).field_f) {
                            statePc = 17;
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
                        var9_int = (int)((long)((we) this).field_a + (((we) this).field_h + -((we) this).field_f));
                        if (var9_int > param1) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9_int = param1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ji.a(((we) this).field_e, (int)(-((we) this).field_h + ((we) this).field_f), param2, param0, var9_int);
                        param0 = param0 + var9_int;
                        ((we) this).field_f = ((we) this).field_f + (long)var9_int;
                        param1 = param1 - var9_int;
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
                        if (((we) this).field_e.length < param1) {
                            statePc = 23;
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
                        if ((param1 ^ -1) >= -1) {
                            statePc = 28;
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
                        this.b(false);
                        var9_int = param1;
                        if (var9_int > ((we) this).field_a) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9_int = ((we) this).field_a;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ji.a(((we) this).field_e, 0, param2, param0, var9_int);
                        param1 = param1 - var9_int;
                        ((we) this).field_f = ((we) this).field_f + (long)var9_int;
                        param0 = param0 + var9_int;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((we) this).field_k.a(false, ((we) this).field_f);
                        ((we) this).field_i = ((we) this).field_f;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((param1 ^ -1) >= -1) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9_int = ((we) this).field_k.a(param2, true, param1, param0);
                        if ((var9_int ^ -1) != 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        param0 = param0 + var9_int;
                        ((we) this).field_f = ((we) this).field_f + (long)var9_int;
                        ((we) this).field_i = ((we) this).field_i + (long)var9_int;
                        param1 = param1 - var9_int;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-1L == ((we) this).field_c) {
                            statePc = 56;
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
                        if (((we) this).field_f >= ((we) this).field_c) {
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
                        if (param1 <= 0) {
                            statePc = 35;
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
                        var9_int = (int)(-((we) this).field_f + ((we) this).field_c) + param0;
                        if (var9_int <= param0 - -param1) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9_int = param0 + param1;
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
                        if (param0 >= var9_int) {
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
                        param1--;
                        param0++;
                        param2[param0] = (byte) 0;
                        ((we) this).field_f = ((we) this).field_f + 1L;
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
                        if (var5_long > ((we) this).field_c) {
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
                        if (((we) this).field_c < (long)var8 + var5_long) {
                            statePc = 41;
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
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (((we) this).field_c > var5_long) {
                            statePc = 42;
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
                        if (((we) this).field_c - -(long)((we) this).field_m <= var5_long) {
                            statePc = 42;
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
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9 = ((we) this).field_c;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var11 = -1L;
                        if ((long)((we) this).field_m + ((we) this).field_c <= var5_long) {
                            statePc = 45;
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
                        if ((((we) this).field_c - -(long)((we) this).field_m ^ -1L) >= (var5_long - -(long)var8 ^ -1L)) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (((we) this).field_c >= var5_long + (long)var8) {
                            statePc = 49;
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
                        if ((long)var8 + var5_long > (long)((we) this).field_m + ((we) this).field_c) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 55;
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
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var11 = (long)((we) this).field_m + ((we) this).field_c;
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
                        if (0L <= (var9 ^ -1L)) {
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
                        if ((var9 ^ -1L) <= (var11 ^ -1L)) {
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
                        var13 = (int)(var11 + -var9);
                        ji.a(((we) this).field_d, (int)(var9 + -((we) this).field_c), param2, (int)(-var5_long + var9) + var7, var13);
                        if ((var11 ^ -1L) < (((we) this).field_f ^ -1L)) {
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
                        param1 = (int)((long)param1 - (var11 + -((we) this).field_f));
                        ((we) this).field_f = var11;
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
                    ((we) this).field_i = -1L;
                    throw var5;
                }
                case 56: {
                    if (-1 > (param1 ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 58: {
                    throw new EOFException();
                }
                case 59: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        if (param1 != 16711708) {
            ti[] discarded$0 = we.a(-44, -9, 23, -38);
        }
        ((we) this).a(0, param0.length, param0, (byte) 0);
    }

    we(di param0, int param1, int param2) throws IOException {
        ((we) this).field_c = -1L;
        ((we) this).field_m = 0;
        ((we) this).field_h = -1L;
        ((we) this).field_k = param0;
        ((we) this).field_g = param0.a(16);
        ((we) this).field_n = param0.a(16);
        ((we) this).field_d = new byte[param2];
        ((we) this).field_f = 0L;
        ((we) this).field_e = new byte[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Log in / Create account";
    }
}
