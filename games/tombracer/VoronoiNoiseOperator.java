/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class VoronoiNoiseOperator extends TextureOperator {
    static float field_u;
    private int field_n;
    private byte[] field_q;
    private int field_p;
    static String field_s;
    private short[] field_v;
    private int field_o;
    private int field_t;
    private int field_r;
    private int field_m;

    final static void a(boolean param0, int param1, UiComponent param2) {
        PlayerContextMenu var10 = null;
        Sprite var11 = null;
        String var12 = null;
        PlayerContextMenu var13 = null;
        Sprite var14 = null;
        String var15 = null;
        PlayerContextMenu var16 = null;
        Sprite var17 = null;
        String var18 = null;
        PlayerContextMenu var19 = null;
        Sprite var20 = null;
        String var21 = null;
        PlayerContextMenu var22 = null;
        Sprite var23 = null;
        String var24 = null;
        PlayerContextMenu var25 = null;
        Sprite var26 = null;
        String var27 = null;
        PlayerContextMenu var28 = null;
        String var30 = null;
        PlayerContextMenu var31 = null;
        Sprite var32 = null;
        String var33 = null;
        PlayerContextMenu var34 = null;
        Sprite var35 = null;
        String var36 = null;
        PlayerContextMenu var37 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Sprite var29 = null;
        Sprite var29Lifetime1;
        Sprite var29Lifetime2;
        Sprite var29Lifetime3;
        Sprite var29Lifetime4;
        Sprite var29Lifetime5;
        Sprite var29Lifetime6;
        Sprite var29Lifetime7;
        Sprite var29Lifetime1Lifetime1;
        Sprite var29Lifetime1Lifetime2;
        Sprite var29Lifetime1Lifetime3;
        Sprite var29Lifetime1Lifetime4;
        Sprite var29Lifetime1Lifetime5;
        if (param0) {
          return;
        }
        try {
          DateInputWidget.openPlayerContextMenu((ScrollPanel) null, -1, (String) null, 0L, -11635, (int[]) null, param2, param1, (String) null);
          if (param1 == 0) {
            var10 = hka.field_b;
            var11 = ColouriseOperator.field_m[0];
            var29 = var11;
            var29Lifetime3 = var11;
            var12 = TileRenderable.field_f;
            var10.field_f.addIconItem(var11, 11, var12, false);
            var13 = hka.field_b;
            var14 = ColouriseOperator.field_m[1];
            var29Lifetime4 = var14;
            var29Lifetime5 = var14;
            var15 = ImageProducerCanvasImageBuffer.field_k;
            var13.field_f.addIconItem(var14, 12, var15, false);
            var16 = hka.field_b;
            var17 = ColouriseOperator.field_m[2];
            var29Lifetime6 = var17;
            var29Lifetime7 = var17;
            var18 = LruNodeCache.field_f;
            var16.field_f.addIconItem(var17, 13, var18, false);
          }
          if (param1 == 1) {
            var19 = hka.field_b;
            var20 = ColouriseOperator.field_m[0];
            var29Lifetime1 = var20;
            var29Lifetime1Lifetime1 = var20;
            var21 = pda.field_a;
            var19.field_f.addIconItem(var20, 11, var21, false);
            var22 = hka.field_b;
            var23 = ColouriseOperator.field_m[1];
            var29Lifetime1Lifetime2 = var23;
            var29Lifetime1Lifetime3 = var23;
            var24 = ContextMenuRow.field_xb;
            var22.field_f.addIconItem(var23, 12, var24, param0);
            var25 = hka.field_b;
            var26 = ColouriseOperator.field_m[2];
            var29Lifetime1Lifetime4 = var26;
            var29Lifetime1Lifetime5 = var26;
            var27 = HardwareRidgedWaterNoise.field_w;
            var25.field_f.addIconItem(var26, 13, var27, false);
          }
          if (param1 == 2) {
            var28 = hka.field_b;
            var29Lifetime2 = ColouriseOperator.field_m[0];
            var30 = FormFieldRow.field_z;
            var28.field_f.addIconItem(var29Lifetime2, 11, var30, param0);
            var31 = hka.field_b;
            var32 = ColouriseOperator.field_m[1];
            var33 = ConstrainToFacingArcLocomotor.field_t;
            var31.field_f.addIconItem(var32, 12, var33, false);
            var34 = hka.field_b;
            var35 = ColouriseOperator.field_m[2];
            var36 = LegacyOpenGlUnlitEffect.field_c;
            var34.field_f.addIconItem(var35, 13, var36, false);
          }
          var37 = hka.field_b;
          var4 = param2.field_q;
          var5 = param2.field_A;
          var6 = param2.field_G;
          var7 = param2.field_t;
          var37.field_f.openAt(var5, var7, -67, var6, var4);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "nw.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static Boolean e(byte param0) {
        Boolean var1 = RendererMode.field_b;
        RendererMode.field_b = null;
        if (param0 <= 57) {
          return (Boolean) null;
        }
        return var1;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 118) {
          VoronoiNoiseOperator.releaseStatics((byte) 93);
        }
        field_s = null;
    }

    public VoronoiNoiseOperator() {
        super(0, true);
        this.field_o = 2;
        this.field_v = new short[512];
        this.field_q = new byte[512];
        this.field_r = 2048;
        this.field_n = 0;
        this.field_p = 1;
        this.field_m = 5;
        this.field_t = 5;
    }

    final int[] getMonochromeRow(int param0, int param1) {
        int var14 = 0;
        int var8 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int stackIn_10_0 = 0;
        byte[] stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_13_2 = 0;
        int stackIn_17_0 = 0;
        byte[] stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        double stackIn_39_0 = 0.0;
        int stackIn_40_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_1 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var18Lifetime1;
        var19 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
          return (int[]) null;
        }
        var3 = this.monochromeCache.getRow((byte) -109, param1);
        if (this.monochromeCache.rowMissed) {
          var4 = sj.textureRowCoords[param1] * this.field_m + 2048;
          var5 = var4 >> 12;
          var6 = var5 + 1;
          for (var14 = 0; var14 < LegacyOpenGlTurbulentTextureEffect.textureWidth; var14++) {
            CachedArchiveSource.field_l = 2147483647;
            CharacterPreview.field_h = 2147483647;
            CorpseList.field_b = 2147483647;
            TextFieldValidator.field_h = 2147483647;
            var15 = 2048 + LobbyGameWidget.textureColumnCoords[var14] * this.field_t;
            var16 = var15 >> 12;
            var17 = var16 + 1;
            for (var8 = var5 - 1; var8 <= var6; var8++) {
              stackIn_10_0 = 255;
              stackIn_10_1 = this.field_q;
              stackIn_10_2 = ~var8;
              stackIn_10_3 = ~this.field_m;
              if (stackIn_10_2 > stackIn_10_3) {
                stackIn_13_2 = var8;
              } else {
                stackIn_13_2 = -this.field_m + var8;
              }
              var12 = stackIn_10_0 & stackIn_10_1[stackIn_13_2 & 255];
              for (var7 = -1 + var16; var17 >= var7; var7++) {
                stackIn_17_0 = 2;
                stackIn_17_1 = this.field_q;
                stackIn_17_2 = var12;
                if (this.field_t <= var7) {
                  stackIn_18_3 = -this.field_t + var7;
                } else {
                  stackIn_18_3 = var7;
                }
                var13 = stackIn_17_0 * (stackIn_17_1[stackIn_17_2 + stackIn_18_3 & 255] & 255);
                incrementValue$0 = var13;
                var13++;
                var9 = var15 - (var7 << 12) - this.field_v[incrementValue$0];
                var10 = -(var8 << 12) + (-this.field_v[var13] + var4);
                var18 = this.field_p;
                if (var18 != 1) {
                  if (3 == var18) {
                    if (var10 >= 0) {
                      stackIn_30_0 = var10;
                    } else {
                      stackIn_30_0 = -var10;
                    }
                    var10 = stackIn_30_0;
                    if (0 <= var9) {
                      stackIn_33_0 = var9;
                    } else {
                      stackIn_33_0 = -var9;
                    }
                    var9 = stackIn_33_0;
                    stackIn_36_0 = (var10 < var9) ? var9 : var10;
                    var11 = stackIn_36_0;
                  } else {
                    if (var18 == 4) {
                      stackIn_39_0 = 4096.0;
                      if (var9 >= 0) {
                        stackIn_40_1 = var9;
                      } else {
                        stackIn_40_1 = -var9;
                      }
                      var9 = (int)(stackIn_39_0 * Math.sqrt((double)((float)stackIn_40_1 / 4096.0f)));
                      if (var10 < 0) {
                        stackIn_43_0 = -var10;
                      } else {
                        stackIn_43_0 = var10;
                      }
                      var10 = (int)(Math.sqrt((double)((float)stackIn_43_0 / 4096.0f)) * 4096.0);
                      var11 = var9 + var10;
                      var11 = var11 * var11 >> 12;
                    } else {
                      if (var18 != 5) {
                        if (var18 != 2) {
                          var11 = (int)(4096.0 * Math.sqrt((double)((float)(var9 * var9 + var10 * var10) / 16777216.0f)));
                        } else {
                          if (var9 >= 0) {
                            stackIn_48_0 = var9;
                          } else {
                            stackIn_48_0 = -var9;
                          }
                          if (var10 >= 0) {
                            stackIn_51_1 = var10;
                          } else {
                            stackIn_51_1 = -var10;
                          }
                          var11 = stackIn_48_0 + stackIn_51_1;
                        }
                      } else {
                        var10 = var10 * var10;
                        var9 = var9 * var9;
                        var11 = (int)(4096.0 * Math.sqrt(Math.sqrt((double)((float)(var10 + var9) / 16777216.0f))));
                      }
                    }
                  }
                } else {
                  var11 = var9 * var9 + var10 * var10 >> 12;
                }
                if (var11 < TextFieldValidator.field_h) {
                  CharacterPreview.field_h = CachedArchiveSource.field_l;
                  CachedArchiveSource.field_l = CorpseList.field_b;
                  CorpseList.field_b = TextFieldValidator.field_h;
                  TextFieldValidator.field_h = var11;
                } else {
                  if (var11 < CorpseList.field_b) {
                    CharacterPreview.field_h = CachedArchiveSource.field_l;
                    CachedArchiveSource.field_l = CorpseList.field_b;
                    CorpseList.field_b = var11;
                  } else {
                    if (CachedArchiveSource.field_l <= var11) {
                      if (CharacterPreview.field_h > var11) {
                        CharacterPreview.field_h = var11;
                      }
                    } else {
                      CharacterPreview.field_h = CachedArchiveSource.field_l;
                      CachedArchiveSource.field_l = var11;
                    }
                  }
                }
              }
            }
            var18Lifetime1 = this.field_o;
            if (var18Lifetime1 == 0) {
              var3[var14] = TextFieldValidator.field_h;
            } else {
              if (1 != var18Lifetime1) {
                if (var18Lifetime1 == 3) {
                  var3[var14] = CachedArchiveSource.field_l;
                } else {
                  if (var18Lifetime1 != 4) {
                    if (2 == var18Lifetime1) {
                      var3[var14] = CorpseList.field_b - TextFieldValidator.field_h;
                    }
                  } else {
                    var3[var14] = CharacterPreview.field_h;
                  }
                }
              } else {
                var3[var14] = CorpseList.field_b;
              }
            }
          }
        }
        return var3;
    }

    final void decodeParameter(byte param0, PacketBuffer param1, int param2) {
        int dupTemp$0 = 0;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 107) {
            this.field_v = (short[]) null;
          }
          var4_int = param2;
          if (0 == var4_int) {
            dupTemp$0 = param1.readUnsignedByte(param0 ^ 148);
            this.field_m = dupTemp$0;
            this.field_t = dupTemp$0;
          } else {
            if (var4_int == 1) {
              this.field_n = param1.readUnsignedByte(param0 + 148);
            } else {
              if (var4_int == 2) {
                this.field_r = param1.readUnsignedShort(122);
              } else {
                if (var4_int != 3) {
                  if (var4_int != 4) {
                    if (5 != var4_int) {
                      if (var4_int == 6) {
                        this.field_m = param1.readUnsignedByte(255);
                      }
                    } else {
                      this.field_t = param1.readUnsignedByte(255);
                    }
                  } else {
                    this.field_p = param1.readUnsignedByte(255);
                  }
                } else {
                  this.field_o = param1.readUnsignedByte(255);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("nw.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void generatePermutation(int param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        Random var5 = new Random((long)this.field_n);
        Random var2 = var5;
        int var3Lifetime1;
        this.field_v = new short[512];
        if (this.field_r > 0) {
          for (var3 = 0; 512 > var3; var3++) {
            this.field_v[var3] = (short)BufferedSocket.randomBelow(this.field_r, var5, 86);
          }
        }
        var3Lifetime1 = -16 / ((param0 + 54) / 37);
    }

    final void onDecoded(byte param0) {
        if (param0 != 116) {
          return;
        }
        this.field_q = TileGridCell.getPermutationTable(this.field_n, (byte) 76);
        this.generatePermutation(-94);
    }

    final static GraphicsToolkit createToolkit(int param0, int param1, TextureProvider param2, int param3, ResourceArchive param4, java.awt.Canvas param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        java.awt.Dimension var8 = null;
        UiComponent var9 = null;
        GraphicsToolkit stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 0;
          var7 = 0;
          if (param5 != null) {
            var8 = param5.getSize();
            var6_int = var8.width;
            var7 = var8.height;
          }
          if (param1 != -29355) {
            var9 = (UiComponent) null;
            VoronoiNoiseOperator.a(false, -120, (UiComponent) null);
          }
          stackIn_5_0 = GraphicsToolkit.createToolkit(param2, var7, param4, param3, var6_int, param0, param5, -17441);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("nw.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_s = "You have <%0> unread messages!";
    }
}
