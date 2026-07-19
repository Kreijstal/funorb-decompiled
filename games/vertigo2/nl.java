/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends ug {
    private long[] field_l;
    private long field_h;
    static int field_d;
    private int field_i;
    private long field_f;
    static int[] field_e;
    private long field_j;
    private int field_g;
    static int field_k;

    final static er[] a(int param0, int param1, r param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param3 == 13416) {
              break L0;
            } else {
              field_k = -9;
              break L0;
            }
          }
          if (hq.a(124, param1, param0, param2)) {
            return vd.a((byte) 76);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("nl.K(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    private final long d(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        var2 = System.nanoTime();
        var4 = var2 + -this.field_f;
        this.field_f = var2;
        if (param0 == -9830) {
          if ((var4 ^ -1L) < 4999999999L) {
            if (5000000000L > var4) {
              this.field_l[this.field_g] = var4;
              this.field_g = (1 + this.field_g) % 10;
              if (-2 < (this.field_i ^ -1)) {
                this.field_i = this.field_i + 1;
                var6 = 0L;
                var8 = 1;
                L0: while (true) {
                  if (this.field_i < var8) {
                    return var6 / (long)this.field_i;
                  } else {
                    var6 = var6 + this.field_l[(-var8 + (this.field_g - -10)) % 10];
                    var8++;
                    continue L0;
                  }
                }
              } else {
                var6 = 0L;
                var8 = 1;
                L1: while (true) {
                  if (this.field_i < var8) {
                    return var6 / (long)this.field_i;
                  } else {
                    var6 = var6 + this.field_l[(-var8 + (this.field_g - -10)) % 10];
                    var8++;
                    continue L1;
                  }
                }
              }
            } else {
              var6 = 0L;
              var8 = 1;
              L2: while (true) {
                if (this.field_i < var8) {
                  return var6 / (long)this.field_i;
                } else {
                  var6 = var6 + this.field_l[(-var8 + (this.field_g - -10)) % 10];
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            var6 = 0L;
            var8 = 1;
            L3: while (true) {
              if (this.field_i < var8) {
                return var6 / (long)this.field_i;
              } else {
                var6 = var6 + this.field_l[(-var8 + (this.field_g - -10)) % 10];
                var8++;
                continue L3;
              }
            }
          }
        } else {
          return -86L;
        }
    }

    final long a(int param0) {
        this.field_h = this.field_h + this.d(-9830);
        int var2 = -114 / ((param0 - 8) / 62);
        if (!(this.field_j <= this.field_h)) {
            return (-this.field_h + this.field_j) / 1000000L;
        }
        return 0L;
    }

    final void b(int param0) {
        L0: {
          if (this.field_j > this.field_h) {
            this.field_h = this.field_h + (-this.field_h + this.field_j);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -1) {
          return;
        } else {
          this.field_f = 0L;
          return;
        }
    }

    final static boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 107) {
          L0: {
            field_k = -83;
            if (250 >= hm.field_F) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (250 >= hm.field_F) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void e(int param0) {
        int var1 = 71 % ((70 - param0) / 39);
        field_e = null;
    }

    final int a(boolean param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            break L0;
          }
        }
        if ((this.field_j ^ -1L) < (this.field_h ^ -1L)) {
          this.field_f = this.field_f + (this.field_j - this.field_h);
          this.field_h = this.field_h + (this.field_j - this.field_h);
          this.field_j = this.field_j + param1;
          return 1;
        } else {
          var4 = 0;
          L1: while (true) {
            L2: {
              this.field_j = this.field_j + param1;
              var4++;
              if (var4 >= 10) {
                break L2;
              } else {
                if ((this.field_j ^ -1L) > (this.field_h ^ -1L)) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if ((this.field_h ^ -1L) < (this.field_j ^ -1L)) {
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

    nl() {
        this.field_i = 1;
        this.field_h = 0L;
        this.field_l = new long[10];
        this.field_f = 0L;
        this.field_j = 0L;
        this.field_g = 0;
        this.field_h = System.nanoTime();
        this.field_j = System.nanoTime();
    }

    static {
        field_e = new int[]{14, 15, 16, 36, 7};
    }
}
