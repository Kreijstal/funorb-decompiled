/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ph {
    private long field_d;
    private int field_a;
    private ml field_b;
    static float[] field_c;
    static String field_k;
    private long field_i;
    private int field_f;
    private byte[] field_e;
    static float[] field_n;
    private byte[] field_h;
    private long field_m;
    private long field_g;
    private long field_j;
    private long field_l;

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param0 == -16) {
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((ph) this).field_l != -1L) {
            L2: {
              if (((ph) this).field_j == ((ph) this).field_l) {
                break L2;
              } else {
                ((ph) this).field_b.a(param0 ^ -16, ((ph) this).field_l);
                ((ph) this).field_j = ((ph) this).field_l;
                break L2;
              }
            }
            L3: {
              ((ph) this).field_b.a(0, 0, ((ph) this).field_f, ((ph) this).field_e);
              ((ph) this).field_j = ((ph) this).field_j + (long)((ph) this).field_f;
              if ((((ph) this).field_j ^ -1L) >= (((ph) this).field_i ^ -1L)) {
                break L3;
              } else {
                ((ph) this).field_i = ((ph) this).field_j;
                break L3;
              }
            }
            L4: {
              L5: {
                var2 = -1L;
                var4 = -1L;
                if (((ph) this).field_l < ((ph) this).field_m) {
                  break L5;
                } else {
                  if ((((ph) this).field_m - -(long)((ph) this).field_a ^ -1L) < (((ph) this).field_l ^ -1L)) {
                    var2 = ((ph) this).field_l;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (((ph) this).field_l > ((ph) this).field_m) {
                break L4;
              } else {
                if (((long)((ph) this).field_f + ((ph) this).field_l ^ -1L) >= (((ph) this).field_m ^ -1L)) {
                  break L4;
                } else {
                  var2 = ((ph) this).field_m;
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                if ((((ph) this).field_l - -(long)((ph) this).field_f ^ -1L) >= (((ph) this).field_m ^ -1L)) {
                  break L7;
                } else {
                  if (((ph) this).field_l - -(long)((ph) this).field_f <= ((ph) this).field_m - -(long)((ph) this).field_a) {
                    var4 = (long)((ph) this).field_f + ((ph) this).field_l;
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if ((long)((ph) this).field_a + ((ph) this).field_m <= ((ph) this).field_l) {
                break L6;
              } else {
                if (((long)((ph) this).field_a + ((ph) this).field_m ^ -1L) < ((long)((ph) this).field_f + ((ph) this).field_l ^ -1L)) {
                  break L6;
                } else {
                  var4 = ((ph) this).field_m + (long)((ph) this).field_a;
                  break L6;
                }
              }
            }
            L8: {
              if (0L <= (var2 ^ -1L)) {
                break L8;
              } else {
                if ((var4 ^ -1L) >= (var2 ^ -1L)) {
                  break L8;
                } else {
                  var6 = (int)(var4 - var2);
                  lua.a(((ph) this).field_e, (int)(-((ph) this).field_l + var2), ((ph) this).field_h, (int)(-((ph) this).field_m + var2), var6);
                  break L8;
                }
              }
            }
            ((ph) this).field_f = 0;
            ((ph) this).field_l = -1L;
            break L1;
          } else {
            break L1;
          }
        }
    }

    final void b(byte param0) throws IOException {
        this.a((byte) -16);
        ((ph) this).field_b.b((byte) -127);
        if (param0 >= -14) {
            ph.a(false);
        }
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        ((ph) this).field_a = 0;
        if (!(((ph) this).field_g == ((ph) this).field_j)) {
            ((ph) this).field_b.a(0, ((ph) this).field_g);
            ((ph) this).field_j = ((ph) this).field_g;
        }
        ((ph) this).field_m = ((ph) this).field_g;
        while (((ph) this).field_a < ((ph) this).field_h.length) {
            var2 = ((ph) this).field_h.length + -((ph) this).field_a;
            if ((var2 ^ -1) < -200000001) {
                var2 = 200000000;
            }
            var3 = ((ph) this).field_b.a((byte) 69, ((ph) this).field_h, var2, ((ph) this).field_a);
            // if_icmpeq L136
            ((ph) this).field_j = ((ph) this).field_j + (long)var3;
            ((ph) this).field_a = ((ph) this).field_a + var3;
        }
        if (param0 != -1) {
            ph.a(false);
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        ((ph) this).a(param0, param0.length, param1, (byte) -112);
    }

    final long b(boolean param0) {
        if (!param0) {
            return -88L;
        }
        return ((ph) this).field_d;
    }

    public static void a(boolean param0) {
        field_n = null;
        field_k = null;
        field_c = null;
        if (!param0) {
            ph.a(false);
        }
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
                    var10 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((ph) this).field_g - -(long)param3 > ((ph) this).field_d) {
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
                        ((ph) this).field_d = (long)param3 + ((ph) this).field_g;
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
                        if (-1L == ((ph) this).field_l) {
                            statePc = 10;
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
                        if ((((ph) this).field_g ^ -1L) <= (((ph) this).field_l ^ -1L)) {
                            statePc = 7;
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
                        this.a((byte) -16);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((long)((ph) this).field_f + ((ph) this).field_l ^ -1L) <= (((ph) this).field_g ^ -1L)) {
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
                        this.a((byte) -16);
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
                        if ((((ph) this).field_l ^ -1L) == 0L) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((((ph) this).field_l - -(long)((ph) this).field_e.length ^ -1L) > ((long)param3 + ((ph) this).field_g ^ -1L)) {
                            statePc = 13;
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5_int = (int)((long)((ph) this).field_e.length - (-((ph) this).field_l + ((ph) this).field_g));
                        lua.a(param0, param1, ((ph) this).field_e, (int)(((ph) this).field_g - ((ph) this).field_l), var5_int);
                        ((ph) this).field_g = ((ph) this).field_g + (long)var5_int;
                        param1 = param1 + var5_int;
                        param3 = param3 - var5_int;
                        ((ph) this).field_f = ((ph) this).field_e.length;
                        this.a((byte) -16);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((ph) this).field_e.length >= param3) {
                            statePc = 39;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((ph) this).field_g != ((ph) this).field_j) {
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
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((ph) this).field_b.a(0, ((ph) this).field_g);
                        ((ph) this).field_j = ((ph) this).field_g;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((ph) this).field_b.a(param1, 0, param3, param0);
                        ((ph) this).field_j = ((ph) this).field_j + (long)param3;
                        if ((((ph) this).field_i ^ -1L) <= (((ph) this).field_j ^ -1L)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((ph) this).field_i = ((ph) this).field_j;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5_long = -1L;
                        var7 = -1L;
                        if (((ph) this).field_g < ((ph) this).field_m) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((((ph) this).field_m - -(long)((ph) this).field_a ^ -1L) >= (((ph) this).field_g ^ -1L)) {
                            statePc = 23;
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
                        var5_long = ((ph) this).field_g;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (((ph) this).field_m < ((ph) this).field_g) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((((ph) this).field_m ^ -1L) > (((ph) this).field_g + (long)param3 ^ -1L)) {
                            statePc = 26;
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
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5_long = ((ph) this).field_m;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((ph) this).field_m ^ -1L) <= ((long)param3 + ((ph) this).field_g ^ -1L)) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((((ph) this).field_m + (long)((ph) this).field_a ^ -1L) > ((long)param3 + ((ph) this).field_g ^ -1L)) {
                            statePc = 30;
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
                        var7 = ((ph) this).field_g - -(long)param3;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (((long)((ph) this).field_a + ((ph) this).field_m ^ -1L) >= (((ph) this).field_g ^ -1L)) {
                            statePc = 34;
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
                        if (((long)param3 + ((ph) this).field_g ^ -1L) <= ((long)((ph) this).field_a + ((ph) this).field_m ^ -1L)) {
                            statePc = 33;
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
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var7 = ((ph) this).field_m - -(long)((ph) this).field_a;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var5_long ^ -1L) >= 0L) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((var7 ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = (int)(var7 + -var5_long);
                        lua.a(param0, (int)((long)param1 + (var5_long - ((ph) this).field_g)), ((ph) this).field_h, (int)(-((ph) this).field_m + var5_long), var9);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((ph) this).field_g = ((ph) this).field_g + (long)param3;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return;
                }
                case 39: {
                    try {
                        if (-1 > (param3 ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (((ph) this).field_l != -1L) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((ph) this).field_l = ((ph) this).field_g;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        lua.a(param0, param1, ((ph) this).field_e, (int)(-((ph) this).field_l + ((ph) this).field_g), param3);
                        ((ph) this).field_g = ((ph) this).field_g + (long)param3;
                        if ((-((ph) this).field_l + ((ph) this).field_g ^ -1L) >= ((long)((ph) this).field_f ^ -1L)) {
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
                        ((ph) this).field_f = (int)(((ph) this).field_g + -((ph) this).field_l);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    return;
                }
                case 46: {
                    try {
                        if (param2 == -17) {
                            statePc = 50;
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
                        ((ph) this).field_b = null;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    var5 = (IOException) (Object) caughtException;
                    ((ph) this).field_j = -1L;
                    throw var5;
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
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
                    var14 = TombRacer.field_G ? 1 : 0;
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
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param1 + param2 + -param0.length);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((((ph) this).field_l ^ -1L) == 0L) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((ph) this).field_g ^ -1L) > (((ph) this).field_l ^ -1L)) {
                            statePc = 9;
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
                        if ((((ph) this).field_l + (long)((ph) this).field_f ^ -1L) <= ((long)param1 + ((ph) this).field_g ^ -1L)) {
                            statePc = 7;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        lua.a(((ph) this).field_e, (int)(-((ph) this).field_l + ((ph) this).field_g), param0, param2, param1);
                        ((ph) this).field_g = ((ph) this).field_g + (long)param1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        if (param3 <= -22) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_long = ((ph) this).field_g;
                        var7 = param2;
                        var8 = param1;
                        if (((ph) this).field_m > ((ph) this).field_g) {
                            statePc = 16;
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
                        if (((ph) this).field_g >= ((ph) this).field_m + (long)((ph) this).field_a) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = (int)(-((ph) this).field_g - -((ph) this).field_m + (long)((ph) this).field_a);
                        if (var9_int <= param1) {
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
                        var9_int = param1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        lua.a(((ph) this).field_h, (int)(-((ph) this).field_m + ((ph) this).field_g), param0, param2, var9_int);
                        ((ph) this).field_g = ((ph) this).field_g + (long)var9_int;
                        param2 = param2 + var9_int;
                        param1 = param1 - var9_int;
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
                        if (((ph) this).field_h.length < param1) {
                            statePc = 23;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param1 > 0) {
                            statePc = 19;
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
                        statePc = 27;
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
                        var9_int = param1;
                        if (((ph) this).field_a < var9_int) {
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
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9_int = ((ph) this).field_a;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        lua.a(((ph) this).field_h, 0, param0, param2, var9_int);
                        param2 = param2 + var9_int;
                        param1 = param1 - var9_int;
                        ((ph) this).field_g = ((ph) this).field_g + (long)var9_int;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((ph) this).field_b.a(0, ((ph) this).field_g);
                        ((ph) this).field_j = ((ph) this).field_g;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (param1 <= 0) {
                            statePc = 27;
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
                        var9_int = ((ph) this).field_b.a((byte) 80, param0, param1, param2);
                        if (var9_int == -1) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param2 = param2 + var9_int;
                        ((ph) this).field_j = ((ph) this).field_j + (long)var9_int;
                        ((ph) this).field_g = ((ph) this).field_g + (long)var9_int;
                        param1 = param1 - var9_int;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (((ph) this).field_l != -1L) {
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
                        if (((ph) this).field_g >= ((ph) this).field_l) {
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
                        if (param1 > 0) {
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
                        var9_int = param2 - -(int)(((ph) this).field_l - ((ph) this).field_g);
                        if (param1 + param2 >= var9_int) {
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
                        var9_int = param2 - -param1;
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
                        if (var9_int <= param2) {
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
                        param2++;
                        param0[param2] = (byte) 0;
                        param1--;
                        ((ph) this).field_g = ((ph) this).field_g + 1L;
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
                        var11 = -1L;
                        if (var5_long > ((ph) this).field_l) {
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
                        if ((((ph) this).field_l ^ -1L) > (var5_long + (long)var8 ^ -1L)) {
                            statePc = 43;
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
                        if (var5_long < ((ph) this).field_l) {
                            statePc = 44;
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
                        if ((var5_long ^ -1L) > ((long)((ph) this).field_f + ((ph) this).field_l ^ -1L)) {
                            statePc = 42;
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
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var9 = var5_long;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var9 = ((ph) this).field_l;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var5_long >= ((ph) this).field_l - -(long)((ph) this).field_f) {
                            statePc = 47;
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
                        if (((long)var8 + var5_long ^ -1L) > ((long)((ph) this).field_f + ((ph) this).field_l ^ -1L)) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11 = (long)((ph) this).field_f + ((ph) this).field_l;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var5_long + (long)var8 <= ((ph) this).field_l) {
                            statePc = 51;
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
                        if (((long)((ph) this).field_f + ((ph) this).field_l ^ -1L) <= (var5_long + (long)var8 ^ -1L)) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var11 = var5_long - -(long)var8;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (-1L >= var9) {
                            statePc = 58;
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
                        if ((var9 ^ -1L) > (var11 ^ -1L)) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var13 = (int)(var11 + -var9);
                        lua.a(((ph) this).field_e, (int)(-((ph) this).field_l + var9), param0, var7 - -(int)(-var5_long + var9), var13);
                        if (((ph) this).field_g >= var11) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        param1 = (int)((long)param1 - (var11 + -((ph) this).field_g));
                        ((ph) this).field_g = var11;
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
                    ((ph) this).field_j = -1L;
                    throw var5;
                }
                case 58: {
                    if (0 < param1) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    throw new EOFException();
                }
                case 61: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ph(ml param0, int param1, int param2) throws IOException {
        ((ph) this).field_m = -1L;
        ((ph) this).field_l = -1L;
        ((ph) this).field_f = 0;
        ((ph) this).field_b = param0;
        ((ph) this).field_i = param0.a(false);
        ((ph) this).field_d = param0.a(false);
        ((ph) this).field_g = 0L;
        ((ph) this).field_e = new byte[param2];
        ((ph) this).field_h = new byte[param1];
    }

    final void a(byte param0, long param1) throws IOException {
        if (!(param1 >= 0L)) {
            throw new IOException();
        }
        ((ph) this).field_g = param1;
        int var4 = -100 % ((param0 - -58) / 50);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_c = new float[16384];
        field_k = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        field_n = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; var2 < 16384; var2++) {
            field_n[var2] = (float)Math.sin(var0 * (double)var2);
            field_c[var2] = (float)Math.cos(var0 * (double)var2);
        }
    }
}
