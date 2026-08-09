/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends q implements lm {
    static String field_j;
    private int field_s;
    private int field_o;
    static String field_u;
    static String field_q;
    private int field_t;
    private int[] field_p;
    private int field_z;
    static int field_A;
    private int field_x;
    private int field_k;
    private int field_y;
    static volatile int field_r;
    private int field_w;
    private int field_m;
    private int field_l;
    private int field_v;
    private int field_n;

    public final long a(int param0, int param1) {
        long var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          if (param0 >= 0) {
            if (param0 <= this.field_v) {
              break L0;
            } else {
              param0 = this.field_v;
              break L0;
            }
          } else {
            param0 = 0;
            break L0;
          }
        }
        L1: {
          var3 = 0L;
          param1++;
          var5 = 0;
          if (param0 + param1 <= this.field_v) {
            break L1;
          } else {
            var6 = param0 * (this.field_y - this.field_x) + this.field_v * (this.field_x + this.field_t);
            var7 = param0 * (this.field_o - this.field_z) + this.field_v * (this.field_z + this.field_l);
            var8 = param0 * (this.field_s - this.field_k) + this.field_v * (this.field_k + this.field_m);
            var9 = param0 + param1 - this.field_v;
            param1 = param1 - var9;
            var5 = var5 + var9;
            var3 = var3 << var9;
            if (this.b(var6, var7, var8, this.field_v) != this.field_w) {
              break L1;
            } else {
              var3 = var3 | (long)((1 << var9) - 1);
              break L1;
            }
          }
        }
        var6 = param0 * this.field_y + param1 * this.field_x + this.field_v * this.field_t;
        var7 = param0 * this.field_o + param1 * this.field_z + this.field_v * this.field_l;
        var8 = param0 * this.field_s + param1 * this.field_k + this.field_v * this.field_m;
        L2: while (true) {
          L3: {
            if (param0 + param1 <= 0) {
              break L3;
            } else {
              if (var5 >= 64) {
                break L3;
              } else {
                var3 = var3 << 1;
                param1--;
                var5++;
                var6 = var6 - this.field_x;
                var7 = var7 - this.field_z;
                var8 = var8 - this.field_k;
                if (this.b(var6, var7, var8, this.field_v) != this.field_w) {
                  continue L2;
                } else {
                  var3 = var3 + 1L;
                  continue L2;
                }
              }
            }
          }
          L4: {
            if (var5 >= 64) {
              break L4;
            } else {
              var6 = param0 * (this.field_y - this.field_x) + this.field_v * this.field_t;
              var7 = param0 * (this.field_o - this.field_z) + this.field_v * this.field_l;
              var8 = param0 * (this.field_s - this.field_k) + this.field_v * this.field_m;
              var9 = 64 - var5;
              var3 = var3 << var9;
              if (this.b(var6, var7, var8, this.field_v) != this.field_w) {
                break L4;
              } else {
                var3 = var3 | (long)((1 << var9) - 1);
                break L4;
              }
            }
          }
          return var3;
        }
    }

    public final int a(int param0, int param1, int param2) {
        return (this.b(param0, param1, param2, 1) ^ -1) != (this.field_w ^ -1) ? 0 : 2;
    }

    private final int b(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= this.field_n) {
            return var5;
          } else {
            var7 = 6 * var6;
            var8 = (param0 - this.field_p[var7] * param3) * this.field_p[var7 + 3] + (param1 - this.field_p[var7 + 1] * param3) * this.field_p[var7 + 4] + (param2 - this.field_p[var7 + 2] * param3) * this.field_p[var7 + 5];
            if (var8 >= 0) {
              var5 = var5 + (1 << var6);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    public final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = fo.a(param11, (byte) -49, fo.a(param9, (byte) -20, param10));
        param10 = param10 / var13;
        param11 = param11 / var13;
        param9 = param9 / var13;
        int var14 = param9 * this.field_p[3] - -(this.field_p[4] * param10) - -(param11 * this.field_p[5]);
        int var15 = param11 * param11 + param10 * param10 + param9 * param9;
        int var16 = this.field_p[5] * this.field_p[5] + (this.field_p[3] * this.field_p[3] - -(this.field_p[4] * this.field_p[4]));
        double var17 = (double)var14 * (double)var14 / ((double)var16 * (double)var15);
        int var19 = this.field_p[3] * ((param6 + param3 + param0) / 3 - this.field_p[0]) + this.field_p[4] * ((param7 + (param1 - -param4)) / 3 + -this.field_p[1]) - -(this.field_p[5] * (-this.field_p[2] + (param5 + param2 + param8) / 3));
        double var20 = (double)var19 / Math.sqrt((double)var16);
        if (var17 > 0.99) {
            if (!(15.0 <= Math.abs(var20))) {
                return false;
            }
        }
        return (this.a(0, param2, param1, param0) | this.a(0, param5, param4, param3) | this.a(0, param8, param7, param6)) == this.field_w ? true : false;
    }

    private final int a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        var7 = Torquing.field_u;
        var5 = 0;
        var6 = param0;
        L0: while (true) {
          if (var6 >= this.field_n) {
            return var5;
          } else {
            if (0 < qm.a(true, param2, param3, 6 * var6, this.field_p, param1)) {
              var5 = var5 + (1 << var6);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_q = null;
        field_j = null;
        if (param0 <= 0) {
            return;
        }
        field_u = null;
    }

    public final boolean equals(Object param0) {
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            stackIn_1_0 = super.equals(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("pf.equals(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static boolean a(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 < -5) {
            break L0;
          } else {
            pf.a(16);
            break L0;
          }
        }
        L1: {
          L2: {
            if (vk.field_E == null) {
              break L2;
            } else {
              if (!ef.field_a.a(109)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public final String toString() {
        return super.toString();
    }

    public final boolean a(lm param0) {
        return this == param0;
    }

    public final boolean a() {
        return true;
    }

    public final void a(int[] param0, int[] param1, int[] param2, int param3) {
        try {
            this.field_v = param3;
            this.field_z = param1[1] + -param1[2];
            this.field_y = param0[0] + -param0[2];
            this.field_m = param2[2];
            this.field_o = param1[0] + -param1[2];
            this.field_x = param0[1] + -param0[2];
            this.field_k = param2[1] + -param2[2];
            this.field_l = param1[2];
            this.field_t = param0[2];
            this.field_s = -param2[2] + param2[0];
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "pf.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    pf(int[] param0, int[] param1, int[] param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              var4_int = param0.length;
              this.field_n = param0.length + 1;
              this.field_w = (1 << this.field_n) + -1;
              this.field_p = new int[6 * this.field_n];
              this.field_p[0] = param0[0];
              this.field_p[1] = param1[0];
              this.field_p[2] = param2[0];
              var5 = var4_int + -1;
              this.field_p[3] = -((-param2[0] + param2[1]) * (-param1[0] + param1[var5])) + (param1[1] + -param1[0]) * (param2[var5] + -param2[0]);
              this.field_p[4] = -((-param0[0] + param0[1]) * (-param2[0] + param2[var5])) + (-param2[0] + param2[1]) * (param0[var5] - param0[0]);
              this.field_p[5] = -((param0[var5] - param0[0]) * (param1[1] - param1[0])) + (param1[var5] - param1[0]) * (-param0[0] + param0[1]);
              wo.a((byte) 49, 3, this.field_p);
              if (0 <= qm.a(true, param1[0] - -12, 1 + param0[0], 0, this.field_p, -12 + param2[0])) {
                break L1;
              } else {
                this.field_p[4] = this.field_p[4] * -1;
                this.field_p[5] = this.field_p[5] * -1;
                this.field_p[3] = this.field_p[3] * -1;
                break L1;
              }
            }
            var6 = 1;
            L2: while (true) {
              if (var6 >= this.field_n) {
                break L0;
              } else {
                L3: {
                  var7 = var6 * 6;
                  var8 = (-1 + var6) % var4_int;
                  this.field_p[var7] = param0[var8];
                  this.field_p[1 + var7] = param1[var8];
                  this.field_p[2 + var7] = param2[var8];
                  var9 = var6 % var4_int;
                  this.field_p[3 + var7] = -((param2[var9] + -param2[var8]) * -12) + 12 * (-param1[var8] + param1[var9]);
                  this.field_p[var7 + 4] = (-param2[var8] + param2[var9]) * -1 + -(12 * (param0[var9] - param0[var8]));
                  this.field_p[5 + var7] = (param0[var9] + -param0[var8]) * -12 - (param1[var9] - param1[var8]) * -1;
                  wo.a((byte) 49, 3 + var7, this.field_p);
                  var10 = (1 + var6) % var4_int;
                  if (qm.a(true, param1[var10], param0[var10], var7, this.field_p, param2[var10]) >= 0) {
                    break L3;
                  } else {
                    this.field_p[var7 + 3] = this.field_p[var7 + 3] * -1;
                    this.field_p[4 + var7] = this.field_p[4 + var7] * -1;
                    this.field_p[var7 - -5] = this.field_p[var7 - -5] * -1;
                    break L3;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("pf.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
        }
    }

    static {
        field_j = "Type your email address again to make sure it's correct";
        field_q = "Quit to website";
        field_r = 0;
        field_u = "To Customer Support";
    }
}
