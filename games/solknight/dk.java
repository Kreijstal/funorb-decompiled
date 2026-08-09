/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk extends rj {
    private long field_j;
    static byte[] field_l;
    private long[] field_k;
    private int field_e;
    private long field_g;
    static kb field_h;
    private long field_f;
    static int field_i;
    private int field_d;

    final long a(int param0) {
        this.field_f = this.field_f + this.d(-5378);
        if (param0 > 114) {
          if ((this.field_g ^ -1L) < (this.field_f ^ -1L)) {
            return (this.field_g - this.field_f) / 1000000L;
          } else {
            return 0L;
          }
        } else {
          return 98L;
        }
    }

    public static void e(int param0) {
        if (param0 > -17) {
            field_h = (kb) null;
            field_l = null;
            field_h = null;
            return;
        }
        field_l = null;
        field_h = null;
    }

    final void c(int param0) {
        L0: {
          if ((this.field_f ^ -1L) > (this.field_g ^ -1L)) {
            this.field_f = this.field_f + (-this.field_f + this.field_g);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -10158) {
          field_i = 31;
          this.field_j = 0L;
          return;
        } else {
          this.field_j = 0L;
          return;
        }
    }

    final int a(long param0, boolean param1) {
        int var4;
        int var5;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        if (param1) {
          if ((this.field_f ^ -1L) <= (this.field_g ^ -1L)) {
            var4 = 0;
            L0: while (true) {
              var4++;
              this.field_g = this.field_g + param0;
              stackIn_16_0 = -11;
              L1: while (true) {
                L2: {
                  if (stackIn_16_0 >= (var4 ^ -1)) {
                    break L2;
                  } else {
                    if ((this.field_f ^ -1L) < (this.field_g ^ -1L)) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_16_0 = (this.field_g < this.field_f ? -1 : (this.field_g == this.field_f ? 0 : 1));

                if (var5 != 0) {
                  continue L1;
                } else {
                  if (stackIn_16_0 < 0) {
                    this.field_g = this.field_f;
                    return var4;
                  } else {
                    return var4;
                  }
                }
              }
            }
          } else {
            this.field_j = this.field_j + (this.field_g - this.field_f);
            this.field_f = this.field_f + (this.field_g - this.field_f);
            this.field_g = this.field_g + param0;
            return 1;
          }
        } else {
          field_l = (byte[]) null;
          if ((this.field_f ^ -1L) <= (this.field_g ^ -1L)) {
            var4 = 0;
            L3: while (true) {
              var4++;
              this.field_g = this.field_g + param0;
              stackIn_5_0 = -11;
              L4: while (true) {
                L5: {
                  if (stackIn_5_0 >= (var4 ^ -1)) {
                    break L5;
                  } else {
                    if ((this.field_f ^ -1L) < (this.field_g ^ -1L)) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
                stackIn_5_0 = (this.field_g < this.field_f ? -1 : (this.field_g == this.field_f ? 0 : 1));

                if (var5 != 0) {
                  continue L4;
                } else {
                  if (stackIn_5_0 >= 0) {
                    return var4;
                  } else {
                    this.field_g = this.field_f;
                    return var4;
                  }
                }
              }
            }
          } else {
            this.field_j = this.field_j + (this.field_g - this.field_f);
            this.field_f = this.field_f + (this.field_g - this.field_f);
            this.field_g = this.field_g + param0;
            return 1;
          }
        }
    }

    private final long d(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        long stackIn_6_0 = 0L;
        long stackIn_8_0 = 0L;
        long stackIn_16_0 = 0L;
        long stackIn_18_0 = 0L;
        long stackIn_22_0 = 0L;
        long stackIn_24_0 = 0L;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = SolKnight.field_L ? 1 : 0;
                    if (param0 == -5378) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return 76L;
                }
                case 2: {
                    var2 = System.nanoTime();
                    var4 = -this.field_j + var2;
                    this.field_j = var2;
                    if (var4 > -5000000000L) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var6 = 0L;
                    var8 = 1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var8 > this.field_d) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_8_0 = var6 + this.field_k[(-var8 + (this.field_e + 10)) % 10];
                    stackIn_6_0 = stackIn_8_0;
                    if (var9 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var6 = stackIn_6_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackIn_8_0 = var6 / (long)this.field_d;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    if (-5000000001L >= (var4 ^ -1L)) {
                        statePc = 19;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_k[this.field_e] = var4;
                    if (this.field_d < 1) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_d = this.field_d + 1;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    this.field_e = (1 + this.field_e) % 10;
                    var6 = 0L;
                    var8 = 1;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var8 > this.field_d) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_18_0 = var6 + this.field_k[(-var8 + (this.field_e + 10)) % 10];
                    stackIn_16_0 = stackIn_18_0;
                    if (var9 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var6 = stackIn_16_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = var6 / (long)this.field_d;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    return stackIn_18_0;
                }
                case 19: {
                    var6 = 0L;
                    var8 = 1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var8 > this.field_d) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_24_0 = var6 + this.field_k[(-var8 + (this.field_e + 10)) % 10];
                    stackIn_22_0 = stackIn_24_0;
                    if (var9 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var6 = stackIn_22_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = var6 / (long)this.field_d;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    return stackIn_24_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    dk() {
        this.field_f = 0L;
        this.field_e = 0;
        this.field_k = new long[10];
        this.field_j = 0L;
        this.field_d = 1;
        this.field_g = 0L;
        this.field_f = System.nanoTime();
        this.field_g = System.nanoTime();
    }

    static {
        field_h = new kb();
    }
}
