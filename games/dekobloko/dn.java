/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends ie {
    private long field_g;
    static int field_r;
    static nm field_l;
    static boolean field_k;
    private long[] field_f;
    private long field_m;
    static String field_s;
    private long field_h;
    static ck[] field_p;
    static String field_j;
    static String field_q;
    static boolean field_i;
    private int field_n;
    private int field_o;

    final int a(byte param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        var5 = client.field_A ? 1 : 0;
        if (param0 == 109) {
          if (this.field_g < this.field_m) {
            this.field_h = this.field_h + (-this.field_g + this.field_m);
            this.field_g = this.field_g + (this.field_m - this.field_g);
            this.field_m = this.field_m + param1;
            return 1;
          } else {
            var4 = 0;
            L0: while (true) {
              var4++;
              this.field_m = this.field_m + param1;
              stackOut_4_0 = var4;
              stackIn_5_0 = stackOut_4_0;
              L1: while (true) {
                L2: {
                  if (stackIn_5_0 >= 10) {
                    break L2;
                  } else {
                    if (this.field_m < this.field_g) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = (this.field_m < this.field_g ? -1 : (this.field_m == this.field_g ? 0 : 1));
                stackIn_5_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var5 != 0) {
                  continue L1;
                } else {
                  L3: {
                    if (stackIn_8_0 < 0) {
                      this.field_m = this.field_g;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return var4;
                }
              }
            }
          }
        } else {
          return -6;
        }
    }

    final void b(int param0) {
        if (param0 != -30693) {
          return;
        } else {
          L0: {
            this.field_h = 0L;
            if (this.field_g < this.field_m) {
              this.field_g = this.field_g + (-this.field_g + this.field_m);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    public static void d(int param0) {
        ac discarded$0 = null;
        field_j = null;
        field_q = null;
        field_l = null;
        field_s = null;
        field_p = null;
        if (param0 <= 65) {
            discarded$0 = dn.b((byte) 101);
        }
    }

    final long a(int param0) {
        this.field_g = this.field_g + this.c(-8325);
        if (param0 != -22962) {
            this.field_o = 53;
            if (!(this.field_g >= this.field_m)) {
                return (-this.field_g + this.field_m) / 1000000L;
            }
            return 0L;
        }
        if (!(this.field_g >= this.field_m)) {
            return (-this.field_g + this.field_m) / 1000000L;
        }
        return 0L;
    }

    final static ac b(byte param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        ac var2 = null;
        int var3 = 0;
        ac stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        ac stackOut_6_0 = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 25) {
                break L1;
              } else {
                field_j = (String) null;
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              var2 = oi.field_a.a(-39, var1_int);
              if (!var2.field_D) {
                var1_int++;
                continue L2;
              } else {
                if (var3 != 0) {
                  continue L2;
                } else {
                  stackOut_6_0 = (ac) (var2);
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
        return stackIn_7_0;
    }

    private final long c(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        long stackIn_12_0 = 0L;
        long stackIn_14_0 = 0L;
        long stackIn_18_0 = 0L;
        long stackIn_20_0 = 0L;
        long stackOut_17_0 = 0L;
        long stackOut_19_0 = 0L;
        long stackOut_11_0 = 0L;
        long stackOut_13_0 = 0L;
        L0: {
          var9 = client.field_A ? 1 : 0;
          var2 = System.nanoTime();
          var4 = var2 - this.field_h;
          if (param0 == -8325) {
            break L0;
          } else {
            break L0;
          }
        }
        this.field_h = var2;
        if (var4 <= -5000000000L) {
          var6 = 0L;
          var8 = 1;
          L1: while (true) {
            L2: {
              L3: {
                if (var8 > this.field_n) {
                  break L3;
                } else {
                  stackOut_17_0 = var6 + this.field_f[(10 + (this.field_o - var8)) % 10];
                  stackIn_20_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (var9 != 0) {
                    break L2;
                  } else {
                    var6 = stackIn_18_0;
                    var8++;
                    if (var9 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_19_0 = var6 / (long)this.field_n;
              stackIn_20_0 = stackOut_19_0;
              break L2;
            }
            return stackIn_20_0;
          }
        } else {
          L4: {
            if ((var4 ^ -1L) > -5000000001L) {
              L5: {
                this.field_f[this.field_o] = var4;
                if (-2 < (this.field_n ^ -1)) {
                  this.field_n = this.field_n + 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              this.field_o = (1 + this.field_o) % 10;
              break L4;
            } else {
              break L4;
            }
          }
          var6 = 0L;
          var8 = 1;
          L6: while (true) {
            L7: {
              L8: {
                if (var8 > this.field_n) {
                  break L8;
                } else {
                  stackOut_11_0 = var6 + this.field_f[(10 + (this.field_o - var8)) % 10];
                  stackIn_14_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (var9 != 0) {
                    break L7;
                  } else {
                    var6 = stackIn_12_0;
                    var8++;
                    if (var9 == 0) {
                      continue L6;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              stackOut_13_0 = var6 / (long)this.field_n;
              stackIn_14_0 = stackOut_13_0;
              break L7;
            }
            return stackIn_14_0;
          }
        }
    }

    dn() {
        this.field_g = 0L;
        this.field_h = 0L;
        this.field_f = new long[10];
        this.field_n = 1;
        this.field_o = 0;
        this.field_m = 0L;
        this.field_g = System.nanoTime();
        this.field_m = System.nanoTime();
    }

    static {
        field_s = "Service unavailable";
        field_j = "Flowers";
        field_r = 20;
        field_q = "Match 4 or more to make them disappear, like this:";
        field_p = new ck[8];
    }
}
