/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends ji {
    private int[][] field_A;
    static java.math.BigInteger field_H;
    private int[] field_z;
    static long field_y;
    static wo[] field_E;
    static String field_D;
    static String field_C;
    static ei field_B;
    static int field_G;

    final static void d(int param0, int param1) {
        mi var2 = uh.field_Wb;
        var2.j(param1, 119);
        var2.f(2, param0 ^ 108);
        var2.f(4, 101);
        var2.f(hr.i(104), -97);
        if (param0 == 1) {
          return;
        }
        field_D = (String) null;
    }

    final int[][] b(int param0, int param1) {
        int var9 = 0;
        int var4 = 0;
        int var10 = Vertigo2.field_L ? 1 : 0;
        int[][] var14 = this.field_v.a(param1, -2);
        int[][] var12 = var14;
        int[][] var11 = var12;
        int[][] var3 = var11;
        if (!this.field_v.field_c) {
          if (param0 != -3780) {
            field_B = (ei) null;
            return var11;
          }
          return var11;
        }
        int[] var17 = this.a(0, -1, param1);
        int[] var6 = var14[0];
        int[] var7 = var14[1];
        int[] var8 = var14[2];
        for (var9 = 0; we.field_M > var9; var9++) {
          var4 = var17[var9] >> 4;
          if (0 > var4) {
            var4 = 0;
          }
          if (var4 > 256) {
            var4 = 256;
          }
          var4 = this.field_z[var4];
          var6[var9] = b.a(16711680, var4) >> 12;
          var7[var9] = b.a(var4 >> 4, 4080);
          var8[var9] = b.a(255, var4) << 4;
        }
        if (param0 == -3780) {
          return var11;
        }
        field_B = (ei) null;
        return var11;
    }

    private final void a(int param0, byte param1) {
        int var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param1 != 59) {
          field_y = 70L;
        }
        if (param0 == 0) {
          return;
        }
        var3 = param0;
        if (var3 == 1) {
          this.field_A = new int[2][4];
          this.field_A[0][1] = 0;
          this.field_A[0][3] = 0;
          this.field_A[0][0] = 0;
          this.field_A[0][2] = 0;
          this.field_A[1][2] = 4096;
          this.field_A[1][1] = 4096;
          this.field_A[1][3] = 4096;
          this.field_A[1][0] = 4096;
          return;
        }
        if (var3 == 2) {
          this.field_A = new int[8][4];
          this.field_A[0][3] = 2361;
          this.field_A[0][2] = 2602;
          this.field_A[0][1] = 2650;
          this.field_A[0][0] = 0;
          this.field_A[1][1] = 2313;
          this.field_A[1][0] = 2867;
          this.field_A[1][2] = 1799;
          this.field_A[1][3] = 1558;
          this.field_A[2][1] = 2618;
          this.field_A[2][0] = 3072;
          this.field_A[2][2] = 1734;
          this.field_A[2][3] = 1413;
          this.field_A[3][2] = 1220;
          this.field_A[3][3] = 947;
          this.field_A[3][1] = 2296;
          this.field_A[3][0] = 3276;
          this.field_A[4][3] = 722;
          this.field_A[4][1] = 2072;
          this.field_A[4][0] = 3481;
          this.field_A[4][2] = 963;
          this.field_A[5][3] = 1766;
          this.field_A[5][1] = 2730;
          this.field_A[5][0] = 3686;
          this.field_A[5][2] = 2152;
          this.field_A[6][3] = 915;
          this.field_A[6][2] = 1060;
          this.field_A[6][0] = 3891;
          this.field_A[6][1] = 2232;
          this.field_A[7][3] = 1140;
          this.field_A[7][0] = 4096;
          this.field_A[7][1] = 1686;
          this.field_A[7][2] = 1413;
          return;
        }
        if (3 == var3) {
          this.field_A = new int[7][4];
          this.field_A[0][3] = 4096;
          this.field_A[0][1] = 0;
          this.field_A[0][2] = 0;
          this.field_A[0][0] = 0;
          this.field_A[1][2] = 4096;
          this.field_A[1][3] = 4096;
          this.field_A[1][0] = 663;
          this.field_A[1][1] = 0;
          this.field_A[2][3] = 0;
          this.field_A[2][2] = 4096;
          this.field_A[2][0] = 1363;
          this.field_A[2][1] = 0;
          this.field_A[3][3] = 0;
          this.field_A[3][0] = 2048;
          this.field_A[3][1] = 4096;
          this.field_A[3][2] = 4096;
          this.field_A[4][3] = 0;
          this.field_A[4][2] = 0;
          this.field_A[4][1] = 4096;
          this.field_A[4][0] = 2727;
          this.field_A[5][2] = 0;
          this.field_A[5][0] = 3411;
          this.field_A[5][3] = 4096;
          this.field_A[5][1] = 4096;
          this.field_A[6][0] = 4096;
          this.field_A[6][2] = 0;
          this.field_A[6][1] = 0;
          this.field_A[6][3] = 4096;
          return;
        }
        if (var3 == 4) {
          this.field_A = new int[6][4];
          this.field_A[0][2] = 0;
          this.field_A[0][3] = 0;
          this.field_A[0][0] = 0;
          this.field_A[0][1] = 0;
          this.field_A[1][0] = 1843;
          this.field_A[1][1] = 0;
          this.field_A[1][3] = 1493;
          this.field_A[1][2] = 0;
          this.field_A[2][0] = 2457;
          this.field_A[2][1] = 0;
          this.field_A[2][2] = 0;
          this.field_A[2][3] = 2939;
          this.field_A[3][3] = 3565;
          this.field_A[3][0] = 2781;
          this.field_A[3][2] = 1124;
          this.field_A[3][1] = 0;
          this.field_A[4][2] = 3084;
          this.field_A[4][3] = 4031;
          this.field_A[4][0] = 3481;
          this.field_A[4][1] = 546;
          this.field_A[5][1] = 4096;
          this.field_A[5][2] = 4096;
          this.field_A[5][3] = 4096;
          this.field_A[5][0] = 4096;
          return;
        }
        if (5 != var3) {
          if (var3 != 6) {
            throw new RuntimeException("Invalid gradient preset");
          }
          this.field_A = new int[4][4];
          this.field_A[0][0] = 2048;
          this.field_A[0][3] = 0;
          this.field_A[0][2] = 4096;
          this.field_A[0][1] = 0;
          this.field_A[1][3] = 0;
          this.field_A[1][1] = 4096;
          this.field_A[1][2] = 4096;
          this.field_A[1][0] = 2867;
          this.field_A[2][2] = 4096;
          this.field_A[2][3] = 0;
          this.field_A[2][0] = 3276;
          this.field_A[2][1] = 4096;
          this.field_A[3][0] = 4096;
          this.field_A[3][1] = 4096;
          this.field_A[3][2] = 0;
          this.field_A[3][3] = 0;
          return;
        }
        this.field_A = new int[16][4];
        this.field_A[0][2] = 192;
        this.field_A[0][1] = 80;
        this.field_A[0][3] = 321;
        this.field_A[0][0] = 0;
        this.field_A[1][0] = 155;
        this.field_A[1][2] = 449;
        this.field_A[1][1] = 321;
        this.field_A[1][3] = 562;
        this.field_A[2][0] = 389;
        this.field_A[2][2] = 690;
        this.field_A[2][1] = 578;
        this.field_A[2][3] = 803;
        this.field_A[3][1] = 947;
        this.field_A[3][3] = 1140;
        this.field_A[3][2] = 995;
        this.field_A[3][0] = 671;
        this.field_A[4][3] = 1509;
        this.field_A[4][1] = 1285;
        this.field_A[4][0] = 897;
        this.field_A[4][2] = 1397;
        this.field_A[5][1] = 1525;
        this.field_A[5][0] = 1175;
        this.field_A[5][2] = 1429;
        this.field_A[5][3] = 1413;
        this.field_A[6][1] = 1734;
        this.field_A[6][2] = 1461;
        this.field_A[6][3] = 1333;
        this.field_A[6][0] = 1368;
        this.field_A[7][1] = 1413;
        this.field_A[7][3] = 1702;
        this.field_A[7][0] = 1507;
        this.field_A[7][2] = 1525;
        this.field_A[8][0] = 1736;
        this.field_A[8][3] = 2056;
        this.field_A[8][1] = 1108;
        this.field_A[8][2] = 1590;
        this.field_A[9][1] = 1766;
        this.field_A[9][3] = 2666;
        this.field_A[9][0] = 2088;
        this.field_A[9][2] = 2056;
        this.field_A[10][2] = 2586;
        this.field_A[10][3] = 3276;
        this.field_A[10][0] = 2355;
        this.field_A[10][1] = 2409;
        this.field_A[11][3] = 3228;
        this.field_A[11][0] = 2691;
        this.field_A[11][2] = 3148;
        this.field_A[11][1] = 3116;
        this.field_A[12][1] = 3806;
        this.field_A[12][3] = 3196;
        this.field_A[12][2] = 3710;
        this.field_A[12][0] = 3031;
        this.field_A[13][3] = 3019;
        this.field_A[13][1] = 3437;
        this.field_A[13][0] = 3522;
        this.field_A[13][2] = 3421;
        this.field_A[14][0] = 3727;
        this.field_A[14][3] = 3228;
        this.field_A[14][2] = 3148;
        this.field_A[14][1] = 3116;
        this.field_A[15][1] = 2377;
        this.field_A[15][0] = 4096;
        this.field_A[15][3] = 2746;
        this.field_A[15][2] = 2505;
    }

    final void a(int param0) {
        if (this.field_A == null) {
          this.a(1, (byte) 59);
          if (param0 > -98) {
            field_E = (wo[]) null;
            this.g(2);
            return;
          }
          this.g(2);
          return;
        }
        if (param0 <= -98) {
          this.g(2);
          return;
        }
        field_E = (wo[]) null;
        this.g(2);
    }

    public static void b(byte param0) {
        field_C = null;
        field_H = null;
        field_E = null;
        int var1 = 35 % ((param0 + 50) / 61);
        field_D = null;
        field_B = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param2 != 915) {
          return true;
        }
        return ch.a(param1, (byte) 63, param0, param3);
    }

    final void a(byte param0, int param1, ed param2) {
        int var5 = 0;
        int var4_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 == 0) {
            var4_int = param2.h(-11);
            if (var4_int == 0) {
              this.field_A = new int[param2.h(param0 ^ -101)][4];
              for (var5 = 0; this.field_A.length > var5; var5++) {
                this.field_A[var5][0] = param2.a((byte) -11);
                this.field_A[var5][1] = param2.h(-11) << 4;
                this.field_A[var5][2] = param2.h(-11) << 4;
                this.field_A[var5][3] = param2.h(-11) << 4;
              }
            } else {
              this.a(var4_int, (byte) 59);
            }
          }
          if (param0 == 110) {
            return;
          }
          field_E = (wo[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("jm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void g(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int[] var10;
        int var11;
        int var12;
        int var13;
        int[] var17;
        int[] var15;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int[] var10Lifetime1;
        int[] var17Lifetime1;
        int[] var15Lifetime1;
        var13 = Vertigo2.field_L ? 1 : 0;
        if (param0 == 2) {
          var5 = this.field_A.length;
          if (var5 <= 0) {
            return;
          }
          for (var6 = 0; var6 < 257; var6++) {
            var7 = 0;
            var8 = var6 << 4;
            for (var9 = 0; var5 > var9; var9++) {
              if (this.field_A[var9][0] <= var8) {
                var7++;
                continue;
              }
              break;
            }
            if (var5 <= var7) {
              var15 = this.field_A[-1 + var5];
              var4 = var15[3];
              var2 = var15[1];
              var3 = var15[2];
            } else {
              var17 = this.field_A[var7];
              if (0 < var7) {
                var10 = this.field_A[var7 - 1];
                var11 = (-var10[0] + var8 << 12) / (-var10[0] + var17[0]);
                var12 = -var11 + 4096;
                var4 = var11 * var17[3] + var10[3] * var12 >> 12;
                var3 = var10[2] * var12 + var17[2] * var11 >> 12;
                var2 = var17[1] * var11 + var10[1] * var12 >> 12;
              } else {
                var4 = var17[3];
                var3 = var17[2];
                var2 = var17[1];
              }
            }
            var3 = var3 >> 4;
            var4 = var4 >> 4;
            var2 = var2 >> 4;
            if (var4 >= 0) {
              if (var4 > 255) {
                var4 = 255;
              }
            } else {
              var4 = 0;
            }
            if (var3 < 0) {
              var3 = 0;
            } else {
              if (var3 > 255) {
                var3 = 255;
              }
            }
            if (0 > var2) {
              var2 = 0;
            } else {
              if (255 < var2) {
                var2 = 255;
              }
            }
            this.field_z[var6] = om.a(var4, om.a(var2 << 16, var3 << 8));
          }
          return;
        }
        field_G = -89;
        var5Lifetime1 = this.field_A.length;
        if (var5Lifetime1 <= 0) {
          return;
        }
        for (var6Lifetime1 = 0; var6Lifetime1 < 257; var6Lifetime1++) {
          var7Lifetime1 = 0;
          var8Lifetime1 = var6Lifetime1 << 4;
          for (var9Lifetime1 = 0; var5Lifetime1 > var9Lifetime1; var9Lifetime1++) {
            if (this.field_A[var9Lifetime1][0] <= var8Lifetime1) {
              var7Lifetime1++;
              continue;
            }
            break;
          }
          if (var5Lifetime1 <= var7Lifetime1) {
            var15Lifetime1 = this.field_A[-1 + var5Lifetime1];
            var4Lifetime1 = var15Lifetime1[3];
            var2Lifetime1 = var15Lifetime1[1];
            var3Lifetime1 = var15Lifetime1[2];
          } else {
            var17Lifetime1 = this.field_A[var7Lifetime1];
            if (0 < var7Lifetime1) {
              var10Lifetime1 = this.field_A[var7Lifetime1 - 1];
              var11Lifetime1 = (-var10Lifetime1[0] + var8Lifetime1 << 12) / (-var10Lifetime1[0] + var17Lifetime1[0]);
              var12Lifetime1 = -var11Lifetime1 + 4096;
              var4Lifetime1 = var11Lifetime1 * var17Lifetime1[3] + var10Lifetime1[3] * var12Lifetime1 >> 12;
              var3Lifetime1 = var10Lifetime1[2] * var12Lifetime1 + var17Lifetime1[2] * var11Lifetime1 >> 12;
              var2Lifetime1 = var17Lifetime1[1] * var11Lifetime1 + var10Lifetime1[1] * var12Lifetime1 >> 12;
            } else {
              var4Lifetime1 = var17Lifetime1[3];
              var3Lifetime1 = var17Lifetime1[2];
              var2Lifetime1 = var17Lifetime1[1];
            }
          }
          var3Lifetime1 = var3Lifetime1 >> 4;
          var4Lifetime1 = var4Lifetime1 >> 4;
          var2Lifetime1 = var2Lifetime1 >> 4;
          if (var4Lifetime1 >= 0) {
            if (var4Lifetime1 > 255) {
              var4Lifetime1 = 255;
            }
          } else {
            var4Lifetime1 = 0;
          }
          if (var3Lifetime1 < 0) {
            var3Lifetime1 = 0;
          } else {
            if (var3Lifetime1 > 255) {
              var3Lifetime1 = 255;
            }
          }
          if (0 > var2Lifetime1) {
            var2Lifetime1 = 0;
          } else {
            if (255 < var2Lifetime1) {
              var2Lifetime1 = 255;
            }
          }
          this.field_z[var6Lifetime1] = om.a(var4Lifetime1, om.a(var2Lifetime1 << 16, var3Lifetime1 << 8));
        }
    }

    public jm() {
        super(1, false);
        this.field_z = new int[257];
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (1 > var3_int) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = rc.a(param0, 320);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!jq.a(var4.charAt(param1), -96) &&
              !jq.a(var4.charAt(-1 + var4.length()), -96)) {
              var5 = 0;
              for (var6 = 0; param0.length() > var6; var6++) {
                var7 = param0.charAt(var6);
                if (!jq.a((char) var7, -96)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (var5 >= 2 &&
                  !param2) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("jm.B(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_E = null;
        field_C = "New Game";
        field_D = "You need to play 1 more rated game to unlock this option.";
        field_H = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
