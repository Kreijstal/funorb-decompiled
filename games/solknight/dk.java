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
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        if (param1) {
          if ((this.field_f ^ -1L) <= (this.field_g ^ -1L)) {
            var4 = 0;
            L0: while (true) {
              var4++;
              this.field_g = this.field_g + param0;
              stackOut_15_0 = -11;
              stackIn_16_0 = stackOut_15_0;
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
                stackOut_18_0 = (this.field_g < this.field_f ? -1 : (this.field_g == this.field_f ? 0 : 1));
                stackIn_16_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (var5 != 0) {
                  continue L1;
                } else {
                  if (stackIn_19_0 < 0) {
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
              stackOut_4_0 = -11;
              stackIn_5_0 = stackOut_4_0;
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
                stackOut_7_0 = (this.field_g < this.field_f ? -1 : (this.field_g == this.field_f ? 0 : 1));
                stackIn_5_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var5 != 0) {
                  continue L4;
                } else {
                  if (stackIn_8_0 >= 0) {
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
        long stackOut_21_0 = 0L;
        long stackOut_23_0 = 0L;
        long stackOut_15_0 = 0L;
        long stackOut_17_0 = 0L;
        long stackOut_5_0 = 0L;
        long stackOut_7_0 = 0L;
        var9 = SolKnight.field_L ? 1 : 0;
        if (param0 == -5378) {
          var2 = System.nanoTime();
          var4 = -this.field_j + var2;
          this.field_j = var2;
          if (var4 > -5000000000L) {
            if (-5000000001L >= (var4 ^ -1L)) {
              var6 = 0L;
              var8 = 1;
              L0: while (true) {
                L1: {
                  L2: {
                    if (var8 > this.field_d) {
                      break L2;
                    } else {
                      stackOut_21_0 = var6 + this.field_k[(-var8 + (this.field_e + 10)) % 10];
                      stackIn_24_0 = stackOut_21_0;
                      stackIn_22_0 = stackOut_21_0;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        var6 = stackIn_22_0;
                        var8++;
                        if (var9 == 0) {
                          continue L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  stackOut_23_0 = var6 / (long)this.field_d;
                  stackIn_24_0 = stackOut_23_0;
                  break L1;
                }
                return stackIn_24_0;
              }
            } else {
              L3: {
                this.field_k[this.field_e] = var4;
                if (this.field_d < 1) {
                  this.field_d = this.field_d + 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_e = (1 + this.field_e) % 10;
              var6 = 0L;
              var8 = 1;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var8 > this.field_d) {
                      break L6;
                    } else {
                      stackOut_15_0 = var6 + this.field_k[(-var8 + (this.field_e + 10)) % 10];
                      stackIn_18_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (var9 != 0) {
                        break L5;
                      } else {
                        var6 = stackIn_16_0;
                        var8++;
                        if (var9 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_17_0 = var6 / (long)this.field_d;
                  stackIn_18_0 = stackOut_17_0;
                  break L5;
                }
                return stackIn_18_0;
              }
            }
          } else {
            var6 = 0L;
            var8 = 1;
            L7: while (true) {
              L8: {
                L9: {
                  if (var8 > this.field_d) {
                    break L9;
                  } else {
                    stackOut_5_0 = var6 + this.field_k[(-var8 + (this.field_e + 10)) % 10];
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var9 != 0) {
                      break L8;
                    } else {
                      var6 = stackIn_6_0;
                      var8++;
                      if (var9 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                stackOut_7_0 = var6 / (long)this.field_d;
                stackIn_8_0 = stackOut_7_0;
                break L8;
              }
              return stackIn_8_0;
            }
          }
        } else {
          return 76L;
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
