/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ge {
    private long field_o;
    private int field_j;
    static String field_i;
    private pf field_b;
    static he[] field_p;
    private long field_a;
    static String field_c;
    static int field_f;
    private long field_h;
    static he field_d;
    static String field_g;
    private long field_n;
    private long field_k;
    private byte[] field_m;
    private byte[] field_l;
    private long field_e;
    private int field_q;

    final void a(int param0) throws IOException {
        if (param0 > -46) {
            return;
        }
        this.b(0);
        ((ge) this).field_b.c(104);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
                    var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((((ge) this).field_h ^ -1L) <= (((ge) this).field_a + (long)param0 ^ -1L)) {
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
                        ((ge) this).field_h = ((ge) this).field_a + (long)param0;
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
                        if (((ge) this).field_k == -1L) {
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
                        if (((ge) this).field_a < ((ge) this).field_k) {
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
                        if (((ge) this).field_a > ((ge) this).field_k + (long)((ge) this).field_j) {
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
                        this.b(0);
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
                        if (-1L == ((ge) this).field_k) {
                            statePc = 12;
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
                        if (((long)((ge) this).field_l.length + ((ge) this).field_k ^ -1L) > (((ge) this).field_a + (long)param0 ^ -1L)) {
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int = (int)(-((ge) this).field_a - (-((ge) this).field_k - (long)((ge) this).field_l.length));
                        kg.a(param3, param1, ((ge) this).field_l, (int)(((ge) this).field_a - ((ge) this).field_k), var5_int);
                        ((ge) this).field_a = ((ge) this).field_a + (long)var5_int;
                        param1 = param1 + var5_int;
                        param0 = param0 - var5_int;
                        ((ge) this).field_j = ((ge) this).field_l.length;
                        this.b(0);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param0 <= ((ge) this).field_l.length) {
                            statePc = 37;
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
                        if ((((ge) this).field_e ^ -1L) != (((ge) this).field_a ^ -1L)) {
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((ge) this).field_b.a(1536, ((ge) this).field_a);
                        ((ge) this).field_e = ((ge) this).field_a;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((ge) this).field_b.a((byte) -104, param0, param1, param3);
                        ((ge) this).field_e = ((ge) this).field_e + (long)param0;
                        if ((((ge) this).field_n ^ -1L) <= (((ge) this).field_e ^ -1L)) {
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
                        ((ge) this).field_n = ((ge) this).field_e;
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
                        var5_long = -1L;
                        if ((((ge) this).field_o ^ -1L) < (((ge) this).field_a ^ -1L)) {
                            statePc = 21;
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
                        if ((((ge) this).field_a ^ -1L) > (((ge) this).field_o - -(long)((ge) this).field_q ^ -1L)) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
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
                        if (((ge) this).field_a > ((ge) this).field_o) {
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
                        if ((((ge) this).field_o ^ -1L) > (((ge) this).field_a + (long)param0 ^ -1L)) {
                            statePc = 24;
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
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5_long = ((ge) this).field_o;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5_long = ((ge) this).field_a;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7 = -1L;
                        if ((((ge) this).field_o ^ -1L) <= ((long)param0 + ((ge) this).field_a ^ -1L)) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (((long)((ge) this).field_q + ((ge) this).field_o ^ -1L) > ((long)param0 + ((ge) this).field_a ^ -1L)) {
                            statePc = 29;
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
                        var7 = (long)param0 + ((ge) this).field_a;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((long)((ge) this).field_q + ((ge) this).field_o ^ -1L) >= (((ge) this).field_a ^ -1L)) {
                            statePc = 32;
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
                        if ((long)((ge) this).field_q + ((ge) this).field_o > ((ge) this).field_a - -(long)param0) {
                            statePc = 32;
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
                        var7 = ((ge) this).field_o + (long)((ge) this).field_q;
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
                        if (-1L >= var5_long) {
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
                        if ((var5_long ^ -1L) <= (var7 ^ -1L)) {
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
                        var9 = (int)(-var5_long + var7);
                        kg.a(param3, (int)((long)param1 - -var5_long - ((ge) this).field_a), ((ge) this).field_m, (int)(var5_long - ((ge) this).field_o), var9);
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
                        ((ge) this).field_a = ((ge) this).field_a + (long)param0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return;
                }
                case 37: {
                    try {
                        if (param2 == 18017) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return;
                }
                case 39: {
                    try {
                        if (0 < param0) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (-1L == ((ge) this).field_k) {
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
                        ((ge) this).field_k = ((ge) this).field_a;
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
                        kg.a(param3, param1, ((ge) this).field_l, (int)(((ge) this).field_a - ((ge) this).field_k), param0);
                        ((ge) this).field_a = ((ge) this).field_a + (long)param0;
                        if ((-((ge) this).field_k + ((ge) this).field_a ^ -1L) < ((long)((ge) this).field_j ^ -1L)) {
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
                        ((ge) this).field_j = (int)(((ge) this).field_a + -((ge) this).field_k);
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
                    ((ge) this).field_e = -1L;
                    throw var5;
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_i = null;
        field_c = null;
        field_g = null;
        field_d = null;
        field_p = null;
    }

    final void a(byte param0, byte[] param1) throws IOException {
        ((ge) this).a(0, param1, param1.length, -101);
        if (param0 != -111) {
            f discarded$0 = ge.a(-11, (byte) 68);
        }
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = ui.a(param1, param2, -3);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (param0 >= 82) {
              break L0;
            } else {
              var6 = null;
              String discarded$2 = ge.a((byte) -112, false, (CharSequence) null);
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            if (param2.length() > var4) {
              if (pa.a((byte) 58, param2.charAt(var4))) {
                var4++;
                continue L1;
              } else {
                return ul.field_g;
              }
            } else {
              return null;
            }
          }
        }
    }

    final static int a(byte[] param0, int param1, int param2, int param3, CharSequence param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var6 = param3 + -param2;
          if (param5 <= -123) {
            break L0;
          } else {
            var10 = null;
            int discarded$1 = ge.a((byte[]) null, 67, 112, -126, (CharSequence) null, 48);
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          L2: {
            if (var7 >= var6) {
              break L2;
            } else {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      var8 = param4.charAt(var7 + param2);
                      if (var8 <= 0) {
                        break L6;
                      } else {
                        if (var8 < 128) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (160 > var8) {
                      break L4;
                    } else {
                      if (255 < var8) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  param0[var7 + param1] = (byte)var8;
                  if (0 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (var8 == 8364) {
                    break L7;
                  } else {
                    L8: {
                      if (var8 != 8218) {
                        break L8;
                      } else {
                        param0[param1 - -var7] = (byte)-126;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var8 == 402) {
                        break L9;
                      } else {
                        L10: {
                          if (var8 != 8222) {
                            break L10;
                          } else {
                            param0[var7 + param1] = (byte)-124;
                            if (0 == 0) {
                              break L3;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (8230 != var8) {
                            break L11;
                          } else {
                            param0[var7 + param1] = (byte)-123;
                            if (0 == 0) {
                              break L3;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (8224 != var8) {
                            break L12;
                          } else {
                            param0[param1 - -var7] = (byte)-122;
                            if (0 == 0) {
                              break L3;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L13: {
                          if (var8 == 8225) {
                            break L13;
                          } else {
                            L14: {
                              if (var8 == 710) {
                                break L14;
                              } else {
                                L15: {
                                  if (var8 == 8240) {
                                    break L15;
                                  } else {
                                    L16: {
                                      if (352 != var8) {
                                        break L16;
                                      } else {
                                        param0[param1 - -var7] = (byte)-118;
                                        if (0 == 0) {
                                          break L3;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    L17: {
                                      if (var8 != 8249) {
                                        break L17;
                                      } else {
                                        param0[var7 + param1] = (byte)-117;
                                        if (0 == 0) {
                                          break L3;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    L18: {
                                      if (var8 == 338) {
                                        break L18;
                                      } else {
                                        L19: {
                                          if (var8 == 381) {
                                            break L19;
                                          } else {
                                            L20: {
                                              if (var8 == 8216) {
                                                break L20;
                                              } else {
                                                L21: {
                                                  if (8217 != var8) {
                                                    break L21;
                                                  } else {
                                                    param0[param1 - -var7] = (byte)-110;
                                                    if (0 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                }
                                                L22: {
                                                  if (var8 == 8220) {
                                                    break L22;
                                                  } else {
                                                    L23: {
                                                      if (8221 != var8) {
                                                        break L23;
                                                      } else {
                                                        param0[param1 - -var7] = (byte)-108;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                    L24: {
                                                      if (var8 != 8226) {
                                                        break L24;
                                                      } else {
                                                        param0[param1 + var7] = (byte)-107;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    L25: {
                                                      if (8211 == var8) {
                                                        break L25;
                                                      } else {
                                                        L26: {
                                                          if (var8 == 8212) {
                                                            break L26;
                                                          } else {
                                                            L27: {
                                                              if (var8 == 732) {
                                                                break L27;
                                                              } else {
                                                                L28: {
                                                                  if (8482 != var8) {
                                                                    break L28;
                                                                  } else {
                                                                    param0[param1 + var7] = (byte)-103;
                                                                    if (0 == 0) {
                                                                      break L3;
                                                                    } else {
                                                                      break L28;
                                                                    }
                                                                  }
                                                                }
                                                                L29: {
                                                                  if (var8 == 353) {
                                                                    break L29;
                                                                  } else {
                                                                    L30: {
                                                                      if (8250 != var8) {
                                                                        break L30;
                                                                      } else {
                                                                        param0[param1 + var7] = (byte)-101;
                                                                        if (0 == 0) {
                                                                          break L3;
                                                                        } else {
                                                                          break L30;
                                                                        }
                                                                      }
                                                                    }
                                                                    L31: {
                                                                      if (var8 == 339) {
                                                                        break L31;
                                                                      } else {
                                                                        L32: {
                                                                          if (var8 != 382) {
                                                                            break L32;
                                                                          } else {
                                                                            param0[var7 + param1] = (byte)-98;
                                                                            if (0 == 0) {
                                                                              break L3;
                                                                            } else {
                                                                              break L32;
                                                                            }
                                                                          }
                                                                        }
                                                                        L33: {
                                                                          if (var8 == 376) {
                                                                            break L33;
                                                                          } else {
                                                                            param0[param1 + var7] = (byte)63;
                                                                            if (0 == 0) {
                                                                              break L3;
                                                                            } else {
                                                                              break L33;
                                                                            }
                                                                          }
                                                                        }
                                                                        param0[var7 + param1] = (byte)-97;
                                                                        if (0 == 0) {
                                                                          break L3;
                                                                        } else {
                                                                          break L31;
                                                                        }
                                                                      }
                                                                    }
                                                                    param0[var7 + param1] = (byte)-100;
                                                                    if (0 == 0) {
                                                                      break L3;
                                                                    } else {
                                                                      break L29;
                                                                    }
                                                                  }
                                                                }
                                                                param0[var7 + param1] = (byte)-102;
                                                                if (0 == 0) {
                                                                  break L3;
                                                                } else {
                                                                  break L27;
                                                                }
                                                              }
                                                            }
                                                            param0[param1 - -var7] = (byte)-104;
                                                            if (0 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L26;
                                                            }
                                                          }
                                                        }
                                                        param0[var7 + param1] = (byte)-105;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                    param0[param1 - -var7] = (byte)-106;
                                                    if (0 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                }
                                                param0[var7 + param1] = (byte)-109;
                                                if (0 == 0) {
                                                  break L3;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            param0[var7 + param1] = (byte)-111;
                                            if (0 == 0) {
                                              break L3;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                        param0[var7 + param1] = (byte)-114;
                                        if (0 == 0) {
                                          break L3;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    param0[param1 - -var7] = (byte)-116;
                                    if (0 == 0) {
                                      break L3;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                param0[param1 - -var7] = (byte)-119;
                                if (0 == 0) {
                                  break L3;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            param0[param1 + var7] = (byte)-120;
                            if (0 == 0) {
                              break L3;
                            } else {
                              break L13;
                            }
                          }
                        }
                        param0[param1 + var7] = (byte)-121;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L9;
                        }
                      }
                    }
                    param0[var7 + param1] = (byte)-125;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L7;
                    }
                  }
                }
                param0[var7 + param1] = (byte)-128;
                break L3;
              }
              var7++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          return var6;
        }
    }

    final long b(boolean param0) {
        if (!param0) {
            return -64L;
        }
        return ((ge) this).field_h;
    }

    private final void a(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          ((ge) this).field_q = 0;
          if ((((ge) this).field_a ^ -1L) != (((ge) this).field_e ^ -1L)) {
            ((ge) this).field_b.a(1536, ((ge) this).field_a);
            ((ge) this).field_e = ((ge) this).field_a;
            break L0;
          } else {
            break L0;
          }
        }
        ((ge) this).field_o = ((ge) this).field_a;
        if (param0 != -102) {
          return;
        } else {
          L1: while (true) {
            L2: {
              if (((ge) this).field_q >= ((ge) this).field_m.length) {
                break L2;
              } else {
                L3: {
                  var2 = -((ge) this).field_q + ((ge) this).field_m.length;
                  if (200000000 < var2) {
                    var2 = 200000000;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = ((ge) this).field_b.a(((ge) this).field_m, var2, param0 + 101, ((ge) this).field_q);
                if ((var3 ^ -1) != 0) {
                  ((ge) this).field_e = ((ge) this).field_e + (long)var3;
                  ((ge) this).field_q = ((ge) this).field_q + var3;
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            return;
          }
        }
    }

    final void a(long param0, byte param1) throws IOException {
        if (!(param0 >= 0L)) {
            throw new IOException();
        }
        if (param1 != -63) {
            return;
        }
        ((ge) this).field_a = param0;
    }

    private final void b(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            var8 = null;
            int discarded$1 = ge.a((byte[]) null, 111, 53, 38, (CharSequence) null, -38);
            break L0;
          }
        }
        L1: {
          if (-1L != ((ge) this).field_k) {
            L2: {
              if ((((ge) this).field_k ^ -1L) == (((ge) this).field_e ^ -1L)) {
                break L2;
              } else {
                ((ge) this).field_b.a(param0 + 1536, ((ge) this).field_k);
                ((ge) this).field_e = ((ge) this).field_k;
                break L2;
              }
            }
            L3: {
              ((ge) this).field_b.a((byte) -87, ((ge) this).field_j, 0, ((ge) this).field_l);
              ((ge) this).field_e = ((ge) this).field_e + (long)((ge) this).field_j;
              if (((ge) this).field_e <= ((ge) this).field_n) {
                break L3;
              } else {
                ((ge) this).field_n = ((ge) this).field_e;
                break L3;
              }
            }
            L4: {
              L5: {
                var2 = -1L;
                if (((ge) this).field_k < ((ge) this).field_o) {
                  break L5;
                } else {
                  if (((ge) this).field_k >= (long)((ge) this).field_q + ((ge) this).field_o) {
                    break L5;
                  } else {
                    var2 = ((ge) this).field_k;
                    break L4;
                  }
                }
              }
              if (((ge) this).field_o < ((ge) this).field_k) {
                break L4;
              } else {
                if ((((ge) this).field_k + (long)((ge) this).field_j ^ -1L) >= (((ge) this).field_o ^ -1L)) {
                  break L4;
                } else {
                  var2 = ((ge) this).field_o;
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                var4 = -1L;
                if (((ge) this).field_o >= ((ge) this).field_k + (long)((ge) this).field_j) {
                  break L7;
                } else {
                  if (((ge) this).field_k + (long)((ge) this).field_j <= ((ge) this).field_o - -(long)((ge) this).field_q) {
                    var4 = ((ge) this).field_k - -(long)((ge) this).field_j;
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (((ge) this).field_k >= (long)((ge) this).field_q + ((ge) this).field_o) {
                break L6;
              } else {
                if (((ge) this).field_o - -(long)((ge) this).field_q <= (long)((ge) this).field_j + ((ge) this).field_k) {
                  var4 = (long)((ge) this).field_q + ((ge) this).field_o;
                  break L6;
                } else {
                  L8: {
                    if ((var2 ^ -1L) >= 0L) {
                      break L8;
                    } else {
                      if (var4 <= var2) {
                        break L8;
                      } else {
                        var6 = (int)(-var2 + var4);
                        kg.a(((ge) this).field_l, (int)(var2 - ((ge) this).field_k), ((ge) this).field_m, (int)(var2 + -((ge) this).field_o), var6);
                        break L8;
                      }
                    }
                  }
                  ((ge) this).field_k = -1L;
                  ((ge) this).field_j = 0;
                  break L1;
                }
              }
            }
            L9: {
              if ((var2 ^ -1L) >= 0L) {
                break L9;
              } else {
                if (var4 <= var2) {
                  break L9;
                } else {
                  var6 = (int)(-var2 + var4);
                  kg.a(((ge) this).field_l, (int)(var2 - ((ge) this).field_k), ((ge) this).field_m, (int)(var2 + -((ge) this).field_o), var6);
                  break L9;
                }
              }
            }
            ((ge) this).field_k = -1L;
            ((ge) this).field_j = 0;
            break L1;
          } else {
            break L1;
          }
        }
    }

    final static f a(int param0, byte param1) {
        f var2 = new f();
        ql.field_i.a((gi) (Object) var2, 255);
        if (param1 >= -74) {
            f discarded$0 = ge.a(103, (byte) 124);
        }
        bj.a(2591, param0);
        return var2;
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
                    var14 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 + param2 > param1.length) {
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
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param1.length + param2 + param0);
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param3 <= -95) {
                            statePc = 6;
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
                        field_p = null;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (0L == (((ge) this).field_k ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((((ge) this).field_k ^ -1L) < (((ge) this).field_a ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (((long)((ge) this).field_j + ((ge) this).field_k ^ -1L) <= (((ge) this).field_a + (long)param2 ^ -1L)) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        kg.a(((ge) this).field_l, (int)(-((ge) this).field_k + ((ge) this).field_a), param1, param0, param2);
                        ((ge) this).field_a = ((ge) this).field_a + (long)param2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return;
                }
                case 12: {
                    try {
                        var5_long = ((ge) this).field_a;
                        var7 = param0;
                        var8 = param2;
                        if ((((ge) this).field_o ^ -1L) < (((ge) this).field_a ^ -1L)) {
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
                        if (((ge) this).field_a >= ((ge) this).field_o + (long)((ge) this).field_q) {
                            statePc = 17;
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
                        var9_int = (int)((long)((ge) this).field_q - (-((ge) this).field_o + ((ge) this).field_a));
                        if (var9_int <= param2) {
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
                        var9_int = param2;
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
                        kg.a(((ge) this).field_m, (int)(-((ge) this).field_o + ((ge) this).field_a), param1, param0, var9_int);
                        param2 = param2 - var9_int;
                        param0 = param0 + var9_int;
                        ((ge) this).field_a = ((ge) this).field_a + (long)var9_int;
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
                        if (param2 <= ((ge) this).field_m.length) {
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
                        ((ge) this).field_b.a(1536, ((ge) this).field_a);
                        ((ge) this).field_e = ((ge) this).field_a;
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
                        if (-1 <= (param2 ^ -1)) {
                            statePc = 26;
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
                        var9_int = ((ge) this).field_b.a(param1, param2, -1, param0);
                        if (-1 == var9_int) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        param2 = param2 - var9_int;
                        ((ge) this).field_a = ((ge) this).field_a + (long)var9_int;
                        param0 = param0 + var9_int;
                        ((ge) this).field_e = ((ge) this).field_e + (long)var9_int;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (-1 <= (param2 ^ -1)) {
                            statePc = 26;
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
                        this.a((byte) -102);
                        var9_int = param2;
                        if (var9_int <= ((ge) this).field_q) {
                            statePc = 25;
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
                        var9_int = ((ge) this).field_q;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        kg.a(((ge) this).field_m, 0, param1, param0, var9_int);
                        param0 = param0 + var9_int;
                        ((ge) this).field_a = ((ge) this).field_a + (long)var9_int;
                        param2 = param2 - var9_int;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (((ge) this).field_k != -1L) {
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
                        if ((((ge) this).field_a ^ -1L) <= (((ge) this).field_k ^ -1L)) {
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
                        if (param2 > 0) {
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
                        var9_int = (int)(((ge) this).field_k - ((ge) this).field_a) + param0;
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
                        var9_int = param0 + param2;
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
                        if (param0 >= var9_int) {
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
                        param0++;
                        param1[param0] = (byte) 0;
                        param2--;
                        ((ge) this).field_a = ((ge) this).field_a + 1L;
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
                        if ((var5_long ^ -1L) < (((ge) this).field_k ^ -1L)) {
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
                        if (((ge) this).field_k >= (long)var8 + var5_long) {
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
                        var9 = ((ge) this).field_k;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (((ge) this).field_k > var5_long) {
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
                        if ((((ge) this).field_k - -(long)((ge) this).field_j ^ -1L) >= (var5_long ^ -1L)) {
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
                        var9 = var5_long;
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
                        if (((long)((ge) this).field_j + ((ge) this).field_k ^ -1L) >= (var5_long ^ -1L)) {
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
                        if ((long)((ge) this).field_j + ((ge) this).field_k > var5_long + (long)var8) {
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
                        var11 = ((ge) this).field_k - -(long)((ge) this).field_j;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((long)var8 + var5_long <= ((ge) this).field_k) {
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
                        if ((long)((ge) this).field_j + ((ge) this).field_k >= var5_long + (long)var8) {
                            statePc = 48;
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
                        var11 = (long)var8 + var5_long;
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
                        if ((var9 ^ -1L) >= 0L) {
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
                        var13 = (int)(-var9 + var11);
                        kg.a(((ge) this).field_l, (int)(var9 + -((ge) this).field_k), param1, var7 + (int)(-var5_long + var9), var13);
                        if ((((ge) this).field_a ^ -1L) > (var11 ^ -1L)) {
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
                        param2 = (int)((long)param2 - (-((ge) this).field_a + var11));
                        ((ge) this).field_a = var11;
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
                    ((ge) this).field_e = -1L;
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

    ge(pf param0, int param1, int param2) throws IOException {
        ((ge) this).field_j = 0;
        ((ge) this).field_k = -1L;
        ((ge) this).field_o = -1L;
        ((ge) this).field_b = param0;
        ((ge) this).field_n = param0.a(-105);
        ((ge) this).field_h = param0.a(-105);
        ((ge) this).field_a = 0L;
        ((ge) this).field_l = new byte[param2];
        ((ge) this).field_m = new byte[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new he[1];
        field_i = "Score";
        field_c = "Email (Login):";
        field_g = "Play free version";
    }
}
