/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gdb {
    static asb field_i;
    static String field_d;
    private byte[] field_h;
    private long field_a;
    private int field_j;
    private long field_c;
    private byte[] field_f;
    private long field_e;
    private au field_m;
    private long field_b;
    private long field_g;
    private long field_k;
    private int field_l;

    final void a(int param0, byte[] param1) throws IOException {
        if (param0 >= -80) {
        }
        ((gdb) this).a(param1, param1.length, 0, -30541);
    }

    final long b(int param0) {
        if (param0 != 0) {
            ((gdb) this).field_m = null;
        }
        return ((gdb) this).field_b;
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 > -41) {
            field_d = null;
        }
        field_d = null;
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (param0 != -200000001) {
        }
        ((gdb) this).field_l = 0;
        if (((gdb) this).field_a != ((gdb) this).field_c) {
            ((gdb) this).field_m.a((byte) -38, ((gdb) this).field_a);
            ((gdb) this).field_c = ((gdb) this).field_a;
        }
        ((gdb) this).field_e = ((gdb) this).field_a;
        while (((gdb) this).field_h.length > ((gdb) this).field_l) {
            var2 = -((gdb) this).field_l + ((gdb) this).field_h.length;
            if (-200000001 > (var2 ^ -1)) {
                var2 = 200000000;
            }
            var3 = ((gdb) this).field_m.a((byte) -60, var2, ((gdb) this).field_h, ((gdb) this).field_l);
            // ifeq L154
            ((gdb) this).field_l = ((gdb) this).field_l + var3;
            ((gdb) this).field_c = ((gdb) this).field_c + (long)var3;
        }
    }

    final void a(int param0, long param1) throws IOException {
        if ((param1 ^ -1L) > -1L) {
          throw new IOException();
        } else {
          L0: {
            ((gdb) this).field_a = param1;
            if (param0 == 0) {
              break L0;
            } else {
              ((gdb) this).field_a = 43L;
              break L0;
            }
          }
          return;
        }
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
                    var10 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((long)param0 + ((gdb) this).field_a > ((gdb) this).field_b) {
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
                        ((gdb) this).field_b = ((gdb) this).field_a - -(long)param0;
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
                        if (param2 <= -66) {
                            statePc = 6;
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
                        gdb.b(34, -32L);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (-1L == ((gdb) this).field_g) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((((gdb) this).field_g ^ -1L) >= (((gdb) this).field_a ^ -1L)) {
                            statePc = 9;
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
                        this.a((byte) -123);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((((gdb) this).field_a ^ -1L) >= ((long)((gdb) this).field_j + ((gdb) this).field_g ^ -1L)) {
                            statePc = 12;
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
                        this.a((byte) -123);
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
                        if (((gdb) this).field_g == -1L) {
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
                        if ((((gdb) this).field_a + (long)param0 ^ -1L) >= (((gdb) this).field_g + (long)((gdb) this).field_f.length ^ -1L)) {
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
                        var5_int = (int)((long)((gdb) this).field_f.length + -((gdb) this).field_a + ((gdb) this).field_g);
                        cua.a(param3, param1, ((gdb) this).field_f, (int)(((gdb) this).field_a + -((gdb) this).field_g), var5_int);
                        ((gdb) this).field_a = ((gdb) this).field_a + (long)var5_int;
                        param0 = param0 - var5_int;
                        param1 = param1 + var5_int;
                        ((gdb) this).field_j = ((gdb) this).field_f.length;
                        this.a((byte) -120);
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
                        if (param0 <= ((gdb) this).field_f.length) {
                            statePc = 40;
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
                        if (((gdb) this).field_a == ((gdb) this).field_c) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((gdb) this).field_m.a((byte) -38, ((gdb) this).field_a);
                        ((gdb) this).field_c = ((gdb) this).field_a;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((gdb) this).field_m.a(param0, -14394, param3, param1);
                        ((gdb) this).field_c = ((gdb) this).field_c + (long)param0;
                        if ((((gdb) this).field_k ^ -1L) <= (((gdb) this).field_c ^ -1L)) {
                            statePc = 20;
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
                        ((gdb) this).field_k = ((gdb) this).field_c;
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
                        var7 = -1L;
                        if (((gdb) this).field_e > ((gdb) this).field_a) {
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
                        if ((long)((gdb) this).field_l + ((gdb) this).field_e > ((gdb) this).field_a) {
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
                        if ((((gdb) this).field_a ^ -1L) < (((gdb) this).field_e ^ -1L)) {
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
                        if ((((gdb) this).field_e ^ -1L) > (((gdb) this).field_a + (long)param0 ^ -1L)) {
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
                        var5_long = ((gdb) this).field_e;
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
                        var5_long = ((gdb) this).field_a;
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
                        if ((long)param0 + ((gdb) this).field_a <= ((gdb) this).field_e) {
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
                        if (((gdb) this).field_a - -(long)param0 <= ((gdb) this).field_e - -(long)((gdb) this).field_l) {
                            statePc = 34;
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
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((((gdb) this).field_a ^ -1L) <= (((gdb) this).field_e + (long)((gdb) this).field_l ^ -1L)) {
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
                        if ((((gdb) this).field_e - -(long)((gdb) this).field_l ^ -1L) < (((gdb) this).field_a + (long)param0 ^ -1L)) {
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
                        var7 = (long)((gdb) this).field_l + ((gdb) this).field_e;
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
                        var7 = ((gdb) this).field_a - -(long)param0;
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
                        if ((var5_long ^ -1L) >= 0L) {
                            statePc = 38;
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
                        if (var7 <= var5_long) {
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
                        var9 = (int)(-var5_long + var7);
                        cua.a(param3, (int)(var5_long + (long)param1 + -((gdb) this).field_a), ((gdb) this).field_h, (int)(var5_long + -((gdb) this).field_e), var9);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ((gdb) this).field_a = ((gdb) this).field_a + (long)param0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return;
                }
                case 40: {
                    try {
                        if (param0 <= 0) {
                            statePc = 48;
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
                        if (-1L != ((gdb) this).field_g) {
                            statePc = 43;
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
                        ((gdb) this).field_g = ((gdb) this).field_a;
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
                        cua.a(param3, param1, ((gdb) this).field_f, (int)(-((gdb) this).field_g + ((gdb) this).field_a), param0);
                        ((gdb) this).field_a = ((gdb) this).field_a + (long)param0;
                        if (((long)((gdb) this).field_j ^ -1L) > (((gdb) this).field_a - ((gdb) this).field_g ^ -1L)) {
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
                        ((gdb) this).field_j = (int)(((gdb) this).field_a - ((gdb) this).field_g);
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
                    ((gdb) this).field_c = -1L;
                    throw var5;
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) throws IOException {
        this.a((byte) -123);
        if (!param0) {
            gdb.b(-67, 17L);
        }
        ((gdb) this).field_m.a(false);
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (param0 <= -51) {
            break L0;
          } else {
            field_i = null;
            break L0;
          }
        }
        L1: {
          if (-1L == ((gdb) this).field_g) {
            break L1;
          } else {
            L2: {
              if ((((gdb) this).field_g ^ -1L) == (((gdb) this).field_c ^ -1L)) {
                break L2;
              } else {
                ((gdb) this).field_m.a((byte) -38, ((gdb) this).field_g);
                ((gdb) this).field_c = ((gdb) this).field_g;
                break L2;
              }
            }
            L3: {
              ((gdb) this).field_m.a(((gdb) this).field_j, -14394, ((gdb) this).field_f, 0);
              ((gdb) this).field_c = ((gdb) this).field_c + (long)((gdb) this).field_j;
              if (((gdb) this).field_k >= ((gdb) this).field_c) {
                break L3;
              } else {
                ((gdb) this).field_k = ((gdb) this).field_c;
                break L3;
              }
            }
            L4: {
              L5: {
                var2 = -1L;
                var4 = -1L;
                if (((gdb) this).field_g < ((gdb) this).field_e) {
                  break L5;
                } else {
                  if (((gdb) this).field_g < (long)((gdb) this).field_l + ((gdb) this).field_e) {
                    var2 = ((gdb) this).field_g;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if ((((gdb) this).field_e ^ -1L) > (((gdb) this).field_g ^ -1L)) {
                break L4;
              } else {
                if ((((gdb) this).field_e ^ -1L) > (((gdb) this).field_g - -(long)((gdb) this).field_j ^ -1L)) {
                  var2 = ((gdb) this).field_e;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                if (((gdb) this).field_g + (long)((gdb) this).field_j <= ((gdb) this).field_e) {
                  break L7;
                } else {
                  if (((long)((gdb) this).field_l + ((gdb) this).field_e ^ -1L) > ((long)((gdb) this).field_j + ((gdb) this).field_g ^ -1L)) {
                    break L7;
                  } else {
                    var4 = ((gdb) this).field_g - -(long)((gdb) this).field_j;
                    break L6;
                  }
                }
              }
              if (((gdb) this).field_g >= (long)((gdb) this).field_l + ((gdb) this).field_e) {
                break L6;
              } else {
                if (((long)((gdb) this).field_l + ((gdb) this).field_e ^ -1L) < (((gdb) this).field_g + (long)((gdb) this).field_j ^ -1L)) {
                  break L6;
                } else {
                  var4 = (long)((gdb) this).field_l + ((gdb) this).field_e;
                  break L6;
                }
              }
            }
            L8: {
              if (0L <= (var2 ^ -1L)) {
                break L8;
              } else {
                if (var4 <= var2) {
                  break L8;
                } else {
                  var6 = (int)(var4 + -var2);
                  cua.a(((gdb) this).field_f, (int)(-((gdb) this).field_g + var2), ((gdb) this).field_h, (int)(-((gdb) this).field_e + var2), var6);
                  break L8;
                }
              }
            }
            ((gdb) this).field_j = 0;
            ((gdb) this).field_g = -1L;
            break L1;
          }
        }
    }

    final static void b(int param0, long param1) {
        int var3 = -66 / ((param0 - -8) / 38);
        if (!(param1 > 0L)) {
            return;
        }
        if (param1 % 10L == 0L) {
            hg.a((byte) 90, -1L + param1);
            hg.a((byte) 90, 1L);
        } else {
            hg.a((byte) 90, param1);
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
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
                    var14 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0.length >= param2 - -param1) {
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
                        throw new ArrayIndexOutOfBoundsException(-param0.length + param1 + param2);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1L == ((gdb) this).field_g) {
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
                        if ((((gdb) this).field_a ^ -1L) > (((gdb) this).field_g ^ -1L)) {
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
                        if (((long)((gdb) this).field_j + ((gdb) this).field_g ^ -1L) <= (((gdb) this).field_a - -(long)param1 ^ -1L)) {
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
                        cua.a(((gdb) this).field_f, (int)(((gdb) this).field_a + -((gdb) this).field_g), param0, param2, param1);
                        ((gdb) this).field_a = ((gdb) this).field_a + (long)param1;
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
                        var5_long = ((gdb) this).field_a;
                        var7 = param2;
                        var8 = param1;
                        if ((((gdb) this).field_e ^ -1L) < (((gdb) this).field_a ^ -1L)) {
                            statePc = 14;
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
                        if ((long)((gdb) this).field_l + ((gdb) this).field_e <= ((gdb) this).field_a) {
                            statePc = 14;
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
                        var9_int = (int)((long)((gdb) this).field_l - ((gdb) this).field_a + ((gdb) this).field_e);
                        if (var9_int <= param1) {
                            statePc = 13;
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
                        var9_int = param1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        cua.a(((gdb) this).field_h, (int)(-((gdb) this).field_e + ((gdb) this).field_a), param0, param2, var9_int);
                        param2 = param2 + var9_int;
                        param1 = param1 - var9_int;
                        ((gdb) this).field_a = ((gdb) this).field_a + (long)var9_int;
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
                        if (param1 > ((gdb) this).field_h.length) {
                            statePc = 20;
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
                        if ((param1 ^ -1) < -1) {
                            statePc = 17;
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
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.c(param3 + -199969460);
                        var9_int = param1;
                        if (var9_int <= ((gdb) this).field_l) {
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
                        var9_int = ((gdb) this).field_l;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        cua.a(((gdb) this).field_h, 0, param0, param2, var9_int);
                        param2 = param2 + var9_int;
                        param1 = param1 - var9_int;
                        ((gdb) this).field_a = ((gdb) this).field_a + (long)var9_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((gdb) this).field_m.a((byte) -38, ((gdb) this).field_a);
                        ((gdb) this).field_c = ((gdb) this).field_a;
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
                        if (-1 <= (param1 ^ -1)) {
                            statePc = 25;
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
                        var9_int = ((gdb) this).field_m.a((byte) -60, param1, param0, param2);
                        if (-1 != var9_int) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((gdb) this).field_c = ((gdb) this).field_c + (long)var9_int;
                        param2 = param2 + var9_int;
                        ((gdb) this).field_a = ((gdb) this).field_a + (long)var9_int;
                        param1 = param1 - var9_int;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (0L == (((gdb) this).field_g ^ -1L)) {
                            statePc = 52;
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
                        if ((((gdb) this).field_g ^ -1L) >= (((gdb) this).field_a ^ -1L)) {
                            statePc = 33;
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
                        if (0 >= param1) {
                            statePc = 33;
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
                        var9_int = (int)(-((gdb) this).field_a + ((gdb) this).field_g) + param2;
                        if (param2 + param1 < var9_int) {
                            statePc = 30;
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
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 55;
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
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param2 >= var9_int) {
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
                        param2++;
                        param0[param2] = (byte) 0;
                        param1--;
                        ((gdb) this).field_a = ((gdb) this).field_a + 1L;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if ((((gdb) this).field_g ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 36;
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
                        if (((gdb) this).field_g >= (long)var8 + var5_long) {
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
                        var9 = ((gdb) this).field_g;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((((gdb) this).field_g ^ -1L) < (var5_long ^ -1L)) {
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
                        if (((long)((gdb) this).field_j + ((gdb) this).field_g ^ -1L) >= (var5_long ^ -1L)) {
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
                        var9 = var5_long;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((var5_long ^ -1L) <= (((gdb) this).field_g + (long)((gdb) this).field_j ^ -1L)) {
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
                        if ((long)((gdb) this).field_j + ((gdb) this).field_g > var5_long - -(long)var8) {
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
                        var11 = ((gdb) this).field_g - -(long)((gdb) this).field_j;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var5_long + (long)var8 <= ((gdb) this).field_g) {
                            statePc = 46;
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
                        if (((long)var8 + var5_long ^ -1L) >= ((long)((gdb) this).field_j + ((gdb) this).field_g ^ -1L)) {
                            statePc = 45;
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
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (0L <= (var9 ^ -1L)) {
                            statePc = 52;
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
                        if ((var9 ^ -1L) > (var11 ^ -1L)) {
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
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var13 = (int)(-var9 + var11);
                        cua.a(((gdb) this).field_f, (int)(-((gdb) this).field_g + var9), param0, var7 + (int)(var9 + -var5_long), var13);
                        if ((((gdb) this).field_a ^ -1L) > (var11 ^ -1L)) {
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
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        param1 = (int)((long)param1 - (var11 + -((gdb) this).field_a));
                        ((gdb) this).field_a = var11;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (param3 == -30541) {
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
                        ((gdb) this).field_m = null;
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
                    ((gdb) this).field_c = -1L;
                    throw var5;
                }
                case 56: {
                    if (0 < param1) {
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

    gdb(au param0, int param1, int param2) throws IOException {
        ((gdb) this).field_j = 0;
        ((gdb) this).field_e = -1L;
        ((gdb) this).field_g = -1L;
        ((gdb) this).field_m = param0;
        ((gdb) this).field_k = param0.a(1);
        ((gdb) this).field_b = param0.a(1);
        ((gdb) this).field_f = new byte[param2];
        ((gdb) this).field_h = new byte[param1];
        ((gdb) this).field_a = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Accept unrated rematch";
    }
}
