/*
 * Decompiled by CFR-JS 0.4.0.
 */
class Sprite_dm extends SpriteState_wh {
    int[] pixels_field_v;

    private final void sampleBilinear_c(int destinationIndex_param0, int sourceX_param1, int sourceY_param2, int fractionX_param3, int fractionY_param4) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        L0: {
          var6 = sourceY_param2 * this.width_field_r + sourceX_param1;
          fractionX_param3 = fractionX_param3 & 4095;
          fractionY_param4 = fractionY_param4 & 4095;
          if (sourceY_param2 < 0) {
            var12 = 0;
            var11 = 0;
            var8 = 0;
            var7 = 0;
            break L0;
          } else {
            L1: {
              if (sourceX_param1 < 0) {
                var11 = 0;
                var7 = 0;
                break L1;
              } else {
                L2: {
                  var7 = this.pixels_field_v[var6];
                  if (var7 == 0) {
                    stackIn_5_0 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = (4096 - fractionX_param3) * (4096 - fractionY_param4);
                    break L2;
                  }
                }
                var11 = stackIn_5_0;
                break L1;
              }
            }
            if (sourceX_param1 >= this.width_field_r - 1) {
              var12 = 0;
              var8 = 0;
              break L0;
            } else {
              L3: {
                var8 = this.pixels_field_v[var6 + 1];
                if (var8 == 0) {
                  stackIn_11_0 = 0;
                  break L3;
                } else {
                  stackIn_11_0 = fractionX_param3 * (4096 - fractionY_param4);
                  break L3;
                }
              }
              var12 = stackIn_11_0;
              break L0;
            }
          }
        }
        L4: {
          if (sourceY_param2 >= this.height_field_m - 1) {
            var14 = 0;
            var13 = 0;
            var10 = 0;
            var9 = 0;
            break L4;
          } else {
            L5: {
              if (sourceX_param1 < 0) {
                var13 = 0;
                var9 = 0;
                break L5;
              } else {
                L6: {
                  var9 = this.pixels_field_v[var6 + this.width_field_r];
                  if (var9 == 0) {
                    stackIn_19_0 = 0;
                    break L6;
                  } else {
                    stackIn_19_0 = (4096 - fractionX_param3) * fractionY_param4;
                    break L6;
                  }
                }
                var13 = stackIn_19_0;
                break L5;
              }
            }
            if (sourceX_param1 >= this.width_field_r - 1) {
              var14 = 0;
              var10 = 0;
              break L4;
            } else {
              L7: {
                var10 = this.pixels_field_v[var6 + this.width_field_r + 1];
                if (var10 == 0) {
                  stackIn_25_0 = 0;
                  break L7;
                } else {
                  stackIn_25_0 = fractionX_param3 * fractionY_param4;
                  break L7;
                }
              }
              var14 = stackIn_25_0;
              break L4;
            }
          }
        }
        L8: {
          var11 = var11 >> 16;
          var12 = var12 >> 16;
          var13 = var13 >> 16;
          var14 = var14 >> 16;
          var15 = var11 + var12 + var13 + var14;
          if (var15 < 256) {
            if (var15 < 128) {
              return;
            } else {
              L9: {
                var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
                var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
                var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
                var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
                var18 = ((var16 >>> 16) / var15 << 16) + (var17 / var15 & 65280) + (var16 & 65535) / var15;
                if (var18 != 0) {
                  break L9;
                } else {
                  var18 = 1;
                  break L9;
                }
              }
              SoftwareRasterizer_vb.framebuffer_field_c[destinationIndex_param0] = var18;
              break L8;
            }
          } else {
            L10: {
              var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
              var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
              var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
              var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
              var18 = (var16 >>> 8 & 16711935) + (var17 >>> 8 & 65280);
              if (var18 != 0) {
                break L10;
              } else {
                var18 = 1;
                break L10;
              }
            }
            SoftwareRasterizer_vb.framebuffer_field_c[destinationIndex_param0] = var18;
            break L8;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.trimX_field_u;
        param1 = param1 + this.trimY_field_p;
        int var4 = param0 + param1 * SoftwareRasterizer_vb.stride_field_f;
        int var5 = 0;
        int var6 = this.height_field_m;
        int var7 = this.width_field_r;
        int var8 = SoftwareRasterizer_vb.stride_field_f - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer_vb.clipTop_field_i) {
            var10 = SoftwareRasterizer_vb.clipTop_field_i - param1;
            var6 = var6 - var10;
            param1 = SoftwareRasterizer_vb.clipTop_field_i;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * SoftwareRasterizer_vb.stride_field_f;
        }
        if (param1 + var6 > SoftwareRasterizer_vb.clipBottom_field_d) {
            var6 = var6 - (param1 + var6 - SoftwareRasterizer_vb.clipBottom_field_d);
        }
        if (param0 < SoftwareRasterizer_vb.clipLeft_field_e) {
            var10 = SoftwareRasterizer_vb.clipLeft_field_e - param0;
            var7 = var7 - var10;
            param0 = SoftwareRasterizer_vb.clipLeft_field_e;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > SoftwareRasterizer_vb.clipRight_field_k) {
            var10 = param0 + var7 - SoftwareRasterizer_vb.clipRight_field_k;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            Sprite_dm.a(SoftwareRasterizer_vb.framebuffer_field_c, this.pixels_field_v, param2, var5, var4, var7, var6, var8, var9);
            return;
        }
    }

    void rotateNearest_b(int sourcePivotX_param0, int sourcePivotY_param1, int destinationX_param2, int destinationY_param3, int angle_param4, int scale_param5) {
        int writeIndex_incrementValue$0 = 0;
        int writeIndex_incrementValue$1 = 0;
        int writeIndex_incrementValue$2 = 0;
        int writeIndex_incrementValue$3 = 0;
        int writeIndex_incrementValue$4 = 0;
        int writeIndex_incrementValue$5 = 0;
        int writeIndex_incrementValue$6 = 0;
        int writeIndex_incrementValue$7 = 0;
        int writeIndex_incrementValue$8 = 0;
        double angleRadians_var7;
        int scaledSin_var9;
        int scaledCos_var10;
        int corner0X_var11;
        int corner0Y_var12;
        int corner1X_var13;
        int corner1Y_var14;
        int corner2X_var15;
        int corner2Y_var16;
        int corner3X_var17;
        int corner3Y_var18;
        int leftBound_var19;
        int rightThenNegativeWidth_var20;
        int topBound_var21;
        int bottomThenNegativeHeight_var22;
        int rowDestinationIndex_var23;
        double inverseScaleFactor_var24;
        int inverseSinStep_var26;
        int inverseCosStep_var27;
        int destinationOffsetX_var28;
        int destinationOffsetY_var29;
        int rowSourceXQ12_var30;
        int rowSourceYQ12_var31;
        int clipPixelCount_var32;
        int negativeRowCounter_var33;
        int destinationIndex_var34;
        int sourceXQ12_var35;
        int sourceYQ12_var36;
        int negativePixelCounter_var37;
        int sampledPixel_var38;
        if (scale_param5 != 0) {
          L0: {
            sourcePivotX_param0 = sourcePivotX_param0 - (this.trimX_field_u << 4);
            sourcePivotY_param1 = sourcePivotY_param1 - (this.trimY_field_p << 4);
            angleRadians_var7 = (double)(angle_param4 & 65535) * 0.00009587379924285257;
            scaledSin_var9 = (int)Math.floor(Math.sin(angleRadians_var7) * (double)scale_param5 + 0.5);
            scaledCos_var10 = (int)Math.floor(Math.cos(angleRadians_var7) * (double)scale_param5 + 0.5);
            corner0X_var11 = -sourcePivotX_param0 * scaledCos_var10 + -sourcePivotY_param1 * scaledSin_var9;
            corner0Y_var12 = --sourcePivotX_param0 * scaledSin_var9 + -sourcePivotY_param1 * scaledCos_var10;
            corner1X_var13 = ((this.width_field_r << 4) - sourcePivotX_param0) * scaledCos_var10 + -sourcePivotY_param1 * scaledSin_var9;
            corner1Y_var14 = -((this.width_field_r << 4) - sourcePivotX_param0) * scaledSin_var9 + -sourcePivotY_param1 * scaledCos_var10;
            corner2X_var15 = -sourcePivotX_param0 * scaledCos_var10 + ((this.height_field_m << 4) - sourcePivotY_param1) * scaledSin_var9;
            corner2Y_var16 = --sourcePivotX_param0 * scaledSin_var9 + ((this.height_field_m << 4) - sourcePivotY_param1) * scaledCos_var10;
            corner3X_var17 = ((this.width_field_r << 4) - sourcePivotX_param0) * scaledCos_var10 + ((this.height_field_m << 4) - sourcePivotY_param1) * scaledSin_var9;
            corner3Y_var18 = -((this.width_field_r << 4) - sourcePivotX_param0) * scaledSin_var9 + ((this.height_field_m << 4) - sourcePivotY_param1) * scaledCos_var10;
            if (corner0X_var11 >= corner1X_var13) {
              leftBound_var19 = corner1X_var13;
              rightThenNegativeWidth_var20 = corner0X_var11;
              break L0;
            } else {
              leftBound_var19 = corner0X_var11;
              rightThenNegativeWidth_var20 = corner1X_var13;
              break L0;
            }
          }
          L1: {
            if (corner2X_var15 >= leftBound_var19) {
              break L1;
            } else {
              leftBound_var19 = corner2X_var15;
              break L1;
            }
          }
          L2: {
            if (corner3X_var17 >= leftBound_var19) {
              break L2;
            } else {
              leftBound_var19 = corner3X_var17;
              break L2;
            }
          }
          L3: {
            if (corner2X_var15 <= rightThenNegativeWidth_var20) {
              break L3;
            } else {
              rightThenNegativeWidth_var20 = corner2X_var15;
              break L3;
            }
          }
          L4: {
            if (corner3X_var17 <= rightThenNegativeWidth_var20) {
              break L4;
            } else {
              rightThenNegativeWidth_var20 = corner3X_var17;
              break L4;
            }
          }
          L5: {
            if (corner0Y_var12 >= corner1Y_var14) {
              topBound_var21 = corner1Y_var14;
              bottomThenNegativeHeight_var22 = corner0Y_var12;
              break L5;
            } else {
              topBound_var21 = corner0Y_var12;
              bottomThenNegativeHeight_var22 = corner1Y_var14;
              break L5;
            }
          }
          L6: {
            if (corner2Y_var16 >= topBound_var21) {
              break L6;
            } else {
              topBound_var21 = corner2Y_var16;
              break L6;
            }
          }
          L7: {
            if (corner3Y_var18 >= topBound_var21) {
              break L7;
            } else {
              topBound_var21 = corner3Y_var18;
              break L7;
            }
          }
          L8: {
            if (corner2Y_var16 <= bottomThenNegativeHeight_var22) {
              break L8;
            } else {
              bottomThenNegativeHeight_var22 = corner2Y_var16;
              break L8;
            }
          }
          L9: {
            if (corner3Y_var18 <= bottomThenNegativeHeight_var22) {
              break L9;
            } else {
              bottomThenNegativeHeight_var22 = corner3Y_var18;
              break L9;
            }
          }
          L10: {
            leftBound_var19 = leftBound_var19 >> 12;
            rightThenNegativeWidth_var20 = rightThenNegativeWidth_var20 + 4095 >> 12;
            topBound_var21 = topBound_var21 >> 12;
            bottomThenNegativeHeight_var22 = bottomThenNegativeHeight_var22 + 4095 >> 12;
            leftBound_var19 = leftBound_var19 + destinationX_param2;
            rightThenNegativeWidth_var20 = rightThenNegativeWidth_var20 + destinationX_param2;
            topBound_var21 = topBound_var21 + destinationY_param3;
            bottomThenNegativeHeight_var22 = bottomThenNegativeHeight_var22 + destinationY_param3;
            leftBound_var19 = leftBound_var19 >> 4;
            rightThenNegativeWidth_var20 = rightThenNegativeWidth_var20 + 15 >> 4;
            topBound_var21 = topBound_var21 >> 4;
            bottomThenNegativeHeight_var22 = bottomThenNegativeHeight_var22 + 15 >> 4;
            if (leftBound_var19 >= SoftwareRasterizer_vb.clipLeft_field_e) {
              break L10;
            } else {
              leftBound_var19 = SoftwareRasterizer_vb.clipLeft_field_e;
              break L10;
            }
          }
          L11: {
            if (rightThenNegativeWidth_var20 <= SoftwareRasterizer_vb.clipRight_field_k) {
              break L11;
            } else {
              rightThenNegativeWidth_var20 = SoftwareRasterizer_vb.clipRight_field_k;
              break L11;
            }
          }
          L12: {
            if (topBound_var21 >= SoftwareRasterizer_vb.clipTop_field_i) {
              break L12;
            } else {
              topBound_var21 = SoftwareRasterizer_vb.clipTop_field_i;
              break L12;
            }
          }
          L13: {
            if (bottomThenNegativeHeight_var22 <= SoftwareRasterizer_vb.clipBottom_field_d) {
              break L13;
            } else {
              bottomThenNegativeHeight_var22 = SoftwareRasterizer_vb.clipBottom_field_d;
              break L13;
            }
          }
          rightThenNegativeWidth_var20 = leftBound_var19 - rightThenNegativeWidth_var20;
          if (rightThenNegativeWidth_var20 < 0) {
            bottomThenNegativeHeight_var22 = topBound_var21 - bottomThenNegativeHeight_var22;
            if (bottomThenNegativeHeight_var22 < 0) {
              L14: {
                rowDestinationIndex_var23 = topBound_var21 * SoftwareRasterizer_vb.stride_field_f + leftBound_var19;
                inverseScaleFactor_var24 = 16777216.0 / (double)scale_param5;
                inverseSinStep_var26 = (int)Math.floor(Math.sin(angleRadians_var7) * inverseScaleFactor_var24 + 0.5);
                inverseCosStep_var27 = (int)Math.floor(Math.cos(angleRadians_var7) * inverseScaleFactor_var24 + 0.5);
                destinationOffsetX_var28 = (leftBound_var19 << 4) + 8 - destinationX_param2;
                destinationOffsetY_var29 = (topBound_var21 << 4) + 8 - destinationY_param3;
                rowSourceXQ12_var30 = (sourcePivotX_param0 << 8) - (destinationOffsetY_var29 * inverseSinStep_var26 >> 4);
                rowSourceYQ12_var31 = (sourcePivotY_param1 << 8) + (destinationOffsetY_var29 * inverseCosStep_var27 >> 4);
                if (inverseCosStep_var27 != 0) {
                  if (inverseCosStep_var27 >= 0) {
                    if (inverseSinStep_var26 != 0) {
                      if (inverseSinStep_var26 >= 0) {
                        negativeRowCounter_var33 = bottomThenNegativeHeight_var22;
                        L15: while (true) {
                          if (negativeRowCounter_var33 >= 0) {
                            break L14;
                          } else {
                            L16: {
                              destinationIndex_var34 = rowDestinationIndex_var23;
                              sourceXQ12_var35 = rowSourceXQ12_var30 + (destinationOffsetX_var28 * inverseCosStep_var27 >> 4);
                              sourceYQ12_var36 = rowSourceYQ12_var31 + (destinationOffsetX_var28 * inverseSinStep_var26 >> 4);
                              negativePixelCounter_var37 = rightThenNegativeWidth_var20;
                              if (sourceXQ12_var35 >= 0) {
                                break L16;
                              } else {
                                clipPixelCount_var32 = (inverseCosStep_var27 - 1 - sourceXQ12_var35) / inverseCosStep_var27;
                                negativePixelCounter_var37 = negativePixelCounter_var37 + clipPixelCount_var32;
                                sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27 * clipPixelCount_var32;
                                sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26 * clipPixelCount_var32;
                                destinationIndex_var34 = destinationIndex_var34 + clipPixelCount_var32;
                                break L16;
                              }
                            }
                            L17: {
                              clipPixelCount_var32 = (1 + sourceXQ12_var35 - (this.width_field_r << 12) - inverseCosStep_var27) / inverseCosStep_var27;
                              if ((1 + sourceXQ12_var35 - (this.width_field_r << 12) - inverseCosStep_var27) / inverseCosStep_var27 <= negativePixelCounter_var37) {
                                break L17;
                              } else {
                                negativePixelCounter_var37 = clipPixelCount_var32;
                                break L17;
                              }
                            }
                            L18: {
                              if (sourceYQ12_var36 >= 0) {
                                break L18;
                              } else {
                                clipPixelCount_var32 = (inverseSinStep_var26 - 1 - sourceYQ12_var36) / inverseSinStep_var26;
                                negativePixelCounter_var37 = negativePixelCounter_var37 + clipPixelCount_var32;
                                sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27 * clipPixelCount_var32;
                                sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26 * clipPixelCount_var32;
                                destinationIndex_var34 = destinationIndex_var34 + clipPixelCount_var32;
                                break L18;
                              }
                            }
                            L19: {
                              clipPixelCount_var32 = (1 + sourceYQ12_var36 - (this.height_field_m << 12) - inverseSinStep_var26) / inverseSinStep_var26;
                              if ((1 + sourceYQ12_var36 - (this.height_field_m << 12) - inverseSinStep_var26) / inverseSinStep_var26 <= negativePixelCounter_var37) {
                                break L19;
                              } else {
                                negativePixelCounter_var37 = clipPixelCount_var32;
                                break L19;
                              }
                            }
                            L20: while (true) {
                              if (negativePixelCounter_var37 >= 0) {
                                negativeRowCounter_var33++;
                                rowSourceXQ12_var30 = rowSourceXQ12_var30 - inverseSinStep_var26;
                                rowSourceYQ12_var31 = rowSourceYQ12_var31 + inverseCosStep_var27;
                                rowDestinationIndex_var23 = rowDestinationIndex_var23 + SoftwareRasterizer_vb.stride_field_f;
                                continue L15;
                              } else {
                                L21: {
                                  sampledPixel_var38 = this.pixels_field_v[(sourceYQ12_var36 >> 12) * this.width_field_r + (sourceXQ12_var35 >> 12)];
                                  if (sampledPixel_var38 == 0) {
                                    destinationIndex_var34++;
                                    break L21;
                                  } else {
                                    writeIndex_incrementValue$0 = destinationIndex_var34;
                                    destinationIndex_var34++;
                                    SoftwareRasterizer_vb.framebuffer_field_c[writeIndex_incrementValue$0] = sampledPixel_var38;
                                    break L21;
                                  }
                                }
                                sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27;
                                sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26;
                                negativePixelCounter_var37++;
                                continue L20;
                              }
                            }
                          }
                        }
                      } else {
                        negativeRowCounter_var33 = bottomThenNegativeHeight_var22;
                        L22: while (true) {
                          if (negativeRowCounter_var33 >= 0) {
                            break L14;
                          } else {
                            L23: {
                              destinationIndex_var34 = rowDestinationIndex_var23;
                              sourceXQ12_var35 = rowSourceXQ12_var30 + (destinationOffsetX_var28 * inverseCosStep_var27 >> 4);
                              sourceYQ12_var36 = rowSourceYQ12_var31 + (destinationOffsetX_var28 * inverseSinStep_var26 >> 4);
                              negativePixelCounter_var37 = rightThenNegativeWidth_var20;
                              if (sourceXQ12_var35 >= 0) {
                                break L23;
                              } else {
                                clipPixelCount_var32 = (inverseCosStep_var27 - 1 - sourceXQ12_var35) / inverseCosStep_var27;
                                negativePixelCounter_var37 = negativePixelCounter_var37 + clipPixelCount_var32;
                                sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27 * clipPixelCount_var32;
                                sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26 * clipPixelCount_var32;
                                destinationIndex_var34 = destinationIndex_var34 + clipPixelCount_var32;
                                break L23;
                              }
                            }
                            L24: {
                              clipPixelCount_var32 = (1 + sourceXQ12_var35 - (this.width_field_r << 12) - inverseCosStep_var27) / inverseCosStep_var27;
                              if ((1 + sourceXQ12_var35 - (this.width_field_r << 12) - inverseCosStep_var27) / inverseCosStep_var27 <= negativePixelCounter_var37) {
                                break L24;
                              } else {
                                negativePixelCounter_var37 = clipPixelCount_var32;
                                break L24;
                              }
                            }
                            L25: {
                              clipPixelCount_var32 = sourceYQ12_var36 - (this.height_field_m << 12);
                              if (sourceYQ12_var36 - (this.height_field_m << 12) < 0) {
                                break L25;
                              } else {
                                clipPixelCount_var32 = (inverseSinStep_var26 - clipPixelCount_var32) / inverseSinStep_var26;
                                negativePixelCounter_var37 = negativePixelCounter_var37 + clipPixelCount_var32;
                                sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27 * clipPixelCount_var32;
                                sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26 * clipPixelCount_var32;
                                destinationIndex_var34 = destinationIndex_var34 + clipPixelCount_var32;
                                break L25;
                              }
                            }
                            L26: {
                              clipPixelCount_var32 = (sourceYQ12_var36 - inverseSinStep_var26) / inverseSinStep_var26;
                              if ((sourceYQ12_var36 - inverseSinStep_var26) / inverseSinStep_var26 <= negativePixelCounter_var37) {
                                break L26;
                              } else {
                                negativePixelCounter_var37 = clipPixelCount_var32;
                                break L26;
                              }
                            }
                            L27: while (true) {
                              if (negativePixelCounter_var37 >= 0) {
                                negativeRowCounter_var33++;
                                rowSourceXQ12_var30 = rowSourceXQ12_var30 - inverseSinStep_var26;
                                rowSourceYQ12_var31 = rowSourceYQ12_var31 + inverseCosStep_var27;
                                rowDestinationIndex_var23 = rowDestinationIndex_var23 + SoftwareRasterizer_vb.stride_field_f;
                                continue L22;
                              } else {
                                L28: {
                                  sampledPixel_var38 = this.pixels_field_v[(sourceYQ12_var36 >> 12) * this.width_field_r + (sourceXQ12_var35 >> 12)];
                                  if (sampledPixel_var38 == 0) {
                                    destinationIndex_var34++;
                                    break L28;
                                  } else {
                                    writeIndex_incrementValue$1 = destinationIndex_var34;
                                    destinationIndex_var34++;
                                    SoftwareRasterizer_vb.framebuffer_field_c[writeIndex_incrementValue$1] = sampledPixel_var38;
                                    break L28;
                                  }
                                }
                                sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27;
                                sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26;
                                negativePixelCounter_var37++;
                                continue L27;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      negativeRowCounter_var33 = bottomThenNegativeHeight_var22;
                      L29: while (true) {
                        if (negativeRowCounter_var33 >= 0) {
                          break L14;
                        } else {
                          L30: {
                            destinationIndex_var34 = rowDestinationIndex_var23;
                            sourceXQ12_var35 = rowSourceXQ12_var30 + (destinationOffsetX_var28 * inverseCosStep_var27 >> 4);
                            sourceYQ12_var36 = rowSourceYQ12_var31;
                            negativePixelCounter_var37 = rightThenNegativeWidth_var20;
                            if (sourceYQ12_var36 >= 0) {
                              if (sourceYQ12_var36 - (this.height_field_m << 12) < 0) {
                                L31: {
                                  if (sourceXQ12_var35 >= 0) {
                                    break L31;
                                  } else {
                                    clipPixelCount_var32 = (inverseCosStep_var27 - 1 - sourceXQ12_var35) / inverseCosStep_var27;
                                    negativePixelCounter_var37 = negativePixelCounter_var37 + clipPixelCount_var32;
                                    sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27 * clipPixelCount_var32;
                                    destinationIndex_var34 = destinationIndex_var34 + clipPixelCount_var32;
                                    break L31;
                                  }
                                }
                                L32: {
                                  clipPixelCount_var32 = (1 + sourceXQ12_var35 - (this.width_field_r << 12) - inverseCosStep_var27) / inverseCosStep_var27;
                                  if ((1 + sourceXQ12_var35 - (this.width_field_r << 12) - inverseCosStep_var27) / inverseCosStep_var27 <= negativePixelCounter_var37) {
                                    break L32;
                                  } else {
                                    negativePixelCounter_var37 = clipPixelCount_var32;
                                    break L32;
                                  }
                                }
                                L33: while (true) {
                                  if (negativePixelCounter_var37 >= 0) {
                                    break L30;
                                  } else {
                                    L34: {
                                      sampledPixel_var38 = this.pixels_field_v[(sourceYQ12_var36 >> 12) * this.width_field_r + (sourceXQ12_var35 >> 12)];
                                      if (sampledPixel_var38 == 0) {
                                        destinationIndex_var34++;
                                        break L34;
                                      } else {
                                        writeIndex_incrementValue$2 = destinationIndex_var34;
                                        destinationIndex_var34++;
                                        SoftwareRasterizer_vb.framebuffer_field_c[writeIndex_incrementValue$2] = sampledPixel_var38;
                                        break L34;
                                      }
                                    }
                                    sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27;
                                    negativePixelCounter_var37++;
                                    continue L33;
                                  }
                                }
                              } else {
                                break L30;
                              }
                            } else {
                              break L30;
                            }
                          }
                          negativeRowCounter_var33++;
                          rowSourceYQ12_var31 = rowSourceYQ12_var31 + inverseCosStep_var27;
                          rowDestinationIndex_var23 = rowDestinationIndex_var23 + SoftwareRasterizer_vb.stride_field_f;
                          continue L29;
                        }
                      }
                    }
                  } else {
                    if (inverseSinStep_var26 != 0) {
                      if (inverseSinStep_var26 >= 0) {
                        negativeRowCounter_var33 = bottomThenNegativeHeight_var22;
                        L35: while (true) {
                          if (negativeRowCounter_var33 >= 0) {
                            break L14;
                          } else {
                            L36: {
                              destinationIndex_var34 = rowDestinationIndex_var23;
                              sourceXQ12_var35 = rowSourceXQ12_var30 + (destinationOffsetX_var28 * inverseCosStep_var27 >> 4);
                              sourceYQ12_var36 = rowSourceYQ12_var31 + (destinationOffsetX_var28 * inverseSinStep_var26 >> 4);
                              negativePixelCounter_var37 = rightThenNegativeWidth_var20;
                              clipPixelCount_var32 = sourceXQ12_var35 - (this.width_field_r << 12);
                              if (sourceXQ12_var35 - (this.width_field_r << 12) < 0) {
                                break L36;
                              } else {
                                clipPixelCount_var32 = (inverseCosStep_var27 - clipPixelCount_var32) / inverseCosStep_var27;
                                negativePixelCounter_var37 = negativePixelCounter_var37 + clipPixelCount_var32;
                                sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27 * clipPixelCount_var32;
                                sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26 * clipPixelCount_var32;
                                destinationIndex_var34 = destinationIndex_var34 + clipPixelCount_var32;
                                break L36;
                              }
                            }
                            L37: {
                              clipPixelCount_var32 = (sourceXQ12_var35 - inverseCosStep_var27) / inverseCosStep_var27;
                              if ((sourceXQ12_var35 - inverseCosStep_var27) / inverseCosStep_var27 <= negativePixelCounter_var37) {
                                break L37;
                              } else {
                                negativePixelCounter_var37 = clipPixelCount_var32;
                                break L37;
                              }
                            }
                            L38: {
                              if (sourceYQ12_var36 >= 0) {
                                break L38;
                              } else {
                                clipPixelCount_var32 = (inverseSinStep_var26 - 1 - sourceYQ12_var36) / inverseSinStep_var26;
                                negativePixelCounter_var37 = negativePixelCounter_var37 + clipPixelCount_var32;
                                sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27 * clipPixelCount_var32;
                                sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26 * clipPixelCount_var32;
                                destinationIndex_var34 = destinationIndex_var34 + clipPixelCount_var32;
                                break L38;
                              }
                            }
                            L39: {
                              clipPixelCount_var32 = (1 + sourceYQ12_var36 - (this.height_field_m << 12) - inverseSinStep_var26) / inverseSinStep_var26;
                              if ((1 + sourceYQ12_var36 - (this.height_field_m << 12) - inverseSinStep_var26) / inverseSinStep_var26 <= negativePixelCounter_var37) {
                                break L39;
                              } else {
                                negativePixelCounter_var37 = clipPixelCount_var32;
                                break L39;
                              }
                            }
                            L40: while (true) {
                              if (negativePixelCounter_var37 >= 0) {
                                negativeRowCounter_var33++;
                                rowSourceXQ12_var30 = rowSourceXQ12_var30 - inverseSinStep_var26;
                                rowSourceYQ12_var31 = rowSourceYQ12_var31 + inverseCosStep_var27;
                                rowDestinationIndex_var23 = rowDestinationIndex_var23 + SoftwareRasterizer_vb.stride_field_f;
                                continue L35;
                              } else {
                                L41: {
                                  sampledPixel_var38 = this.pixels_field_v[(sourceYQ12_var36 >> 12) * this.width_field_r + (sourceXQ12_var35 >> 12)];
                                  if (sampledPixel_var38 == 0) {
                                    destinationIndex_var34++;
                                    break L41;
                                  } else {
                                    writeIndex_incrementValue$3 = destinationIndex_var34;
                                    destinationIndex_var34++;
                                    SoftwareRasterizer_vb.framebuffer_field_c[writeIndex_incrementValue$3] = sampledPixel_var38;
                                    break L41;
                                  }
                                }
                                sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27;
                                sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26;
                                negativePixelCounter_var37++;
                                continue L40;
                              }
                            }
                          }
                        }
                      } else {
                        negativeRowCounter_var33 = bottomThenNegativeHeight_var22;
                        L42: while (true) {
                          if (negativeRowCounter_var33 >= 0) {
                            break L14;
                          } else {
                            L43: {
                              destinationIndex_var34 = rowDestinationIndex_var23;
                              sourceXQ12_var35 = rowSourceXQ12_var30 + (destinationOffsetX_var28 * inverseCosStep_var27 >> 4);
                              sourceYQ12_var36 = rowSourceYQ12_var31 + (destinationOffsetX_var28 * inverseSinStep_var26 >> 4);
                              negativePixelCounter_var37 = rightThenNegativeWidth_var20;
                              clipPixelCount_var32 = sourceXQ12_var35 - (this.width_field_r << 12);
                              if (sourceXQ12_var35 - (this.width_field_r << 12) < 0) {
                                break L43;
                              } else {
                                clipPixelCount_var32 = (inverseCosStep_var27 - clipPixelCount_var32) / inverseCosStep_var27;
                                negativePixelCounter_var37 = negativePixelCounter_var37 + clipPixelCount_var32;
                                sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27 * clipPixelCount_var32;
                                sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26 * clipPixelCount_var32;
                                destinationIndex_var34 = destinationIndex_var34 + clipPixelCount_var32;
                                break L43;
                              }
                            }
                            L44: {
                              clipPixelCount_var32 = (sourceXQ12_var35 - inverseCosStep_var27) / inverseCosStep_var27;
                              if ((sourceXQ12_var35 - inverseCosStep_var27) / inverseCosStep_var27 <= negativePixelCounter_var37) {
                                break L44;
                              } else {
                                negativePixelCounter_var37 = clipPixelCount_var32;
                                break L44;
                              }
                            }
                            L45: {
                              clipPixelCount_var32 = sourceYQ12_var36 - (this.height_field_m << 12);
                              if (sourceYQ12_var36 - (this.height_field_m << 12) < 0) {
                                break L45;
                              } else {
                                clipPixelCount_var32 = (inverseSinStep_var26 - clipPixelCount_var32) / inverseSinStep_var26;
                                negativePixelCounter_var37 = negativePixelCounter_var37 + clipPixelCount_var32;
                                sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27 * clipPixelCount_var32;
                                sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26 * clipPixelCount_var32;
                                destinationIndex_var34 = destinationIndex_var34 + clipPixelCount_var32;
                                break L45;
                              }
                            }
                            L46: {
                              clipPixelCount_var32 = (sourceYQ12_var36 - inverseSinStep_var26) / inverseSinStep_var26;
                              if ((sourceYQ12_var36 - inverseSinStep_var26) / inverseSinStep_var26 <= negativePixelCounter_var37) {
                                break L46;
                              } else {
                                negativePixelCounter_var37 = clipPixelCount_var32;
                                break L46;
                              }
                            }
                            L47: while (true) {
                              if (negativePixelCounter_var37 >= 0) {
                                negativeRowCounter_var33++;
                                rowSourceXQ12_var30 = rowSourceXQ12_var30 - inverseSinStep_var26;
                                rowSourceYQ12_var31 = rowSourceYQ12_var31 + inverseCosStep_var27;
                                rowDestinationIndex_var23 = rowDestinationIndex_var23 + SoftwareRasterizer_vb.stride_field_f;
                                continue L42;
                              } else {
                                L48: {
                                  sampledPixel_var38 = this.pixels_field_v[(sourceYQ12_var36 >> 12) * this.width_field_r + (sourceXQ12_var35 >> 12)];
                                  if (sampledPixel_var38 == 0) {
                                    destinationIndex_var34++;
                                    break L48;
                                  } else {
                                    writeIndex_incrementValue$4 = destinationIndex_var34;
                                    destinationIndex_var34++;
                                    SoftwareRasterizer_vb.framebuffer_field_c[writeIndex_incrementValue$4] = sampledPixel_var38;
                                    break L48;
                                  }
                                }
                                sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27;
                                sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26;
                                negativePixelCounter_var37++;
                                continue L47;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      negativeRowCounter_var33 = bottomThenNegativeHeight_var22;
                      L49: while (true) {
                        if (negativeRowCounter_var33 >= 0) {
                          break L14;
                        } else {
                          L50: {
                            destinationIndex_var34 = rowDestinationIndex_var23;
                            sourceXQ12_var35 = rowSourceXQ12_var30 + (destinationOffsetX_var28 * inverseCosStep_var27 >> 4);
                            sourceYQ12_var36 = rowSourceYQ12_var31;
                            negativePixelCounter_var37 = rightThenNegativeWidth_var20;
                            if (sourceYQ12_var36 >= 0) {
                              if (sourceYQ12_var36 - (this.height_field_m << 12) < 0) {
                                L51: {
                                  clipPixelCount_var32 = sourceXQ12_var35 - (this.width_field_r << 12);
                                  if (sourceXQ12_var35 - (this.width_field_r << 12) < 0) {
                                    break L51;
                                  } else {
                                    clipPixelCount_var32 = (inverseCosStep_var27 - clipPixelCount_var32) / inverseCosStep_var27;
                                    negativePixelCounter_var37 = negativePixelCounter_var37 + clipPixelCount_var32;
                                    sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27 * clipPixelCount_var32;
                                    destinationIndex_var34 = destinationIndex_var34 + clipPixelCount_var32;
                                    break L51;
                                  }
                                }
                                L52: {
                                  clipPixelCount_var32 = (sourceXQ12_var35 - inverseCosStep_var27) / inverseCosStep_var27;
                                  if ((sourceXQ12_var35 - inverseCosStep_var27) / inverseCosStep_var27 <= negativePixelCounter_var37) {
                                    break L52;
                                  } else {
                                    negativePixelCounter_var37 = clipPixelCount_var32;
                                    break L52;
                                  }
                                }
                                L53: while (true) {
                                  if (negativePixelCounter_var37 >= 0) {
                                    break L50;
                                  } else {
                                    L54: {
                                      sampledPixel_var38 = this.pixels_field_v[(sourceYQ12_var36 >> 12) * this.width_field_r + (sourceXQ12_var35 >> 12)];
                                      if (sampledPixel_var38 == 0) {
                                        destinationIndex_var34++;
                                        break L54;
                                      } else {
                                        writeIndex_incrementValue$5 = destinationIndex_var34;
                                        destinationIndex_var34++;
                                        SoftwareRasterizer_vb.framebuffer_field_c[writeIndex_incrementValue$5] = sampledPixel_var38;
                                        break L54;
                                      }
                                    }
                                    sourceXQ12_var35 = sourceXQ12_var35 + inverseCosStep_var27;
                                    negativePixelCounter_var37++;
                                    continue L53;
                                  }
                                }
                              } else {
                                break L50;
                              }
                            } else {
                              break L50;
                            }
                          }
                          negativeRowCounter_var33++;
                          rowSourceYQ12_var31 = rowSourceYQ12_var31 + inverseCosStep_var27;
                          rowDestinationIndex_var23 = rowDestinationIndex_var23 + SoftwareRasterizer_vb.stride_field_f;
                          continue L49;
                        }
                      }
                    }
                  }
                } else {
                  if (inverseSinStep_var26 != 0) {
                    if (inverseSinStep_var26 >= 0) {
                      negativeRowCounter_var33 = bottomThenNegativeHeight_var22;
                      L55: while (true) {
                        if (negativeRowCounter_var33 >= 0) {
                          break L14;
                        } else {
                          L56: {
                            destinationIndex_var34 = rowDestinationIndex_var23;
                            sourceXQ12_var35 = rowSourceXQ12_var30;
                            sourceYQ12_var36 = rowSourceYQ12_var31 + (destinationOffsetX_var28 * inverseSinStep_var26 >> 4);
                            negativePixelCounter_var37 = rightThenNegativeWidth_var20;
                            if (sourceXQ12_var35 >= 0) {
                              if (sourceXQ12_var35 - (this.width_field_r << 12) < 0) {
                                L57: {
                                  if (sourceYQ12_var36 >= 0) {
                                    break L57;
                                  } else {
                                    clipPixelCount_var32 = (inverseSinStep_var26 - 1 - sourceYQ12_var36) / inverseSinStep_var26;
                                    negativePixelCounter_var37 = negativePixelCounter_var37 + clipPixelCount_var32;
                                    sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26 * clipPixelCount_var32;
                                    destinationIndex_var34 = destinationIndex_var34 + clipPixelCount_var32;
                                    break L57;
                                  }
                                }
                                L58: {
                                  clipPixelCount_var32 = (1 + sourceYQ12_var36 - (this.height_field_m << 12) - inverseSinStep_var26) / inverseSinStep_var26;
                                  if ((1 + sourceYQ12_var36 - (this.height_field_m << 12) - inverseSinStep_var26) / inverseSinStep_var26 <= negativePixelCounter_var37) {
                                    break L58;
                                  } else {
                                    negativePixelCounter_var37 = clipPixelCount_var32;
                                    break L58;
                                  }
                                }
                                L59: while (true) {
                                  if (negativePixelCounter_var37 >= 0) {
                                    break L56;
                                  } else {
                                    L60: {
                                      sampledPixel_var38 = this.pixels_field_v[(sourceYQ12_var36 >> 12) * this.width_field_r + (sourceXQ12_var35 >> 12)];
                                      if (sampledPixel_var38 == 0) {
                                        destinationIndex_var34++;
                                        break L60;
                                      } else {
                                        writeIndex_incrementValue$6 = destinationIndex_var34;
                                        destinationIndex_var34++;
                                        SoftwareRasterizer_vb.framebuffer_field_c[writeIndex_incrementValue$6] = sampledPixel_var38;
                                        break L60;
                                      }
                                    }
                                    sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26;
                                    negativePixelCounter_var37++;
                                    continue L59;
                                  }
                                }
                              } else {
                                break L56;
                              }
                            } else {
                              break L56;
                            }
                          }
                          negativeRowCounter_var33++;
                          rowSourceXQ12_var30 = rowSourceXQ12_var30 - inverseSinStep_var26;
                          rowDestinationIndex_var23 = rowDestinationIndex_var23 + SoftwareRasterizer_vb.stride_field_f;
                          continue L55;
                        }
                      }
                    } else {
                      negativeRowCounter_var33 = bottomThenNegativeHeight_var22;
                      L61: while (true) {
                        if (negativeRowCounter_var33 >= 0) {
                          break L14;
                        } else {
                          L62: {
                            destinationIndex_var34 = rowDestinationIndex_var23;
                            sourceXQ12_var35 = rowSourceXQ12_var30;
                            sourceYQ12_var36 = rowSourceYQ12_var31 + (destinationOffsetX_var28 * inverseSinStep_var26 >> 4);
                            negativePixelCounter_var37 = rightThenNegativeWidth_var20;
                            if (sourceXQ12_var35 >= 0) {
                              if (sourceXQ12_var35 - (this.width_field_r << 12) < 0) {
                                L63: {
                                  clipPixelCount_var32 = sourceYQ12_var36 - (this.height_field_m << 12);
                                  if (sourceYQ12_var36 - (this.height_field_m << 12) < 0) {
                                    break L63;
                                  } else {
                                    clipPixelCount_var32 = (inverseSinStep_var26 - clipPixelCount_var32) / inverseSinStep_var26;
                                    negativePixelCounter_var37 = negativePixelCounter_var37 + clipPixelCount_var32;
                                    sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26 * clipPixelCount_var32;
                                    destinationIndex_var34 = destinationIndex_var34 + clipPixelCount_var32;
                                    break L63;
                                  }
                                }
                                L64: {
                                  clipPixelCount_var32 = (sourceYQ12_var36 - inverseSinStep_var26) / inverseSinStep_var26;
                                  if ((sourceYQ12_var36 - inverseSinStep_var26) / inverseSinStep_var26 <= negativePixelCounter_var37) {
                                    break L64;
                                  } else {
                                    negativePixelCounter_var37 = clipPixelCount_var32;
                                    break L64;
                                  }
                                }
                                L65: while (true) {
                                  if (negativePixelCounter_var37 >= 0) {
                                    break L62;
                                  } else {
                                    L66: {
                                      sampledPixel_var38 = this.pixels_field_v[(sourceYQ12_var36 >> 12) * this.width_field_r + (sourceXQ12_var35 >> 12)];
                                      if (sampledPixel_var38 == 0) {
                                        destinationIndex_var34++;
                                        break L66;
                                      } else {
                                        writeIndex_incrementValue$7 = destinationIndex_var34;
                                        destinationIndex_var34++;
                                        SoftwareRasterizer_vb.framebuffer_field_c[writeIndex_incrementValue$7] = sampledPixel_var38;
                                        break L66;
                                      }
                                    }
                                    sourceYQ12_var36 = sourceYQ12_var36 + inverseSinStep_var26;
                                    negativePixelCounter_var37++;
                                    continue L65;
                                  }
                                }
                              } else {
                                negativeRowCounter_var33++;
                                rowSourceXQ12_var30 = rowSourceXQ12_var30 - inverseSinStep_var26;
                                rowDestinationIndex_var23 = rowDestinationIndex_var23 + SoftwareRasterizer_vb.stride_field_f;
                                continue L61;
                              }
                            } else {
                              break L62;
                            }
                          }
                          negativeRowCounter_var33++;
                          rowSourceXQ12_var30 = rowSourceXQ12_var30 - inverseSinStep_var26;
                          rowDestinationIndex_var23 = rowDestinationIndex_var23 + SoftwareRasterizer_vb.stride_field_f;
                          continue L61;
                        }
                      }
                    }
                  } else {
                    negativeRowCounter_var33 = bottomThenNegativeHeight_var22;
                    L67: while (true) {
                      if (negativeRowCounter_var33 >= 0) {
                        return;
                      } else {
                        destinationIndex_var34 = rowDestinationIndex_var23;
                        sourceXQ12_var35 = rowSourceXQ12_var30;
                        sourceYQ12_var36 = rowSourceYQ12_var31;
                        negativePixelCounter_var37 = rightThenNegativeWidth_var20;
                        if (sourceXQ12_var35 >= 0) {
                          L68: {
                            if (sourceYQ12_var36 >= 0) {
                              if (sourceXQ12_var35 - (this.width_field_r << 12) < 0) {
                                if (sourceYQ12_var36 - (this.height_field_m << 12) < 0) {
                                  L69: while (true) {
                                    if (negativePixelCounter_var37 >= 0) {
                                      break L68;
                                    } else {
                                      sampledPixel_var38 = this.pixels_field_v[(sourceYQ12_var36 >> 12) * this.width_field_r + (sourceXQ12_var35 >> 12)];
                                      if (sampledPixel_var38 == 0) {
                                        destinationIndex_var34++;
                                        negativePixelCounter_var37++;
                                        continue L69;
                                      } else {
                                        writeIndex_incrementValue$8 = destinationIndex_var34;
                                        destinationIndex_var34++;
                                        SoftwareRasterizer_vb.framebuffer_field_c[writeIndex_incrementValue$8] = sampledPixel_var38;
                                        negativePixelCounter_var37++;
                                        continue L69;
                                      }
                                    }
                                  }
                                } else {
                                  break L68;
                                }
                              } else {
                                break L68;
                              }
                            } else {
                              break L68;
                            }
                          }
                          negativeRowCounter_var33++;
                          rowDestinationIndex_var23 = rowDestinationIndex_var23 + SoftwareRasterizer_vb.stride_field_f;
                          continue L67;
                        } else {
                          negativeRowCounter_var33++;
                          rowDestinationIndex_var23 = rowDestinationIndex_var23 + SoftwareRasterizer_vb.stride_field_f;
                          continue L67;
                        }
                      }
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int incrementValue$1 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
            var14 = (param4 >> 16) * param11;
            for (var15 = -param7; var15 < 0; var15++) {
                param2 = param1[(param3 >> 16) + var14];
                if (param2 != 0) {
                    incrementValue$1 = param5;
                    param5++;
                    param0[incrementValue$1] = param2;
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var12;
            param5 = param5 + param6;
        }
    }

    final void d() {
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int[] var7;
        int var8;
        int var9;
        var1 = this.height_field_m - 1;
        L0: while (true) {
          L1: {
            if (var1 < 0) {
              break L1;
            } else {
              var2 = var1 * this.width_field_r;
              var3 = 0;
              L2: while (true) {
                if (var3 >= this.width_field_r) {
                  var1--;
                  continue L0;
                } else {
                  if (this.pixels_field_v[var2 + var3] == 0) {
                    var3++;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          var2 = 0;
          L3: while (true) {
            L4: {
              if (var2 >= var1) {
                break L4;
              } else {
                var3 = var2 * this.width_field_r;
                var4 = 0;
                L5: while (true) {
                  if (var4 >= this.width_field_r) {
                    var2++;
                    continue L3;
                  } else {
                    if (this.pixels_field_v[var3 + var4] == 0) {
                      var4++;
                      continue L5;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            var3 = this.width_field_r - 1;
            L6: while (true) {
              L7: {
                if (var3 < 0) {
                  break L7;
                } else {
                  var4 = var2;
                  L8: while (true) {
                    if (var4 > var1) {
                      var3--;
                      continue L6;
                    } else {
                      if (this.pixels_field_v[var4 * this.width_field_r + var3] == 0) {
                        var4++;
                        continue L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
              }
              var4 = 0;
              L9: while (true) {
                L10: {
                  if (var4 >= var3) {
                    break L10;
                  } else {
                    var5 = var2;
                    L11: while (true) {
                      if (var5 > var1) {
                        var4++;
                        continue L9;
                      } else {
                        if (this.pixels_field_v[var5 * this.width_field_r + var4] == 0) {
                          var5++;
                          continue L11;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
                L12: {
                  if (var4 != 0) {
                    break L12;
                  } else {
                    if (var3 != this.width_field_r - 1) {
                      break L12;
                    } else {
                      if (var2 != 0) {
                        break L12;
                      } else {
                        if (var1 != this.height_field_m - 1) {
                          break L12;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                var5 = var3 + 1 - var4;
                var6 = var1 + 1 - var2;
                var7 = new int[var5 * var6];
                var8 = 0;
                L13: while (true) {
                  if (var8 >= var6) {
                    this.pixels_field_v = var7;
                    this.width_field_r = var5;
                    this.height_field_m = var6;
                    this.trimX_field_u = this.trimX_field_u + var4;
                    this.trimY_field_p = this.trimY_field_p + var2;
                    return;
                  } else {
                    var9 = 0;
                    L14: while (true) {
                      if (var9 >= var5) {
                        var8++;
                        continue L13;
                      } else {
                        var7[var8 * var5 + var9] = this.pixels_field_v[(var8 + var2) * this.width_field_r + (var9 + var4)];
                        var9++;
                        continue L14;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void g(int param0) {
        int incrementValue$1 = 0;
        int[] var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var2 = new int[this.width_field_r * this.height_field_m];
        var3 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= this.height_field_m) {
            this.pixels_field_v = var2;
            return;
          } else {
            var5 = 0;
            L1: while (true) {
              if (var5 >= this.width_field_r) {
                var4++;
                continue L0;
              } else {
                L2: {
                  var6 = this.pixels_field_v[var3];
                  if (var6 != 0) {
                    break L2;
                  } else {
                    L3: {
                      if (var5 <= 0) {
                        break L3;
                      } else {
                        if (this.pixels_field_v[var3 - 1] == 0) {
                          break L3;
                        } else {
                          var6 = param0;
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (var4 <= 0) {
                        break L4;
                      } else {
                        if (this.pixels_field_v[var3 - this.width_field_r] == 0) {
                          break L4;
                        } else {
                          var6 = param0;
                          break L2;
                        }
                      }
                    }
                    L5: {
                      if (var5 >= this.width_field_r - 1) {
                        break L5;
                      } else {
                        if (this.pixels_field_v[var3 + 1] == 0) {
                          break L5;
                        } else {
                          var6 = param0;
                          break L2;
                        }
                      }
                    }
                    if (var4 >= this.height_field_m - 1) {
                      break L2;
                    } else {
                      if (this.pixels_field_v[var3 + this.width_field_r] == 0) {
                        break L2;
                      } else {
                        var6 = param0;
                        break L2;
                      }
                    }
                  }
                }
                incrementValue$1 = var3;
                var3++;
                var2[incrementValue$1] = var6;
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        var10 = 256 - param9;
        var11 = -param6;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = -param5;
            L1: while (true) {
              if (var12 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var11++;
                continue L0;
              } else {
                incrementValue$11 = param3;
                param3++;
                param2 = param1[incrementValue$11];
                if (param2 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var13 = param0[param4];
                  incrementValue$12 = param4;
                  param4++;
                  param0[incrementValue$12] = ((param2 & 16711935) * param9 + (var13 & 16711935) * var10 & -16711936) + ((param2 & 65280) * param9 + (var13 & 65280) * var10 & 16711680) >> 8;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void e(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.trimX_field_u;
        param1 = param1 + this.trimY_field_p;
        int var3 = param0 + param1 * SoftwareRasterizer_vb.stride_field_f;
        int var4 = 0;
        int var5 = this.height_field_m;
        int var6 = this.width_field_r;
        int var7 = SoftwareRasterizer_vb.stride_field_f - var6;
        int var8 = 0;
        if (param1 < SoftwareRasterizer_vb.clipTop_field_i) {
            var9 = SoftwareRasterizer_vb.clipTop_field_i - param1;
            var5 = var5 - var9;
            param1 = SoftwareRasterizer_vb.clipTop_field_i;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * SoftwareRasterizer_vb.stride_field_f;
        }
        if (param1 + var5 > SoftwareRasterizer_vb.clipBottom_field_d) {
            var5 = var5 - (param1 + var5 - SoftwareRasterizer_vb.clipBottom_field_d);
        }
        if (param0 < SoftwareRasterizer_vb.clipLeft_field_e) {
            var9 = SoftwareRasterizer_vb.clipLeft_field_e - param0;
            var6 = var6 - var9;
            param0 = SoftwareRasterizer_vb.clipLeft_field_e;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > SoftwareRasterizer_vb.clipRight_field_k) {
            var9 = param0 + var6 - SoftwareRasterizer_vb.clipRight_field_k;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            Sprite_dm.a(0, SoftwareRasterizer_vb.framebuffer_field_c, this.pixels_field_v, 0, var4, var3, var6, var5, var7, var8);
            return;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var13 = 0;
        int var15 = 0;
        if (param2 > 0) {
            if (param3 <= 0) {
                return;
            }
            var5 = this.width_field_r;
            var6 = this.height_field_m;
            var7 = 0;
            var8 = 0;
            var9 = this.field_s;
            var10 = this.field_o;
            var11 = (var9 << 16) / param2;
            var12 = (var10 << 16) / param3;
            if (this.trimX_field_u > 0) {
                var13 = ((this.trimX_field_u << 16) + var11 - 1) / var11;
                param0 = param0 + var13;
                var7 = var7 + (var13 * var11 - (this.trimX_field_u << 16));
            }
            if (this.trimY_field_p > 0) {
                var13 = ((this.trimY_field_p << 16) + var12 - 1) / var12;
                param1 = param1 + var13;
                var8 = var8 + (var13 * var12 - (this.trimY_field_p << 16));
            }
            if (var5 < var9) {
                param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
            }
            if (var6 < var10) {
                param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }
            var13 = param0 + param1 * SoftwareRasterizer_vb.stride_field_f;
            var14 = SoftwareRasterizer_vb.stride_field_f - param2;
            if (param1 + param3 > SoftwareRasterizer_vb.clipBottom_field_d) {
                param3 = param3 - (param1 + param3 - SoftwareRasterizer_vb.clipBottom_field_d);
            }
            if (param1 < SoftwareRasterizer_vb.clipTop_field_i) {
                var15 = SoftwareRasterizer_vb.clipTop_field_i - param1;
                param3 = param3 - var15;
                var13 = var13 + var15 * SoftwareRasterizer_vb.stride_field_f;
                var8 = var8 + var12 * var15;
            }
            if (param0 + param2 > SoftwareRasterizer_vb.clipRight_field_k) {
                var15 = param0 + param2 - SoftwareRasterizer_vb.clipRight_field_k;
                param2 = param2 - var15;
                var14 = var14 + var15;
            }
            if (param0 < SoftwareRasterizer_vb.clipLeft_field_e) {
                var15 = SoftwareRasterizer_vb.clipLeft_field_e - param0;
                param2 = param2 - var15;
                var13 = var13 + var15;
                var7 = var7 + var11 * var15;
                var14 = var14 + var15;
            }
            Sprite_dm.a(SoftwareRasterizer_vb.framebuffer_field_c, this.pixels_field_v, 0, var7, var8, var13, var14, param2, param3, var11, var12, var5);
            return;
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var14 = 0;
        int var16 = 0;
        if (param2 > 0) {
            if (param3 <= 0) {
                return;
            }
            var6 = this.width_field_r;
            var7 = this.height_field_m;
            var8 = 0;
            var9 = 0;
            var10 = this.field_s;
            var11 = this.field_o;
            var12 = (var10 << 16) / param2;
            var13 = (var11 << 16) / param3;
            if (this.trimX_field_u > 0) {
                var14 = ((this.trimX_field_u << 16) + var12 - 1) / var12;
                param0 = param0 + var14;
                var8 = var8 + (var14 * var12 - (this.trimX_field_u << 16));
            }
            if (this.trimY_field_p > 0) {
                var14 = ((this.trimY_field_p << 16) + var13 - 1) / var13;
                param1 = param1 + var14;
                var9 = var9 + (var14 * var13 - (this.trimY_field_p << 16));
            }
            if (var6 < var10) {
                param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }
            if (var7 < var11) {
                param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
            }
            var14 = param0 + param1 * SoftwareRasterizer_vb.stride_field_f;
            var15 = SoftwareRasterizer_vb.stride_field_f - param2;
            if (param1 + param3 > SoftwareRasterizer_vb.clipBottom_field_d) {
                param3 = param3 - (param1 + param3 - SoftwareRasterizer_vb.clipBottom_field_d);
            }
            if (param1 < SoftwareRasterizer_vb.clipTop_field_i) {
                var16 = SoftwareRasterizer_vb.clipTop_field_i - param1;
                param3 = param3 - var16;
                var14 = var14 + var16 * SoftwareRasterizer_vb.stride_field_f;
                var9 = var9 + var13 * var16;
            }
            if (param0 + param2 > SoftwareRasterizer_vb.clipRight_field_k) {
                var16 = param0 + param2 - SoftwareRasterizer_vb.clipRight_field_k;
                param2 = param2 - var16;
                var15 = var15 + var16;
            }
            if (param0 < SoftwareRasterizer_vb.clipLeft_field_e) {
                var16 = SoftwareRasterizer_vb.clipLeft_field_e - param0;
                param2 = param2 - var16;
                var14 = var14 + var16;
                var8 = var8 + var12 * var16;
                var15 = var15 + var16;
            }
            Sprite_dm.a(SoftwareRasterizer_vb.framebuffer_field_c, this.pixels_field_v, 0, var8, var9, var14, var15, param2, param3, var12, var13, var6, param4);
            return;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = this.field_s << 3;
        int var6 = this.field_o << 3;
        param0 = (param0 << 4) + (var5 & 15);
        param1 = (param1 << 4) + (var6 & 15);
        this.rotateSmooth_a(var5, var6, param0, param1, param2, param3);
    }

    private final static void a(int param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var10 = -param7;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = -param6;
            L1: while (true) {
              if (var11 >= 0) {
                param5 = param5 + param8;
                param4 = param4 + param9;
                var10++;
                continue L0;
              } else {
                incrementValue$4 = param4;
                param4++;
                param3 = param2[incrementValue$4];
                if (param3 != 0) {
                  param0 = param1[param5];
                  if (param0 != 0) {
                    var12 = ((param3 & 16711680) >>> 16) * ((param0 & 16711680) >>> 16) >>> 8;
                    var13 = (param3 & 65280) * (param0 & 65280) >>> 24;
                    var14 = (param3 & 255) * (param0 & 255) >>> 8;
                    incrementValue$5 = param5;
                    param5++;
                    param1[incrementValue$5] = (var12 << 16) + (var13 << 8) + var14;
                    var11++;
                    continue L1;
                  } else {
                    param5++;
                    var11++;
                    continue L1;
                  }
                } else {
                  param5++;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int incrementValue$0 = 0;
        int var18 = 0;
        int var13 = 256 - param12;
        int var14 = param3;
        for (var15 = -param8; var15 < 0; var15++) {
            var16 = (param4 >> 16) * param11;
            for (var17 = -param7; var17 < 0; var17++) {
                param2 = param1[(param3 >> 16) + var16];
                if (param2 != 0) {
                    var18 = param0[param5];
                    incrementValue$0 = param5;
                    param5++;
                    param0[incrementValue$0] = ((param2 & 16711935) * param12 + (var18 & 16711935) * var13 & -16711936) + ((param2 & 65280) * param12 + (var18 & 65280) * var13 & 16711680) >> 8;
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var14;
            param5 = param5 + param6;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        var10 = param9 >> 16 & 255;
        var11 = param9 >> 8 & 255;
        var12 = param9 & 255;
        var13 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var14 = var13 + var13 + var13 + var13 + param5;
        var15 = -param6;
        L0: while (true) {
          if (var15 >= 0) {
            return;
          } else {
            var16 = var14;
            L1: while (true) {
              if (var16 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var15++;
                continue L0;
              } else {
                incrementValue$0 = param3;
                param3++;
                param2 = param1[incrementValue$0];
                if (param2 == 0) {
                  param4++;
                  var16++;
                  continue L1;
                } else {
                  L2: {
                    var17 = param2 >> 16 & 255;
                    var18 = param2 >> 8 & 255;
                    var19 = param2 & 255;
                    if (var17 != var18) {
                      break L2;
                    } else {
                      if (var18 != var19) {
                        break L2;
                      } else {
                        if (var17 > 128) {
                          incrementValue$1 = param4;
                          param4++;
                          param0[incrementValue$1] = (var10 * (256 - var17) + 255 * (var17 - 128) >> 7 << 16) + (var11 * (256 - var18) + 255 * (var18 - 128) >> 7 << 8) + (var12 * (256 - var19) + 255 * (var19 - 128) >> 7);
                          var16++;
                          continue L1;
                        } else {
                          incrementValue$2 = param4;
                          param4++;
                          param0[incrementValue$2] = (var17 * var10 >> 7 << 16) + (var18 * var11 >> 7 << 8) + (var19 * var12 >> 7);
                          var16++;
                          continue L1;
                        }
                      }
                    }
                  }
                  incrementValue$3 = param4;
                  param4++;
                  param0[incrementValue$3] = param2;
                  var16++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    void c(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.trimX_field_u;
        param1 = param1 + this.trimY_field_p;
        int var4 = param0 + param1 * SoftwareRasterizer_vb.stride_field_f;
        int var5 = 0;
        int var6 = this.height_field_m;
        int var7 = this.width_field_r;
        int var8 = SoftwareRasterizer_vb.stride_field_f - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer_vb.clipTop_field_i) {
            var10 = SoftwareRasterizer_vb.clipTop_field_i - param1;
            var6 = var6 - var10;
            param1 = SoftwareRasterizer_vb.clipTop_field_i;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * SoftwareRasterizer_vb.stride_field_f;
        }
        if (param1 + var6 > SoftwareRasterizer_vb.clipBottom_field_d) {
            var6 = var6 - (param1 + var6 - SoftwareRasterizer_vb.clipBottom_field_d);
        }
        if (param0 < SoftwareRasterizer_vb.clipLeft_field_e) {
            var10 = SoftwareRasterizer_vb.clipLeft_field_e - param0;
            var7 = var7 - var10;
            param0 = SoftwareRasterizer_vb.clipLeft_field_e;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > SoftwareRasterizer_vb.clipRight_field_k) {
            var10 = param0 + var7 - SoftwareRasterizer_vb.clipRight_field_k;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            if (param2 == 256) {
                Sprite_dm.a(0, 0, 0, SoftwareRasterizer_vb.framebuffer_field_c, this.pixels_field_v, var5, 0, var4, 0, var7, var6, var8, var9);
            } else {
                Sprite_dm.a(0, 0, 0, SoftwareRasterizer_vb.framebuffer_field_c, this.pixels_field_v, var5, 0, var4, 0, var7, var6, var8, var9, param2);
            }
            return;
        }
    }

    final void a() {
        int var4 = 0;
        int incrementValue$0 = 0;
        int var3 = 0;
        int[] var1 = new int[this.width_field_r * this.height_field_m];
        int var2 = 0;
        for (var3 = 0; var3 < this.width_field_r; var3++) {
            for (var4 = this.height_field_m - 1; var4 >= 0; var4--) {
                incrementValue$0 = var2;
                var2++;
                var1[incrementValue$0] = this.pixels_field_v[var3 + var4 * this.width_field_r];
            }
        }
        this.pixels_field_v = var1;
        var3 = this.trimY_field_p;
        this.trimY_field_p = this.trimX_field_u;
        this.trimX_field_u = this.field_o - this.height_field_m - var3;
        var3 = this.height_field_m;
        this.height_field_m = this.width_field_r;
        this.width_field_r = var3;
        var3 = this.field_o;
        this.field_o = this.field_s;
        this.field_s = var3;
    }

    final void e() {
        SoftwareRasterizer_vb.a(this.pixels_field_v, this.width_field_r, this.height_field_m);
    }

    final Sprite_dm c() {
        int var2 = 0;
        int var3 = 0;
        Sprite_dm var1 = new Sprite_dm(this.width_field_r, this.height_field_m);
        var1.field_s = this.field_s;
        var1.field_o = this.field_o;
        var1.trimX_field_u = this.field_s - this.width_field_r - this.trimX_field_u;
        var1.trimY_field_p = this.trimY_field_p;
        for (var2 = 0; var2 < this.height_field_m; var2++) {
            for (var3 = 0; var3 < this.width_field_r; var3++) {
                var1.pixels_field_v[var2 * this.width_field_r + var3] = this.pixels_field_v[var2 * this.width_field_r + this.width_field_r - 1 - var3];
            }
        }
        return var1;
    }

    void d(int param0, int param1) {
        param0 = param0 + (this.trimX_field_u >> 1);
        param1 = param1 + (this.trimY_field_p >> 1);
        int var3 = param0 < SoftwareRasterizer_vb.clipLeft_field_e ? SoftwareRasterizer_vb.clipLeft_field_e - param0 << 1 : 0;
        int var4 = param0 + (this.width_field_r >> 1) > SoftwareRasterizer_vb.clipRight_field_k ? SoftwareRasterizer_vb.clipRight_field_k - param0 << 1 : this.width_field_r;
        int var5 = param1 < SoftwareRasterizer_vb.clipTop_field_i ? SoftwareRasterizer_vb.clipTop_field_i - param1 << 1 : 0;
        int var6 = param1 + (this.height_field_m >> 1) > SoftwareRasterizer_vb.clipBottom_field_d ? SoftwareRasterizer_vb.clipBottom_field_d - param1 << 1 : this.height_field_m;
        Sprite_dm.a(this.pixels_field_v, var5 * this.width_field_r + var3, (param1 + (var5 >> 1)) * SoftwareRasterizer_vb.stride_field_f + (param0 + (var3 >> 1)), (this.width_field_r << 1) - (var4 - var3) + (this.width_field_r & 1), SoftwareRasterizer_vb.stride_field_f - (var4 - var3 >> 1), this.width_field_r, var4 - var3 >> 1, var6 - var5 >> 1);
    }

    void b(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.trimX_field_u;
        param1 = param1 + this.trimY_field_p;
        int var3 = param0 + param1 * SoftwareRasterizer_vb.stride_field_f;
        int var4 = 0;
        int var5 = this.height_field_m;
        int var6 = this.width_field_r;
        int var7 = SoftwareRasterizer_vb.stride_field_f - var6;
        int var8 = 0;
        if (param1 < SoftwareRasterizer_vb.clipTop_field_i) {
            var9 = SoftwareRasterizer_vb.clipTop_field_i - param1;
            var5 = var5 - var9;
            param1 = SoftwareRasterizer_vb.clipTop_field_i;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * SoftwareRasterizer_vb.stride_field_f;
        }
        if (param1 + var5 > SoftwareRasterizer_vb.clipBottom_field_d) {
            var5 = var5 - (param1 + var5 - SoftwareRasterizer_vb.clipBottom_field_d);
        }
        if (param0 < SoftwareRasterizer_vb.clipLeft_field_e) {
            var9 = SoftwareRasterizer_vb.clipLeft_field_e - param0;
            var6 = var6 - var9;
            param0 = SoftwareRasterizer_vb.clipLeft_field_e;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > SoftwareRasterizer_vb.clipRight_field_k) {
            var9 = param0 + var6 - SoftwareRasterizer_vb.clipRight_field_k;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            Sprite_dm.b(SoftwareRasterizer_vb.framebuffer_field_c, this.pixels_field_v, 0, var4, var3, var6, var5, var7, var8);
            return;
        }
    }

    void e(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.trimX_field_u;
        param1 = param1 + this.trimY_field_p;
        int var4 = param0 + param1 * SoftwareRasterizer_vb.stride_field_f;
        int var5 = 0;
        int var6 = this.height_field_m;
        int var7 = this.width_field_r;
        int var8 = SoftwareRasterizer_vb.stride_field_f - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer_vb.clipTop_field_i) {
            var10 = SoftwareRasterizer_vb.clipTop_field_i - param1;
            var6 = var6 - var10;
            param1 = SoftwareRasterizer_vb.clipTop_field_i;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * SoftwareRasterizer_vb.stride_field_f;
        }
        if (param1 + var6 > SoftwareRasterizer_vb.clipBottom_field_d) {
            var6 = var6 - (param1 + var6 - SoftwareRasterizer_vb.clipBottom_field_d);
        }
        if (param0 < SoftwareRasterizer_vb.clipLeft_field_e) {
            var10 = SoftwareRasterizer_vb.clipLeft_field_e - param0;
            var7 = var7 - var10;
            param0 = SoftwareRasterizer_vb.clipLeft_field_e;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > SoftwareRasterizer_vb.clipRight_field_k) {
            var10 = param0 + var7 - SoftwareRasterizer_vb.clipRight_field_k;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            Sprite_dm.a(SoftwareRasterizer_vb.framebuffer_field_c, this.pixels_field_v, 0, var5, var4, var7, var6, var8, var9, param2);
            return;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int incrementValue$48 = 0;
        int incrementValue$49 = 0;
        int incrementValue$50 = 0;
        int incrementValue$51 = 0;
        int incrementValue$52 = 0;
        int incrementValue$53 = 0;
        int var9;
        int var10;
        int var11;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                var11 = param5;
                L2: while (true) {
                  if (var11 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var10++;
                    continue L0;
                  } else {
                    incrementValue$44 = param3;
                    param3++;
                    param2 = param1[incrementValue$44];
                    if (param2 == 0) {
                      param4++;
                      var11++;
                      continue L2;
                    } else {
                      incrementValue$45 = param4;
                      param4++;
                      param0[incrementValue$45] = param2;
                      var11++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$46 = param3;
                  param3++;
                  param2 = param1[incrementValue$46];
                  if (param2 == 0) {
                    param4++;
                    break L3;
                  } else {
                    incrementValue$47 = param4;
                    param4++;
                    param0[incrementValue$47] = param2;
                    break L3;
                  }
                }
                L4: {
                  incrementValue$48 = param3;
                  param3++;
                  param2 = param1[incrementValue$48];
                  if (param2 == 0) {
                    param4++;
                    break L4;
                  } else {
                    incrementValue$49 = param4;
                    param4++;
                    param0[incrementValue$49] = param2;
                    break L4;
                  }
                }
                L5: {
                  incrementValue$50 = param3;
                  param3++;
                  param2 = param1[incrementValue$50];
                  if (param2 == 0) {
                    param4++;
                    break L5;
                  } else {
                    incrementValue$51 = param4;
                    param4++;
                    param0[incrementValue$51] = param2;
                    break L5;
                  }
                }
                incrementValue$52 = param3;
                param3++;
                param2 = param1[incrementValue$52];
                if (param2 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  incrementValue$53 = param4;
                  param4++;
                  param0[incrementValue$53] = param2;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    void f(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        L0: {
          var3 = this.width_field_r >> 2;
          var4 = this.height_field_m >> 2;
          param0 = param0 + this.trimX_field_u / 4;
          param1 = param1 + this.trimY_field_p / 4;
          if (param0 >= SoftwareRasterizer_vb.clipLeft_field_e) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = SoftwareRasterizer_vb.clipLeft_field_e - param0 << 2;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= SoftwareRasterizer_vb.clipRight_field_k) {
            stackIn_6_0 = this.width_field_r - 4;
            break L1;
          } else {
            stackIn_6_0 = (SoftwareRasterizer_vb.clipRight_field_k - param0 << 2) - 4;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= SoftwareRasterizer_vb.clipTop_field_i) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = SoftwareRasterizer_vb.clipTop_field_i - param1 << 2;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= SoftwareRasterizer_vb.clipBottom_field_d) {
            stackIn_12_0 = this.height_field_m - 4;
            break L3;
          } else {
            stackIn_12_0 = (SoftwareRasterizer_vb.clipBottom_field_d - param1 << 2) - 4;
            break L3;
          }
        }
        var8 = stackIn_12_0;
        var9 = var7;
        L4: while (true) {
          if (var9 > var8) {
            return;
          } else {
            var10 = var9 * this.width_field_r + var5;
            var11 = (param1 + (var9 >> 2)) * SoftwareRasterizer_vb.stride_field_f + (param0 + (var5 >> 2));
            var12 = var5;
            L5: while (true) {
              if (var12 > var6) {
                var9 += 4;
                continue L4;
              } else {
                var13 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                L6: while (true) {
                  if (var16 >= 4) {
                    SoftwareRasterizer_vb.framebuffer_field_c[var11] = (var14 & 267390960 | var15 & 1044480) >> 4;
                    var12 += 4;
                    var10 += 4;
                    var11++;
                    continue L5;
                  } else {
                    var17 = 0;
                    L7: while (true) {
                      if (var17 >= 4) {
                        var16++;
                        continue L6;
                      } else {
                        L8: {
                          var13 = this.pixels_field_v[var10 + var16 * this.width_field_r + var17];
                          if (var13 != 0) {
                            break L8;
                          } else {
                            var13 = SoftwareRasterizer_vb.framebuffer_field_c[var11];
                            break L8;
                          }
                        }
                        var14 = var14 + (var13 & 16711935);
                        var15 = var15 + (var13 & 65280);
                        var17++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int incrementValue$4 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var8 = 0;
        L0: while (true) {
          if (var8 >= param7) {
            return;
          } else {
            var9 = 0;
            L1: while (true) {
              if (var9 >= param6) {
                var8++;
                param1 = param1 + param3;
                param2 = param2 + param4;
                continue L0;
              } else {
                L2: {
                  var11 = SoftwareRasterizer_vb.framebuffer_field_c[param2] & 16711935;
                  var12 = SoftwareRasterizer_vb.framebuffer_field_c[param2] & 65280;
                  var13 = 0;
                  var14 = 0;
                  dupTemp$0 = param0[param1];
                  var10 = dupTemp$0;
                  if (dupTemp$0 != 0) {
                    var13 = var13 + (var10 & 16711935);
                    var14 = var14 + (var10 & 65280);
                    break L2;
                  } else {
                    var13 = var13 + var11;
                    var14 = var14 + var12;
                    break L2;
                  }
                }
                L3: {
                  dupTemp$1 = param0[param1 + 1];
                  var10 = dupTemp$1;
                  if (dupTemp$1 != 0) {
                    var13 = var13 + (var10 & 16711935);
                    var14 = var14 + (var10 & 65280);
                    break L3;
                  } else {
                    var13 = var13 + var11;
                    var14 = var14 + var12;
                    break L3;
                  }
                }
                L4: {
                  dupTemp$2 = param0[param1 + param5];
                  var10 = dupTemp$2;
                  if (dupTemp$2 != 0) {
                    var13 = var13 + (var10 & 16711935);
                    var14 = var14 + (var10 & 65280);
                    break L4;
                  } else {
                    var13 = var13 + var11;
                    var14 = var14 + var12;
                    break L4;
                  }
                }
                L5: {
                  dupTemp$3 = param0[param1 + param5 + 1];
                  var10 = dupTemp$3;
                  if (dupTemp$3 != 0) {
                    var13 = var13 + (var10 & 16711935);
                    var14 = var14 + (var10 & 65280);
                    break L5;
                  } else {
                    var13 = var13 + var11;
                    var14 = var14 + var12;
                    break L5;
                  }
                }
                incrementValue$4 = param2;
                param2++;
                SoftwareRasterizer_vb.framebuffer_field_c[incrementValue$4] = (var13 & 66847740 | var14 & 261120) >> 2;
                var9++;
                param1 += 2;
                continue L1;
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int incrementValue$48 = 0;
        int incrementValue$49 = 0;
        int incrementValue$50 = 0;
        int incrementValue$51 = 0;
        int incrementValue$52 = 0;
        int incrementValue$53 = 0;
        int var9;
        int var10;
        int var11;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                var11 = param5;
                L2: while (true) {
                  if (var11 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var10++;
                    continue L0;
                  } else {
                    incrementValue$44 = param3;
                    param3++;
                    if (param1[incrementValue$44] == 0) {
                      param4++;
                      var11++;
                      continue L2;
                    } else {
                      incrementValue$45 = param4;
                      param4++;
                      param0[incrementValue$45] = param2;
                      var11++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$46 = param3;
                  param3++;
                  if (param1[incrementValue$46] == 0) {
                    param4++;
                    break L3;
                  } else {
                    incrementValue$47 = param4;
                    param4++;
                    param0[incrementValue$47] = param2;
                    break L3;
                  }
                }
                L4: {
                  incrementValue$48 = param3;
                  param3++;
                  if (param1[incrementValue$48] == 0) {
                    param4++;
                    break L4;
                  } else {
                    incrementValue$49 = param4;
                    param4++;
                    param0[incrementValue$49] = param2;
                    break L4;
                  }
                }
                L5: {
                  incrementValue$50 = param3;
                  param3++;
                  if (param1[incrementValue$50] == 0) {
                    param4++;
                    break L5;
                  } else {
                    incrementValue$51 = param4;
                    param4++;
                    param0[incrementValue$51] = param2;
                    break L5;
                  }
                }
                incrementValue$52 = param3;
                param3++;
                if (param1[incrementValue$52] == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  incrementValue$53 = param4;
                  param4++;
                  param0[incrementValue$53] = param2;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var14 = 0;
        int var16 = 0;
        if (param2 > 0) {
            if (param3 <= 0) {
                return;
            }
            if (param2 == this.width_field_r && param3 == this.height_field_m) {
                this.a(param0, param1, param4);
                return;
            }
            var6 = this.width_field_r;
            var7 = this.height_field_m;
            var8 = 0;
            var9 = 0;
            var10 = this.field_s;
            var11 = this.field_o;
            var12 = (var10 << 16) / param2;
            var13 = (var11 << 16) / param3;
            if (this.trimX_field_u > 0) {
                var14 = ((this.trimX_field_u << 16) + var12 - 1) / var12;
                param0 = param0 + var14;
                var8 = var8 + (var14 * var12 - (this.trimX_field_u << 16));
            }
            if (this.trimY_field_p > 0) {
                var14 = ((this.trimY_field_p << 16) + var13 - 1) / var13;
                param1 = param1 + var14;
                var9 = var9 + (var14 * var13 - (this.trimY_field_p << 16));
            }
            if (var6 < var10) {
                param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }
            if (var7 < var11) {
                param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
            }
            var14 = param0 + param1 * SoftwareRasterizer_vb.stride_field_f;
            var15 = SoftwareRasterizer_vb.stride_field_f - param2;
            if (param1 + param3 > SoftwareRasterizer_vb.clipBottom_field_d) {
                param3 = param3 - (param1 + param3 - SoftwareRasterizer_vb.clipBottom_field_d);
            }
            if (param1 < SoftwareRasterizer_vb.clipTop_field_i) {
                var16 = SoftwareRasterizer_vb.clipTop_field_i - param1;
                param3 = param3 - var16;
                var14 = var14 + var16 * SoftwareRasterizer_vb.stride_field_f;
                var9 = var9 + var13 * var16;
            }
            if (param0 + param2 > SoftwareRasterizer_vb.clipRight_field_k) {
                var16 = param0 + param2 - SoftwareRasterizer_vb.clipRight_field_k;
                param2 = param2 - var16;
                var15 = var15 + var16;
            }
            if (param0 < SoftwareRasterizer_vb.clipLeft_field_e) {
                var16 = SoftwareRasterizer_vb.clipLeft_field_e - param0;
                param2 = param2 - var16;
                var14 = var14 + var16;
                var8 = var8 + var12 * var16;
                var15 = var15 + var16;
            }
            Sprite_dm.b(SoftwareRasterizer_vb.framebuffer_field_c, this.pixels_field_v, 0, var8, var9, var14, var15, param2, param3, var12, var13, var6, param4);
            return;
        }
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        param8 = -param10;
        L0: while (true) {
          if (param8 >= 0) {
            return;
          } else {
            param6 = -param9;
            L1: while (true) {
              if (param6 >= 0) {
                param7 = param7 + param11;
                param5 = param5 + param12;
                param8++;
                continue L0;
              } else {
                incrementValue$11 = param5;
                param5++;
                param0 = param4[incrementValue$11];
                if (param0 == 0) {
                  param7++;
                  param6++;
                  continue L1;
                } else {
                  param1 = (param0 & 16711935) * param13;
                  param0 = (param1 & -16711936) + (param0 * param13 - param1 & 16711680) >>> 8;
                  param1 = param3[param7];
                  param2 = param0 + param1;
                  param0 = (param0 & 16711935) + (param1 & 16711935);
                  param1 = (param0 & 16777472) + (param2 - param0 & 65536);
                  incrementValue$12 = param7;
                  param7++;
                  param3[incrementValue$12] = param2 - param1 | param1 - (param1 >>> 8);
                  param6++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        for (var8 = -param5; var8 < 0; var8++) {
            var9 = param3 + param4 - 3;
            while (param3 < var9) {
                incrementValue$0 = param3;
                param3++;
                incrementValue$1 = param2;
                param2++;
                param0[incrementValue$0] = param1[incrementValue$1];
                incrementValue$2 = param3;
                param3++;
                incrementValue$3 = param2;
                param2++;
                param0[incrementValue$2] = param1[incrementValue$3];
                incrementValue$4 = param3;
                param3++;
                incrementValue$5 = param2;
                param2++;
                param0[incrementValue$4] = param1[incrementValue$5];
                incrementValue$6 = param3;
                param3++;
                incrementValue$7 = param2;
                param2++;
                param0[incrementValue$6] = param1[incrementValue$7];
            }
            var9 += 3;
            while (param3 < var9) {
                incrementValue$8 = param3;
                param3++;
                incrementValue$9 = param2;
                param2++;
                param0[incrementValue$8] = param1[incrementValue$9];
            }
            param3 = param3 + param6;
            param2 = param2 + param7;
        }
    }

    void c(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.trimX_field_u;
        param1 = param1 + this.trimY_field_p;
        int var3 = param0 + param1 * SoftwareRasterizer_vb.stride_field_f;
        int var4 = 0;
        int var5 = this.height_field_m;
        int var6 = this.width_field_r;
        int var7 = SoftwareRasterizer_vb.stride_field_f - var6;
        int var8 = 0;
        if (param1 < SoftwareRasterizer_vb.clipTop_field_i) {
            var9 = SoftwareRasterizer_vb.clipTop_field_i - param1;
            var5 = var5 - var9;
            param1 = SoftwareRasterizer_vb.clipTop_field_i;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * SoftwareRasterizer_vb.stride_field_f;
        }
        if (param1 + var5 > SoftwareRasterizer_vb.clipBottom_field_d) {
            var5 = var5 - (param1 + var5 - SoftwareRasterizer_vb.clipBottom_field_d);
        }
        if (param0 < SoftwareRasterizer_vb.clipLeft_field_e) {
            var9 = SoftwareRasterizer_vb.clipLeft_field_e - param0;
            var6 = var6 - var9;
            param0 = SoftwareRasterizer_vb.clipLeft_field_e;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > SoftwareRasterizer_vb.clipRight_field_k) {
            var9 = param0 + var6 - SoftwareRasterizer_vb.clipRight_field_k;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            Sprite_dm.a(SoftwareRasterizer_vb.framebuffer_field_c, this.pixels_field_v, var4, var3, var6, var5, var7, var8);
            return;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int var12;
        int var13;
        var12 = param11 & 16711935;
        var13 = param11 >> 8 & 255;
        param6 = -param8;
        L0: while (true) {
          if (param6 >= 0) {
            return;
          } else {
            param5 = -param7;
            L1: while (true) {
              if (param5 >= 0) {
                param4 = param4 + param9;
                param3 = param3 + param10;
                param6++;
                continue L0;
              } else {
                incrementValue$12 = param3;
                param3++;
                param2 = param1[incrementValue$12];
                if (param2 == 0) {
                  param4++;
                  param5++;
                  continue L1;
                } else {
                  if (param2 >> 8 != (param2 & 65535)) {
                    incrementValue$13 = param4;
                    param4++;
                    param0[incrementValue$13] = param2;
                    param5++;
                    continue L1;
                  } else {
                    param2 = param2 & 255;
                    incrementValue$14 = param4;
                    param4++;
                    param0[incrementValue$14] = (param2 * var12 >> 8 & 16711934) + (param2 * var13 & 65280) + 1;
                    param5++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    final void rotateSmooth_a(int sourcePivotX_param0, int sourcePivotY_param1, int destinationX_param2, int destinationY_param3, int angle_param4, int scale_param5) {
        double angleRadians_var7;
        int scaledSin_var9;
        int scaledCos_var10;
        int corner0X_var11;
        int corner0Y_var12;
        int corner1X_var13;
        int corner1Y_var14;
        int corner2X_var15;
        int corner2Y_var16;
        int corner3X_var17;
        int corner3Y_var18;
        int leftBound_var19;
        int rightThenNegativeWidth_var20;
        int topBound_var21;
        int bottomThenNegativeHeight_var22;
        int destinationIndex_var23;
        int rowSkip_var24;
        double inverseScaleFactor_var25;
        int inverseSinStep_var27;
        int inverseCosStep_var28;
        int destinationOffsetX_var29;
        int destinationOffsetY_var30;
        int rowSourceXQ12_var31;
        int rowSourceYQ12_var32;
        int sourcePixelX_var33;
        int sourcePixelY_var34;
        int clipScratch_var35;
        int negativeRowCounter_var36;
        int sourceXQ12_var37;
        int sourceYQ12_var38;
        int negativePixelCounter_var39;
        int canSample_var40;
        if (scale_param5 != 0) {
          L0: {
            sourcePivotX_param0 = sourcePivotX_param0 - (this.trimX_field_u << 4);
            sourcePivotY_param1 = sourcePivotY_param1 - (this.trimY_field_p << 4);
            angleRadians_var7 = (double)(angle_param4 & 65535) * 0.00009587379924285257;
            scaledSin_var9 = (int)Math.floor(Math.sin(angleRadians_var7) * (double)scale_param5 + 0.5);
            scaledCos_var10 = (int)Math.floor(Math.cos(angleRadians_var7) * (double)scale_param5 + 0.5);
            corner0X_var11 = -sourcePivotX_param0 * scaledCos_var10 + -sourcePivotY_param1 * scaledSin_var9;
            corner0Y_var12 = --sourcePivotX_param0 * scaledSin_var9 + -sourcePivotY_param1 * scaledCos_var10;
            corner1X_var13 = ((this.width_field_r << 4) - sourcePivotX_param0) * scaledCos_var10 + -sourcePivotY_param1 * scaledSin_var9;
            corner1Y_var14 = -((this.width_field_r << 4) - sourcePivotX_param0) * scaledSin_var9 + -sourcePivotY_param1 * scaledCos_var10;
            corner2X_var15 = -sourcePivotX_param0 * scaledCos_var10 + ((this.height_field_m << 4) - sourcePivotY_param1) * scaledSin_var9;
            corner2Y_var16 = --sourcePivotX_param0 * scaledSin_var9 + ((this.height_field_m << 4) - sourcePivotY_param1) * scaledCos_var10;
            corner3X_var17 = ((this.width_field_r << 4) - sourcePivotX_param0) * scaledCos_var10 + ((this.height_field_m << 4) - sourcePivotY_param1) * scaledSin_var9;
            corner3Y_var18 = -((this.width_field_r << 4) - sourcePivotX_param0) * scaledSin_var9 + ((this.height_field_m << 4) - sourcePivotY_param1) * scaledCos_var10;
            if (corner0X_var11 >= corner1X_var13) {
              leftBound_var19 = corner1X_var13;
              rightThenNegativeWidth_var20 = corner0X_var11;
              break L0;
            } else {
              leftBound_var19 = corner0X_var11;
              rightThenNegativeWidth_var20 = corner1X_var13;
              break L0;
            }
          }
          L1: {
            if (corner2X_var15 >= leftBound_var19) {
              break L1;
            } else {
              leftBound_var19 = corner2X_var15;
              break L1;
            }
          }
          L2: {
            if (corner3X_var17 >= leftBound_var19) {
              break L2;
            } else {
              leftBound_var19 = corner3X_var17;
              break L2;
            }
          }
          L3: {
            if (corner2X_var15 <= rightThenNegativeWidth_var20) {
              break L3;
            } else {
              rightThenNegativeWidth_var20 = corner2X_var15;
              break L3;
            }
          }
          L4: {
            if (corner3X_var17 <= rightThenNegativeWidth_var20) {
              break L4;
            } else {
              rightThenNegativeWidth_var20 = corner3X_var17;
              break L4;
            }
          }
          L5: {
            if (corner0Y_var12 >= corner1Y_var14) {
              topBound_var21 = corner1Y_var14;
              bottomThenNegativeHeight_var22 = corner0Y_var12;
              break L5;
            } else {
              topBound_var21 = corner0Y_var12;
              bottomThenNegativeHeight_var22 = corner1Y_var14;
              break L5;
            }
          }
          L6: {
            if (corner2Y_var16 >= topBound_var21) {
              break L6;
            } else {
              topBound_var21 = corner2Y_var16;
              break L6;
            }
          }
          L7: {
            if (corner3Y_var18 >= topBound_var21) {
              break L7;
            } else {
              topBound_var21 = corner3Y_var18;
              break L7;
            }
          }
          L8: {
            if (corner2Y_var16 <= bottomThenNegativeHeight_var22) {
              break L8;
            } else {
              bottomThenNegativeHeight_var22 = corner2Y_var16;
              break L8;
            }
          }
          L9: {
            if (corner3Y_var18 <= bottomThenNegativeHeight_var22) {
              break L9;
            } else {
              bottomThenNegativeHeight_var22 = corner3Y_var18;
              break L9;
            }
          }
          L10: {
            leftBound_var19 = leftBound_var19 >> 12;
            rightThenNegativeWidth_var20 = rightThenNegativeWidth_var20 + 4095 >> 12;
            topBound_var21 = topBound_var21 >> 12;
            bottomThenNegativeHeight_var22 = bottomThenNegativeHeight_var22 + 4095 >> 12;
            leftBound_var19 = leftBound_var19 + destinationX_param2;
            rightThenNegativeWidth_var20 = rightThenNegativeWidth_var20 + destinationX_param2;
            topBound_var21 = topBound_var21 + destinationY_param3;
            bottomThenNegativeHeight_var22 = bottomThenNegativeHeight_var22 + destinationY_param3;
            leftBound_var19 = leftBound_var19 >> 4;
            rightThenNegativeWidth_var20 = rightThenNegativeWidth_var20 + 15 >> 4;
            topBound_var21 = topBound_var21 >> 4;
            bottomThenNegativeHeight_var22 = bottomThenNegativeHeight_var22 + 15 >> 4;
            if (leftBound_var19 >= SoftwareRasterizer_vb.clipLeft_field_e) {
              break L10;
            } else {
              leftBound_var19 = SoftwareRasterizer_vb.clipLeft_field_e;
              break L10;
            }
          }
          L11: {
            if (rightThenNegativeWidth_var20 <= SoftwareRasterizer_vb.clipRight_field_k) {
              break L11;
            } else {
              rightThenNegativeWidth_var20 = SoftwareRasterizer_vb.clipRight_field_k;
              break L11;
            }
          }
          L12: {
            if (topBound_var21 >= SoftwareRasterizer_vb.clipTop_field_i) {
              break L12;
            } else {
              topBound_var21 = SoftwareRasterizer_vb.clipTop_field_i;
              break L12;
            }
          }
          L13: {
            if (bottomThenNegativeHeight_var22 <= SoftwareRasterizer_vb.clipBottom_field_d) {
              break L13;
            } else {
              bottomThenNegativeHeight_var22 = SoftwareRasterizer_vb.clipBottom_field_d;
              break L13;
            }
          }
          rightThenNegativeWidth_var20 = leftBound_var19 - rightThenNegativeWidth_var20;
          if (rightThenNegativeWidth_var20 < 0) {
            bottomThenNegativeHeight_var22 = topBound_var21 - bottomThenNegativeHeight_var22;
            if (bottomThenNegativeHeight_var22 < 0) {
              L14: {
                destinationIndex_var23 = topBound_var21 * SoftwareRasterizer_vb.stride_field_f + leftBound_var19;
                rowSkip_var24 = SoftwareRasterizer_vb.stride_field_f + rightThenNegativeWidth_var20;
                inverseScaleFactor_var25 = 16777216.0 / (double)scale_param5;
                inverseSinStep_var27 = (int)Math.floor(Math.sin(angleRadians_var7) * inverseScaleFactor_var25 + 0.5);
                inverseCosStep_var28 = (int)Math.floor(Math.cos(angleRadians_var7) * inverseScaleFactor_var25 + 0.5);
                destinationOffsetX_var29 = (leftBound_var19 << 4) + 8 - destinationX_param2;
                destinationOffsetY_var30 = (topBound_var21 << 4) + 8 - destinationY_param3;
                rowSourceXQ12_var31 = (sourcePivotX_param0 << 8) - 2048 - (destinationOffsetY_var30 * inverseSinStep_var27 >> 4);
                rowSourceYQ12_var32 = (sourcePivotY_param1 << 8) - 2048 + (destinationOffsetY_var30 * inverseCosStep_var28 >> 4);
                if (inverseCosStep_var28 >= 0) {
                  if (inverseSinStep_var27 >= 0) {
                    negativeRowCounter_var36 = bottomThenNegativeHeight_var22;
                    L15: while (true) {
                      if (negativeRowCounter_var36 >= 0) {
                        break L14;
                      } else {
                        L16: {
                          sourceXQ12_var37 = rowSourceXQ12_var31 + (destinationOffsetX_var29 * inverseCosStep_var28 >> 4);
                          sourceYQ12_var38 = rowSourceYQ12_var32 + (destinationOffsetX_var29 * inverseSinStep_var27 >> 4);
                          negativePixelCounter_var39 = rightThenNegativeWidth_var20;
                          canSample_var40 = 0;
                          clipScratch_var35 = sourceXQ12_var37 + 4096;
                          if (clipScratch_var35 < 0) {
                            if (inverseCosStep_var28 != 0) {
                              clipScratch_var35 = (inverseCosStep_var28 - 1 - clipScratch_var35) / inverseCosStep_var28;
                              negativePixelCounter_var39 = negativePixelCounter_var39 + clipScratch_var35;
                              sourceXQ12_var37 = sourceXQ12_var37 + inverseCosStep_var28 * clipScratch_var35;
                              sourceYQ12_var38 = sourceYQ12_var38 + inverseSinStep_var27 * clipScratch_var35;
                              destinationIndex_var23 = destinationIndex_var23 + clipScratch_var35;
                              canSample_var40 = 1;
                              break L16;
                            } else {
                              destinationIndex_var23 = destinationIndex_var23 - negativePixelCounter_var39;
                              break L16;
                            }
                          } else {
                            canSample_var40 = 1;
                            break L16;
                          }
                        }
                        L17: {
                          if (canSample_var40 == 0) {
                            break L17;
                          } else {
                            L18: {
                              canSample_var40 = 0;
                              clipScratch_var35 = sourceYQ12_var38 + 4096;
                              if (clipScratch_var35 < 0) {
                                if (inverseSinStep_var27 != 0) {
                                  clipScratch_var35 = (inverseSinStep_var27 - 1 - clipScratch_var35) / inverseSinStep_var27;
                                  negativePixelCounter_var39 = negativePixelCounter_var39 + clipScratch_var35;
                                  sourceXQ12_var37 = sourceXQ12_var37 + inverseCosStep_var28 * clipScratch_var35;
                                  sourceYQ12_var38 = sourceYQ12_var38 + inverseSinStep_var27 * clipScratch_var35;
                                  destinationIndex_var23 = destinationIndex_var23 + clipScratch_var35;
                                  canSample_var40 = 1;
                                  break L18;
                                } else {
                                  destinationIndex_var23 = destinationIndex_var23 - negativePixelCounter_var39;
                                  break L18;
                                }
                              } else {
                                canSample_var40 = 1;
                                break L18;
                              }
                            }
                            if (canSample_var40 == 0) {
                              break L17;
                            } else {
                              L19: while (true) {
                                L20: {
                                  if (negativePixelCounter_var39 >= 0) {
                                    break L20;
                                  } else {
                                    sourcePixelX_var33 = sourceXQ12_var37 >> 12;
                                    if (sourceXQ12_var37 >> 12 >= this.width_field_r) {
                                      break L20;
                                    } else {
                                      sourcePixelY_var34 = sourceYQ12_var38 >> 12;
                                      if (sourceYQ12_var38 >> 12 < this.height_field_m) {
                                        this.sampleBilinear_c(destinationIndex_var23, sourcePixelX_var33, sourcePixelY_var34, sourceXQ12_var37, sourceYQ12_var38);
                                        negativePixelCounter_var39++;
                                        sourceXQ12_var37 = sourceXQ12_var37 + inverseCosStep_var28;
                                        sourceYQ12_var38 = sourceYQ12_var38 + inverseSinStep_var27;
                                        destinationIndex_var23++;
                                        continue L19;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                                destinationIndex_var23 = destinationIndex_var23 - negativePixelCounter_var39;
                                break L17;
                              }
                            }
                          }
                        }
                        negativeRowCounter_var36++;
                        rowSourceXQ12_var31 = rowSourceXQ12_var31 - inverseSinStep_var27;
                        rowSourceYQ12_var32 = rowSourceYQ12_var32 + inverseCosStep_var28;
                        destinationIndex_var23 = destinationIndex_var23 + rowSkip_var24;
                        continue L15;
                      }
                    }
                  } else {
                    negativeRowCounter_var36 = bottomThenNegativeHeight_var22;
                    L21: while (true) {
                      if (negativeRowCounter_var36 >= 0) {
                        break L14;
                      } else {
                        L22: {
                          sourceXQ12_var37 = rowSourceXQ12_var31 + (destinationOffsetX_var29 * inverseCosStep_var28 >> 4);
                          sourceYQ12_var38 = rowSourceYQ12_var32 + (destinationOffsetX_var29 * inverseSinStep_var27 >> 4);
                          negativePixelCounter_var39 = rightThenNegativeWidth_var20;
                          canSample_var40 = 0;
                          clipScratch_var35 = sourceXQ12_var37 + 4096;
                          if (clipScratch_var35 < 0) {
                            if (inverseCosStep_var28 != 0) {
                              clipScratch_var35 = (inverseCosStep_var28 - 1 - clipScratch_var35) / inverseCosStep_var28;
                              negativePixelCounter_var39 = negativePixelCounter_var39 + clipScratch_var35;
                              sourceXQ12_var37 = sourceXQ12_var37 + inverseCosStep_var28 * clipScratch_var35;
                              sourceYQ12_var38 = sourceYQ12_var38 + inverseSinStep_var27 * clipScratch_var35;
                              destinationIndex_var23 = destinationIndex_var23 + clipScratch_var35;
                              canSample_var40 = 1;
                              break L22;
                            } else {
                              destinationIndex_var23 = destinationIndex_var23 - negativePixelCounter_var39;
                              break L22;
                            }
                          } else {
                            canSample_var40 = 1;
                            break L22;
                          }
                        }
                        L23: {
                          if (canSample_var40 == 0) {
                            break L23;
                          } else {
                            L24: {
                              canSample_var40 = 0;
                              clipScratch_var35 = sourceYQ12_var38 - (this.height_field_m << 12);
                              if (clipScratch_var35 >= 0) {
                                if (inverseSinStep_var27 != 0) {
                                  clipScratch_var35 = (inverseSinStep_var27 - clipScratch_var35) / inverseSinStep_var27;
                                  negativePixelCounter_var39 = negativePixelCounter_var39 + clipScratch_var35;
                                  sourceXQ12_var37 = sourceXQ12_var37 + inverseCosStep_var28 * clipScratch_var35;
                                  sourceYQ12_var38 = sourceYQ12_var38 + inverseSinStep_var27 * clipScratch_var35;
                                  destinationIndex_var23 = destinationIndex_var23 + clipScratch_var35;
                                  canSample_var40 = 1;
                                  break L24;
                                } else {
                                  destinationIndex_var23 = destinationIndex_var23 - negativePixelCounter_var39;
                                  break L24;
                                }
                              } else {
                                canSample_var40 = 1;
                                break L24;
                              }
                            }
                            if (canSample_var40 == 0) {
                              break L23;
                            } else {
                              L25: while (true) {
                                L26: {
                                  if (negativePixelCounter_var39 >= 0) {
                                    break L26;
                                  } else {
                                    if (sourceYQ12_var38 < -4096) {
                                      break L26;
                                    } else {
                                      sourcePixelX_var33 = sourceXQ12_var37 >> 12;
                                      if (sourceXQ12_var37 >> 12 < this.width_field_r) {
                                        sourcePixelY_var34 = sourceYQ12_var38 >> 12;
                                        this.sampleBilinear_c(destinationIndex_var23, sourcePixelX_var33, sourcePixelY_var34, sourceXQ12_var37, sourceYQ12_var38);
                                        negativePixelCounter_var39++;
                                        sourceXQ12_var37 = sourceXQ12_var37 + inverseCosStep_var28;
                                        sourceYQ12_var38 = sourceYQ12_var38 + inverseSinStep_var27;
                                        destinationIndex_var23++;
                                        continue L25;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                }
                                destinationIndex_var23 = destinationIndex_var23 - negativePixelCounter_var39;
                                break L23;
                              }
                            }
                          }
                        }
                        negativeRowCounter_var36++;
                        rowSourceXQ12_var31 = rowSourceXQ12_var31 - inverseSinStep_var27;
                        rowSourceYQ12_var32 = rowSourceYQ12_var32 + inverseCosStep_var28;
                        destinationIndex_var23 = destinationIndex_var23 + rowSkip_var24;
                        continue L21;
                      }
                    }
                  }
                } else {
                  if (inverseSinStep_var27 >= 0) {
                    negativeRowCounter_var36 = bottomThenNegativeHeight_var22;
                    L27: while (true) {
                      if (negativeRowCounter_var36 >= 0) {
                        break L14;
                      } else {
                        L28: {
                          sourceXQ12_var37 = rowSourceXQ12_var31 + (destinationOffsetX_var29 * inverseCosStep_var28 >> 4);
                          sourceYQ12_var38 = rowSourceYQ12_var32 + (destinationOffsetX_var29 * inverseSinStep_var27 >> 4);
                          negativePixelCounter_var39 = rightThenNegativeWidth_var20;
                          canSample_var40 = 0;
                          clipScratch_var35 = sourceXQ12_var37 - (this.width_field_r << 12);
                          if (clipScratch_var35 >= 0) {
                            if (inverseCosStep_var28 != 0) {
                              clipScratch_var35 = (inverseCosStep_var28 - clipScratch_var35) / inverseCosStep_var28;
                              negativePixelCounter_var39 = negativePixelCounter_var39 + clipScratch_var35;
                              sourceXQ12_var37 = sourceXQ12_var37 + inverseCosStep_var28 * clipScratch_var35;
                              sourceYQ12_var38 = sourceYQ12_var38 + inverseSinStep_var27 * clipScratch_var35;
                              destinationIndex_var23 = destinationIndex_var23 + clipScratch_var35;
                              canSample_var40 = 1;
                              break L28;
                            } else {
                              destinationIndex_var23 = destinationIndex_var23 - negativePixelCounter_var39;
                              break L28;
                            }
                          } else {
                            canSample_var40 = 1;
                            break L28;
                          }
                        }
                        L29: {
                          if (canSample_var40 == 0) {
                            break L29;
                          } else {
                            L30: {
                              canSample_var40 = 0;
                              clipScratch_var35 = sourceYQ12_var38 + 4096;
                              if (clipScratch_var35 < 0) {
                                if (inverseSinStep_var27 != 0) {
                                  clipScratch_var35 = (inverseSinStep_var27 - 1 - clipScratch_var35) / inverseSinStep_var27;
                                  negativePixelCounter_var39 = negativePixelCounter_var39 + clipScratch_var35;
                                  sourceXQ12_var37 = sourceXQ12_var37 + inverseCosStep_var28 * clipScratch_var35;
                                  sourceYQ12_var38 = sourceYQ12_var38 + inverseSinStep_var27 * clipScratch_var35;
                                  destinationIndex_var23 = destinationIndex_var23 + clipScratch_var35;
                                  canSample_var40 = 1;
                                  break L30;
                                } else {
                                  destinationIndex_var23 = destinationIndex_var23 - negativePixelCounter_var39;
                                  break L30;
                                }
                              } else {
                                canSample_var40 = 1;
                                break L30;
                              }
                            }
                            if (canSample_var40 == 0) {
                              break L29;
                            } else {
                              L31: while (true) {
                                L32: {
                                  if (negativePixelCounter_var39 >= 0) {
                                    break L32;
                                  } else {
                                    if (sourceXQ12_var37 < -4096) {
                                      break L32;
                                    } else {
                                      sourcePixelY_var34 = sourceYQ12_var38 >> 12;
                                      if (sourceYQ12_var38 >> 12 < this.height_field_m) {
                                        sourcePixelX_var33 = sourceXQ12_var37 >> 12;
                                        this.sampleBilinear_c(destinationIndex_var23, sourcePixelX_var33, sourcePixelY_var34, sourceXQ12_var37, sourceYQ12_var38);
                                        negativePixelCounter_var39++;
                                        sourceXQ12_var37 = sourceXQ12_var37 + inverseCosStep_var28;
                                        sourceYQ12_var38 = sourceYQ12_var38 + inverseSinStep_var27;
                                        destinationIndex_var23++;
                                        continue L31;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                }
                                destinationIndex_var23 = destinationIndex_var23 - negativePixelCounter_var39;
                                break L29;
                              }
                            }
                          }
                        }
                        negativeRowCounter_var36++;
                        rowSourceXQ12_var31 = rowSourceXQ12_var31 - inverseSinStep_var27;
                        rowSourceYQ12_var32 = rowSourceYQ12_var32 + inverseCosStep_var28;
                        destinationIndex_var23 = destinationIndex_var23 + rowSkip_var24;
                        continue L27;
                      }
                    }
                  } else {
                    negativeRowCounter_var36 = bottomThenNegativeHeight_var22;
                    L33: while (true) {
                      if (negativeRowCounter_var36 >= 0) {
                        return;
                      } else {
                        L34: {
                          sourceXQ12_var37 = rowSourceXQ12_var31 + (destinationOffsetX_var29 * inverseCosStep_var28 >> 4);
                          sourceYQ12_var38 = rowSourceYQ12_var32 + (destinationOffsetX_var29 * inverseSinStep_var27 >> 4);
                          negativePixelCounter_var39 = rightThenNegativeWidth_var20;
                          canSample_var40 = 0;
                          clipScratch_var35 = sourceXQ12_var37 - (this.width_field_r << 12);
                          if (clipScratch_var35 >= 0) {
                            if (inverseCosStep_var28 != 0) {
                              clipScratch_var35 = (inverseCosStep_var28 - clipScratch_var35) / inverseCosStep_var28;
                              negativePixelCounter_var39 = negativePixelCounter_var39 + clipScratch_var35;
                              sourceXQ12_var37 = sourceXQ12_var37 + inverseCosStep_var28 * clipScratch_var35;
                              sourceYQ12_var38 = sourceYQ12_var38 + inverseSinStep_var27 * clipScratch_var35;
                              destinationIndex_var23 = destinationIndex_var23 + clipScratch_var35;
                              canSample_var40 = 1;
                              break L34;
                            } else {
                              destinationIndex_var23 = destinationIndex_var23 - negativePixelCounter_var39;
                              break L34;
                            }
                          } else {
                            canSample_var40 = 1;
                            break L34;
                          }
                        }
                        L35: {
                          if (canSample_var40 == 0) {
                            break L35;
                          } else {
                            L36: {
                              canSample_var40 = 0;
                              clipScratch_var35 = sourceYQ12_var38 - (this.height_field_m << 12);
                              if (clipScratch_var35 >= 0) {
                                if (inverseSinStep_var27 != 0) {
                                  clipScratch_var35 = (inverseSinStep_var27 - clipScratch_var35) / inverseSinStep_var27;
                                  negativePixelCounter_var39 = negativePixelCounter_var39 + clipScratch_var35;
                                  sourceXQ12_var37 = sourceXQ12_var37 + inverseCosStep_var28 * clipScratch_var35;
                                  sourceYQ12_var38 = sourceYQ12_var38 + inverseSinStep_var27 * clipScratch_var35;
                                  destinationIndex_var23 = destinationIndex_var23 + clipScratch_var35;
                                  canSample_var40 = 1;
                                  break L36;
                                } else {
                                  destinationIndex_var23 = destinationIndex_var23 - negativePixelCounter_var39;
                                  break L36;
                                }
                              } else {
                                canSample_var40 = 1;
                                break L36;
                              }
                            }
                            if (canSample_var40 == 0) {
                              break L35;
                            } else {
                              L37: while (true) {
                                L38: {
                                  if (negativePixelCounter_var39 >= 0) {
                                    break L38;
                                  } else {
                                    if (sourceXQ12_var37 < -4096) {
                                      break L38;
                                    } else {
                                      if (sourceYQ12_var38 >= -4096) {
                                        sourcePixelX_var33 = sourceXQ12_var37 >> 12;
                                        sourcePixelY_var34 = sourceYQ12_var38 >> 12;
                                        this.sampleBilinear_c(destinationIndex_var23, sourcePixelX_var33, sourcePixelY_var34, sourceXQ12_var37, sourceYQ12_var38);
                                        negativePixelCounter_var39++;
                                        sourceXQ12_var37 = sourceXQ12_var37 + inverseCosStep_var28;
                                        sourceYQ12_var38 = sourceYQ12_var38 + inverseSinStep_var27;
                                        destinationIndex_var23++;
                                        continue L37;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                }
                                destinationIndex_var23 = destinationIndex_var23 - negativePixelCounter_var39;
                                break L35;
                              }
                            }
                          }
                        }
                        negativeRowCounter_var36++;
                        rowSourceXQ12_var31 = rowSourceXQ12_var31 - inverseSinStep_var27;
                        rowSourceYQ12_var32 = rowSourceYQ12_var32 + inverseCosStep_var28;
                        destinationIndex_var23 = destinationIndex_var23 + rowSkip_var24;
                        continue L33;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    void b(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.trimX_field_u;
        param1 = param1 + this.trimY_field_p;
        int var4 = param0 + param1 * SoftwareRasterizer_vb.stride_field_f;
        int var5 = 0;
        int var6 = this.height_field_m;
        int var7 = this.width_field_r;
        int var8 = SoftwareRasterizer_vb.stride_field_f - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer_vb.clipTop_field_i) {
            var10 = SoftwareRasterizer_vb.clipTop_field_i - param1;
            var6 = var6 - var10;
            param1 = SoftwareRasterizer_vb.clipTop_field_i;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * SoftwareRasterizer_vb.stride_field_f;
        }
        if (param1 + var6 > SoftwareRasterizer_vb.clipBottom_field_d) {
            var6 = var6 - (param1 + var6 - SoftwareRasterizer_vb.clipBottom_field_d);
        }
        if (param0 < SoftwareRasterizer_vb.clipLeft_field_e) {
            var10 = SoftwareRasterizer_vb.clipLeft_field_e - param0;
            var7 = var7 - var10;
            param0 = SoftwareRasterizer_vb.clipLeft_field_e;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > SoftwareRasterizer_vb.clipRight_field_k) {
            var10 = param0 + var7 - SoftwareRasterizer_vb.clipRight_field_k;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            Sprite_dm.b(SoftwareRasterizer_vb.framebuffer_field_c, this.pixels_field_v, 0, var5, var4, 0, 0, var7, var6, var8, var9, param2);
            return;
        }
    }

    final Sprite_dm b() {
        int var3 = 0;
        Sprite_dm var1 = new Sprite_dm(this.width_field_r, this.height_field_m);
        var1.field_s = this.field_s;
        var1.field_o = this.field_o;
        var1.trimX_field_u = this.trimX_field_u;
        var1.trimY_field_p = this.trimY_field_p;
        int var2 = this.pixels_field_v.length;
        for (var3 = 0; var3 < var2; var3++) {
            var1.pixels_field_v[var3] = this.pixels_field_v[var3];
        }
        return var1;
    }

    Sprite_dm(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        this.field_s = param0;
        this.field_o = param1;
        this.trimX_field_u = param2;
        this.trimY_field_p = param3;
        this.width_field_r = param4;
        this.height_field_m = param5;
        this.pixels_field_v = param6;
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        param8 = -param10;
        L0: while (true) {
          if (param8 >= 0) {
            return;
          } else {
            param6 = -param9;
            L1: while (true) {
              if (param6 >= 0) {
                param7 = param7 + param11;
                param5 = param5 + param12;
                param8++;
                continue L0;
              } else {
                incrementValue$11 = param5;
                param5++;
                param0 = param4[incrementValue$11];
                if (param0 == 0) {
                  param7++;
                  param6++;
                  continue L1;
                } else {
                  param1 = param3[param7];
                  param2 = param0 + param1;
                  param0 = (param0 & 16711935) + (param1 & 16711935);
                  param1 = (param0 & 16777472) + (param2 - param0 & 65536);
                  incrementValue$12 = param7;
                  param7++;
                  param3[incrementValue$12] = param2 - param1 | param1 - (param1 >>> 8);
                  param6++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    void d(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.trimX_field_u;
        param1 = param1 + this.trimY_field_p;
        int var4 = param0 + param1 * SoftwareRasterizer_vb.stride_field_f;
        int var5 = 0;
        int var6 = this.height_field_m;
        int var7 = this.width_field_r;
        int var8 = SoftwareRasterizer_vb.stride_field_f - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer_vb.clipTop_field_i) {
            var10 = SoftwareRasterizer_vb.clipTop_field_i - param1;
            var6 = var6 - var10;
            param1 = SoftwareRasterizer_vb.clipTop_field_i;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * SoftwareRasterizer_vb.stride_field_f;
        }
        if (param1 + var6 > SoftwareRasterizer_vb.clipBottom_field_d) {
            var6 = var6 - (param1 + var6 - SoftwareRasterizer_vb.clipBottom_field_d);
        }
        if (param0 < SoftwareRasterizer_vb.clipLeft_field_e) {
            var10 = SoftwareRasterizer_vb.clipLeft_field_e - param0;
            var7 = var7 - var10;
            param0 = SoftwareRasterizer_vb.clipLeft_field_e;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > SoftwareRasterizer_vb.clipRight_field_k) {
            var10 = param0 + var7 - SoftwareRasterizer_vb.clipRight_field_k;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            Sprite_dm.b(SoftwareRasterizer_vb.framebuffer_field_c, this.pixels_field_v, 0, var5, var4, var7, var6, var8, var9, param2);
            return;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int incrementValue$1 = 0;
        int var13 = param3;
        for (var14 = -param8; var14 < 0; var14++) {
            var15 = (param4 >> 16) * param11;
            for (var16 = -param7; var16 < 0; var16++) {
                param2 = param1[(param3 >> 16) + var15];
                if (param2 != 0) {
                    incrementValue$1 = param5;
                    param5++;
                    param0[incrementValue$1] = param12;
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var13;
            param5 = param5 + param6;
        }
    }

    Sprite_dm(int param0, int param1) {
        this.pixels_field_v = new int[param0 * param1];
        this.field_s = param0;
        this.width_field_r = param0;
        this.field_o = param1;
        this.height_field_m = param1;
        this.trimY_field_p = 0;
        this.trimX_field_u = 0;
    }

    Sprite_dm(byte[] param0, java.awt.Component param1) {
        Throwable decompiledCaughtException = null;
        java.awt.Image var3 = null;
        InterruptedException var3_ref = null;
        java.awt.MediaTracker var4 = null;
        java.awt.image.PixelGrabber var5 = null;
        try {
          L0: {
            var3 = java.awt.Toolkit.getDefaultToolkit().createImage(param0);
            var4 = new java.awt.MediaTracker(param1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.width_field_r = var3.getWidth((java.awt.image.ImageObserver) ((Object) param1));
            this.height_field_m = var3.getHeight((java.awt.image.ImageObserver) ((Object) param1));
            this.field_s = this.width_field_r;
            this.field_o = this.height_field_m;
            this.trimX_field_u = 0;
            this.trimY_field_p = 0;
            this.pixels_field_v = new int[this.width_field_r * this.height_field_m];
            var5 = new java.awt.image.PixelGrabber(var3, 0, 0, this.width_field_r, this.height_field_m, this.pixels_field_v, 0, this.width_field_r);
            var5.grabPixels();
            break L0;
          }
        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = (InterruptedException) (Object) decompiledCaughtException;
            break L1;
          }
        }
    }
}
