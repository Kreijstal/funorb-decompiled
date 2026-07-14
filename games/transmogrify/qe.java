/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends qg {
    private ti field_y;
    static String field_H;
    private ti field_C;
    static String field_I;
    static ti[] field_F;
    private ti[] field_D;
    private int field_G;
    boolean field_w;
    int field_J;
    static kh field_x;
    private int field_u;
    private ti field_K;
    private int field_M;
    private int field_L;
    private int field_t;
    private int field_B;
    static String[] field_E;
    static int[] field_z;
    static String field_v;
    static String field_A;

    private final ti h(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Transmogrify.field_A ? 1 : 0;
        int var2 = ((qe) this).field_h >> -2114180767;
        ti var3 = new ti(var2, ((qe) this).field_h);
        oj.a(var3, 256);
        for (var4 = 0; var4 < ((qe) this).field_h; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((qe) this).field_h));
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(var6 * 255.0) : 255;
                }
                sb.a(var5, var4, var8 << 408496040 | var8 | var8 << 1557073104);
            }
        }
        if (param0 != -29239) {
            field_E = null;
        }
        fi.c(true);
        return var3;
    }

    final void a(boolean param0, int param1, int param2) {
        ((qe) this).field_u = (param1 & 16711422) >> -1813204703;
        ((qe) this).field_L = 8355711 & param2 >> -1606387295;
        ((qe) this).field_B = param1;
        ((qe) this).field_M = param2;
        this.c(false);
        if (!param0) {
            ((qe) this).a(false, 76, -81);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-109, param1, param2, param3, param4);
        int var6 = 118 / ((param0 - -29) / 53);
        this.c(false);
    }

    private final ti a(byte param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ti var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var13 = Transmogrify.field_A ? 1 : 0;
          var14 = new ti(((qe) this).field_t * 2, ((qe) this).field_h);
          oj.a(var14, param0 + 166);
          var5 = ((qe) this).field_h >> -1790979455;
          if (param0 == 90) {
            break L0;
          } else {
            ti discarded$1 = this.h(50);
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (var6 >= ((qe) this).field_h) {
            fi.c(true);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> -1974548927) * (-1 + ((qe) this).field_t * 2) % (((qe) this).field_t * 2);
              var8 = param2 & 16711935;
              var9 = 65280 & param2;
              var10 = var6 - var5;
              var11 = 128 + (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5));
              if (-257 >= (var11 ^ -1)) {
                stackOut_6_0 = var9 | var8;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = (16711680 & var11 * var9 | var11 * var8 & -16711936) >>> -1794144536;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_7_0;
              sb.d(var7, var6, ((qe) this).field_t, var12);
              sb.d(var7 - 2 * ((qe) this).field_t, var6, ((qe) this).field_t, var12);
              var9 = param1 & 65280;
              var8 = 16711935 & param1;
              if (var11 < 256) {
                stackOut_9_0 = (var9 * var11 & 16711680 | var11 * var8 & -16711936) >>> -811925688;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var9 | var8;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var12 = stackIn_10_0;
            sb.d(var7 - -((qe) this).field_t, var6, ((qe) this).field_t, var12);
            sb.d(-((qe) this).field_t + var7, var6, ((qe) this).field_t, var12);
            var6++;
            continue L1;
          }
        }
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        if (!(!((qe) this).field_w)) {
            ((qe) this).field_G = ((qe) this).field_G + 1;
            if (!(((qe) this).field_G <= ((qe) this).field_t * 2)) {
                ((qe) this).field_G = ((qe) this).field_G - ((qe) this).field_t * 2;
            }
        }
        if (param1 != -12) {
            field_v = null;
        }
    }

    private final void c(boolean param0) {
        if (param0) {
            ((qe) this).field_u = -108;
        }
        ((qe) this).field_D = new ti[]{this.a((byte) 90, ((qe) this).field_B, ((qe) this).field_M), this.a((byte) 90, ((qe) this).field_u, ((qe) this).field_L)};
        ((qe) this).field_y = this.h(-29239);
        ((qe) this).field_C = ((qe) this).field_y.c();
        ((qe) this).field_K = new ti(((qe) this).field_h >> 1507472769, ((qe) this).field_h);
    }

    private final void a(byte param0, ti param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Transmogrify.field_A ? 1 : 0;
          var5 = ((qe) this).field_l + param3;
          c.a(var5 + -((qe) this).field_y.field_n, ((qe) this).field_y.field_n + param3, (byte) -50, ((qe) this).field_h + param2, param2);
          var6 = -((qe) this).field_G + param3;
          if (param0 == -57) {
            break L0;
          } else {
            ti discarded$1 = this.h(-123);
            break L0;
          }
        }
        L1: while (true) {
          if (var6 >= var5) {
            L2: {
              fi.c(true);
              if (param3 - -((qe) this).field_y.field_n < sb.field_d) {
                break L2;
              } else {
                oj.a(((qe) this).field_K, 256);
                param1.c(-((qe) this).field_G, 0);
                param1.c(((qe) this).field_t * 2 - ((qe) this).field_G, 0);
                ((qe) this).field_C.b(0, 0);
                fi.c(true);
                ((qe) this).field_K.c(param3, param2);
                break L2;
              }
            }
            L3: {
              if (var5 + -((qe) this).field_y.field_n <= sb.field_b) {
                oj.a(((qe) this).field_K, 256);
                var7 = ((qe) this).field_G + ((qe) this).field_l - ((qe) this).field_y.field_n;
                L4: while (true) {
                  if (2 * ((qe) this).field_t >= var7) {
                    param1.c(-var7, 0);
                    param1.c(((qe) this).field_t * 2 - var7, 0);
                    ((qe) this).field_y.b(0, 0);
                    fi.c(true);
                    ((qe) this).field_K.c(-((qe) this).field_y.field_n + var5, param2);
                    break L3;
                  } else {
                    var7 = var7 - 2 * ((qe) this).field_t;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            return;
          } else {
            param1.c(var6, param2);
            var6 = var6 + param1.field_n;
            continue L1;
          }
        }
    }

    qe(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> -1277422143, param6 >> 342186241 & 8355711);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (0 != param2) {
            return;
        }
        int var5 = -77 % ((param3 - 77) / 34);
        int var6 = ((qe) this).field_p + param0;
        int var7 = ((qe) this).field_n + param1;
        this.a((byte) -57, ((qe) this).field_D[0], var7, var6);
        if (65536 > ((qe) this).field_J) {
            c.a(((qe) this).field_l + var6, (((qe) this).field_l * ((qe) this).field_J >> -156630320) + var6, (byte) -50, ((qe) this).field_h + var7, var7);
            this.a((byte) -57, ((qe) this).field_D[1], var7, var6);
            fi.c(true);
        }
    }

    public static void i(int param0) {
        field_E = null;
        field_A = null;
        field_F = null;
        field_z = null;
        field_H = null;
        if (param0 != -156630320) {
            qe.i(-7);
        }
        field_x = null;
        field_v = null;
        field_I = null;
    }

    private qe(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((qe) this).field_L = param7;
        ((qe) this).field_t = param4;
        ((qe) this).field_M = param5;
        ((qe) this).field_u = param8;
        ((qe) this).field_B = param6;
        ((qe) this).a(75, param1, param0, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Passwords can only contain letters and numbers";
        field_I = "Continue";
        field_x = new kh("");
        field_v = "Instructions";
        field_E = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_z = new int[8192];
        field_A = "Age:";
    }
}
