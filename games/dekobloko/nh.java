/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nh {
    private long field_b;
    private long field_k;
    private long field_n;
    private long field_j;
    private long field_e;
    private hf field_h;
    private int field_m;
    private byte[] field_g;
    private long field_o;
    private byte[] field_d;
    private int field_c;
    static qm field_i;
    static boolean field_a;
    static char[] field_l;
    static String field_f;

    public static void a(byte param0) {
        field_f = null;
        field_l = null;
        if (param0 != -73) {
            return;
        }
        field_i = null;
    }

    final void a(long param0, byte param1) throws IOException {
        if ((param0 ^ -1L) > -1L) {
          throw new IOException();
        } else {
          L0: {
            ((nh) this).field_j = param0;
            if (param1 == -109) {
              break L0;
            } else {
              nh.a((byte) 91);
              break L0;
            }
          }
          return;
        }
    }

    private final void b(byte param0) throws IOException {
        int var2 = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = client.field_A ? 1 : 0;
          var2 = 75 / ((param0 - -55) / 40);
          if (((nh) this).field_e != -1L) {
            L1: {
              if ((((nh) this).field_e ^ -1L) != (((nh) this).field_b ^ -1L)) {
                ((nh) this).field_h.a(((nh) this).field_e, 80);
                ((nh) this).field_b = ((nh) this).field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((nh) this).field_h.a(((nh) this).field_d, 117, 0, ((nh) this).field_c);
              ((nh) this).field_b = ((nh) this).field_b + (long)((nh) this).field_c;
              if ((((nh) this).field_k ^ -1L) > (((nh) this).field_b ^ -1L)) {
                ((nh) this).field_k = ((nh) this).field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                if ((((nh) this).field_e ^ -1L) > (((nh) this).field_o ^ -1L)) {
                  break L4;
                } else {
                  if ((((nh) this).field_e ^ -1L) > (((nh) this).field_o + (long)((nh) this).field_m ^ -1L)) {
                    var3 = ((nh) this).field_e;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if ((((nh) this).field_e ^ -1L) < (((nh) this).field_o ^ -1L)) {
                break L3;
              } else {
                if (((long)((nh) this).field_c + ((nh) this).field_e ^ -1L) < (((nh) this).field_o ^ -1L)) {
                  var3 = ((nh) this).field_o;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var5 = -1L;
                if ((((nh) this).field_o ^ -1L) <= ((long)((nh) this).field_c + ((nh) this).field_e ^ -1L)) {
                  break L6;
                } else {
                  if ((long)((nh) this).field_m + ((nh) this).field_o >= (long)((nh) this).field_c + ((nh) this).field_e) {
                    var5 = ((nh) this).field_e + (long)((nh) this).field_c;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if ((long)((nh) this).field_m + ((nh) this).field_o <= ((nh) this).field_e) {
                break L5;
              } else {
                if (((nh) this).field_o + (long)((nh) this).field_m <= ((nh) this).field_e + (long)((nh) this).field_c) {
                  var5 = ((nh) this).field_o + (long)((nh) this).field_m;
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
                if ((var3 ^ -1L) > (var5 ^ -1L)) {
                  var7 = (int)(var5 - var3);
                  an.a(((nh) this).field_d, (int)(-((nh) this).field_e + var3), ((nh) this).field_g, (int)(-((nh) this).field_o + var3), var7);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((nh) this).field_e = -1L;
            ((nh) this).field_c = 0;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final long b(int param0) {
        int var2 = 93 / ((-25 - param0) / 62);
        return ((nh) this).field_n;
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        ((nh) this).field_m = param0;
        if (!(((nh) this).field_b == ((nh) this).field_j)) {
            ((nh) this).field_h.a(((nh) this).field_j, 123);
            ((nh) this).field_b = ((nh) this).field_j;
        }
        ((nh) this).field_o = ((nh) this).field_j;
        while (((nh) this).field_m < ((nh) this).field_g.length) {
            var2 = -((nh) this).field_m + ((nh) this).field_g.length;
            if (!(-200000001 <= (var2 ^ -1))) {
                var2 = 200000000;
            }
            var3 = ((nh) this).field_h.a(((nh) this).field_g, (byte) -103, ((nh) this).field_m, var2);
            if (-1 == var3) {
                break;
            }
            ((nh) this).field_m = ((nh) this).field_m + var3;
            ((nh) this).field_b = ((nh) this).field_b + (long)var3;
        }
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
                    var14 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == 741) {
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
                        nh.a((byte) 18, 18);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param1.length < param0 - -param3) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param1.length + (param0 + param3));
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((((nh) this).field_e ^ -1L) == 0L) {
                            statePc = 11;
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
                        if (((nh) this).field_j < ((nh) this).field_e) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (((nh) this).field_j + (long)param3 > (long)((nh) this).field_c + ((nh) this).field_e) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        an.a(((nh) this).field_d, (int)(-((nh) this).field_e + ((nh) this).field_j), param1, param0, param3);
                        ((nh) this).field_j = ((nh) this).field_j + (long)param3;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        var5_long = ((nh) this).field_j;
                        var7 = param0;
                        var8 = param3;
                        if ((((nh) this).field_j ^ -1L) > (((nh) this).field_o ^ -1L)) {
                            statePc = 17;
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
                        if (((nh) this).field_j < (long)((nh) this).field_m + ((nh) this).field_o) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = (int)((long)((nh) this).field_m + (-((nh) this).field_j - -((nh) this).field_o));
                        if (param3 >= var9_int) {
                            statePc = 16;
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
                        var9_int = param3;
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
                        an.a(((nh) this).field_g, (int)(((nh) this).field_j - ((nh) this).field_o), param1, param0, var9_int);
                        ((nh) this).field_j = ((nh) this).field_j + (long)var9_int;
                        param3 = param3 - var9_int;
                        param0 = param0 + var9_int;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param3 <= ((nh) this).field_g.length) {
                            statePc = 22;
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
                        ((nh) this).field_h.a(((nh) this).field_j, 23);
                        ((nh) this).field_b = ((nh) this).field_j;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (0 >= param3) {
                            statePc = 27;
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
                        var9_int = ((nh) this).field_h.a(param1, (byte) -38, param0, param3);
                        if ((var9_int ^ -1) == 0) {
                            statePc = 27;
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
                        ((nh) this).field_b = ((nh) this).field_b + (long)var9_int;
                        param3 = param3 - var9_int;
                        param0 = param0 + var9_int;
                        ((nh) this).field_j = ((nh) this).field_j + (long)var9_int;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((param3 ^ -1) >= -1) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.a(0);
                        var9_int = param3;
                        if (((nh) this).field_m < var9_int) {
                            statePc = 25;
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
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9_int = ((nh) this).field_m;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        an.a(((nh) this).field_g, 0, param1, param0, var9_int);
                        param0 = param0 + var9_int;
                        param3 = param3 - var9_int;
                        ((nh) this).field_j = ((nh) this).field_j + (long)var9_int;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (((nh) this).field_e != -1L) {
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
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((nh) this).field_j >= ((nh) this).field_e) {
                            statePc = 36;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (-1 > (param3 ^ -1)) {
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
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9_int = param0 - -(int)(((nh) this).field_e - ((nh) this).field_j);
                        if (var9_int <= param0 - -param3) {
                            statePc = 34;
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
                        var9_int = param3 + param0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 56;
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
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param3--;
                        param0++;
                        param1[param0] = (byte) 0;
                        ((nh) this).field_j = ((nh) this).field_j + 1L;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = -1L;
                        if ((var5_long ^ -1L) < (((nh) this).field_e ^ -1L)) {
                            statePc = 39;
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
                        if (((nh) this).field_e >= var5_long - -(long)var8) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = ((nh) this).field_e;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((((nh) this).field_e ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var5_long ^ -1L) > ((long)((nh) this).field_c + ((nh) this).field_e ^ -1L)) {
                            statePc = 42;
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
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 56;
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
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var11 = -1L;
                        if ((long)((nh) this).field_c + ((nh) this).field_e <= var5_long) {
                            statePc = 46;
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
                        if (((long)var8 + var5_long ^ -1L) <= ((long)((nh) this).field_c + ((nh) this).field_e ^ -1L)) {
                            statePc = 50;
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
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (((nh) this).field_e >= (long)var8 + var5_long) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (((long)((nh) this).field_c + ((nh) this).field_e ^ -1L) <= (var5_long + (long)var8 ^ -1L)) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var11 = ((nh) this).field_e - -(long)((nh) this).field_c;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var9 <= -1L) {
                            statePc = 57;
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
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var13 = (int)(var11 - var9);
                        an.a(((nh) this).field_d, (int)(-((nh) this).field_e + var9), param1, var7 + (int)(-var5_long + var9), var13);
                        if ((var11 ^ -1L) >= (((nh) this).field_j ^ -1L)) {
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
                        param3 = (int)((long)param3 - (-((nh) this).field_j + var11));
                        ((nh) this).field_j = var11;
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
                    ((nh) this).field_b = -1L;
                    throw var5;
                }
                case 57: {
                    if ((param3 ^ -1) < -1) {
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

    final void c(byte param0) throws IOException {
        this.b((byte) -99);
        ((nh) this).field_h.a(-82);
        if (param0 < 113) {
            field_l = null;
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
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
                    var10 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((((nh) this).field_n ^ -1L) <= (((nh) this).field_j - -(long)param3 ^ -1L)) {
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
                        ((nh) this).field_n = (long)param3 + ((nh) this).field_j;
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
                        if (-1L == ((nh) this).field_e) {
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
                        if ((((nh) this).field_j ^ -1L) > (((nh) this).field_e ^ -1L)) {
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
                        if ((((nh) this).field_j ^ -1L) < (((nh) this).field_e - -(long)((nh) this).field_c ^ -1L)) {
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
                        this.b((byte) -120);
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
                        if (0L == (((nh) this).field_e ^ -1L)) {
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
                        if (((nh) this).field_j + (long)param3 <= ((nh) this).field_e - -(long)((nh) this).field_d.length) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5_int = (int)((long)((nh) this).field_d.length + (((nh) this).field_e + -((nh) this).field_j));
                        an.a(param0, param2, ((nh) this).field_d, (int)(((nh) this).field_j - ((nh) this).field_e), var5_int);
                        param2 = param2 + var5_int;
                        param3 = param3 - var5_int;
                        ((nh) this).field_j = ((nh) this).field_j + (long)var5_int;
                        ((nh) this).field_c = ((nh) this).field_d.length;
                        this.b((byte) -15);
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
                        if (((nh) this).field_d.length < param3) {
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
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((((nh) this).field_j ^ -1L) == (((nh) this).field_b ^ -1L)) {
                            statePc = 15;
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
                        ((nh) this).field_h.a(((nh) this).field_j, 47);
                        ((nh) this).field_b = ((nh) this).field_j;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((nh) this).field_h.a(param0, 83, param2, param3);
                        ((nh) this).field_b = ((nh) this).field_b + (long)param3;
                        if (((nh) this).field_b <= ((nh) this).field_k) {
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
                        ((nh) this).field_k = ((nh) this).field_b;
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
                        var5_long = -1L;
                        if ((((nh) this).field_o ^ -1L) < (((nh) this).field_j ^ -1L)) {
                            statePc = 20;
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
                        if (((nh) this).field_j >= ((nh) this).field_o + (long)((nh) this).field_m) {
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
                        var5_long = ((nh) this).field_j;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (((nh) this).field_o < ((nh) this).field_j) {
                            statePc = 24;
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
                        if (((nh) this).field_o < (long)param3 + ((nh) this).field_j) {
                            statePc = 23;
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
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5_long = ((nh) this).field_o;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7 = -1L;
                        if (((nh) this).field_o >= ((nh) this).field_j - -(long)param3) {
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
                        if ((long)((nh) this).field_m + ((nh) this).field_o >= (long)param3 + ((nh) this).field_j) {
                            statePc = 31;
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
                        if ((long)((nh) this).field_m + ((nh) this).field_o <= ((nh) this).field_j) {
                            statePc = 32;
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
                        if ((((nh) this).field_o - -(long)((nh) this).field_m ^ -1L) >= ((long)param3 + ((nh) this).field_j ^ -1L)) {
                            statePc = 30;
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
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7 = ((nh) this).field_o - -(long)((nh) this).field_m;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var7 = ((nh) this).field_j + (long)param3;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((var5_long ^ -1L) >= 0L) {
                            statePc = 36;
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
                        if (var7 > var5_long) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = (int)(-var5_long + var7);
                        an.a(param0, (int)(var5_long + ((long)param2 + -((nh) this).field_j)), ((nh) this).field_g, (int)(-((nh) this).field_o + var5_long), var9);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ((nh) this).field_j = ((nh) this).field_j + (long)param3;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return;
                }
                case 38: {
                    try {
                        if (param1 > 91) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        field_f = null;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (param3 <= 0) {
                            statePc = 49;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((((nh) this).field_e ^ -1L) == 0L) {
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
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((nh) this).field_e = ((nh) this).field_j;
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
                        an.a(param0, param2, ((nh) this).field_d, (int)(((nh) this).field_j - ((nh) this).field_e), param3);
                        ((nh) this).field_j = ((nh) this).field_j + (long)param3;
                        if ((((nh) this).field_j + -((nh) this).field_e ^ -1L) < ((long)((nh) this).field_c ^ -1L)) {
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
                        ((nh) this).field_c = (int)(-((nh) this).field_e + ((nh) this).field_j);
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
                    ((nh) this).field_b = -1L;
                    throw var5;
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, int param1) {
        if (param0 != 12) {
          return;
        } else {
          L0: {
            qk.field_i = 3 & param1 >> -171891708;
            wh.field_d = (13 & param1) >> -1689619070;
            if (2 >= qk.field_i) {
              break L0;
            } else {
              qk.field_i = 2;
              break L0;
            }
          }
          L1: {
            wl.field_o = 3 & param1;
            if (wh.field_d <= 2) {
              break L1;
            } else {
              wh.field_d = 2;
              break L1;
            }
          }
          L2: {
            if (-3 <= (wl.field_o ^ -1)) {
              break L2;
            } else {
              wl.field_o = 2;
              break L2;
            }
          }
          return;
        }
    }

    nh(hf param0, int param1, int param2) throws IOException {
        ((nh) this).field_o = -1L;
        ((nh) this).field_e = -1L;
        ((nh) this).field_c = 0;
        ((nh) this).field_h = param0;
        ((nh) this).field_k = param0.a((byte) -50);
        ((nh) this).field_n = param0.a((byte) -50);
        ((nh) this).field_g = new byte[param1];
        ((nh) this).field_j = 0L;
        ((nh) this).field_d = new byte[param2];
    }

    final void a(byte[] param0, byte param1) throws IOException {
        ((nh) this).a(0, param0, 741, param0.length);
        int var3 = 38 / ((param1 - 70) / 44);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new qm(0, 2, 2, 1);
        field_f = "Show all lobby chat";
        field_l = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
