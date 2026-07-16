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
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          if (param0 >= 0) {
            if (param0 <= ((pf) this).field_v) {
              break L0;
            } else {
              param0 = ((pf) this).field_v;
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
          if (param0 + param1 <= ((pf) this).field_v) {
            break L1;
          } else {
            var6 = param0 * (((pf) this).field_y - ((pf) this).field_x) + ((pf) this).field_v * (((pf) this).field_x + ((pf) this).field_t);
            var7 = param0 * (((pf) this).field_o - ((pf) this).field_z) + ((pf) this).field_v * (((pf) this).field_z + ((pf) this).field_l);
            var8 = param0 * (((pf) this).field_s - ((pf) this).field_k) + ((pf) this).field_v * (((pf) this).field_k + ((pf) this).field_m);
            var9 = param0 + param1 - ((pf) this).field_v;
            param1 = param1 - var9;
            var5 = var5 + var9;
            var3 = var3 << var9;
            if (this.b(var6, var7, var8, ((pf) this).field_v) != ((pf) this).field_w) {
              break L1;
            } else {
              var3 = var3 | (long)((1 << var9) - 1);
              break L1;
            }
          }
        }
        var6 = param0 * ((pf) this).field_y + param1 * ((pf) this).field_x + ((pf) this).field_v * ((pf) this).field_t;
        var7 = param0 * ((pf) this).field_o + param1 * ((pf) this).field_z + ((pf) this).field_v * ((pf) this).field_l;
        var8 = param0 * ((pf) this).field_s + param1 * ((pf) this).field_k + ((pf) this).field_v * ((pf) this).field_m;
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
                var6 = var6 - ((pf) this).field_x;
                var7 = var7 - ((pf) this).field_z;
                var8 = var8 - ((pf) this).field_k;
                if (this.b(var6, var7, var8, ((pf) this).field_v) != ((pf) this).field_w) {
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
              var6 = param0 * (((pf) this).field_y - ((pf) this).field_x) + ((pf) this).field_v * ((pf) this).field_t;
              var7 = param0 * (((pf) this).field_o - ((pf) this).field_z) + ((pf) this).field_v * ((pf) this).field_l;
              var8 = param0 * (((pf) this).field_s - ((pf) this).field_k) + ((pf) this).field_v * ((pf) this).field_m;
              var9 = 64 - var5;
              var3 = var3 << var9;
              if (this.b(var6, var7, var8, ((pf) this).field_v) != ((pf) this).field_w) {
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
        return (this.b(param0, param1, param2, 1) ^ -1) != (((pf) this).field_w ^ -1) ? 0 : 2;
    }

    private final int b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((pf) this).field_n) {
            return var5;
          } else {
            var7 = 6 * var6;
            var8 = (param0 - ((pf) this).field_p[var7] * param3) * ((pf) this).field_p[var7 + 3] + (param1 - ((pf) this).field_p[var7 + 1] * param3) * ((pf) this).field_p[var7 + 4] + (param2 - ((pf) this).field_p[var7 + 2] * param3) * ((pf) this).field_p[var7 + 5];
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
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        double var17 = 0.0;
        int var19 = 0;
        double var20 = 0.0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var13 = fo.a(param11, (byte) -49, fo.a(param9, (byte) -20, param10));
          param10 = param10 / var13;
          param11 = param11 / var13;
          param9 = param9 / var13;
          var14 = param9 * ((pf) this).field_p[3] - -(((pf) this).field_p[4] * param10) - -(param11 * ((pf) this).field_p[5]);
          var15 = param11 * param11 + param10 * param10 + param9 * param9;
          var16 = ((pf) this).field_p[5] * ((pf) this).field_p[5] + (((pf) this).field_p[3] * ((pf) this).field_p[3] - -(((pf) this).field_p[4] * ((pf) this).field_p[4]));
          var17 = (double)var14 * (double)var14 / ((double)var16 * (double)var15);
          var19 = ((pf) this).field_p[3] * ((param6 + param3 + param0) / 3 - ((pf) this).field_p[0]) + ((pf) this).field_p[4] * ((param7 + (param1 - -param4)) / 3 + -((pf) this).field_p[1]) - -(((pf) this).field_p[5] * (-((pf) this).field_p[2] + (param5 + param2 + param8) / 3));
          var20 = (double)var19 / Math.sqrt((double)var16);
          if (var17 <= 0.99) {
            break L0;
          } else {
            if (15.0 > Math.abs(var20)) {
              return false;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if ((this.a(0, param2, param1, param0) | this.a(0, param5, param4, param3) | this.a(0, param8, param7, param6)) != ((pf) this).field_w) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          } else {
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L1;
          }
        }
        return stackIn_7_0 != 0;
    }

    private final int a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Torquing.field_u;
        var5 = 0;
        var6 = param0;
        L0: while (true) {
          if (var6 >= ((pf) this).field_n) {
            return var5;
          } else {
            if (0 < qm.a(true, param2, param3, 6 * var6, ((pf) this).field_p, param1)) {
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
        return super.equals(param0);
    }

    final static boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
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
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public final String toString() {
        return super.toString();
    }

    public final boolean a(lm param0) {
        return this == (Object) (Object) param0;
    }

    public final boolean a() {
        return true;
    }

    public final void a(int[] param0, int[] param1, int[] param2, int param3) {
        ((pf) this).field_v = param3;
        ((pf) this).field_z = param1[1] + -param1[2];
        ((pf) this).field_y = param0[0] + -param0[2];
        ((pf) this).field_m = param2[2];
        ((pf) this).field_o = param1[0] + -param1[2];
        ((pf) this).field_x = param0[1] + -param0[2];
        ((pf) this).field_k = param2[1] + -param2[2];
        ((pf) this).field_l = param1[2];
        ((pf) this).field_t = param0[2];
        ((pf) this).field_s = -param2[2] + param2[0];
    }

    pf(int[] param0, int[] param1, int[] param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var4 = param0.length;
          ((pf) this).field_n = param0.length + 1;
          ((pf) this).field_w = (1 << ((pf) this).field_n) + -1;
          ((pf) this).field_p = new int[6 * ((pf) this).field_n];
          ((pf) this).field_p[0] = param0[0];
          ((pf) this).field_p[1] = param1[0];
          ((pf) this).field_p[2] = param2[0];
          var5 = var4 + -1;
          ((pf) this).field_p[3] = -((-param2[0] + param2[1]) * (-param1[0] + param1[var5])) + (param1[1] + -param1[0]) * (param2[var5] + -param2[0]);
          ((pf) this).field_p[4] = -((-param0[0] + param0[1]) * (-param2[0] + param2[var5])) + (-param2[0] + param2[1]) * (param0[var5] - param0[0]);
          ((pf) this).field_p[5] = -((param0[var5] - param0[0]) * (param1[1] - param1[0])) + (param1[var5] - param1[0]) * (-param0[0] + param0[1]);
          wo.a((byte) 49, 3, ((pf) this).field_p);
          if (0 <= qm.a(true, param1[0] - -12, 1 + param0[0], 0, ((pf) this).field_p, -12 + param2[0])) {
            break L0;
          } else {
            ((pf) this).field_p[4] = ((pf) this).field_p[4] * -1;
            ((pf) this).field_p[5] = ((pf) this).field_p[5] * -1;
            ((pf) this).field_p[3] = ((pf) this).field_p[3] * -1;
            break L0;
          }
        }
        var6 = 1;
        L1: while (true) {
          if (var6 >= ((pf) this).field_n) {
            return;
          } else {
            var7 = var6 * 6;
            var8 = (-1 + var6) % var4;
            ((pf) this).field_p[var7] = param0[var8];
            ((pf) this).field_p[1 + var7] = param1[var8];
            ((pf) this).field_p[2 + var7] = param2[var8];
            var9 = var6 % var4;
            ((pf) this).field_p[3 + var7] = -((param2[var9] + -param2[var8]) * -12) + 12 * (-param1[var8] + param1[var9]);
            ((pf) this).field_p[var7 + 4] = (-param2[var8] + param2[var9]) * -1 + -(12 * (param0[var9] - param0[var8]));
            ((pf) this).field_p[5 + var7] = (param0[var9] + -param0[var8]) * -12 - (param1[var9] - param1[var8]) * -1;
            wo.a((byte) 49, 3 + var7, ((pf) this).field_p);
            var10 = (1 + var6) % var4;
            if (qm.a(true, param1[var10], param0[var10], var7, ((pf) this).field_p, param2[var10]) < 0) {
              ((pf) this).field_p[var7 + 3] = ((pf) this).field_p[var7 + 3] * -1;
              ((pf) this).field_p[4 + var7] = ((pf) this).field_p[4 + var7] * -1;
              ((pf) this).field_p[var7 - -5] = ((pf) this).field_p[var7 - -5] * -1;
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Type your email address again to make sure it's correct";
        field_q = "Quit to website";
        field_r = 0;
        field_u = "To Customer Support";
    }
}
