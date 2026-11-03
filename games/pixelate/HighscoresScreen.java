/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighscoresScreen extends MenuScreen {
    static rh field_p;
    static String field_s;
    static dj field_o;
    static char[] field_r;
    static Sprite field_q;

    private final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6, BinaryBitmapFont param7, int param8, int param9, int param10) {
        String stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        try {
          var12_int = param6 + (param1 + param10);
          if (var12_int != 0) {
            param6 = (200 * param6 + var12_int) / (var12_int * 2);
            param1 = (var12_int + 200 * param1) / (2 * var12_int);
            param10 = (var12_int + param10 * 200) / (var12_int * 2);
          }
          if (-1 != param8) {
            param7.drawRightAlignedText(param8 + 1 + ". ", 70, param4, param9, param0);
          }
          var14 = param5;
          param7.drawText(var14, 70, param4, param9, param0);
          var15 = Integer.toString(param3);
          param7.drawCentered(var15, aj.field_o[0], param4, param9, param0);
          if (param2 != 540) {
            field_p = (rh) null;
          }
          if (var12_int < 50) {
            stackIn_11_0 = Integer.toString(var12_int);
          } else {
            stackIn_11_0 = "50+";
          }
          var16 = stackIn_11_0;
          var13 = var16;
          param7.drawCentered(var16, aj.field_o[1], param4, param9, param0);
          var17 = param10 + "%";
          param7.drawCentered(var17, aj.field_o[2], param4, param9, param0);
          var18 = param1 + "%";
          param7.drawCentered(var18, aj.field_o[3], param4, param9, param0);
          var19 = param6 + "%";
          param7.drawCentered(var19, aj.field_o[4], param4, param9, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_15_0 = var12;
          stackIn_15_1 = new StringBuilder().append("wh.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    final int b(int param0, int param1) {
        int var3 = 51 % ((param0 + 13) / 37);
        if (ArrayWidgetContainer.a((byte) 64)) {
          return this.field_d + param1 * this.field_i;
        }
        if (param1 < 2) {
          return this.field_d;
        }
        return this.field_i + this.field_d;
    }

    final int a(int param0, byte param1) {
        this.field_m = 30;
        if (param1 != 90) {
          this.a(-116, false);
          this.field_a = 640 - this.field_m;
          if (ArrayWidgetContainer.a((byte) 123)) {
            return -(this.d(param0, 29) >> 1) + 320;
          }
          if (2 <= param0) {
            return -(this.d(param0, 29) >> 1) + 320;
          }
          if (param0 == 0) {
            return this.field_m;
          }
          return this.field_a - this.d(1, 28);
        }
        this.field_a = 640 - this.field_m;
        if (ArrayWidgetContainer.a((byte) 123)) {
          return -(this.d(param0, 29) >> 1) + 320;
        }
        if (2 <= param0) {
          return -(this.d(param0, 29) >> 1) + 320;
        }
        if (param0 == 0) {
          return this.field_m;
        }
        return this.field_a - this.d(1, 28);
    }

    private final int d(int param0, int param1) {
        String var3 = PacketBuffer.field_o[this.field_k[param0]];
        int var4 = 96 / ((param1 + 50) / 50);
        return 20 + rk.field_e.textWidth(var3);
    }

    final static void e(int param0) {
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        sm var5_ref_sm = null;
        int var5 = 0;
        int var6_int = 0;
        df var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        CipherPacketBuffer var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          var2 = 88 % ((31 - param0) / 43);
          var11 = MusicCrossfadeStream.field_o;
          var3 = var11.readUnsignedByte(255);
          var4 = var11.readUnsignedByte(255);
          if (var3 == 0) {
            var5_ref_sm = (sm) (MusicPatchNode.field_J.c(1504642273));
            if (var5_ref_sm == null) {
              na.a(true);
              return;
            }
            var6_int = -var11.position + BackgroundScene.field_b;
            var13 = var5_ref_sm.field_o;
            var12 = var13;
            var7 = var12;
            if (var6_int > var13.length << 2) {
              var6_int = var13.length << 2;
            }
            var8 = 0;
            while (true) {
              if (var8 < var6_int) {
                var7[var8 >> 2] = var7[var8 >> 2] + (var11.readUnsignedByte(255) << (cm.a(var8, 3) << 8));
                var8++;
                if (var9 == 0) {
                  continue;
                }
              } else {
                var5_ref_sm.unlink(2779);
              }
              break;
            }
            if (var9 == 0) {
              return;
            }
          }
          if (var3 == 1) {
            var5 = var11.l(-20729);
            var6 = (df) (he.field_b.c(1504642273));
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var6 != null) {
                stackIn_27_0 = var4;
                decompiledFrameRemainder0 = (var9 == 0);
                if ((decompiledFrameRemainder0) && (stackIn_27_0 != var6.field_p ||
                  var6.field_k != var5)) {
                  var6 = (df) (he.field_b.last(1504642273));
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var6 != null) {
                  var6.unlink(2779);
                  if (var9 == 0) {
                    return;
                  }
                  break;
                }
                stackIn_27_0 = 1;
              }
              na.a(stackIn_27_0 != 0);
              return;
            }
          }
          CheckboxPainter.reportClientError(1, "LR1: " + jm.b(-35), (Throwable) null);
          na.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var1), "wh.I(" + param0 + ')');
        }
    }

    final void a(int param0) {
        int var3;
        String var4;
        BinaryBitmapFont var5;
        int var6;
        int var7;
        int var8;
        int var9;
        String[] var10;
        int[] var11;
        int var12;
        int var13;
        int var15;
        PaletteBitmapFont var16;
        PaletteBitmapFont var17;
        String var18;
        BinaryBitmapFont var21;
        String[] var22;
        String var23;
        PaletteBitmapFont var24;
        BinaryBitmapFont var25;
        String[] var26;
        String var27;
        BinaryBitmapFont var29;
        String[] var30;
        String var31;
        String var33;
        String var36;
        BinaryBitmapFont var37;
        String[] var38;
        String var39;
        int var3Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        String var4Lifetime1;
        String var4Lifetime2;
        int[] var11Lifetime1;
        int[] var11Lifetime2;
        PaletteBitmapFont var16Lifetime1;
        var15 = Pixelate.field_H ? 1 : 0;
        NumericDateInputWidget.field_W[8].b(0, 45);
        this.b((byte) -71);
        if (param0 != 11) {
          this.a((byte) -95, false, 89);
          this.d((byte) 74);
          var17 = rk.field_e;
          var16 = var17;
          var3 = var17.maxAscent + var17.maxDescent;
          if (WhirlpoolHasher.field_f == null &&
            !ArrayWidgetContainer.a((byte) 112)) {
            WhirlpoolHasher.field_f = cn.a(0, 7, 10, -119);
          }
          if (ArrayWidgetContainer.a((byte) 83)) {
            var4 = mj.field_h;
          } else {
            if (WhirlpoolHasher.field_f.field_u) {
              if (WhirlpoolHasher.field_f.field_o != null) {
                var21 = qj.field_e;
                var6 = 1 + var21.maxAscent + var21.maxDescent;
                var7 = 150 + var6;
                var8 = 16777215;
                var9 = 0;
                var21.drawCentered(MarkerSliderPainter.field_b, aj.field_o[0], var7, var8, var9);
                var21.drawCentered(TextHotspotWidget.field_N, aj.field_o[1], var7, var8, var9);
                var21.drawCentered(wa.field_d, aj.field_o[2], var7, var8, var9);
                var21.drawCentered(ab.field_e, aj.field_o[3], var7, var8, var9);
                var21.drawCentered(IntrusiveNode.field_d, aj.field_o[4], var7, var8, var9);
                var4 = SpriteState.field_z;
                var7 = var7 + (var6 + 4);
                var22 = WhirlpoolHasher.field_f.field_o[d.field_c];
                var11 = WhirlpoolHasher.field_f.field_r[d.field_c];
                var12 = 0;
                var13 = 0;
                scanLoop1: while (true) {
                  if (10 > var13) {
                    if (var15 == 0) {
                      if (null != var22[var13]) {
                        var23 = var22[var13];
                        var8 = 16777215;
                        if (sm.a(var23, param0 - 12)) {
                          var12 = 1;
                          var8 = 16711680;
                        }
                        var4 = "";
                        this.a(var9, var11[4 * var13 + 3], 540, var11[var13 * 4], var7, var23, var11[4 * var13 + 2], var21, var13, var8, var11[4 * var13 + 1]);
                      }
                      var7 = var7 + var6;
                      var13++;
                      continue;
                    }
                  } else {
                    if (var12 != 0) {
                      break scanLoop1;
                    }
                    var7 += 4;
                    var8 = 16711680;
                  }
                  this.a(var9, WhirlpoolHasher.field_f.field_m, param0 ^ 535, WhirlpoolHasher.field_f.field_p, var7, ModalStack.field_J, WhirlpoolHasher.field_f.field_n, var21, -1, var8, WhirlpoolHasher.field_f.field_v);
                  break;
                }
                if (var15 != 0) {
                  var4 = MenuInputState.field_l;
                  var4 = mj.field_h;
                }
              } else {
                var4 = MenuInputState.field_l;
                if (var15 != 0) {
                  var4 = mj.field_h;
                }
              }
            } else {
              var18 = GrowableIntList.field_b;
              if (var15 == 0) {
                var17.drawParagraph(var18, 50, 150, 540, 200, 0, -1, 1, 1, var3);
                return;
              }
              if (WhirlpoolHasher.field_f.field_o != null) {
                var21 = qj.field_e;
                var6 = 1 + var21.maxAscent + var21.maxDescent;
                var7 = 150 + var6;
                var8 = 16777215;
                var9 = 0;
                var21.drawCentered(MarkerSliderPainter.field_b, aj.field_o[0], var7, var8, var9);
                var21.drawCentered(TextHotspotWidget.field_N, aj.field_o[1], var7, var8, var9);
                var21.drawCentered(wa.field_d, aj.field_o[2], var7, var8, var9);
                var21.drawCentered(ab.field_e, aj.field_o[3], var7, var8, var9);
                var21.drawCentered(IntrusiveNode.field_d, aj.field_o[4], var7, var8, var9);
                var4 = SpriteState.field_z;
                var7 = var7 + (var6 + 4);
                var22 = WhirlpoolHasher.field_f.field_o[d.field_c];
                var11 = WhirlpoolHasher.field_f.field_r[d.field_c];
                var12 = 0;
                var13 = 0;
                scanLoop2: while (true) {
                  if (10 <= var13) {
                    if (var12 != 0) {
                      break scanLoop2;
                    }
                    var7 += 4;
                    var8 = 16711680;
                  }
                  this.a(var9, WhirlpoolHasher.field_f.field_m, param0 ^ 535, WhirlpoolHasher.field_f.field_p, var7, ModalStack.field_J, WhirlpoolHasher.field_f.field_n, var21, -1, var8, WhirlpoolHasher.field_f.field_v);
                  break;
                }
              }
              var4 = MenuInputState.field_l;
              var4 = mj.field_h;
            }
          }
          var17.drawParagraph(var4, 50, 150, 540, 200, 0, -1, 1, 1, var3);
          return;
        }
        this.d((byte) 74);
        var24 = rk.field_e;
        var16Lifetime1 = var24;
        var3Lifetime1 = var24.maxAscent + var24.maxDescent;
        if (WhirlpoolHasher.field_f == null) {
          if (ArrayWidgetContainer.a((byte) 112)) {
            if (ArrayWidgetContainer.a((byte) 83)) {
              var4Lifetime1 = mj.field_h;
            } else {
              if (WhirlpoolHasher.field_f.field_u) {
                if (WhirlpoolHasher.field_f.field_o != null) {
                  var25 = qj.field_e;
                  var5 = var25;
                  var6Lifetime1 = 1 + var25.maxAscent + var25.maxDescent;
                  var7Lifetime1 = 150 + var6Lifetime1;
                  var8Lifetime1 = 16777215;
                  var9Lifetime1 = 0;
                  var25.drawCentered(MarkerSliderPainter.field_b, aj.field_o[0], var7Lifetime1, var8Lifetime1, var9Lifetime1);
                  var25.drawCentered(TextHotspotWidget.field_N, aj.field_o[1], var7Lifetime1, var8Lifetime1, var9Lifetime1);
                  var25.drawCentered(wa.field_d, aj.field_o[2], var7Lifetime1, var8Lifetime1, var9Lifetime1);
                  var25.drawCentered(ab.field_e, aj.field_o[3], var7Lifetime1, var8Lifetime1, var9Lifetime1);
                  var25.drawCentered(IntrusiveNode.field_d, aj.field_o[4], var7Lifetime1, var8Lifetime1, var9Lifetime1);
                  var4Lifetime1 = SpriteState.field_z;
                  var7Lifetime1 = var7Lifetime1 + (var6Lifetime1 + 4);
                  var26 = WhirlpoolHasher.field_f.field_o[d.field_c];
                  var10 = var26;
                  var11Lifetime1 = WhirlpoolHasher.field_f.field_r[d.field_c];
                  var12Lifetime1 = 0;
                  var13Lifetime1 = 0;
                  scanLoop3: while (true) {
                    if (10 > var13Lifetime1) {
                      if (var15 == 0) {
                        if (null != var26[var13Lifetime1]) {
                          var27 = var26[var13Lifetime1];
                          var8Lifetime1 = 16777215;
                          if (sm.a(var27, param0 - 12)) {
                            var12Lifetime1 = 1;
                            var8Lifetime1 = 16711680;
                          }
                          var4Lifetime1 = "";
                          this.a(var9Lifetime1, var11Lifetime1[4 * var13Lifetime1 + 3], 540, var11Lifetime1[var13Lifetime1 * 4], var7Lifetime1, var27, var11Lifetime1[4 * var13Lifetime1 + 2], var25, var13Lifetime1, var8Lifetime1, var11Lifetime1[4 * var13Lifetime1 + 1]);
                        }
                        var7Lifetime1 = var7Lifetime1 + var6Lifetime1;
                        var13Lifetime1++;
                        continue;
                      }
                    } else {
                      if (var12Lifetime1 != 0) {
                        break scanLoop3;
                      }
                      var7Lifetime1 += 4;
                      var8Lifetime1 = 16711680;
                    }
                    this.a(var9Lifetime1, WhirlpoolHasher.field_f.field_m, param0 ^ 535, WhirlpoolHasher.field_f.field_p, var7Lifetime1, ModalStack.field_J, WhirlpoolHasher.field_f.field_n, var25, -1, var8Lifetime1, WhirlpoolHasher.field_f.field_v);
                    break;
                  }
                  if (var15 != 0) {
                    var4Lifetime1 = MenuInputState.field_l;
                    var4Lifetime1 = mj.field_h;
                  }
                } else {
                  var4Lifetime1 = MenuInputState.field_l;
                  if (var15 != 0) {
                    var4Lifetime1 = mj.field_h;
                  }
                }
              } else {
                var33 = GrowableIntList.field_b;
                if (var15 == 0) {
                  var24.drawParagraph(var33, 50, 150, 540, 200, 0, -1, 1, 1, var3Lifetime1);
                  return;
                }
                if (WhirlpoolHasher.field_f.field_o != null) {
                  var29 = qj.field_e;
                  var5 = var29;
                  var6Lifetime1 = 1 + var29.maxAscent + var29.maxDescent;
                  var7Lifetime1 = 150 + var6Lifetime1;
                  var8Lifetime1 = 16777215;
                  var9Lifetime1 = 0;
                  var29.drawCentered(MarkerSliderPainter.field_b, aj.field_o[0], var7Lifetime1, var8Lifetime1, var9Lifetime1);
                  var29.drawCentered(TextHotspotWidget.field_N, aj.field_o[1], var7Lifetime1, var8Lifetime1, var9Lifetime1);
                  var29.drawCentered(wa.field_d, aj.field_o[2], var7Lifetime1, var8Lifetime1, var9Lifetime1);
                  var29.drawCentered(ab.field_e, aj.field_o[3], var7Lifetime1, var8Lifetime1, var9Lifetime1);
                  var29.drawCentered(IntrusiveNode.field_d, aj.field_o[4], var7Lifetime1, var8Lifetime1, var9Lifetime1);
                  var4Lifetime1 = SpriteState.field_z;
                  var7Lifetime1 = var7Lifetime1 + (var6Lifetime1 + 4);
                  var30 = WhirlpoolHasher.field_f.field_o[d.field_c];
                  var10 = var30;
                  var11Lifetime1 = WhirlpoolHasher.field_f.field_r[d.field_c];
                  var12Lifetime1 = 0;
                  var13Lifetime1 = 0;
                  scanLoop4: while (true) {
                    if (10 <= var13Lifetime1) {
                      if (var12Lifetime1 != 0) {
                        break scanLoop4;
                      }
                      var7Lifetime1 += 4;
                      var8Lifetime1 = 16711680;
                    }
                    this.a(var9Lifetime1, WhirlpoolHasher.field_f.field_m, param0 ^ 535, WhirlpoolHasher.field_f.field_p, var7Lifetime1, ModalStack.field_J, WhirlpoolHasher.field_f.field_n, var29, -1, var8Lifetime1, WhirlpoolHasher.field_f.field_v);
                    break;
                  }
                }
                var4Lifetime1 = MenuInputState.field_l;
                var4Lifetime1 = mj.field_h;
              }
            }
            var24.drawParagraph(var4Lifetime1, 50, 150, 540, 200, 0, -1, 1, 1, var3Lifetime1);
            return;
          }
          WhirlpoolHasher.field_f = cn.a(0, 7, 10, -119);
        }
        if (ArrayWidgetContainer.a((byte) 83)) {
          var4Lifetime2 = mj.field_h;
        } else {
          if (WhirlpoolHasher.field_f.field_u) {
            if (WhirlpoolHasher.field_f.field_o != null) {
              var37 = qj.field_e;
              var6Lifetime2 = 1 + var37.maxAscent + var37.maxDescent;
              var7Lifetime2 = 150 + var6Lifetime2;
              var8Lifetime2 = 16777215;
              var9Lifetime2 = 0;
              var37.drawCentered(MarkerSliderPainter.field_b, aj.field_o[0], var7Lifetime2, var8Lifetime2, var9Lifetime2);
              var37.drawCentered(TextHotspotWidget.field_N, aj.field_o[1], var7Lifetime2, var8Lifetime2, var9Lifetime2);
              var37.drawCentered(wa.field_d, aj.field_o[2], var7Lifetime2, var8Lifetime2, var9Lifetime2);
              var37.drawCentered(ab.field_e, aj.field_o[3], var7Lifetime2, var8Lifetime2, var9Lifetime2);
              var37.drawCentered(IntrusiveNode.field_d, aj.field_o[4], var7Lifetime2, var8Lifetime2, var9Lifetime2);
              var4Lifetime2 = SpriteState.field_z;
              var7Lifetime2 = var7Lifetime2 + (var6Lifetime2 + 4);
              var38 = WhirlpoolHasher.field_f.field_o[d.field_c];
              var11Lifetime2 = WhirlpoolHasher.field_f.field_r[d.field_c];
              var12Lifetime2 = 0;
              var13Lifetime2 = 0;
              scanLoop5: while (true) {
                if (10 > var13Lifetime2) {
                  if (var15 == 0) {
                    if (null != var38[var13Lifetime2]) {
                      var39 = var38[var13Lifetime2];
                      var8Lifetime2 = 16777215;
                      if (sm.a(var39, param0 - 12)) {
                        var12Lifetime2 = 1;
                        var8Lifetime2 = 16711680;
                      }
                      var4Lifetime2 = "";
                      this.a(var9Lifetime2, var11Lifetime2[4 * var13Lifetime2 + 3], 540, var11Lifetime2[var13Lifetime2 * 4], var7Lifetime2, var39, var11Lifetime2[4 * var13Lifetime2 + 2], var37, var13Lifetime2, var8Lifetime2, var11Lifetime2[4 * var13Lifetime2 + 1]);
                    }
                    var7Lifetime2 = var7Lifetime2 + var6Lifetime2;
                    var13Lifetime2++;
                    continue;
                  }
                } else {
                  if (var12Lifetime2 != 0) {
                    break scanLoop5;
                  }
                  var7Lifetime2 += 4;
                  var8Lifetime2 = 16711680;
                }
                this.a(var9Lifetime2, WhirlpoolHasher.field_f.field_m, param0 ^ 535, WhirlpoolHasher.field_f.field_p, var7Lifetime2, ModalStack.field_J, WhirlpoolHasher.field_f.field_n, var37, -1, var8Lifetime2, WhirlpoolHasher.field_f.field_v);
                break;
              }
              if (var15 != 0) {
                var4Lifetime2 = MenuInputState.field_l;
                var4Lifetime2 = mj.field_h;
              }
            } else {
              var4Lifetime2 = MenuInputState.field_l;
              if (var15 != 0) {
                var4Lifetime2 = mj.field_h;
              }
            }
          } else {
            var36 = GrowableIntList.field_b;
            if (var15 == 0) {
              var24.drawParagraph(var36, 50, 150, 540, 200, 0, -1, 1, 1, var3Lifetime1);
              return;
            }
            if (WhirlpoolHasher.field_f.field_o != null) {
              var37 = qj.field_e;
              var6Lifetime2 = 1 + var37.maxAscent + var37.maxDescent;
              var7Lifetime2 = 150 + var6Lifetime2;
              var8Lifetime2 = 16777215;
              var9Lifetime2 = 0;
              var37.drawCentered(MarkerSliderPainter.field_b, aj.field_o[0], var7Lifetime2, var8Lifetime2, var9Lifetime2);
              var37.drawCentered(TextHotspotWidget.field_N, aj.field_o[1], var7Lifetime2, var8Lifetime2, var9Lifetime2);
              var37.drawCentered(wa.field_d, aj.field_o[2], var7Lifetime2, var8Lifetime2, var9Lifetime2);
              var37.drawCentered(ab.field_e, aj.field_o[3], var7Lifetime2, var8Lifetime2, var9Lifetime2);
              var37.drawCentered(IntrusiveNode.field_d, aj.field_o[4], var7Lifetime2, var8Lifetime2, var9Lifetime2);
              var4Lifetime2 = SpriteState.field_z;
              var7Lifetime2 = var7Lifetime2 + (var6Lifetime2 + 4);
              var38 = WhirlpoolHasher.field_f.field_o[d.field_c];
              var11Lifetime2 = WhirlpoolHasher.field_f.field_r[d.field_c];
              var12Lifetime2 = 0;
              var13Lifetime2 = 0;
              scanLoop6: while (true) {
                if (10 <= var13Lifetime2) {
                  if (var12Lifetime2 != 0) {
                    break scanLoop6;
                  }
                  var7Lifetime2 += 4;
                  var8Lifetime2 = 16711680;
                }
                this.a(var9Lifetime2, WhirlpoolHasher.field_f.field_m, param0 ^ 535, WhirlpoolHasher.field_f.field_p, var7Lifetime2, ModalStack.field_J, WhirlpoolHasher.field_f.field_n, var37, -1, var8Lifetime2, WhirlpoolHasher.field_f.field_v);
                break;
              }
            }
            var4Lifetime2 = MenuInputState.field_l;
            var4Lifetime2 = mj.field_h;
          }
        }
        var24.drawParagraph(var4Lifetime2, 50, 150, 540, 200, 0, -1, 1, 1, var3Lifetime1);
    }

    public static void releaseStatics(byte param0) {
        field_s = null;
        field_q = null;
        field_r = null;
        field_o = null;
        field_p = null;
        int var1 = 116 / ((param0 + 12) / 59);
    }

    final static void e(int param0, int param1) {
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        if (fq.field_o != null) {
          var2 = 20 / ((10 - param0) / 32);
          return;
        }
        if (Js5NetworkRequest.field_C[param1] != LoginCredentials.field_e) {
          fq.field_o = Js5NetworkRequest.field_C[param1];
          fq.field_o.field_d = RegistrationRequestDialog.field_Cb;
          NightToRememberBackground.field_o = param1;
          DebouncedValidator.field_d = 0;
          QuickChatPhraseCache.a(false, 2 + param1);
          var2Lifetime1 = 20 / ((10 - param0) / 32);
          return;
        }
        var2Lifetime2 = 20 / ((10 - param0) / 32);
    }

    final int a(int param0, boolean param1) {
        if (param1) {
          this.c((byte) -54);
          if (ArrayWidgetContainer.a((byte) 115)) {
            return (this.d(param0, 53) >> 1) + 320;
          }
          if (param0 >= 2) {
            return (this.d(param0, 53) >> 1) + 320;
          }
          if (param0 == 0) {
            return this.field_m + this.d(0, -103);
          }
          return this.field_a;
        }
        if (ArrayWidgetContainer.a((byte) 115)) {
          return (this.d(param0, 53) >> 1) + 320;
        }
        if (param0 >= 2) {
          return (this.d(param0, 53) >> 1) + 320;
        }
        if (param0 == 0) {
          return this.field_m + this.d(0, -103);
        }
        return this.field_a;
    }

    final void c(byte param0) {
        if (param0 < -13) {
          la.a(this.field_l, TickClock.field_a, false, -25528);
          return;
        }
        field_s = (String) null;
        la.a(this.field_l, TickClock.field_a, false, -25528);
    }

    HighscoresScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static void a(java.math.BigInteger param0, PacketBuffer param1, java.math.BigInteger param2, PacketBuffer param3, int param4) {
        try {
          SecondaryNodeDeque.writeEncryptedPayload(param0, true, 0, param3.position, param2, param1, param3.payload);
          if (param4 != 12556) {
            field_s = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "wh.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        Sprite var4 = null;
        Sprite var4Lifetime1;
        Sprite var4Lifetime2;
        Sprite var4Lifetime3;
        if (param0 > -116) {
          field_q = (Sprite) null;
          var4 = StripedProgressBar.field_N;
          if (!ArrayWidgetContainer.a((byte) 117)) {
            if (param2 == 1) {
              var4 = StripedProgressBar.field_S;
            }
            super.a((byte) 35, var4, param1, param2);
            return;
          }
          var4Lifetime3 = StripedProgressBar.field_S;
          super.a((byte) 35, var4Lifetime3, param1, param2);
          return;
        }
        var4Lifetime1 = StripedProgressBar.field_N;
        if (ArrayWidgetContainer.a((byte) 117)) {
          var4Lifetime1 = StripedProgressBar.field_S;
          super.a((byte) 35, var4Lifetime1, param1, param2);
          return;
        }
        if (param2 != 1) {
          super.a((byte) 35, var4Lifetime1, param1, param2);
          return;
        }
        var4Lifetime2 = StripedProgressBar.field_S;
        super.a((byte) 35, var4Lifetime2, param1, param2);
    }

    static {
        field_p = null;
        field_r = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_s = "Private";
        field_o = new dj();
    }
}
