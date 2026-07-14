/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class v {
    private long field_c;
    private long field_b;
    private byte[] field_h;
    private long field_l;
    private long field_i;
    private long field_g;
    private qaa field_k;
    private int field_j;
    private int field_f;
    private long field_e;
    static ht field_d;
    private byte[] field_a;

    final static void a(byte param0) {
        if (gm.field_k) {
            dg.g(dg.field_f, dg.field_j, dg.field_h + -dg.field_f, -dg.field_j + dg.field_k);
            fo.field_a.a(false, 7802);
        }
        if (param0 != -50) {
            field_d = null;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
                    var10 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((long)param3 + ((v) this).field_g > ((v) this).field_i) {
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
                        ((v) this).field_i = ((v) this).field_g + (long)param3;
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
                        if (-1L == ((v) this).field_e) {
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
                        if ((((v) this).field_e ^ -1L) >= (((v) this).field_g ^ -1L)) {
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
                        this.b((byte) 50);
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
                        if (((v) this).field_g <= (long)((v) this).field_j + ((v) this).field_e) {
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
                        this.b((byte) 50);
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
                        if (param0 < -52) {
                            statePc = 12;
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
                        if (0L == (((v) this).field_e ^ -1L)) {
                            statePc = 15;
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
                        if ((((v) this).field_e + (long)((v) this).field_a.length ^ -1L) <= (((v) this).field_g + (long)param3 ^ -1L)) {
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
                        var5_int = (int)(-((v) this).field_g - -((v) this).field_e + (long)((v) this).field_a.length);
                        bl.a(param2, param1, ((v) this).field_a, (int)(-((v) this).field_e + ((v) this).field_g), var5_int);
                        param3 = param3 - var5_int;
                        ((v) this).field_g = ((v) this).field_g + (long)var5_int;
                        param1 = param1 + var5_int;
                        ((v) this).field_j = ((v) this).field_a.length;
                        this.b((byte) 50);
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
                        if (param3 > ((v) this).field_a.length) {
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
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((((v) this).field_b ^ -1L) == (((v) this).field_g ^ -1L)) {
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
                        ((v) this).field_k.a(((v) this).field_g, false);
                        ((v) this).field_b = ((v) this).field_g;
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
                        ((v) this).field_k.a(param1, param3, param2, (byte) 124);
                        ((v) this).field_b = ((v) this).field_b + (long)param3;
                        if ((((v) this).field_b ^ -1L) >= (((v) this).field_l ^ -1L)) {
                            statePc = 21;
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
                        ((v) this).field_l = ((v) this).field_b;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5_long = -1L;
                        if (((v) this).field_c > ((v) this).field_g) {
                            statePc = 24;
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
                        if (((v) this).field_g >= ((v) this).field_c + (long)((v) this).field_f) {
                            statePc = 24;
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
                        var5_long = ((v) this).field_g;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((((v) this).field_c ^ -1L) > (((v) this).field_g ^ -1L)) {
                            statePc = 28;
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
                        if ((long)param3 + ((v) this).field_g > ((v) this).field_c) {
                            statePc = 27;
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
                        var5_long = ((v) this).field_c;
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
                        if ((((v) this).field_g - -(long)param3 ^ -1L) >= (((v) this).field_c ^ -1L)) {
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
                        if (((v) this).field_c + (long)((v) this).field_f < ((v) this).field_g + (long)param3) {
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
                        var7 = (long)param3 + ((v) this).field_g;
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
                        if ((((v) this).field_g ^ -1L) <= (((v) this).field_c - -(long)((v) this).field_f ^ -1L)) {
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
                        if ((long)param3 + ((v) this).field_g >= ((v) this).field_c - -(long)((v) this).field_f) {
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
                        var7 = (long)((v) this).field_f + ((v) this).field_c;
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
                        if ((var7 ^ -1L) < (var5_long ^ -1L)) {
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
                        var9 = (int)(var7 + -var5_long);
                        bl.a(param2, (int)((long)param1 + var5_long + -((v) this).field_g), ((v) this).field_h, (int)(var5_long + -((v) this).field_c), var9);
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
                        ((v) this).field_g = ((v) this).field_g + (long)param3;
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
                        if (0 >= param3) {
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
                        if (((v) this).field_e != -1L) {
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
                        ((v) this).field_e = ((v) this).field_g;
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
                        bl.a(param2, param1, ((v) this).field_a, (int)(((v) this).field_g - ((v) this).field_e), param3);
                        ((v) this).field_g = ((v) this).field_g + (long)param3;
                        if ((((v) this).field_g + -((v) this).field_e ^ -1L) >= ((long)((v) this).field_j ^ -1L)) {
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
                        ((v) this).field_j = (int)(((v) this).field_g + -((v) this).field_e);
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
                    ((v) this).field_b = -1L;
                    throw var5;
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        if (param0 != 50) {
          return;
        } else {
          L0: {
            if (((v) this).field_e == -1L) {
              break L0;
            } else {
              L1: {
                if (((v) this).field_b == ((v) this).field_e) {
                  break L1;
                } else {
                  ((v) this).field_k.a(((v) this).field_e, false);
                  ((v) this).field_b = ((v) this).field_e;
                  break L1;
                }
              }
              L2: {
                ((v) this).field_k.a(0, ((v) this).field_j, ((v) this).field_a, (byte) 115);
                ((v) this).field_b = ((v) this).field_b + (long)((v) this).field_j;
                if (((v) this).field_b <= ((v) this).field_l) {
                  break L2;
                } else {
                  ((v) this).field_l = ((v) this).field_b;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  var4 = -1L;
                  if (((v) this).field_c > ((v) this).field_e) {
                    break L4;
                  } else {
                    if ((((v) this).field_e ^ -1L) <= (((v) this).field_c - -(long)((v) this).field_f ^ -1L)) {
                      break L4;
                    } else {
                      var2 = ((v) this).field_e;
                      break L3;
                    }
                  }
                }
                if (((v) this).field_e > ((v) this).field_c) {
                  break L3;
                } else {
                  if ((long)((v) this).field_j + ((v) this).field_e > ((v) this).field_c) {
                    var2 = ((v) this).field_c;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  if (((long)((v) this).field_j + ((v) this).field_e ^ -1L) >= (((v) this).field_c ^ -1L)) {
                    break L6;
                  } else {
                    if (((long)((v) this).field_j + ((v) this).field_e ^ -1L) >= (((v) this).field_c - -(long)((v) this).field_f ^ -1L)) {
                      var4 = (long)((v) this).field_j + ((v) this).field_e;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((((v) this).field_e ^ -1L) <= (((v) this).field_c + (long)((v) this).field_f ^ -1L)) {
                  break L5;
                } else {
                  if ((long)((v) this).field_j + ((v) this).field_e >= (long)((v) this).field_f + ((v) this).field_c) {
                    var4 = (long)((v) this).field_f + ((v) this).field_c;
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
                    var6 = (int)(var4 + -var2);
                    bl.a(((v) this).field_a, (int)(var2 + -((v) this).field_e), ((v) this).field_h, (int)(var2 + -((v) this).field_c), var6);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              ((v) this).field_e = -1L;
              ((v) this).field_j = 0;
              break L0;
            }
          }
          return;
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        int var3 = -69 / ((80 - param0) / 40);
        ((v) this).a(param1.length, 0, -1, param1);
    }

    public static void a(int param0) {
        if (param0 != -203) {
            field_d = null;
        }
        field_d = null;
    }

    final long b(int param0) {
        if (param0 != -1) {
            return 71L;
        }
        return ((v) this).field_i;
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        if (param0 != -1) {
            v.a((byte) -81);
        }
        ((v) this).field_f = 0;
        if (((v) this).field_b != ((v) this).field_g) {
            ((v) this).field_k.a(((v) this).field_g, false);
            ((v) this).field_b = ((v) this).field_g;
        }
        ((v) this).field_c = ((v) this).field_g;
        while (((v) this).field_h.length > ((v) this).field_f) {
            var2 = ((v) this).field_h.length - ((v) this).field_f;
            if ((var2 ^ -1) < -200000001) {
                var2 = 200000000;
            }
            var3 = ((v) this).field_k.a(((v) this).field_h, var2, ((v) this).field_f, param0 ^ -1);
            // if_icmpeq L149
            ((v) this).field_f = ((v) this).field_f + var3;
            ((v) this).field_b = ((v) this).field_b + (long)var3;
        }
    }

    final void d(int param0) throws IOException {
        int var2 = 108 / ((-72 - param0) / 38);
        this.b((byte) 50);
        ((v) this).field_k.a(true);
    }

    final void a(long param0, byte param1) throws IOException {
        if (param1 > -84) {
            v.a(-19);
        }
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        ((v) this).field_g = param0;
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
        Object var15 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3.length >= param0 + param1) {
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
                        throw new ArrayIndexOutOfBoundsException(-param3.length + (param0 + param1));
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((((v) this).field_e ^ -1L) == 0L) {
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
                        if ((((v) this).field_e ^ -1L) < (((v) this).field_g ^ -1L)) {
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
                        if ((((v) this).field_g - -(long)param0 ^ -1L) >= (((v) this).field_e - -(long)((v) this).field_j ^ -1L)) {
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
                        bl.a(((v) this).field_a, (int)(-((v) this).field_e + ((v) this).field_g), param3, param1, param0);
                        ((v) this).field_g = ((v) this).field_g + (long)param0;
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
                        var5_long = ((v) this).field_g;
                        if (param2 == -1) {
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
                    try {
                        var15 = null;
                        v.a(-89, (byte) -81, -71, (lda) null, (lda) null, 78);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = param1;
                        var8 = param0;
                        if ((((v) this).field_g ^ -1L) > (((v) this).field_c ^ -1L)) {
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
                        if (((v) this).field_g < (long)((v) this).field_f + ((v) this).field_c) {
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = (int)(-((v) this).field_g + (((v) this).field_c + (long)((v) this).field_f));
                        if (var9_int <= param0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9_int = param0;
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
                        bl.a(((v) this).field_h, (int)(((v) this).field_g - ((v) this).field_c), param3, param1, var9_int);
                        param0 = param0 - var9_int;
                        param1 = param1 + var9_int;
                        ((v) this).field_g = ((v) this).field_g + (long)var9_int;
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
                        if (((v) this).field_h.length < param0) {
                            statePc = 22;
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
                        if (param0 <= 0) {
                            statePc = 26;
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
                        this.c(param2 ^ 0);
                        var9_int = param0;
                        if (((v) this).field_f >= var9_int) {
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
                        var9_int = ((v) this).field_f;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        bl.a(((v) this).field_h, 0, param3, param1, var9_int);
                        ((v) this).field_g = ((v) this).field_g + (long)var9_int;
                        param1 = param1 + var9_int;
                        param0 = param0 - var9_int;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((v) this).field_k.a(((v) this).field_g, false);
                        ((v) this).field_b = ((v) this).field_g;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((param0 ^ -1) >= -1) {
                            statePc = 26;
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
                        var9_int = ((v) this).field_k.a(param3, param0, param1, 0);
                        if (-1 == var9_int) {
                            statePc = 26;
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
                        ((v) this).field_b = ((v) this).field_b + (long)var9_int;
                        ((v) this).field_g = ((v) this).field_g + (long)var9_int;
                        param0 = param0 - var9_int;
                        param1 = param1 + var9_int;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((((v) this).field_e ^ -1L) == 0L) {
                            statePc = 56;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((v) this).field_e ^ -1L) >= (((v) this).field_g ^ -1L)) {
                            statePc = 34;
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
                        if ((param0 ^ -1) >= -1) {
                            statePc = 34;
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
                        var9_int = param1 + (int)(-((v) this).field_g + ((v) this).field_e);
                        if (param1 - -param0 < var9_int) {
                            statePc = 31;
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
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9_int = param0 + param1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (param1 >= var9_int) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        param1++;
                        param3[param1] = (byte) 0;
                        param0--;
                        ((v) this).field_g = ((v) this).field_g + 1L;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = -1L;
                        if (var5_long > ((v) this).field_e) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (((long)var8 + var5_long ^ -1L) >= (((v) this).field_e ^ -1L)) {
                            statePc = 37;
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
                        var9 = ((v) this).field_e;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var5_long ^ -1L) > (((v) this).field_e ^ -1L)) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((var5_long ^ -1L) > (((v) this).field_e - -(long)((v) this).field_j ^ -1L)) {
                            statePc = 40;
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
                        statePc = 41;
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
                        if (((v) this).field_e - -(long)((v) this).field_j <= var5_long) {
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
                        if ((long)var8 + var5_long >= ((v) this).field_e - -(long)((v) this).field_j) {
                            statePc = 47;
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
                        if ((long)var8 + var5_long <= ((v) this).field_e) {
                            statePc = 48;
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
                        if ((var5_long + (long)var8 ^ -1L) < (((v) this).field_e + (long)((v) this).field_j ^ -1L)) {
                            statePc = 48;
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
                        var11 = var5_long + (long)var8;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11 = (long)((v) this).field_j + ((v) this).field_e;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var9 <= -1L) {
                            statePc = 56;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 55;
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
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var13 = (int)(-var9 + var11);
                        bl.a(((v) this).field_a, (int)(var9 - ((v) this).field_e), param3, (int)(-var5_long + var9) + var7, var13);
                        if (((v) this).field_g < var11) {
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
                        param0 = (int)((long)param0 - (var11 - ((v) this).field_g));
                        ((v) this).field_g = var11;
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
                    ((v) this).field_b = -1L;
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

    final static void a(int param0, byte param1, int param2, lda param3, lda param4, int param5) {
        hna.field_k = param2;
        pba.field_r = param5;
        aka.field_x = param3;
        raa.field_J = param0;
        nj.field_j = param4;
        if (param1 <= 19) {
            v.a(-48);
        }
    }

    v(qaa param0, int param1, int param2) throws IOException {
        ((v) this).field_c = -1L;
        ((v) this).field_e = -1L;
        ((v) this).field_j = 0;
        ((v) this).field_k = param0;
        ((v) this).field_l = param0.a((byte) 24);
        ((v) this).field_i = param0.a((byte) 24);
        ((v) this).field_a = new byte[param2];
        ((v) this).field_g = 0L;
        ((v) this).field_h = new byte[param1];
    }

    static {
    }
}
