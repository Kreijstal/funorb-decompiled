/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CrossedSineBandsOperator extends TextureOperator {
    private int field_p;
    static boolean field_v;
    static String field_s;
    private int field_n;
    private int field_r;
    private int field_m;
    private int field_u;
    private int field_o;
    static String field_q;
    private int field_t;

    final int[] getMonochromeRow(int param0, int param1) {
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_33_2 = 0;
        int[] var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        var11 = TombRacer.field_G ? 1 : 0;
        var12 = this.monochromeCache.getRow((byte) -109, param1);
        var3 = var12;
        if (param0 != 1) {
          this.field_p = 94;
        }
        if (this.monochromeCache.rowMissed) {
          var4 = sj.textureRowCoords[param1] - 2048;
          for (var5 = 0; var5 < ns.textureWidth; var5++) {
            var6 = -2048 + ht.textureColumnCoords[var5];
            var7 = this.field_p + var6;
            if (var7 < -2048) {
              stackIn_8_0 = var7 + 4096;
            } else {
              stackIn_8_0 = var7;
            }
            var7Lifetime1 = stackIn_8_0;
            if (var7Lifetime1 <= 2048) {
              stackIn_11_0 = var7Lifetime1;
            } else {
              stackIn_11_0 = var7Lifetime1 - 4096;
            }
            var7Lifetime2 = stackIn_11_0;
            var8 = var4 + this.field_u;
            if (var8 < -2048) {
              stackIn_14_0 = 4096 + var8;
            } else {
              stackIn_14_0 = var8;
            }
            var8Lifetime1 = stackIn_14_0;
            if (var8Lifetime1 > 2048) {
              stackIn_17_0 = var8Lifetime1 - 4096;
            } else {
              stackIn_17_0 = var8Lifetime1;
            }
            var8Lifetime2 = stackIn_17_0;
            var9 = this.field_o + var6;
            if (var9 >= -2048) {
              stackIn_20_0 = var9;
            } else {
              stackIn_20_0 = 4096 + var9;
            }
            var9Lifetime1 = stackIn_20_0;
            if (var9Lifetime1 > 2048) {
              stackIn_23_0 = -4096 + var9Lifetime1;
            } else {
              stackIn_23_0 = var9Lifetime1;
            }
            var9Lifetime2 = stackIn_23_0;
            var10 = var4 + this.field_n;
            if (var10 >= -2048) {
              stackIn_26_0 = var10;
            } else {
              stackIn_26_0 = var10 + 4096;
            }
            var10Lifetime1 = stackIn_26_0;
            if (var10Lifetime1 > 2048) {
              stackIn_29_0 = var10Lifetime1 - 4096;
            } else {
              stackIn_29_0 = var10Lifetime1;
            }
            var10Lifetime2 = stackIn_29_0;
            stackIn_32_0 = var12;
            stackIn_32_1 = var5;
            if (!this.a(var8Lifetime2, var7Lifetime2, (byte) 84) &&
              !this.a(var9Lifetime2, (byte) -128, var10Lifetime2)) {
              stackIn_33_2 = 0;
            } else {
              stackIn_33_2 = 4096;
            }
            stackIn_32_0[stackIn_32_1] = stackIn_33_2;
          }
        }
        return var12;
    }

    final void decodeParameter(byte param0, PacketBuffer param1, int param2) {
        boolean discarded$0 = false;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param2;
          if (var4_int != 0) {
            if (1 != var4_int) {
              if (var4_int == 2) {
                this.field_o = param1.readUnsignedShort(122);
              } else {
                if (var4_int != 3) {
                  if (var4_int == 4) {
                    this.field_t = param1.readUnsignedShort(127);
                  } else {
                    if (var4_int != 5) {
                      if (var4_int == 6) {
                        this.field_r = param1.readUnsignedShort(122);
                      }
                    } else {
                      this.field_m = param1.readUnsignedShort(125);
                    }
                  }
                } else {
                  this.field_n = param1.readUnsignedShort(param0 + 17);
                }
              }
            } else {
              this.field_u = param1.readUnsignedShort(122);
            }
          } else {
            this.field_p = param1.readUnsignedShort(param0 ^ 23);
          }
          if (param0 != 107) {
            discarded$0 = this.a(3, 43, (byte) 18);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("voa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void d(int param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        bb var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        kb var6_ref_kb = null;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        BitPacketBuffer var28 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          var28 = WeaveOperator.field_q;
          if (param0 > -48) {
            return;
          }
          var2 = var28.readUnsignedByte(255);
          if (var2 == 0) {
            var3 = var28.readUnsignedShort(122);
            var4 = (bb) (mg.field_b.first(-80));
            while (var4 != null) {
              if (var4.field_n != var3) {
                var4 = (bb) (mg.field_b.next(124));
                continue;
              }
              break;
            }
            if (var4 == null) {
              dea.a(60);
              return;
            }
            var5 = var28.readUnsignedByte(255);
            if (var5 != 0) {
              var6 = var4.field_j;
              StripesOperator.field_s[0].field_a = MenuEntry.field_k;
              StripesOperator.field_s[0].field_c = null;
              StripesOperator.field_s[0].field_d = false;
              var7 = var4.field_i;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                StripesOperator.field_s[var8_int].field_a = var28.readString((byte) -76);
                StripesOperator.field_s[var8_int].field_d = false;
                if (var28.readUnsignedByte(255) == 1) {
                  StripesOperator.field_s[var8_int].field_c = var28.readString((byte) -76);
                } else {
                  StripesOperator.field_s[var8_int].field_c = null;
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_k = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_o = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6 * var7];
              var4.field_p = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var28.readUnsignedByte(255);
              if (var18 > 0) {
                for (var19 = 0; var18 > var19; var19++) {
                  var20 = var28.readUnsignedByte(255);
                  var21 = StripesOperator.field_s[var20].field_a;
                  var22 = var28.readLong(290646880);
                  var24 = var28.position;
                  if (var19 < var6) {
                    var8[0][var12] = var21;
                    var9[0][var12] = StripesOperator.field_s[var20].field_c;
                    var10[0][var12] = var22;
                    for (var25 = 0; var25 < var7; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var28.readInt(-41);
                    }
                    var12++;
                  }
                  if (var21 != null &&
                    MiscItemBehaviour.a(var21, 0)) {
                    var8[1][var13] = MenuEntry.field_k;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var28.position = var24;
                    var13++;
                    for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var28.readInt(121);
                    }
                  }
                  if (var14 < var6 &&
                    !StripesOperator.field_s[var20].field_d) {
                    StripesOperator.field_s[var20].field_d = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = StripesOperator.field_s[var20].field_c;
                    var10[2][var14] = var22;
                    var14++;
                    var28.position = var24;
                    for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var28.readInt(-105);
                    }
                  }
                }
              }
            }
            var4.field_h = true;
            var4.unlink(125);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var28.readUnsignedShort(125);
            var4_long = var28.readLong(290646880);
            var6_ref_kb = (kb) (nn.field_a.first(-80));
            while (var6_ref_kb != null) {
              if (var6_ref_kb.field_l != var3Lifetime1) {
                var6_ref_kb = (kb) (nn.field_a.next(122));
                continue;
              }
              break;
            }
            if (var6_ref_kb == null) {
              dea.a(60);
              return;
            }
            var6_ref_kb.field_h = var4_long;
            var6_ref_kb.unlink(39);
            return;
          }
          ssa.a("HS1: " + kk.a(32), (byte) 121, (Throwable) null);
          dea.a(60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "voa.E(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          field_q = (String) null;
        }
        field_q = null;
        field_s = null;
    }

    final void b(byte param0) {
        tka.b((byte) 105);
        if (param0 != 116) {
          this.field_p = 92;
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, boolean param5, int param6, int param7, boolean param8, boolean param9) {
        int var11;
        var11 = TombRacer.field_G ? 1 : 0;
        if (!param1 && (SoftwareRasterizer.field_g != SceneLight.field_i ||
          BufferedSocket.field_g != SoftwareRasterizer.field_a) && (SoftwareRasterizer.field_a == gn.field_C.field_e &&
          gn.field_C.field_f == SoftwareRasterizer.field_g)) {
          if (null != C2SChooseRewardPacket.field_a) {
            MazeComponent.c(false, 2);
          } else {
            if (null == WaveformOperator.field_n) {
              re.a(-29040);
            } else {
              MazeComponent.c(true, 2);
            }
          }
        }
        if (param1) {
          ava.field_d = ht.field_Xb;
        } else {
          ava.field_d = (-640 + SceneLight.field_i) / 2;
        }
        di.a((byte) -98, param1);
        if (mla.field_a > 0) {
          SimpleHoverMountComponent.a(param5, true, param1, param6);
        }
        MessageOverlay.field_t.field_x = tka.field_q.field_x;
        MessageOverlay.field_t.field_z = 1;
        if (0 < GameKeyHandler.field_a) {
          FallbackShaderEffect.a((byte) 1, param5, param1, param6);
        }
        if (0 < fp.field_e) {
          CoinBagItemComponent.a(param1, -1, param6, param8, param5);
        }
        if (tla.field_e &&
          C2SChooseRewardPacket.field_a.field_Mb >= C2SChooseRewardPacket.field_a.field_Jb) {
          RasterShape.field_e.field_X = false;
          bsa.field_j.field_vb.field_r = RandomAccessFileHandle.field_c;
          BridgeModel.a(-116, bsa.field_j.field_tb);
        } else {
          RasterShape.field_e.field_X = true;
          bsa.field_j.field_vb.field_r = null;
          ava.a(bsa.field_j, param6, param0, param9, 2);
        }
        PlayTrackCommand.a(param7, 0, param3, param0, param4, param6, param9);
        if (param2 != 4096) {
          return;
        }
        ava.a(tn.field_n, param6, param0, param9, 2);
        lh.field_a = lh.field_a + 1;
    }

    private final boolean a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        boolean stackIn_6_0 = false;
        var4 = (param2 + param0) * this.field_t >> 12;
        var5 = ColourFillOperator.field_r[(1047023 & 255 * var4) >> 12];
        var5 = (var5 << 12) / this.field_t;
        if (param1 != -128) {
          this.field_r = 96;
        }
        var5 = (var5 << 12) / this.field_r;
        var5 = this.field_m * var5 >> 12;
        stackIn_6_0 = (var5 > param2 - param0) && (-var5 < param2 - param0);
        return stackIn_6_0;
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        boolean stackIn_6_0 = false;
        var4 = (param0 - param1) * this.field_t >> 12;
        var5 = ColourFillOperator.field_r[(var4 * 255 & 1048064) >> 12];
        var5 = (var5 << 12) / this.field_t;
        var5 = (var5 << 12) / this.field_r;
        var5 = var5 * this.field_m >> 12;
        if (param2 < 51) {
          this.field_p = -19;
        }
        stackIn_6_0 = (var5 > param1 + param0) && (param1 + param0 > -var5);
        return stackIn_6_0;
    }

    public CrossedSineBandsOperator() {
        super(0, true);
        this.field_p = 2048;
        this.field_o = 0;
        this.field_r = 8192;
        this.field_n = 2048;
        this.field_m = 4096;
        this.field_u = 0;
        this.field_t = 12288;
    }

    static {
        field_v = true;
        field_q = "Watching";
    }
}
