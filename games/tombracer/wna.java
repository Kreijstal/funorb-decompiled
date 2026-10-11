/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wna extends ci {
    static hua field_n;
    private int[][] field_o;
    private int[] field_m;

    private final void d(int param0) {
        int var7 = 0;
        int var10 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var8;
        int var9;
        int[] var11;
        int var12;
        int var13;
        int var14;
        int[] var15;
        int[] var18;
        var14 = TombRacer.field_G ? 1 : 0;
        var3 = -88 % ((param0 - 19) / 43);
        var6 = this.field_o.length;
        if (var6 <= 0) {
          return;
        }
        for (var7 = 0; var7 < 257; var7++) {
          var8 = 0;
          var9 = var7 << 4;
          for (var10 = 0; var6 > var10; var10++) {
            if (this.field_o[var10][0] <= var9) {
              var8++;
              continue;
            }
            break;
          }
          if (var6 > var8) {
            var18 = this.field_o[var8];
            if (var8 > 0) {
              var11 = this.field_o[var8 - 1];
              var12 = (var9 - var11[0] << 12) / (-var11[0] + var18[0]);
              var13 = -var12 + 4096;
              var4 = var13 * var11[2] + var12 * var18[2] >> 12;
              var5 = var13 * var11[3] + var18[3] * var12 >> 12;
              var2 = var12 * var18[1] + var11[1] * var13 >> 12;
            } else {
              var5 = var18[3];
              var2 = var18[1];
              var4 = var18[2];
            }
          } else {
            var15 = this.field_o[var6 - 1];
            var5 = var15[3];
            var4 = var15[2];
            var2 = var15[1];
          }
          var5 = var5 >> 4;
          var4 = var4 >> 4;
          var2 = var2 >> 4;
          if (0 > var4) {
            var4 = 0;
          } else {
            if (255 < var4) {
              var4 = 255;
            }
          }
          if (0 <= var5) {
            if (var5 > 255) {
              var5 = 255;
            }
          } else {
            var5 = 0;
          }
          if (0 > var2) {
            var2 = 0;
          } else {
            if (var2 > 255) {
              var2 = 255;
            }
          }
          this.field_m[var7] = fh.a(var5, fh.a(var2 << 16, var4 << 8));
        }
        return;
    }

    final void a(byte param0, uia param1, int param2) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 == 0) {
            var4_int = param1.h(param0 + 148);
            if (var4_int == 0) {
              this.field_o = new int[param1.h(255)][4];
              for (var5 = 0; this.field_o.length > var5; var5++) {
                this.field_o[var5][0] = param1.d(127);
                this.field_o[var5][1] = param1.h(kha.b((int) param0, 148)) << 4;
                this.field_o[var5][2] = param1.h(255) << 4;
                this.field_o[var5][3] = param1.h(255) << 4;
              }
            } else {
              this.d(var4_int, -6333);
            }
          }
          if (param0 == 107) {
            return;
          }
          wna.d((byte) 91);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("wna.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        if (param0 != -109) {
          wna.c(103);
          field_n = null;
          return;
        }
        field_n = null;
    }

    public wna() {
        super(1, false);
        this.field_m = new int[257];
    }

    private final void d(int param0, int param1) {
        int var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (0 != param0) {
          var3 = param0;
          if (var3 == 1) {
            this.field_o = new int[2][4];
            this.field_o[0][3] = 0;
            this.field_o[0][2] = 0;
            this.field_o[0][0] = 0;
            this.field_o[0][1] = 0;
            this.field_o[1][1] = 4096;
            this.field_o[1][3] = 4096;
            this.field_o[1][0] = 4096;
            this.field_o[1][2] = 4096;
          } else {
            if (var3 == 2) {
              this.field_o = new int[8][4];
              this.field_o[0][0] = 0;
              this.field_o[0][2] = 2602;
              this.field_o[0][1] = 2650;
              this.field_o[0][3] = 2361;
              this.field_o[1][1] = 2313;
              this.field_o[1][3] = 1558;
              this.field_o[1][2] = 1799;
              this.field_o[1][0] = 2867;
              this.field_o[2][0] = 3072;
              this.field_o[2][2] = 1734;
              this.field_o[2][3] = 1413;
              this.field_o[2][1] = 2618;
              this.field_o[3][2] = 1220;
              this.field_o[3][0] = 3276;
              this.field_o[3][3] = 947;
              this.field_o[3][1] = 2296;
              this.field_o[4][2] = 963;
              this.field_o[4][0] = 3481;
              this.field_o[4][1] = 2072;
              this.field_o[4][3] = 722;
              this.field_o[5][2] = 2152;
              this.field_o[5][0] = 3686;
              this.field_o[5][3] = 1766;
              this.field_o[5][1] = 2730;
              this.field_o[6][2] = 1060;
              this.field_o[6][3] = 915;
              this.field_o[6][1] = 2232;
              this.field_o[6][0] = 3891;
              this.field_o[7][2] = 1413;
              this.field_o[7][0] = 4096;
              this.field_o[7][3] = 1140;
              this.field_o[7][1] = 1686;
              if (param1 != -6333) {
                field_n = (hua) null;
              }
              return;
            }
            if (var3 == 3) {
              this.field_o = new int[7][4];
              this.field_o[0][0] = 0;
              this.field_o[0][1] = 0;
              this.field_o[0][2] = 0;
              this.field_o[0][3] = 4096;
              this.field_o[1][2] = 4096;
              this.field_o[1][0] = 663;
              this.field_o[1][1] = 0;
              this.field_o[1][3] = 4096;
              this.field_o[2][1] = 0;
              this.field_o[2][2] = 4096;
              this.field_o[2][0] = 1363;
              this.field_o[2][3] = 0;
              this.field_o[3][1] = 4096;
              this.field_o[3][0] = 2048;
              this.field_o[3][2] = 4096;
              this.field_o[3][3] = 0;
              this.field_o[4][0] = 2727;
              this.field_o[4][2] = 0;
              this.field_o[4][1] = 4096;
              this.field_o[4][3] = 0;
              this.field_o[5][1] = 4096;
              this.field_o[5][0] = 3411;
              this.field_o[5][2] = 0;
              this.field_o[5][3] = 4096;
              this.field_o[6][3] = 4096;
              this.field_o[6][1] = 0;
              this.field_o[6][2] = 0;
              this.field_o[6][0] = 4096;
              if (param1 != -6333) {
                field_n = (hua) null;
              }
              return;
            }
            if (4 == var3) {
              this.field_o = new int[6][4];
              this.field_o[0][1] = 0;
              this.field_o[0][0] = 0;
              this.field_o[0][3] = 0;
              this.field_o[0][2] = 0;
              this.field_o[1][0] = 1843;
              this.field_o[1][2] = 0;
              this.field_o[1][1] = 0;
              this.field_o[1][3] = 1493;
              this.field_o[2][3] = 2939;
              this.field_o[2][1] = 0;
              this.field_o[2][2] = 0;
              this.field_o[2][0] = 2457;
              this.field_o[3][2] = 1124;
              this.field_o[3][3] = 3565;
              this.field_o[3][0] = 2781;
              this.field_o[3][1] = 0;
              this.field_o[4][2] = 3084;
              this.field_o[4][0] = 3481;
              this.field_o[4][3] = 4031;
              this.field_o[4][1] = 546;
              this.field_o[5][0] = 4096;
              this.field_o[5][1] = 4096;
              this.field_o[5][3] = 4096;
              this.field_o[5][2] = 4096;
              if (param1 != -6333) {
                field_n = (hua) null;
              }
              return;
            }
            if (var3 != 5) {
              if (var3 != 6) {
                throw new RuntimeException("Invalid gradient preset");
              }
              this.field_o = new int[4][4];
              this.field_o[0][2] = 4096;
              this.field_o[0][0] = 2048;
              this.field_o[0][1] = 0;
              this.field_o[0][3] = 0;
              this.field_o[1][1] = 4096;
              this.field_o[1][2] = 4096;
              this.field_o[1][0] = 2867;
              this.field_o[1][3] = 0;
              this.field_o[2][2] = 4096;
              this.field_o[2][0] = 3276;
              this.field_o[2][1] = 4096;
              this.field_o[2][3] = 0;
              this.field_o[3][3] = 0;
              this.field_o[3][2] = 0;
              this.field_o[3][1] = 4096;
              this.field_o[3][0] = 4096;
            } else {
              this.field_o = new int[16][4];
              this.field_o[0][0] = 0;
              this.field_o[0][3] = 321;
              this.field_o[0][2] = 192;
              this.field_o[0][1] = 80;
              this.field_o[1][3] = 562;
              this.field_o[1][2] = 449;
              this.field_o[1][0] = 155;
              this.field_o[1][1] = 321;
              this.field_o[2][2] = 690;
              this.field_o[2][3] = 803;
              this.field_o[2][0] = 389;
              this.field_o[2][1] = 578;
              this.field_o[3][3] = 1140;
              this.field_o[3][0] = 671;
              this.field_o[3][2] = 995;
              this.field_o[3][1] = 947;
              this.field_o[4][3] = 1509;
              this.field_o[4][1] = 1285;
              this.field_o[4][0] = 897;
              this.field_o[4][2] = 1397;
              this.field_o[5][0] = 1175;
              this.field_o[5][1] = 1525;
              this.field_o[5][2] = 1429;
              this.field_o[5][3] = 1413;
              this.field_o[6][3] = 1333;
              this.field_o[6][2] = 1461;
              this.field_o[6][1] = 1734;
              this.field_o[6][0] = 1368;
              this.field_o[7][2] = 1525;
              this.field_o[7][1] = 1413;
              this.field_o[7][0] = 1507;
              this.field_o[7][3] = 1702;
              this.field_o[8][1] = 1108;
              this.field_o[8][2] = 1590;
              this.field_o[8][3] = 2056;
              this.field_o[8][0] = 1736;
              this.field_o[9][3] = 2666;
              this.field_o[9][2] = 2056;
              this.field_o[9][1] = 1766;
              this.field_o[9][0] = 2088;
              this.field_o[10][1] = 2409;
              this.field_o[10][3] = 3276;
              this.field_o[10][0] = 2355;
              this.field_o[10][2] = 2586;
              this.field_o[11][2] = 3148;
              this.field_o[11][3] = 3228;
              this.field_o[11][1] = 3116;
              this.field_o[11][0] = 2691;
              this.field_o[12][3] = 3196;
              this.field_o[12][0] = 3031;
              this.field_o[12][1] = 3806;
              this.field_o[12][2] = 3710;
              this.field_o[13][3] = 3019;
              this.field_o[13][2] = 3421;
              this.field_o[13][0] = 3522;
              this.field_o[13][1] = 3437;
              this.field_o[14][1] = 3116;
              this.field_o[14][2] = 3148;
              this.field_o[14][0] = 3727;
              this.field_o[14][3] = 3228;
              this.field_o[15][1] = 2377;
              this.field_o[15][3] = 2746;
              this.field_o[15][0] = 4096;
              this.field_o[15][2] = 2505;
            }
          }
        }
        if (param1 == -6333) {
          return;
        }
        field_n = (hua) null;
    }

    final static boolean c(int param0) {
        if (param0 > -111) {
          wna.d((byte) -62);
          if (cga.field_f < 20) {
            return true;
          }
          if (!wua.c((byte) 49)) {
            return true;
          }
          if (lsa.field_a <= 0) {
            return false;
          }
          if (!dg.b(-1)) {
            return true;
          }
          return false;
        }
        if (cga.field_f < 20) {
          return true;
        }
        if (!wua.c((byte) 49)) {
          return true;
        }
        if (lsa.field_a <= 0) {
          return false;
        }
        if (!dg.b(-1)) {
          return true;
        }
        return false;
    }

    final int[][] b(int param0, int param1) {
        int[][] var3;
        int var4;
        int[] var6;
        int[] var7;
        int[] var8;
        int var9;
        int var10;
        int[][] var11;
        int[][] var12;
        int[][] var14;
        int[] var17;
        int var4Lifetime1;
        int var9Lifetime1;
        int[] var6Lifetime1;
        int[] var7Lifetime1;
        int[] var8Lifetime1;
        int[] var17Lifetime1;
        var10 = TombRacer.field_G ? 1 : 0;
        var14 = this.field_h.a(param0, (byte) 108);
        var12 = var14;
        var11 = var12;
        var3 = var11;
        if (param1 == -1) {
          if (!this.field_h.field_f) {
            return var11;
          }
          var17 = this.c(0, -15, param0);
          var6 = var14[0];
          var7 = var14[1];
          var8 = var14[2];
          for (var9 = 0; ns.field_g > var9; var9++) {
            var4 = var17[var9] >> 4;
            if (var4 < 0) {
              var4 = 0;
            }
            if (var4 > 256) {
              var4 = 256;
            }
            var4 = this.field_m[var4];
            var6[var9] = sea.c(var4, 16711680) >> 12;
            var7[var9] = sea.c(var4 >> 4, 4080);
            var8[var9] = sea.c(var4, 255) << 4;
          }
          return var11;
        }
        this.field_o = (int[][]) null;
        if (!this.field_h.field_f) {
          return var11;
        }
        var17Lifetime1 = this.c(0, -15, param0);
        var6Lifetime1 = var14[0];
        var7Lifetime1 = var14[1];
        var8Lifetime1 = var14[2];
        for (var9Lifetime1 = 0; ns.field_g > var9Lifetime1; var9Lifetime1++) {
          var4Lifetime1 = var17Lifetime1[var9Lifetime1] >> 4;
          if (var4Lifetime1 < 0) {
            var4Lifetime1 = 0;
          }
          if (var4Lifetime1 > 256) {
            var4Lifetime1 = 256;
          }
          var4Lifetime1 = this.field_m[var4Lifetime1];
          var6Lifetime1[var9Lifetime1] = sea.c(var4Lifetime1, 16711680) >> 12;
          var7Lifetime1[var9Lifetime1] = sea.c(var4Lifetime1 >> 4, 4080);
          var8Lifetime1[var9Lifetime1] = sea.c(var4Lifetime1, 255) << 4;
        }
        return var11;
    }

    final void b(byte param0) {
        if (this.field_o == null) {
          this.d(1, -6333);
        }
        if (param0 == 116) {
          this.d(112);
          return;
        }
        this.d(-31);
        this.d(112);
    }

    static {
        field_n = new hua();
    }
}
