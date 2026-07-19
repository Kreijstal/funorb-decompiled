/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends qc {
    static int field_n;
    private int field_m;
    private long field_r;
    static int field_q;
    static ka field_s;
    private int field_o;
    private long field_u;
    private long field_t;
    static String field_l;
    private long[] field_p;
    static String field_k;

    final static void b(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 22963) {
                break L1;
              } else {
                uk.d(-122);
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var1_int >= lk.field_h) {
                    break L4;
                  } else {
                    an.field_F[var1_int] = null;
                    var1_int++;
                    if (var2 != 0) {
                      break L3;
                    } else {
                      if (var2 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                lk.field_h = 0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "uk.B(" + param0 + ')');
        }
    }

    final long b(byte param0) {
        this.field_r = this.field_r + this.c(param0 ^ 28722);
        if (this.field_r < this.field_u) {
          return (-this.field_r + this.field_u) / 1000000L;
        } else {
          if (param0 != -103) {
            return 42L;
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
        long stackIn_6_0 = 0L;
        long stackIn_8_0 = 0L;
        long stackIn_17_0 = 0L;
        long stackIn_19_0 = 0L;
        long stackIn_23_0 = 0L;
        long stackIn_25_0 = 0L;
        long stackOut_22_0 = 0L;
        long stackOut_24_0 = 0L;
        long stackOut_16_0 = 0L;
        long stackOut_18_0 = 0L;
        long stackOut_5_0 = 0L;
        long stackOut_7_0 = 0L;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == -28757) {
            break L0;
          } else {
            this.a(122);
            break L0;
          }
        }
        var2 = System.nanoTime();
        var4 = var2 - this.field_t;
        this.field_t = var2;
        if (var4 > -5000000000L) {
          if (5000000000L <= var4) {
            var6 = 0L;
            var8 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var8 > this.field_m) {
                    break L3;
                  } else {
                    stackOut_22_0 = var6 + this.field_p[(10 + (this.field_o - var8)) % 10];
                    stackIn_25_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      var6 = stackIn_23_0;
                      var8++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_24_0 = var6 / (long)this.field_m;
                stackIn_25_0 = stackOut_24_0;
                break L2;
              }
              return stackIn_25_0;
            }
          } else {
            L4: {
              this.field_p[this.field_o] = var4;
              this.field_o = (1 + this.field_o) % 10;
              if (1 > this.field_m) {
                this.field_m = this.field_m + 1;
                break L4;
              } else {
                break L4;
              }
            }
            var6 = 0L;
            var8 = 1;
            L5: while (true) {
              L6: {
                L7: {
                  if (var8 > this.field_m) {
                    break L7;
                  } else {
                    stackOut_16_0 = var6 + this.field_p[(10 + (this.field_o - var8)) % 10];
                    stackIn_19_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (var9 != 0) {
                      break L6;
                    } else {
                      var6 = stackIn_17_0;
                      var8++;
                      if (var9 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                stackOut_18_0 = var6 / (long)this.field_m;
                stackIn_19_0 = stackOut_18_0;
                break L6;
              }
              return stackIn_19_0;
            }
          }
        } else {
          var6 = 0L;
          var8 = 1;
          L8: while (true) {
            L9: {
              L10: {
                if (var8 > this.field_m) {
                  break L10;
                } else {
                  stackOut_5_0 = var6 + this.field_p[(10 + (this.field_o - var8)) % 10];
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var9 != 0) {
                    break L9;
                  } else {
                    var6 = stackIn_6_0;
                    var8++;
                    if (var9 == 0) {
                      continue L8;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              stackOut_7_0 = var6 / (long)this.field_m;
              stackIn_8_0 = stackOut_7_0;
              break L9;
            }
            return stackIn_8_0;
          }
        }
    }

    final int a(long param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == 0) {
            break L0;
          } else {
            uk.d(98);
            break L0;
          }
        }
        if (this.field_r < this.field_u) {
          this.field_t = this.field_t + (this.field_u - this.field_r);
          this.field_r = this.field_r + (-this.field_r + this.field_u);
          this.field_u = this.field_u + param0;
          return 1;
        } else {
          var4 = 0;
          L1: while (true) {
            this.field_u = this.field_u + param0;
            var4++;
            stackOut_4_0 = var4;
            stackIn_5_0 = stackOut_4_0;
            L2: while (true) {
              L3: {
                if (stackIn_5_0 >= 10) {
                  break L3;
                } else {
                  if ((this.field_u ^ -1L) > (this.field_r ^ -1L)) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = (this.field_u < this.field_r ? -1 : (this.field_u == this.field_r ? 0 : 1));
              stackIn_5_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var5 != 0) {
                continue L2;
              } else {
                L4: {
                  if (stackIn_8_0 < 0) {
                    this.field_u = this.field_r;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return var4;
              }
            }
          }
        }
    }

    final void a(int param0) {
        if (this.field_u > this.field_r) {
          this.field_r = this.field_r + (this.field_u - this.field_r);
          this.field_t = (long)param0;
          return;
        } else {
          this.field_t = (long)param0;
          return;
        }
    }

    public static void d(int param0) {
        field_s = null;
        if (param0 != 0) {
            return;
        }
        field_l = null;
        field_k = null;
    }

    uk() {
        this.field_r = 0L;
        this.field_t = 0L;
        this.field_u = 0L;
        this.field_o = 0;
        this.field_m = 1;
        this.field_p = new long[10];
        this.field_r = System.nanoTime();
        this.field_u = System.nanoTime();
    }

    static {
        field_q = -1;
        field_k = "Low";
    }
}
