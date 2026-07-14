/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class td {
    static ai field_o;
    private long field_h;
    static String field_j;
    private long field_d;
    private byte[] field_g;
    private byte[] field_i;
    private long field_l;
    private long field_n;
    private cb field_b;
    static String[] field_f;
    private int field_a;
    private int field_c;
    private long field_k;
    static int field_p;
    private long field_e;
    static int field_m;

    final void a(long param0, int param1) throws IOException {
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        if (param1 != 0) {
            field_f = null;
        }
        ((td) this).field_l = param0;
    }

    private final void a(byte param0) throws IOException {
        int var2 = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        L0: {
          var2 = -79 / ((52 - param0) / 50);
          if (0L == (((td) this).field_d ^ -1L)) {
            break L0;
          } else {
            L1: {
              if (((td) this).field_h == ((td) this).field_d) {
                break L1;
              } else {
                ((td) this).field_b.a(0, ((td) this).field_d);
                ((td) this).field_h = ((td) this).field_d;
                break L1;
              }
            }
            L2: {
              ((td) this).field_b.a(0, ((td) this).field_i, 494, ((td) this).field_c);
              ((td) this).field_h = ((td) this).field_h + (long)((td) this).field_c;
              if (((td) this).field_h > ((td) this).field_k) {
                ((td) this).field_k = ((td) this).field_h;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                var5 = -1L;
                if ((((td) this).field_d ^ -1L) > (((td) this).field_e ^ -1L)) {
                  break L4;
                } else {
                  if ((((td) this).field_d ^ -1L) <= ((long)((td) this).field_a + ((td) this).field_e ^ -1L)) {
                    break L4;
                  } else {
                    var3 = ((td) this).field_d;
                    break L3;
                  }
                }
              }
              if ((((td) this).field_d ^ -1L) < (((td) this).field_e ^ -1L)) {
                break L3;
              } else {
                if (((td) this).field_d - -(long)((td) this).field_c <= ((td) this).field_e) {
                  break L3;
                } else {
                  var3 = ((td) this).field_e;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if ((long)((td) this).field_c + ((td) this).field_d <= ((td) this).field_e) {
                  break L6;
                } else {
                  if ((long)((td) this).field_c + ((td) this).field_d <= ((td) this).field_e - -(long)((td) this).field_a) {
                    var5 = (long)((td) this).field_c + ((td) this).field_d;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if ((((td) this).field_e + (long)((td) this).field_a ^ -1L) >= (((td) this).field_d ^ -1L)) {
                break L5;
              } else {
                if ((((td) this).field_d + (long)((td) this).field_c ^ -1L) <= ((long)((td) this).field_a + ((td) this).field_e ^ -1L)) {
                  var5 = ((td) this).field_e + (long)((td) this).field_a;
                  break L5;
                } else {
                  L7: {
                    if ((var3 ^ -1L) >= 0L) {
                      break L7;
                    } else {
                      if ((var3 ^ -1L) <= (var5 ^ -1L)) {
                        break L7;
                      } else {
                        var7 = (int)(-var3 + var5);
                        ug.a(((td) this).field_i, (int)(var3 - ((td) this).field_d), ((td) this).field_g, (int)(var3 - ((td) this).field_e), var7);
                        break L7;
                      }
                    }
                  }
                  ((td) this).field_d = -1L;
                  ((td) this).field_c = 0;
                  break L0;
                }
              }
            }
            L8: {
              if ((var3 ^ -1L) >= 0L) {
                break L8;
              } else {
                if ((var3 ^ -1L) <= (var5 ^ -1L)) {
                  break L8;
                } else {
                  var7 = (int)(-var3 + var5);
                  ug.a(((td) this).field_i, (int)(var3 - ((td) this).field_d), ((td) this).field_g, (int)(var3 - ((td) this).field_e), var7);
                  break L8;
                }
              }
            }
            ((td) this).field_d = -1L;
            ((td) this).field_c = 0;
            break L0;
          }
        }
    }

    final static int a(int param0, int param1, boolean param2) {
        if (null != bg.field_c) {
          L0: {
            if (param0 < nh.field_f) {
              break L0;
            } else {
              if (bg.field_c.field_u + nh.field_f <= param0) {
                break L0;
              } else {
                if (param1 < lf.field_Z) {
                  break L0;
                } else {
                  if (param1 >= lf.field_Z + bg.field_c.field_v) {
                    break L0;
                  } else {
                    return 0;
                  }
                }
              }
            }
          }
          L1: {
            if (param0 < qf.field_e) {
              break L1;
            } else {
              if (qf.field_e + bg.field_c.field_u <= param0) {
                break L1;
              } else {
                if (mf.field_d > param1) {
                  break L1;
                } else {
                  if (mf.field_d + bg.field_c.field_v <= param1) {
                    break L1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
          if (!param2) {
            return 95;
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final void a(int param0, int param1, boolean param2, byte[] param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if ((long)param1 + ((td) this).field_l > ((td) this).field_n) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((td) this).field_n = (long)param1 + ((td) this).field_l;
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
                        if (!param2) {
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
                        field_j = null;
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
                        if (0L == (((td) this).field_d ^ -1L)) {
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
                        if (((td) this).field_l >= ((td) this).field_d) {
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
                        this.a((byte) -53);
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
                        if ((((td) this).field_l ^ -1L) >= (((td) this).field_d + (long)((td) this).field_c ^ -1L)) {
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
                        this.a((byte) -53);
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
                        if (((td) this).field_d == -1L) {
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
                        if (((td) this).field_d + (long)((td) this).field_i.length >= (long)param1 + ((td) this).field_l) {
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
                        var5_int = (int)((long)((td) this).field_i.length + ((td) this).field_d + -((td) this).field_l);
                        ug.a(param3, param0, ((td) this).field_i, (int)(-((td) this).field_d + ((td) this).field_l), var5_int);
                        ((td) this).field_l = ((td) this).field_l + (long)var5_int;
                        param1 = param1 - var5_int;
                        param0 = param0 + var5_int;
                        ((td) this).field_c = ((td) this).field_i.length;
                        this.a((byte) 125);
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
                        if (((td) this).field_i.length < param1) {
                            statePc = 16;
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
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((((td) this).field_l ^ -1L) == (((td) this).field_h ^ -1L)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((td) this).field_b.a(0, ((td) this).field_l);
                        ((td) this).field_h = ((td) this).field_l;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((td) this).field_b.a(param0, param3, 494, param1);
                        ((td) this).field_h = ((td) this).field_h + (long)param1;
                        if ((((td) this).field_k ^ -1L) > (((td) this).field_h ^ -1L)) {
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
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((td) this).field_k = ((td) this).field_h;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5_long = -1L;
                        if ((((td) this).field_e ^ -1L) < (((td) this).field_l ^ -1L)) {
                            statePc = 24;
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
                        if (((td) this).field_l < (long)((td) this).field_a + ((td) this).field_e) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
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
                        if (((td) this).field_l > ((td) this).field_e) {
                            statePc = 28;
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
                        if (((long)param1 + ((td) this).field_l ^ -1L) >= (((td) this).field_e ^ -1L)) {
                            statePc = 28;
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
                        var5_long = ((td) this).field_e;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var5_long = ((td) this).field_l;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var7 = -1L;
                        if (((td) this).field_e >= (long)param1 + ((td) this).field_l) {
                            statePc = 31;
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
                        if ((((td) this).field_e - -(long)((td) this).field_a ^ -1L) <= ((long)param1 + ((td) this).field_l ^ -1L)) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((((td) this).field_e + (long)((td) this).field_a ^ -1L) >= (((td) this).field_l ^ -1L)) {
                            statePc = 35;
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
                        if (((long)param1 + ((td) this).field_l ^ -1L) > ((long)((td) this).field_a + ((td) this).field_e ^ -1L)) {
                            statePc = 35;
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
                        var7 = (long)((td) this).field_a + ((td) this).field_e;
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
                        var7 = (long)param1 + ((td) this).field_l;
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
                        if (var5_long <= -1L) {
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
                        if (var5_long < var7) {
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
                        var9 = (int)(-var5_long + var7);
                        ug.a(param3, (int)(-((td) this).field_l + ((long)param0 - -var5_long)), ((td) this).field_g, (int)(var5_long - ((td) this).field_e), var9);
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
                        ((td) this).field_l = ((td) this).field_l + (long)param1;
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
                        if (-1 <= (param1 ^ -1)) {
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
                        if (((td) this).field_d == -1L) {
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
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((td) this).field_d = ((td) this).field_l;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ug.a(param3, param0, ((td) this).field_i, (int)(((td) this).field_l + -((td) this).field_d), param1);
                        ((td) this).field_l = ((td) this).field_l + (long)param1;
                        if ((long)((td) this).field_c >= -((td) this).field_d + ((td) this).field_l) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((td) this).field_c = (int)(((td) this).field_l + -((td) this).field_d);
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
                    ((td) this).field_h = -1L;
                    throw var5;
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        ((td) this).field_a = 0;
        if ((((td) this).field_h ^ -1L) != (((td) this).field_l ^ -1L)) {
            ((td) this).field_b.a(0, ((td) this).field_l);
            ((td) this).field_h = ((td) this).field_l;
        }
        ((td) this).field_e = ((td) this).field_l;
        if (param0) {
            field_m = 126;
        }
        while (((td) this).field_a < ((td) this).field_g.length) {
            var2 = ((td) this).field_g.length + -((td) this).field_a;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            var3 = ((td) this).field_b.a(((td) this).field_g, ((td) this).field_a, var2, (byte) -93);
            // ifeq L150
            ((td) this).field_a = ((td) this).field_a + var3;
            ((td) this).field_h = ((td) this).field_h + (long)var3;
        }
    }

    public static void c(int param0) {
        field_o = null;
        field_j = null;
        if (param0 != -12539) {
            return;
        }
        field_f = null;
    }

    final static void b(int param0) {
        eh.field_j = oe.c(param0 + -35671);
        ti.field_b = new tc();
        ba.a(true, true, 2);
        if (param0 != 30000) {
            int discarded$0 = td.a(105, -112, false);
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
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param2 - -param3 > param1.length) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param3 + param2 - param1.length);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((td) this).field_d == -1L) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((td) this).field_d ^ -1L) < (((td) this).field_l ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((td) this).field_d + (long)((td) this).field_c < (long)param3 + ((td) this).field_l) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ug.a(((td) this).field_i, (int)(((td) this).field_l - ((td) this).field_d), param1, param2, param3);
                        ((td) this).field_l = ((td) this).field_l + (long)param3;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var5_long = ((td) this).field_l;
                        var7 = param2;
                        var8 = param3;
                        if (param0 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        field_o = null;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((((td) this).field_l ^ -1L) > (((td) this).field_e ^ -1L)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((((td) this).field_l ^ -1L) <= ((long)((td) this).field_a + ((td) this).field_e ^ -1L)) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9_int = (int)((long)((td) this).field_a - ((td) this).field_l + ((td) this).field_e);
                        if (param3 >= var9_int) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = param3;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ug.a(((td) this).field_g, (int)(((td) this).field_l - ((td) this).field_e), param1, param2, var9_int);
                        param2 = param2 + var9_int;
                        param3 = param3 - var9_int;
                        ((td) this).field_l = ((td) this).field_l + (long)var9_int;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((td) this).field_g.length >= param3) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((td) this).field_b.a(0, ((td) this).field_l);
                        ((td) this).field_h = ((td) this).field_l;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param3 <= 0) {
                            statePc = 27;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9_int = ((td) this).field_b.a(param1, param2, param3, (byte) -109);
                        if (var9_int != -1) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((td) this).field_h = ((td) this).field_h + (long)var9_int;
                        param3 = param3 - var9_int;
                        param2 = param2 + var9_int;
                        ((td) this).field_l = ((td) this).field_l + (long)var9_int;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (-1 > (param3 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.a(false);
                        var9_int = param3;
                        if (((td) this).field_a < var9_int) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9_int = ((td) this).field_a;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ug.a(((td) this).field_g, 0, param1, param2, var9_int);
                        param2 = param2 + var9_int;
                        param3 = param3 - var9_int;
                        ((td) this).field_l = ((td) this).field_l + (long)var9_int;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (-1L != ((td) this).field_d) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((((td) this).field_d ^ -1L) >= (((td) this).field_l ^ -1L)) {
                            statePc = 37;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (0 < param3) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9_int = (int)(-((td) this).field_l + ((td) this).field_d) + param2;
                        if (var9_int > param3 + param2) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9_int = param2 - -param3;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var9_int <= param2) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        param2++;
                        param1[param2] = (byte) 0;
                        param3--;
                        ((td) this).field_l = ((td) this).field_l + 1L;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = -1L;
                        if (((td) this).field_d < var5_long) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((var5_long - -(long)var8 ^ -1L) >= (((td) this).field_d ^ -1L)) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var9 = ((td) this).field_d;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var5_long ^ -1L) > (((td) this).field_d ^ -1L)) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (((td) this).field_d + (long)((td) this).field_c > var5_long) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var9 = var5_long;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var11 = -1L;
                        if (var5_long >= ((td) this).field_d - -(long)((td) this).field_c) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((var5_long - -(long)var8 ^ -1L) <= ((long)((td) this).field_c + ((td) this).field_d ^ -1L)) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (((long)var8 + var5_long ^ -1L) >= (((td) this).field_d ^ -1L)) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var5_long + (long)var8 <= ((td) this).field_d - -(long)((td) this).field_c) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var11 = ((td) this).field_d + (long)((td) this).field_c;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (0L <= (var9 ^ -1L)) {
                            statePc = 59;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                            statePc = 59;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var13 = (int)(-var9 + var11);
                        ug.a(((td) this).field_i, (int)(-((td) this).field_d + var9), param1, (int)(var9 - var5_long) + var7, var13);
                        if ((var11 ^ -1L) < (((td) this).field_l ^ -1L)) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        param3 = (int)((long)param3 - (var11 + -((td) this).field_l));
                        ((td) this).field_l = var11;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 58: {
                    var5 = (IOException) (Object) caughtException;
                    ((td) this).field_h = -1L;
                    throw var5;
                }
                case 59: {
                    if ((param3 ^ -1) < -1) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    return;
                }
                case 61: {
                    throw new EOFException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        ((td) this).a(0, param0, 0, param0.length);
        if (param1 <= 11) {
            ((td) this).field_g = null;
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (param0 >= 0) {
            // if_icmpgt L23
        }
        param0 = param0 >>> 16;
        var2 += 16;
        if (param0 >= 256) {
            param0 = param0 >>> 8;
            var2 += 8;
        }
        if (-17 >= (param0 ^ -1)) {
            param0 = param0 >>> 4;
            var2 += 4;
        }
        if ((param0 ^ -1) <= -5) {
            var2 += 2;
            param0 = param0 >>> 2;
        }
        if (param1 < 23) {
            field_f = null;
        }
        if (1 <= param0) {
            var2++;
            param0 = param0 >>> 1;
        }
        return var2 + param0;
    }

    final long b(boolean param0) {
        if (param0) {
            return -41L;
        }
        return ((td) this).field_n;
    }

    final void a(int param0) throws IOException {
        this.a((byte) -56);
        if (param0 < 36) {
            int discarded$0 = td.a(-31, (byte) 62);
        }
        ((td) this).field_b.a(1);
    }

    td(cb param0, int param1, int param2) throws IOException {
        ((td) this).field_d = -1L;
        ((td) this).field_c = 0;
        ((td) this).field_e = -1L;
        ((td) this).field_b = param0;
        ((td) this).field_k = param0.c(-38);
        ((td) this).field_n = param0.c(-38);
        ((td) this).field_i = new byte[param2];
        ((td) this).field_g = new byte[param1];
        ((td) this).field_l = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "HARD";
        field_f = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
