/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends tb {
    static ee field_c;
    private int field_e;
    static volatile boolean field_m;
    static int field_g;
    private long field_j;
    private int field_l;
    private long field_h;
    private long[] field_f;
    static aj field_n;
    private long field_i;
    static aj field_d;
    static String field_k;

    final void a(byte param0) {
        this.field_i = 0L;
        if (param0 == 50) {
          if (this.field_h < this.field_j) {
            this.field_h = this.field_h + (this.field_j - this.field_h);
            return;
          } else {
            return;
          }
        } else {
          field_c = (ee) null;
          if (this.field_h >= this.field_j) {
            return;
          } else {
            this.field_h = this.field_h + (this.field_j - this.field_h);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_k = null;
        field_n = null;
        if (!param0) {
            return;
        }
        field_c = null;
    }

    final long b(int param0) {
        if (param0 == 255) {
          this.field_h = this.field_h + this.c(10);
          if (this.field_j > this.field_h) {
            return (this.field_j - this.field_h) / 1000000L;
          } else {
            return 0L;
          }
        } else {
          field_m = true;
          this.field_h = this.field_h + this.c(10);
          if (this.field_j > this.field_h) {
            return (this.field_j - this.field_h) / 1000000L;
          } else {
            return 0L;
          }
        }
    }

    private final long c(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Lexicominos.field_L ? 1 : 0;
                    var2 = System.nanoTime();
                    var4 = var2 - this.field_i;
                    this.field_i = var2;
                    if (var4 > -5000000000L) {
                        statePc = 14;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var6 = 0L;
                    var8 = 1;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_l < var8) {
                        statePc = 10;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var6 = var6 + this.field_f[(this.field_e - (var8 + -10)) % 10];
                    var8++;
                    if (var9 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return var6 / (long)this.field_l;
                }
                case 6: {
                    if (var9 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (param0 == 10) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return -86L;
                }
                case 9: {
                    return var6 / (long)this.field_l;
                }
                case 10: {
                    if (param0 != 10) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return var6 / (long)this.field_l;
                }
                case 13: {
                    return -86L;
                }
                case 14: {
                    if (5000000000L > var4) {
                        statePc = 25;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var6 = 0L;
                    var8 = 1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (this.field_l < var8) {
                        statePc = 22;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var6 = var6 + this.field_f[(this.field_e - (var8 + -10)) % 10];
                    var8++;
                    if (var9 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var9 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (param0 == 10) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return -86L;
                }
                case 21: {
                    return var6 / (long)this.field_l;
                }
                case 22: {
                    if (param0 == 10) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return -86L;
                }
                case 24: {
                    return var6 / (long)this.field_l;
                }
                case 25: {
                    this.field_f[this.field_e] = var4;
                    this.field_e = (this.field_e + 1) % 10;
                    if ((this.field_l ^ -1) <= -2) {
                        statePc = 37;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.field_l = this.field_l + 1;
                    var6 = 0L;
                    var8 = 1;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (this.field_l < var8) {
                        statePc = 34;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var6 = var6 + this.field_f[(this.field_e - (var8 + -10)) % 10];
                    var8++;
                    if (var9 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (var9 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (param0 == 10) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    return -86L;
                }
                case 32: {
                    return var6 / (long)this.field_l;
                }
                case 34: {
                    if (param0 == 10) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    return -86L;
                }
                case 36: {
                    return var6 / (long)this.field_l;
                }
                case 37: {
                    var6 = 0L;
                    var8 = 1;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (this.field_l < var8) {
                        statePc = 44;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var6 = var6 + this.field_f[(this.field_e - (var8 + -10)) % 10];
                    var8++;
                    if (var9 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var9 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (param0 == 10) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    return -86L;
                }
                case 43: {
                    return var6 / (long)this.field_l;
                }
                case 44: {
                    if (param0 == 10) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    return -86L;
                }
                case 46: {
                    return var6 / (long)this.field_l;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(long param0, byte param1) {
        int var4;
        int var5;
        int stackIn_5_0 = 0;
        int stackIn_17_0 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (param1 > 113) {
          if (this.field_h >= this.field_j) {
            var4 = 0;
            L0: while (true) {
              this.field_j = this.field_j + param0;
              var4++;
              stackIn_17_0 = var4 ^ -1;
              L1: while (true) {
                L2: {
                  if (stackIn_17_0 <= -11) {
                    break L2;
                  } else {
                    if ((this.field_j ^ -1L) > (this.field_h ^ -1L)) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_17_0 = ((this.field_j ^ -1L) < (this.field_h ^ -1L) ? -1 : ((this.field_j ^ -1L) == (this.field_h ^ -1L) ? 0 : 1));

                if (var5 != 0) {
                  continue L1;
                } else {
                  L3: {
                    if (stackIn_17_0 > 0) {
                      this.field_j = this.field_h;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return var4;
                }
              }
            }
          } else {
            this.field_i = this.field_i + (-this.field_h + this.field_j);
            this.field_h = this.field_h + (-this.field_h + this.field_j);
            this.field_j = this.field_j + param0;
            return 1;
          }
        } else {
          field_g = -117;
          if (this.field_h >= this.field_j) {
            var4 = 0;
            L4: while (true) {
              this.field_j = this.field_j + param0;
              var4++;
              stackIn_5_0 = var4 ^ -1;
              L5: while (true) {
                L6: {
                  if (stackIn_5_0 <= -11) {
                    break L6;
                  } else {
                    if ((this.field_j ^ -1L) > (this.field_h ^ -1L)) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
                stackIn_5_0 = ((this.field_j ^ -1L) < (this.field_h ^ -1L) ? -1 : ((this.field_j ^ -1L) == (this.field_h ^ -1L) ? 0 : 1));

                if (var5 != 0) {
                  continue L5;
                } else {
                  L7: {
                    if (stackIn_5_0 > 0) {
                      this.field_j = this.field_h;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return var4;
                }
              }
            }
          } else {
            this.field_i = this.field_i + (-this.field_h + this.field_j);
            this.field_h = this.field_h + (-this.field_h + this.field_j);
            this.field_j = this.field_j + param0;
            return 1;
          }
        }
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, boolean param3) {
        int stackIn_10_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1) {
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
                        rk.a(true);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param0 < 2) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 <= 36) {
                            statePc = 7;
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
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw new IllegalArgumentException("" + param0);
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4_int = 0;
                        var5 = 0;
                        var6 = 0;
                        var7 = param2.length();
                        var8 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 <= var8) {
                            statePc = 43;
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
                        var9 = param2.charAt(var8);
                        stackIn_44_0 = -1;
                        stackIn_10_0 = stackIn_44_0;
                        if (var11 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 != (var8 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var9 == 45) {
                            statePc = 13;
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4_int = 1;
                        if (var11 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var9 != 43) {
                            statePc = 17;
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
                        if (param3) {
                            statePc = 42;
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
                        if (var9 < 48) {
                            statePc = 21;
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
                        if (var9 > 57) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9 -= 48;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var9 < 65) {
                            statePc = 25;
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
                        if (var9 > 90) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var9 -= 55;
                        if (var11 == 0) {
                            statePc = 32;
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
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var9 < 97) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var9 <= 122) {
                            statePc = 30;
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
                        return false;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0 != 0;
                }
                case 30: {
                    try {
                        var9 -= 87;
                        if (var11 == 0) {
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
                        var9 -= 48;
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
                        if (var9 < param0) {
                            statePc = 35;
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
                        stackIn_34_0 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return stackIn_34_0 != 0;
                }
                case 35: {
                    try {
                        if (var4_int != 0) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = -var9;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var10 = var9 + param0 * var6;
                        if (var6 == var10 / param0) {
                            statePc = 41;
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
                        stackIn_40_0 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return stackIn_40_0 != 0;
                }
                case 41: {
                    try {
                        var5 = 1;
                        var6 = var10;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var8++;
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = var5;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    return stackIn_44_0 != 0;
                }
                case 45: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_47_0 = (RuntimeException) (var4);
                    stackIn_46_0 = stackIn_47_0;
                    stackIn_47_1 = new StringBuilder().append("rk.A(").append(param0).append(',').append(param1).append(',');
                    stackIn_46_1 = stackIn_47_1;
                    if (param2 == null) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_48_0 = (RuntimeException) ((Object) stackIn_46_0);
                    stackIn_48_1 = (StringBuilder) ((Object) stackIn_46_1);
                    stackIn_48_2 = "{...}";
                    statePc = 48;
                    continue stateLoop;
                }
                case 47: {
                    stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                    stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                    stackIn_48_2 = "null";
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    throw ld.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    rk() {
        this.field_j = 0L;
        this.field_h = 0L;
        this.field_f = new long[10];
        this.field_e = 0;
        this.field_i = 0L;
        this.field_l = 1;
        this.field_h = System.nanoTime();
        this.field_j = System.nanoTime();
    }

    static {
        field_m = true;
        field_n = new aj(2, 4, 4, 0);
        field_d = new aj(6, 0, 4, 2);
        field_k = "2 of 4";
    }
}
