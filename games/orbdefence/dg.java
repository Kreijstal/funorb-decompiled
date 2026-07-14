/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends pj {
    private hj field_G;
    private int field_A;
    static String field_C;
    private int field_y;
    static int[] field_B;
    private int field_K;
    private hj[] field_E;
    private int field_H;
    int field_J;
    private hj field_F;
    boolean field_z;
    private hj field_L;
    private int field_x;
    private int field_D;

    dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> -21701087 & 8355711, (16711422 & param6) >> -1972298943);
    }

    private final void a(int param0, int param1, int param2, hj param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = OrbDefence.field_D ? 1 : 0;
          var5 = ((dg) this).field_m + param2;
          id.a(-((dg) this).field_L.field_o + var5, param2 + ((dg) this).field_L.field_o, ((dg) this).field_r + param1, param1, 734);
          var6 = param2 + -((dg) this).field_A;
          if (param0 > 100) {
            break L0;
          } else {
            hj discarded$1 = this.i(114);
            break L0;
          }
        }
        L1: while (true) {
          if (var6 >= var5) {
            L2: {
              oc.g((byte) -105);
              if (((dg) this).field_L.field_o + param2 < ul.field_i) {
                break L2;
              } else {
                de.a(-128, ((dg) this).field_G);
                param3.c(-((dg) this).field_A, 0);
                param3.c(-((dg) this).field_A + 2 * ((dg) this).field_D, 0);
                ((dg) this).field_F.e(0, 0);
                oc.g((byte) -105);
                ((dg) this).field_G.c(param2, param1);
                break L2;
              }
            }
            L3: {
              if (ul.field_e >= -((dg) this).field_L.field_o + var5) {
                de.a(-127, ((dg) this).field_G);
                var7 = ((dg) this).field_A + ((dg) this).field_m + -((dg) this).field_L.field_o;
                L4: while (true) {
                  if (((dg) this).field_D * 2 >= var7) {
                    param3.c(-var7, 0);
                    param3.c(-var7 + 2 * ((dg) this).field_D, 0);
                    ((dg) this).field_L.e(0, 0);
                    oc.g((byte) -105);
                    ((dg) this).field_G.c(var5 + -((dg) this).field_L.field_o, param1);
                    break L3;
                  } else {
                    var7 = var7 - 2 * ((dg) this).field_D;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            return;
          } else {
            param3.c(var6, param1);
            var6 = var6 + param3.field_o;
            continue L1;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 <= 113) {
            dg.a((byte) -26);
        }
        field_C = null;
        field_B = null;
    }

    private final hj i(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = OrbDefence.field_D ? 1 : 0;
        int var2 = ((dg) this).field_r >> 368752481;
        hj var3 = new hj(var2, ((dg) this).field_r);
        if (param0 < 33) {
            return null;
        }
        de.a(-125, var3);
        for (var4 = 0; var4 < ((dg) this).field_r; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((dg) this).field_r));
                var8 = 1;
                if (!(1.0 <= var6)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = var6 < 1.0 ? (int)(255.0 * var6) : 255;
                }
                ul.a(var5, var4, var8 << 200392840 | var8 | var8 << 1723690512);
            }
        }
        oc.g((byte) -105);
        return var3;
    }

    private final hj a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hj var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var13 = OrbDefence.field_D ? 1 : 0;
          if (param1 == -45) {
            break L0;
          } else {
            ((dg) this).field_J = 82;
            break L0;
          }
        }
        var14 = new hj(2 * ((dg) this).field_D, ((dg) this).field_r);
        de.a(-127, var14);
        var5 = ((dg) this).field_r >> 110509729;
        var6 = 0;
        L1: while (true) {
          if (var6 >= ((dg) this).field_r) {
            oc.g((byte) -105);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> 1059469665) * (2 * ((dg) this).field_D + -1) % (((dg) this).field_D * 2);
              var8 = 16711935 & param0;
              var9 = param0 & 65280;
              var10 = var6 - var5;
              var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
              if (var11 < 256) {
                stackOut_6_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> 1637544392;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = var9 | var8;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_7_0;
              ul.d(var7, var6, ((dg) this).field_D, var12);
              ul.d(-(((dg) this).field_D * 2) + var7, var6, ((dg) this).field_D, var12);
              var8 = 16711935 & param2;
              var9 = 65280 & param2;
              if (256 <= var11) {
                stackOut_9_0 = var9 | var8;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> -1927424632;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var12 = stackIn_10_0;
            ul.d(((dg) this).field_D + var7, var6, ((dg) this).field_D, var12);
            ul.d(var7 + -((dg) this).field_D, var6, ((dg) this).field_D, var12);
            var6++;
            continue L1;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.c(false);
    }

    final void a(int param0, int param1, int param2) {
        ((dg) this).field_y = param1;
        ((dg) this).field_H = param2 >> 1279763073 & 8355711;
        ((dg) this).field_x = param2;
        ((dg) this).field_K = (param1 & param0) >> -1024194527;
        this.c(false);
    }

    private final void c(boolean param0) {
        ((dg) this).field_E = new hj[]{this.a(((dg) this).field_y, (byte) -45, ((dg) this).field_x), this.a(((dg) this).field_K, (byte) -45, ((dg) this).field_H)};
        ((dg) this).field_L = this.i(90);
        if (param0) {
            ((dg) this).field_y = -26;
        }
        ((dg) this).field_F = ((dg) this).field_L.b();
        ((dg) this).field_G = new hj(((dg) this).field_r >> -103743775, ((dg) this).field_r);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (0 != param1) {
            return;
        }
        int var5 = ((dg) this).field_s + param3;
        int var6 = param0 - -((dg) this).field_n;
        this.a(121, var6, var5, ((dg) this).field_E[0]);
        if (param2 != 1048575) {
            return;
        }
        if (!(((dg) this).field_J >= 65536)) {
            id.a(var5 + ((dg) this).field_m, (((dg) this).field_m * ((dg) this).field_J >> -1169100496) + var5, var6 - -((dg) this).field_r, var6, 734);
            this.a(111, var6, var5, ((dg) this).field_E[1]);
            oc.g((byte) -105);
        }
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        if (((dg) this).field_z) {
            ((dg) this).field_A = ((dg) this).field_A + 1;
            if (((dg) this).field_A > ((dg) this).field_D * 2) {
                ((dg) this).field_A = ((dg) this).field_A - 2 * ((dg) this).field_D;
            }
        }
        if (param0 != -77) {
            ((dg) this).field_z = true;
        }
    }

    private dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((dg) this).field_H = param8;
        ((dg) this).field_K = param7;
        ((dg) this).field_x = param6;
        ((dg) this).field_y = param5;
        ((dg) this).field_D = param4;
        ((dg) this).a(param0, param1, param3, (byte) -90, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_B = new int[8192];
    }
}
