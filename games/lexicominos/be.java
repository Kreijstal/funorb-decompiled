/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class be {
    private long field_m;
    private long field_g;
    static String field_i;
    private int field_a;
    private ea field_n;
    private long field_h;
    private byte[] field_j;
    static db[] field_b;
    private int field_c;
    static sc field_q;
    private long field_o;
    private long field_e;
    private byte[] field_p;
    static db field_d;
    private long field_k;
    static int field_l;
    static byte[][] field_f;

    private final void b(int param0) throws IOException {
        int var2 = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Lexicominos.field_L ? 1 : 0;
          var2 = -124 % ((param0 - -13) / 50);
          if (((be) this).field_g != -1L) {
            L1: {
              if ((((be) this).field_e ^ -1L) == (((be) this).field_g ^ -1L)) {
                break L1;
              } else {
                ((be) this).field_n.a((byte) -55, ((be) this).field_g);
                ((be) this).field_e = ((be) this).field_g;
                break L1;
              }
            }
            L2: {
              ((be) this).field_n.a(1, 0, ((be) this).field_p, ((be) this).field_a);
              ((be) this).field_e = ((be) this).field_e + (long)((be) this).field_a;
              if ((((be) this).field_e ^ -1L) < (((be) this).field_m ^ -1L)) {
                ((be) this).field_m = ((be) this).field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                if ((((be) this).field_k ^ -1L) < (((be) this).field_g ^ -1L)) {
                  break L4;
                } else {
                  if (((be) this).field_g >= ((be) this).field_k - -(long)((be) this).field_c) {
                    break L4;
                  } else {
                    var3 = ((be) this).field_g;
                    break L3;
                  }
                }
              }
              if ((((be) this).field_k ^ -1L) > (((be) this).field_g ^ -1L)) {
                break L3;
              } else {
                if ((((be) this).field_k ^ -1L) > (((be) this).field_g + (long)((be) this).field_a ^ -1L)) {
                  var3 = ((be) this).field_k;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var5 = -1L;
                if ((((be) this).field_g - -(long)((be) this).field_a ^ -1L) >= (((be) this).field_k ^ -1L)) {
                  break L6;
                } else {
                  if ((((be) this).field_k - -(long)((be) this).field_c ^ -1L) <= ((long)((be) this).field_a + ((be) this).field_g ^ -1L)) {
                    var5 = (long)((be) this).field_a + ((be) this).field_g;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((be) this).field_g >= (long)((be) this).field_c + ((be) this).field_k) {
                break L5;
              } else {
                if (((long)((be) this).field_c + ((be) this).field_k ^ -1L) >= (((be) this).field_g - -(long)((be) this).field_a ^ -1L)) {
                  var5 = (long)((be) this).field_c + ((be) this).field_k;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (-1L >= var3) {
                break L7;
              } else {
                if (var3 < var5) {
                  var7 = (int)(-var3 + var5);
                  o.a(((be) this).field_p, (int)(var3 + -((be) this).field_g), ((be) this).field_j, (int)(-((be) this).field_k + var3), var7);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((be) this).field_a = 0;
            ((be) this).field_g = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    public static void b(byte param0) {
        int var1 = 3 % ((-62 - param0) / 41);
        field_i = null;
        field_b = null;
        field_q = null;
        field_f = null;
        field_d = null;
    }

    final void c(int param0) throws IOException {
        this.b(126);
        ((be) this).field_n.a(true);
        if (param0 != 0) {
        }
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Lexicominos.field_L ? 1 : 0;
        ((be) this).field_c = 0;
        if ((((be) this).field_h ^ -1L) != (((be) this).field_e ^ -1L)) {
            ((be) this).field_n.a((byte) -55, ((be) this).field_h);
            ((be) this).field_e = ((be) this).field_h;
        }
        ((be) this).field_k = ((be) this).field_h;
        while (((be) this).field_c < ((be) this).field_j.length) {
            var2 = -((be) this).field_c + ((be) this).field_j.length;
            if (!(200000000 >= var2)) {
                var2 = 200000000;
            }
            var3 = ((be) this).field_n.a(var2, ((be) this).field_c, (byte) 116, ((be) this).field_j);
            // if_icmpeq L146
            ((be) this).field_e = ((be) this).field_e + (long)var3;
            ((be) this).field_c = ((be) this).field_c + var3;
        }
        if (param0 != -29960) {
        }
    }

    final void a(byte param0, long param1) throws IOException {
        if (param1 < 0L) {
            throw new IOException();
        }
        if (param0 != 40) {
            return;
        }
        ((be) this).field_h = param1;
    }

    final void a(byte[] param0, int param1) throws IOException {
        ((be) this).a(param1, param0, param0.length, -1);
    }

    final long a(byte param0) {
        if (param0 != -122) {
            be.b((byte) 125);
        }
        return ((be) this).field_o;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
                    var14 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1.length >= param0 + param2) {
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
                        throw new ArrayIndexOutOfBoundsException(param2 + param0 + -param1.length);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1L == ((be) this).field_g) {
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
                        if ((((be) this).field_h ^ -1L) > (((be) this).field_g ^ -1L)) {
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
                        if (((be) this).field_h - -(long)param2 <= (long)((be) this).field_a + ((be) this).field_g) {
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
                        o.a(((be) this).field_p, (int)(-((be) this).field_g + ((be) this).field_h), param1, param0, param2);
                        ((be) this).field_h = ((be) this).field_h + (long)param2;
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
                        var5_long = ((be) this).field_h;
                        var7 = param0;
                        var8 = param2;
                        if (((be) this).field_k > ((be) this).field_h) {
                            statePc = 16;
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
                        if ((((be) this).field_h ^ -1L) > ((long)((be) this).field_c + ((be) this).field_k ^ -1L)) {
                            statePc = 12;
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9_int = (int)((long)((be) this).field_c - -((be) this).field_k - ((be) this).field_h);
                        if (var9_int > param2) {
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = param2;
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
                        o.a(((be) this).field_j, (int)(-((be) this).field_k + ((be) this).field_h), param1, param0, var9_int);
                        param2 = param2 - var9_int;
                        ((be) this).field_h = ((be) this).field_h + (long)var9_int;
                        param0 = param0 + var9_int;
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
                        if (((be) this).field_j.length < param2) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param2 > 0) {
                            statePc = 19;
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
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.a(-29960);
                        var9_int = param2;
                        if (((be) this).field_c >= var9_int) {
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
                        var9_int = ((be) this).field_c;
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
                        o.a(((be) this).field_j, 0, param1, param0, var9_int);
                        param0 = param0 + var9_int;
                        ((be) this).field_h = ((be) this).field_h + (long)var9_int;
                        param2 = param2 - var9_int;
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
                        ((be) this).field_n.a((byte) -55, ((be) this).field_h);
                        ((be) this).field_e = ((be) this).field_h;
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
                        if (0 >= param2) {
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
                        var9_int = ((be) this).field_n.a(param2, param0, (byte) -121, param1);
                        if (var9_int == -1) {
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
                        param2 = param2 - var9_int;
                        ((be) this).field_e = ((be) this).field_e + (long)var9_int;
                        ((be) this).field_h = ((be) this).field_h + (long)var9_int;
                        param0 = param0 + var9_int;
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
                        if (((be) this).field_g != (long)param3) {
                            statePc = 28;
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
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((be) this).field_h >= ((be) this).field_g) {
                            statePc = 36;
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
                        if (0 < param2) {
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
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9_int = param0 - -(int)(-((be) this).field_h + ((be) this).field_g);
                        if (param2 + param0 < var9_int) {
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
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9_int = param2 + param0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var9_int <= param0) {
                            statePc = 36;
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
                        param2--;
                        param0++;
                        param1[param0] = (byte) 0;
                        ((be) this).field_h = ((be) this).field_h + 1L;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = -1L;
                        if ((((be) this).field_g ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 39;
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
                        if (((be) this).field_g >= var5_long - -(long)var8) {
                            statePc = 39;
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
                        var9 = ((be) this).field_g;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var5_long < ((be) this).field_g) {
                            statePc = 43;
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
                        if ((var5_long ^ -1L) > (((be) this).field_g - -(long)((be) this).field_a ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var9 = var5_long;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var11 = -1L;
                        if ((var5_long ^ -1L) <= ((long)((be) this).field_a + ((be) this).field_g ^ -1L)) {
                            statePc = 46;
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
                        if (((be) this).field_g - -(long)((be) this).field_a > (long)var8 + var5_long) {
                            statePc = 46;
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
                        var11 = ((be) this).field_g + (long)((be) this).field_a;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((var5_long + (long)var8 ^ -1L) >= (((be) this).field_g ^ -1L)) {
                            statePc = 50;
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
                        if (((be) this).field_g - -(long)((be) this).field_a >= (long)var8 + var5_long) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (-1L >= var9) {
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
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                            statePc = 56;
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
                        var13 = (int)(var11 - var9);
                        o.a(((be) this).field_p, (int)(-((be) this).field_g + var9), param1, (int)(var9 - var5_long) + var7, var13);
                        if (((be) this).field_h >= var11) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        param2 = (int)((long)param2 - (-((be) this).field_h + var11));
                        ((be) this).field_h = var11;
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
                    ((be) this).field_e = -1L;
                    throw var5;
                }
                case 56: {
                    if (-1 > (param2 ^ -1)) {
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

    final void b(int param0, byte[] param1, int param2, int param3) throws IOException {
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
                    var10 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((((be) this).field_o ^ -1L) <= (((be) this).field_h - -(long)param2 ^ -1L)) {
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
                        ((be) this).field_o = (long)param2 + ((be) this).field_h;
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
                        if (param3 == -31593) {
                            statePc = 5;
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
                        be.b((byte) -7);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((be) this).field_g == -1L) {
                            statePc = 11;
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
                        if ((((be) this).field_g ^ -1L) >= (((be) this).field_h ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.b(65);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((((be) this).field_g + (long)((be) this).field_a ^ -1L) <= (((be) this).field_h ^ -1L)) {
                            statePc = 11;
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
                        this.b(65);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((be) this).field_g == -1L) {
                            statePc = 14;
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
                        if (((long)param2 + ((be) this).field_h ^ -1L) >= ((long)((be) this).field_p.length + ((be) this).field_g ^ -1L)) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5_int = (int)((long)((be) this).field_p.length + (((be) this).field_g + -((be) this).field_h));
                        o.a(param1, param0, ((be) this).field_p, (int)(-((be) this).field_g + ((be) this).field_h), var5_int);
                        param0 = param0 + var5_int;
                        ((be) this).field_h = ((be) this).field_h + (long)var5_int;
                        param2 = param2 - var5_int;
                        ((be) this).field_a = ((be) this).field_p.length;
                        this.b(93);
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
                        if (((be) this).field_p.length >= param2) {
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
                        if ((((be) this).field_h ^ -1L) == (((be) this).field_e ^ -1L)) {
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
                        ((be) this).field_n.a((byte) -55, ((be) this).field_h);
                        ((be) this).field_e = ((be) this).field_h;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((be) this).field_n.a(1, param0, param1, param2);
                        ((be) this).field_e = ((be) this).field_e + (long)param2;
                        if (((be) this).field_m < ((be) this).field_e) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((be) this).field_m = ((be) this).field_e;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5_long = -1L;
                        var7 = -1L;
                        if (((be) this).field_k > ((be) this).field_h) {
                            statePc = 23;
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
                        if ((((be) this).field_h ^ -1L) > (((be) this).field_k + (long)((be) this).field_c ^ -1L)) {
                            statePc = 26;
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
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((((be) this).field_k ^ -1L) > (((be) this).field_h ^ -1L)) {
                            statePc = 27;
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
                        if (((be) this).field_h - -(long)param2 <= ((be) this).field_k) {
                            statePc = 27;
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
                        var5_long = ((be) this).field_k;
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
                        var5_long = ((be) this).field_h;
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
                        if ((((be) this).field_h - -(long)param2 ^ -1L) >= (((be) this).field_k ^ -1L)) {
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
                        if ((((be) this).field_k - -(long)((be) this).field_c ^ -1L) <= (((be) this).field_h - -(long)param2 ^ -1L)) {
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
                        if ((((be) this).field_k - -(long)((be) this).field_c ^ -1L) >= (((be) this).field_h ^ -1L)) {
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
                        if ((long)((be) this).field_c + ((be) this).field_k <= (long)param2 + ((be) this).field_h) {
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
                        var7 = (long)((be) this).field_c + ((be) this).field_k;
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
                        var7 = (long)param2 + ((be) this).field_h;
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
                        if ((var7 ^ -1L) < (var5_long ^ -1L)) {
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
                        var9 = (int)(var7 - var5_long);
                        o.a(param1, (int)(-((be) this).field_h + ((long)param0 + var5_long)), ((be) this).field_j, (int)(var5_long - ((be) this).field_k), var9);
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
                        ((be) this).field_h = ((be) this).field_h + (long)param2;
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
                        if (-1 <= (param2 ^ -1)) {
                            statePc = 49;
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
                        if (0L != (((be) this).field_g ^ -1L)) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((be) this).field_g = ((be) this).field_h;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        o.a(param1, param0, ((be) this).field_p, (int)(-((be) this).field_g + ((be) this).field_h), param2);
                        ((be) this).field_h = ((be) this).field_h + (long)param2;
                        if ((-((be) this).field_g + ((be) this).field_h ^ -1L) < ((long)((be) this).field_a ^ -1L)) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((be) this).field_a = (int)(-((be) this).field_g + ((be) this).field_h);
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
                    ((be) this).field_e = -1L;
                    throw var5;
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    be(ea param0, int param1, int param2) throws IOException {
        ((be) this).field_a = 0;
        ((be) this).field_g = -1L;
        ((be) this).field_k = -1L;
        ((be) this).field_n = param0;
        ((be) this).field_m = param0.a(-45);
        ((be) this).field_o = param0.a(-45);
        ((be) this).field_h = 0L;
        ((be) this).field_j = new byte[param1];
        ((be) this).field_p = new byte[param2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Log in";
        field_q = new sc();
        field_d = new db(540, 140);
    }
}
