/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ColorGradientTextureOperation extends TextureOperation {
    private int[][] markers;
    private int[] lookup;

    final int[][] getColorRow(int param0, int param1) {
        int[] var17 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var4 = 0;
        int var10 = VoidHunters.field_G;
        int[][] var14 = this.field_d.getRow(param1, (byte) -115);
        int[][] var12 = var14;
        int[][] var11 = var12;
        int[][] var3 = var11;
        if (param0 != 255) {
          return (int[][]) null;
        }
        if (this.field_d.field_g) {
          var17 = this.getInputMonochromeRow(0, param1, 255);
          var6 = var14[0];
          var7 = var14[1];
          var8 = var14[2];
          for (var9 = 0; var9 < TextHotspotRegion.textureWidth; var9++) {
            var4 = var17[var9] >> 4;
            if (var4 < 0) {
              var4 = 0;
            }
            if (var4 > 256) {
              var4 = 256;
            }
            var4 = this.lookup[var4];
            var6[var9] = dla.a(4080, var4 >> 12);
            var7[var9] = dla.a(4080, var4 >> 4);
            var8[var9] = dla.a(var4 << 4, 4080);
          }
        }
        return var11;
    }

    final void postDecode(byte param0) {
        if (null == this.markers) {
          this.setGradientPreset(true, 1);
        }
        this.buildGradientLookup((byte) 100);
        if (param0 >= -35) {
          this.markers = (int[][]) null;
        }
    }

    private final void buildGradientLookup(byte param0) {
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
        int[] var15;
        int[] var17;
        var13 = VoidHunters.field_G;
        var5 = this.markers.length;
        if (var5 > 0) {
          for (var6 = 0; var6 < 257; var6++) {
            var7 = 0;
            var8 = var6 << 4;
            for (var9 = 0; var5 > var9; var9++) {
              if (var8 >= this.markers[var9][0]) {
                var7++;
                continue;
              }
              break;
            }
            if (var5 <= var7) {
              var15 = this.markers[var5 - 1];
              var2 = var15[1];
              var3 = var15[2];
              var4 = var15[3];
            } else {
              var17 = this.markers[var7];
              if (var7 <= 0) {
                var4 = var17[3];
                var3 = var17[2];
                var2 = var17[1];
              } else {
                var10 = this.markers[var7 - 1];
                var11 = (var8 - var10[0] << 12) / (-var10[0] + var17[0]);
                var12 = 4096 - var11;
                var4 = var10[3] * var12 + var11 * var17[3] >> 12;
                var2 = var12 * var10[1] + var17[1] * var11 >> 12;
                var3 = var17[2] * var11 + var10[2] * var12 >> 12;
              }
            }
            var2 = var2 >> 4;
            var3 = var3 >> 4;
            var4 = var4 >> 4;
            if (var3 < 0) {
              var3 = 0;
            } else {
              if (255 < var3) {
                var3 = 255;
              }
            }
            if (var2 < 0) {
              var2 = 0;
            } else {
              if (var2 > 255) {
                var2 = 255;
              }
            }
            if (var4 < 0) {
              var4 = 0;
            } else {
              if (var4 > 255) {
                var4 = 255;
              }
            }
            this.lookup[var6] = SetAngularForceDownshift.a(var4, SetAngularForceDownshift.a(var3 << 8, var2 << 16));
          }
        }
        if (param0 < 93) {
          this.postDecode((byte) -97);
        }
    }

    final void decodeParameter(int param0, int param1, PacketBuffer param2) {
        int var5 = 0;
        int var4_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 == 0) {
            var4_int = param2.readUnsignedByte((byte) -115);
            if (var4_int == 0) {
              this.markers = new int[param2.readUnsignedByte((byte) -124)][4];
              for (var5 = 0; this.markers.length > var5; var5++) {
                this.markers[var5][0] = param2.readUnsignedShort(1869);
                this.markers[var5][1] = param2.readUnsignedByte((byte) -118) << 4;
                this.markers[var5][2] = param2.readUnsignedByte((byte) -101) << 4;
                this.markers[var5][3] = param2.readUnsignedByte((byte) -90) << 4;
              }
            } else {
              this.setGradientPreset(true, var4_int);
            }
          }
          if (param1 > -60) {
            this.markers = (int[][]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ckb.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public ColorGradientTextureOperation() {
        super(1, false);
        this.lookup = new int[257];
    }

    private final void setGradientPreset(boolean param0, int param1) {
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        if (!param0) {
          return;
        }
        if (param1 != 0) {
          var3 = param1;
          if (var3 != 1) {
            if (2 != var3) {
              if (var3 == 3) {
                this.markers = new int[7][4];
                this.markers[0][2] = 0;
                this.markers[0][0] = 0;
                this.markers[0][3] = 4096;
                this.markers[0][1] = 0;
                this.markers[1][1] = 0;
                this.markers[1][3] = 4096;
                this.markers[1][0] = 663;
                this.markers[1][2] = 4096;
                this.markers[2][3] = 0;
                this.markers[2][1] = 0;
                this.markers[2][2] = 4096;
                this.markers[2][0] = 1363;
                this.markers[3][2] = 4096;
                this.markers[3][0] = 2048;
                this.markers[3][3] = 0;
                this.markers[3][1] = 4096;
                this.markers[4][0] = 2727;
                this.markers[4][2] = 0;
                this.markers[4][1] = 4096;
                this.markers[4][3] = 0;
                this.markers[5][1] = 4096;
                this.markers[5][3] = 4096;
                this.markers[5][0] = 3411;
                this.markers[5][2] = 0;
                this.markers[6][2] = 0;
                this.markers[6][1] = 0;
                this.markers[6][3] = 4096;
                this.markers[6][0] = 4096;
              } else {
                if (var3 != 4) {
                  if (var3 == 5) {
                    this.markers = new int[16][4];
                    this.markers[0][3] = 321;
                    this.markers[0][0] = 0;
                    this.markers[0][1] = 80;
                    this.markers[0][2] = 192;
                    this.markers[1][2] = 449;
                    this.markers[1][3] = 562;
                    this.markers[1][0] = 155;
                    this.markers[1][1] = 321;
                    this.markers[2][2] = 690;
                    this.markers[2][0] = 389;
                    this.markers[2][1] = 578;
                    this.markers[2][3] = 803;
                    this.markers[3][1] = 947;
                    this.markers[3][0] = 671;
                    this.markers[3][2] = 995;
                    this.markers[3][3] = 1140;
                    this.markers[4][0] = 897;
                    this.markers[4][2] = 1397;
                    this.markers[4][3] = 1509;
                    this.markers[4][1] = 1285;
                    this.markers[5][1] = 1525;
                    this.markers[5][3] = 1413;
                    this.markers[5][2] = 1429;
                    this.markers[5][0] = 1175;
                    this.markers[6][1] = 1734;
                    this.markers[6][0] = 1368;
                    this.markers[6][3] = 1333;
                    this.markers[6][2] = 1461;
                    this.markers[7][0] = 1507;
                    this.markers[7][2] = 1525;
                    this.markers[7][3] = 1702;
                    this.markers[7][1] = 1413;
                    this.markers[8][1] = 1108;
                    this.markers[8][0] = 1736;
                    this.markers[8][2] = 1590;
                    this.markers[8][3] = 2056;
                    this.markers[9][0] = 2088;
                    this.markers[9][2] = 2056;
                    this.markers[9][1] = 1766;
                    this.markers[9][3] = 2666;
                    this.markers[10][2] = 2586;
                    this.markers[10][0] = 2355;
                    this.markers[10][1] = 2409;
                    this.markers[10][3] = 3276;
                    this.markers[11][2] = 3148;
                    this.markers[11][1] = 3116;
                    this.markers[11][0] = 2691;
                    this.markers[11][3] = 3228;
                    this.markers[12][0] = 3031;
                    this.markers[12][3] = 3196;
                    this.markers[12][2] = 3710;
                    this.markers[12][1] = 3806;
                    this.markers[13][0] = 3522;
                    this.markers[13][2] = 3421;
                    this.markers[13][3] = 3019;
                    this.markers[13][1] = 3437;
                    this.markers[14][0] = 3727;
                    this.markers[14][1] = 3116;
                    this.markers[14][3] = 3228;
                    this.markers[14][2] = 3148;
                    this.markers[15][2] = 2505;
                    this.markers[15][3] = 2746;
                    this.markers[15][1] = 2377;
                    this.markers[15][0] = 4096;
                  } else {
                    if (6 != var3) {
                      throw new RuntimeException("Invalid gradient preset");
                    }
                    this.markers = new int[4][4];
                    this.markers[0][2] = 4096;
                    this.markers[0][0] = 2048;
                    this.markers[0][1] = 0;
                    this.markers[0][3] = 0;
                    this.markers[1][0] = 2867;
                    this.markers[1][3] = 0;
                    this.markers[1][2] = 4096;
                    this.markers[1][1] = 4096;
                    this.markers[2][0] = 3276;
                    this.markers[2][1] = 4096;
                    this.markers[2][2] = 4096;
                    this.markers[2][3] = 0;
                    this.markers[3][2] = 0;
                    this.markers[3][1] = 4096;
                    this.markers[3][3] = 0;
                    this.markers[3][0] = 4096;
                  }
                } else {
                  this.markers = new int[6][4];
                  this.markers[0][0] = 0;
                  this.markers[0][1] = 0;
                  this.markers[0][2] = 0;
                  this.markers[0][3] = 0;
                  this.markers[1][0] = 1843;
                  this.markers[1][2] = 0;
                  this.markers[1][1] = 0;
                  this.markers[1][3] = 1493;
                  this.markers[2][2] = 0;
                  this.markers[2][0] = 2457;
                  this.markers[2][3] = 2939;
                  this.markers[2][1] = 0;
                  this.markers[3][3] = 3565;
                  this.markers[3][2] = 1124;
                  this.markers[3][0] = 2781;
                  this.markers[3][1] = 0;
                  this.markers[4][3] = 4031;
                  this.markers[4][1] = 546;
                  this.markers[4][2] = 3084;
                  this.markers[4][0] = 3481;
                  this.markers[5][1] = 4096;
                  this.markers[5][2] = 4096;
                  this.markers[5][3] = 4096;
                  this.markers[5][0] = 4096;
                }
              }
            } else {
              this.markers = new int[8][4];
              this.markers[0][2] = 2602;
              this.markers[0][0] = 0;
              this.markers[0][1] = 2650;
              this.markers[0][3] = 2361;
              this.markers[1][1] = 2313;
              this.markers[1][3] = 1558;
              this.markers[1][0] = 2867;
              this.markers[1][2] = 1799;
              this.markers[2][3] = 1413;
              this.markers[2][0] = 3072;
              this.markers[2][2] = 1734;
              this.markers[2][1] = 2618;
              this.markers[3][3] = 947;
              this.markers[3][2] = 1220;
              this.markers[3][0] = 3276;
              this.markers[3][1] = 2296;
              this.markers[4][3] = 722;
              this.markers[4][0] = 3481;
              this.markers[4][1] = 2072;
              this.markers[4][2] = 963;
              this.markers[5][1] = 2730;
              this.markers[5][2] = 2152;
              this.markers[5][3] = 1766;
              this.markers[5][0] = 3686;
              this.markers[6][3] = 915;
              this.markers[6][0] = 3891;
              this.markers[6][2] = 1060;
              this.markers[6][1] = 2232;
              this.markers[7][0] = 4096;
              this.markers[7][1] = 1686;
              this.markers[7][3] = 1140;
              this.markers[7][2] = 1413;
            }
          } else {
            this.markers = new int[2][4];
            this.markers[0][2] = 0;
            this.markers[0][1] = 0;
            this.markers[0][3] = 0;
            this.markers[0][0] = 0;
            this.markers[1][0] = 4096;
            this.markers[1][1] = 4096;
            this.markers[1][2] = 4096;
            this.markers[1][3] = 4096;
          }
        }
    }

    static {
    }
}
