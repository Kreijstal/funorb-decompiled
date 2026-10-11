/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ada extends k {
    static ee field_l;
    static ee field_p;
    static boolean field_k;
    private int[][] field_n;
    private int[] field_o;
    static ee field_m;

    public ada() {
        super(1, false);
        this.field_o = new int[257];
    }

    final void a(byte param0, lu param1, int param2) {
        int var5 = 0;
        int var4_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = BachelorFridge.field_y;
        try {
          if (param2 == 0) {
            var4_int = param1.b(16711935);
            if (0 == var4_int) {
              this.field_n = new int[param1.b(16711935)][4];
              for (var5 = 0; var5 < this.field_n.length; var5++) {
                this.field_n[var5][0] = param1.e((byte) 124);
                this.field_n[var5][1] = param1.b(16711935) << 4;
                this.field_n[var5][2] = param1.b(16711935) << 4;
                this.field_n[var5][3] = param1.b(16711935) << 4;
              }
            } else {
              this.a(var4_int, (byte) 33);
            }
          }
          if (param0 != -71) {
            this.a(false, -103);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ada.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void e(int param0) {
        int var6 = 0;
        int var9 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var7;
        int var8;
        int[] var10;
        int var11;
        int var12;
        int var13;
        int[] var14;
        int[] var17;
        var13 = BachelorFridge.field_y;
        if (param0 != 578) {
          field_p = (ee) null;
        }
        var5 = this.field_n.length;
        if (var5 > 0) {
          for (var6 = 0; 257 > var6; var6++) {
            var7 = 0;
            var8 = var6 << 4;
            for (var9 = 0; var9 < var5; var9++) {
              if (var8 >= this.field_n[var9][0]) {
                var7++;
                continue;
              }
              break;
            }
            if (var5 > var7) {
              var17 = this.field_n[var7];
              if (var7 > 0) {
                var10 = this.field_n[var7 - 1];
                var11 = (-var10[0] + var8 << 12) / (-var10[0] + var17[0]);
                var12 = -var11 + 4096;
                var3 = var11 * var17[2] + var12 * var10[2] >> 12;
                var4 = var12 * var10[3] + var11 * var17[3] >> 12;
                var2 = var10[1] * var12 + var11 * var17[1] >> 12;
              } else {
                var3 = var17[2];
                var2 = var17[1];
                var4 = var17[3];
              }
            } else {
              var14 = this.field_n[var5 - 1];
              var3 = var14[2];
              var4 = var14[3];
              var2 = var14[1];
            }
            var2 = var2 >> 4;
            var4 = var4 >> 4;
            var3 = var3 >> 4;
            if (var3 < 0) {
              var3 = 0;
            } else {
              if (var3 > 255) {
                var3 = 255;
              }
            }
            if (0 <= var2) {
              if (var2 > 255) {
                var2 = 255;
              }
            } else {
              var2 = 0;
            }
            if (var4 >= 0) {
              if (var4 > 255) {
                var4 = 255;
              }
            } else {
              var4 = 0;
            }
            this.field_o[var6] = mp.a(mp.a(var2 << 16, var3 << 8), var4);
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3) {
        sna stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_10_2 = false;
        sna stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean stackIn_17_2 = false;
        sna stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        boolean stackIn_22_2 = false;
        pm.f(199);
        if (wk.field_a >= 0) {
          dea.field_m.field_Z = lga.a(true, new String[]{Integer.toString(wk.field_a)}, bla.field_q);
        } else {
          dea.field_m.field_Z = null;
        }
        stackIn_9_0 = ng.field_e;
        stackIn_9_1 = 19842;
        stackIn_10_2 = (param0) && (!param3) && (!eda.field_j) && (pw.field_w == null) && (null == rv.field_n);
        ((sna) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_10_2);
        stackIn_16_0 = ui.field_r;
        stackIn_16_1 = 19842;
        stackIn_17_2 = (param0) && (!param3) && (!eda.field_j) && (pw.field_w == null) && (rv.field_n == null);
        ((sna) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_17_2);
        stackIn_21_0 = sb.field_n;
        stackIn_21_1 = 19842;
        stackIn_22_2 = (param0) && (!param3) && (eda.field_j);
        ((sna) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_22_2);
        lia.field_j.field_a.f(18632);
        if (mc.field_g.field_R != 0) {
          efa.field_p = true;
        }
        if (ae.field_a.field_R != 0 && (bha.field_l ||
          !(dm.field_f <= 0) ||
          !(hea.field_r < 2) &&
          wga.field_q[12])) {
          aq.a(param2, (byte) 47);
        }
        if (vh.field_y.field_R != 0) {
          if (qha.field_c.length == 1 &&
            mt.field_s != qha.field_c[0]) {
            mt.field_s = qha.field_c[0];
          }
          dn.a(-25, mt.field_s, 0, param2, true, cla.field_a);
        }
        if (param1 != aja.field_l.field_R) {
          eda.field_j = false;
        }
    }

    final void d(byte param0) {
        if (null == this.field_n) {
          this.a(1, (byte) 33);
        }
        this.e(param0 ^ -514);
        if (param0 != -68) {
          this.d((byte) 96);
        }
    }

    final int[][] a(boolean param0, int param1) {
        int[] var17 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var4 = 0;
        int var10 = BachelorFridge.field_y;
        int[][] var14 = this.field_h.a(param1, -858);
        int[][] var12 = var14;
        int[][] var11 = var12;
        int[][] var3 = var11;
        if (this.field_h.field_b) {
          var17 = this.a(0, param1, (byte) 120);
          var6 = var14[0];
          var7 = var14[1];
          var8 = var14[2];
          for (var9 = 0; hh.field_d > var9; var9++) {
            var4 = var17[var9] >> 4;
            if (var4 < 0) {
              var4 = 0;
            }
            if (var4 > 256) {
              var4 = 256;
            }
            var4 = this.field_o[var4];
            var6[var9] = dda.a(var4, 16711680) >> 12;
            var7[var9] = dda.a(4080, var4 >> 4);
            var8[var9] = dda.a(var4 << 4, 4080);
          }
        }
        if (param0) {
          return (int[][]) null;
        }
        return var11;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var7 = 0;
        var6 = BachelorFridge.field_y;
        try {
          if (param4 < param0) {
            for (var5_int = param4; param0 > var5_int; var5_int++) {
              tj.field_b[var5_int][param2] = param1;
            }
          } else {
            var7 = param0;
            var5_int = var7;
            while (var7 < param4) {
              tj.field_b[var7][param2] = param1;
              var7++;
            }
          }
          if (param3 <= 72) {
            field_m = (ee) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var5), "ada.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        int var3;
        int var4;
        var4 = BachelorFridge.field_y;
        if (param1 != 33) {
          this.field_o = (int[]) null;
        }
        if (param0 != 0) {
          var3 = param0;
          if (var3 == 1) {
            this.field_n = new int[2][4];
            this.field_n[0][1] = 0;
            this.field_n[0][2] = 0;
            this.field_n[0][0] = 0;
            this.field_n[0][3] = 0;
            this.field_n[1][1] = 4096;
            this.field_n[1][0] = 4096;
            this.field_n[1][3] = 4096;
            this.field_n[1][2] = 4096;
          } else {
            if (var3 != 2) {
              if (var3 != 3) {
                if (var3 == 4) {
                  this.field_n = new int[6][4];
                  this.field_n[0][2] = 0;
                  this.field_n[0][0] = 0;
                  this.field_n[0][3] = 0;
                  this.field_n[0][1] = 0;
                  this.field_n[1][2] = 0;
                  this.field_n[1][3] = 1493;
                  this.field_n[1][0] = 1843;
                  this.field_n[1][1] = 0;
                  this.field_n[2][2] = 0;
                  this.field_n[2][1] = 0;
                  this.field_n[2][3] = 2939;
                  this.field_n[2][0] = 2457;
                  this.field_n[3][1] = 0;
                  this.field_n[3][2] = 1124;
                  this.field_n[3][0] = 2781;
                  this.field_n[3][3] = 3565;
                  this.field_n[4][0] = 3481;
                  this.field_n[4][2] = 3084;
                  this.field_n[4][3] = 4031;
                  this.field_n[4][1] = 546;
                  this.field_n[5][3] = 4096;
                  this.field_n[5][0] = 4096;
                  this.field_n[5][2] = 4096;
                  this.field_n[5][1] = 4096;
                } else {
                  if (var3 != 5) {
                    if (var3 != 6) {
                      throw new RuntimeException("Invalid gradient preset");
                    }
                    this.field_n = new int[4][4];
                    this.field_n[0][2] = 4096;
                    this.field_n[0][1] = 0;
                    this.field_n[0][0] = 2048;
                    this.field_n[0][3] = 0;
                    this.field_n[1][0] = 2867;
                    this.field_n[1][2] = 4096;
                    this.field_n[1][1] = 4096;
                    this.field_n[1][3] = 0;
                    this.field_n[2][0] = 3276;
                    this.field_n[2][2] = 4096;
                    this.field_n[2][3] = 0;
                    this.field_n[2][1] = 4096;
                    this.field_n[3][0] = 4096;
                    this.field_n[3][2] = 0;
                    this.field_n[3][3] = 0;
                    this.field_n[3][1] = 4096;
                  } else {
                    this.field_n = new int[16][4];
                    this.field_n[0][2] = 192;
                    this.field_n[0][3] = 321;
                    this.field_n[0][1] = 80;
                    this.field_n[0][0] = 0;
                    this.field_n[1][0] = 155;
                    this.field_n[1][3] = 562;
                    this.field_n[1][1] = 321;
                    this.field_n[1][2] = 449;
                    this.field_n[2][2] = 690;
                    this.field_n[2][1] = 578;
                    this.field_n[2][3] = 803;
                    this.field_n[2][0] = 389;
                    this.field_n[3][0] = 671;
                    this.field_n[3][1] = 947;
                    this.field_n[3][3] = 1140;
                    this.field_n[3][2] = 995;
                    this.field_n[4][1] = 1285;
                    this.field_n[4][0] = 897;
                    this.field_n[4][2] = 1397;
                    this.field_n[4][3] = 1509;
                    this.field_n[5][2] = 1429;
                    this.field_n[5][0] = 1175;
                    this.field_n[5][3] = 1413;
                    this.field_n[5][1] = 1525;
                    this.field_n[6][3] = 1333;
                    this.field_n[6][2] = 1461;
                    this.field_n[6][0] = 1368;
                    this.field_n[6][1] = 1734;
                    this.field_n[7][0] = 1507;
                    this.field_n[7][3] = 1702;
                    this.field_n[7][1] = 1413;
                    this.field_n[7][2] = 1525;
                    this.field_n[8][3] = 2056;
                    this.field_n[8][0] = 1736;
                    this.field_n[8][1] = 1108;
                    this.field_n[8][2] = 1590;
                    this.field_n[9][3] = 2666;
                    this.field_n[9][2] = 2056;
                    this.field_n[9][1] = 1766;
                    this.field_n[9][0] = 2088;
                    this.field_n[10][1] = 2409;
                    this.field_n[10][0] = 2355;
                    this.field_n[10][3] = 3276;
                    this.field_n[10][2] = 2586;
                    this.field_n[11][2] = 3148;
                    this.field_n[11][3] = 3228;
                    this.field_n[11][0] = 2691;
                    this.field_n[11][1] = 3116;
                    this.field_n[12][0] = 3031;
                    this.field_n[12][2] = 3710;
                    this.field_n[12][3] = 3196;
                    this.field_n[12][1] = 3806;
                    this.field_n[13][3] = 3019;
                    this.field_n[13][1] = 3437;
                    this.field_n[13][0] = 3522;
                    this.field_n[13][2] = 3421;
                    this.field_n[14][3] = 3228;
                    this.field_n[14][2] = 3148;
                    this.field_n[14][1] = 3116;
                    this.field_n[14][0] = 3727;
                    this.field_n[15][0] = 4096;
                    this.field_n[15][1] = 2377;
                    this.field_n[15][3] = 2746;
                    this.field_n[15][2] = 2505;
                  }
                }
              } else {
                this.field_n = new int[7][4];
                this.field_n[0][2] = 0;
                this.field_n[0][0] = 0;
                this.field_n[0][1] = 0;
                this.field_n[0][3] = 4096;
                this.field_n[1][1] = 0;
                this.field_n[1][2] = 4096;
                this.field_n[1][0] = 663;
                this.field_n[1][3] = 4096;
                this.field_n[2][3] = 0;
                this.field_n[2][2] = 4096;
                this.field_n[2][0] = 1363;
                this.field_n[2][1] = 0;
                this.field_n[3][1] = 4096;
                this.field_n[3][0] = 2048;
                this.field_n[3][2] = 4096;
                this.field_n[3][3] = 0;
                this.field_n[4][1] = 4096;
                this.field_n[4][2] = 0;
                this.field_n[4][0] = 2727;
                this.field_n[4][3] = 0;
                this.field_n[5][0] = 3411;
                this.field_n[5][2] = 0;
                this.field_n[5][3] = 4096;
                this.field_n[5][1] = 4096;
                this.field_n[6][3] = 4096;
                this.field_n[6][2] = 0;
                this.field_n[6][0] = 4096;
                this.field_n[6][1] = 0;
              }
            } else {
              this.field_n = new int[8][4];
              this.field_n[0][2] = 2602;
              this.field_n[0][1] = 2650;
              this.field_n[0][0] = 0;
              this.field_n[0][3] = 2361;
              this.field_n[1][2] = 1799;
              this.field_n[1][0] = 2867;
              this.field_n[1][3] = 1558;
              this.field_n[1][1] = 2313;
              this.field_n[2][3] = 1413;
              this.field_n[2][1] = 2618;
              this.field_n[2][2] = 1734;
              this.field_n[2][0] = 3072;
              this.field_n[3][2] = 1220;
              this.field_n[3][1] = 2296;
              this.field_n[3][3] = 947;
              this.field_n[3][0] = 3276;
              this.field_n[4][1] = 2072;
              this.field_n[4][0] = 3481;
              this.field_n[4][3] = 722;
              this.field_n[4][2] = 963;
              this.field_n[5][1] = 2730;
              this.field_n[5][3] = 1766;
              this.field_n[5][2] = 2152;
              this.field_n[5][0] = 3686;
              this.field_n[6][0] = 3891;
              this.field_n[6][2] = 1060;
              this.field_n[6][1] = 2232;
              this.field_n[6][3] = 915;
              this.field_n[7][2] = 1413;
              this.field_n[7][3] = 1140;
              this.field_n[7][1] = 1686;
              this.field_n[7][0] = 4096;
            }
          }
        }
    }

    public static void d(int param0) {
        field_m = null;
        field_p = null;
        field_l = null;
        if (param0 != -15840) {
          ada.a(false, -12, 60, true);
        }
    }

    static {
        field_k = false;
    }
}
