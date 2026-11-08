/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextHotspotWidget extends TextButton {
    private vl field_K;
    static String field_Q;
    private IntrusiveDeque field_O;
    private String[] field_I;
    static am field_R;
    static String field_M;
    static String field_H;
    static String field_N;
    static String field_L;
    static String field_P;

    void drawLayer(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.drawLayer((byte) -111, param1, param2, param3);
        if (param2 != 0) {
          return;
        }
        if (param0 >= -52) {
          TextHotspotWidget.releaseStatics(-92);
        }
        WidgetTextLayout var9 = (WidgetTextLayout) ((Object) this.field_r);
        vl var6 = this.field_K;
        if (var6 == null) {
        } else {
          var7 = var9.getTextX((UiComponent) (this), (byte) -90, param1);
          var8 = var9.getTextY(param3, -13372, (UiComponent) (this));
          do {
            oj.a(-32171, var8 - (-var6.field_m + 2), var7 + (var6.field_o - 2), var6.field_n + 2, var6.field_g + 2);
            var6 = var6.field_h;
          } while (var6 != null);
        }
    }

    boolean focusNext(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ej.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, String param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_I == null ||
            this.field_I.length <= param0) {
            var7 = new String[param0 + 1];
            var8 = var7;
            var4 = var8;
            if (this.field_I != null) {
              for (var5 = 0; var5 < this.field_I.length; var5++) {
                var7[var5] = this.field_I[var5];
              }
            }
            this.field_I = var8;
          }
          if (param1 != 0) {
            return;
          }
          this.field_I[param0] = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ej.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        this.setBounds(((WidgetTextLayout) ((Object) this.field_r)).getPreferredHeight((UiComponent) (this), 1), param3, param2, param0, -123);
        if (param1 != -4) {
          UiComponent var6 = (UiComponent) null;
          this.updatePointer((UiComponent) null, 33, 61, 69);
        }
    }

    public static void releaseStatics(int param0) {
        field_Q = null;
        field_H = null;
        field_R = null;
        field_P = null;
        if (param0 != 20445) {
          TextHotspotWidget.a(31, -44);
        }
        field_N = null;
        field_L = null;
        field_M = null;
    }

    final void g(byte param0) {
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        WidgetTextLayout var3;
        TextLayout var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        TextLine var12;
        int var13;
        int var14;
        vl var15;
        int var16;
        int var7Lifetime1;
        var16 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 63) {
          TextHotspotWidget.a(-9);
        }
        this.field_O = new IntrusiveDeque();
        var2 = 0;
        var3 = (WidgetTextLayout) ((Object) this.field_r);
        var4 = var3.getTextLayout((UiComponent) (this), -127);
        while (true) {
          var5 = this.field_g.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.field_g.indexOf(">", var5);
          var6 = this.field_g.substring(var5 + 9, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_g.indexOf("</hotspot>", var5);
          var8 = var4.lineForCharacter((byte) 104, var5);
          var9 = var4.lineForCharacter((byte) 79, var2);
          var10 = null;
          for (var11 = var8; var9 >= var11; var11++) {
            var12 = var4.field_f[var11];
            if (~var11 != ~var8) {
              stackIn_9_0 = var12.field_f[0];
            } else {
              stackIn_9_0 = var4.characterOffset(var5, 0);
            }
            var13 = stackIn_9_0;
            if (var9 != var11) {
              if (var12 != null) {
                stackIn_14_0 = var12.field_f[-1 + var12.field_f.length];
              } else {
                stackIn_14_0 = 0;
              }
            } else {
              stackIn_14_0 = var4.characterOffset(var2, param0 - 63);
            }
            var14 = stackIn_14_0;
            var15 = new vl(var7Lifetime1, var13, var12.field_g, var14 - var13, Math.max(var3.lineHeight(27184), var12.field_e - var12.field_g));
            if (var10 != null) {
              ((vl) (var10)).field_h = var15;
            }
            this.field_O.addLast(var15, -1);
            var10 = var15;
          }
        }
    }

    private final vl a(int param0, byte param1, int param2) {
        vl var4;
        vl var5;
        int var6;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 102) {
          return (vl) null;
        }
        var4 = (vl) (this.field_O.first(12623));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param0 >= var5.field_o &&
              var5.field_m <= param2 &&
              param0 < var5.field_g + var5.field_o &&
              var5.field_m + var5.field_n >= param2) {
              return var4;
            }
            var5 = var5.field_h;
          }
          var4 = (vl) (this.field_O.next(0));
        }
        return null;
    }

    final static void a(int param0, boolean param1) {
        SceneWidget stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        SceneWidget stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        SceneWidget stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        SceneWidget stackIn_28_0 = null;
        boolean stackIn_29_1 = false;
        da.clipToRectangle(640 + SoftwareRasterizer.field_e >> 1, SoftwareRasterizer.field_j, param0 ^ -11846, -640 + SoftwareRasterizer.field_e >> 1, 0);
        if (ce.field_h > 0) {
          if (null != oo.field_t) {
            oo.field_t.drawOpaque(BufferedSocket.field_d.field_T, 0);
          }
          stackIn_7_0 = BufferedSocket.field_d;
          stackIn_8_1 = (param1) && (!IntrusiveNode.field_d);
          ((SceneWidget) (Object) stackIn_7_0).drawFullScreen(stackIn_8_1, true);
          stackIn_11_0 = fn.field_e;
          stackIn_12_1 = (param1) && (!IntrusiveNode.field_d);
          ((SceneWidget) (Object) stackIn_11_0).drawFullScreen(stackIn_12_1, true);
        }
        if (param0 != -11837) {
          field_Q = (String) null;
        }
        if (!(sm.field_a <= 0) ||
          !(0 >= oo.field_y)) {
          if (oo.field_t != null) {
            oo.field_t.drawOpaque(hl.field_m.field_T, 0);
          }
          stackIn_24_0 = hl.field_m;
          stackIn_25_1 = (param1) && (!so.field_j);
          ((SceneWidget) (Object) stackIn_24_0).drawFullScreen(stackIn_25_1, true);
          stackIn_28_0 = ReflectionCheckRequest.field_h;
          stackIn_29_1 = (param1) && (!so.field_j);
          ((SceneWidget) (Object) stackIn_28_0).drawFullScreen(stackIn_29_1, true);
        }
        oo.popClipState(-15405);
    }

    final static void a(int param0) {
        String var2 = null;
        if (null != va.field_e) {
          var2 = va.field_e;
          String var1 = var2;
          GrowableIntList.a(99, CachedArchiveProvider.formatTemplate(-118, new String[]{var2}, i.field_b));
          va.field_e = null;
        }
        if (param0 < 94) {
          field_P = (String) null;
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, -111);
        this.g((byte) 63);
        if (param4 >= -49) {
          this.field_K = (vl) null;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = (-640 + SecondaryNodeDequeIterator.field_g) / 2;
        int var3 = DiskCacheRequest.field_F * DiskCacheRequest.field_F;
        if (param0 != 16) {
          return;
        }
        int var4 = var3 - param1 * param1;
        hl.field_m.setBounds(199, -(var4 * 199 / var3) + var2, 90, -4 + SoftwareRasterizer.field_j - 120 - 90, (byte) -120);
        ReflectionCheckRequest.field_h.setBounds(438, 202 + (var2 + 438 * var4 / var3), 0, -4 + SoftwareRasterizer.field_j - 120, (byte) -120);
    }

    String getTooltip(boolean param0) {
        if (null == this.field_K) {
          return null;
        }
        if (this.field_I == null) {
          return null;
        }
        if (param0) {
          return (String) null;
        }
        if (this.field_K.field_j >= this.field_I.length) {
          return null;
        }
        return this.field_I[this.field_K.field_j];
    }

    TextHotspotWidget(String param0, WidgetPainter param1) {
        super(param0, (UiListener) null);
        this.field_K = null;
        try {
          this.field_r = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_10_3 = 0;
        BinaryBitmapFont stackIn_12_0;
        String stackIn_12_1;
        int stackIn_12_2;
        int stackIn_12_3;
        int stackIn_13_4 = 0;
        StringBuilder stackIn_111_0 = null;
        String stackIn_112_1 = null;
        StringBuilder stackIn_132_0 = null;
        String stackIn_133_1 = null;
        StringBuilder stackIn_166_0 = null;
        String stackIn_167_1 = null;
        StringBuilder stackIn_184_0 = null;
        String stackIn_185_1 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var12_ref_String = null;
        int var13 = 0;
        String var14 = null;
        int var14_int = 0;
        String var15 = null;
        int var17 = 0;
        String var18 = null;
        BattleUnit var19 = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        BattleUnit var25 = null;
        BattleUnit var26 = null;
        String var27 = null;
        BattleUnit var28 = null;
        String var29 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        String var14Lifetime1;
        String var15Lifetime1;
        String var14Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var12Lifetime1;
        int var14_intLifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime2Lifetime1;
        int var4Lifetime1Lifetime1;
        int var4Lifetime2Lifetime1;
        int var14_intLifetime1Lifetime1;
        int var14_intLifetime1Lifetime2;
        var17 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = IntKeyLookup.field_g.field_nb;
          var3 = 90;
          var4 = lo.field_q - 30 + var2_int;
          var5 = 13;
          var6 = 18;
          var7 = lo.field_q + var2_int - 100;
          stackIn_3_0 = var6;
          stackIn_3_1 = var7;
          stackIn_3_2 = 9;
          if (!ConditionalTextValue.field_f) {
            stackIn_4_3 = 8421504;
          } else {
            stackIn_4_3 = 16777215;
          }
          SoftwareRasterizer.fillCircle(stackIn_3_0, stackIn_3_1, stackIn_3_2, stackIn_4_3);
          SoftwareRasterizer.drawCircleOutline(var6, var7, 9, 0);
          if (bm.field_g.field_I >= 0) {
            stackIn_7_0 = bm.field_g.field_I;
          } else {
            stackIn_7_0 = 6;
          }
          var8 = stackIn_7_0;
          var9 = nj.field_n[var8];
          stackIn_9_0 = var6;
          stackIn_9_1 = var7;
          stackIn_9_2 = 7;
          if (ConditionalTextValue.field_f) {
            stackIn_10_3 = var9;
          } else {
            stackIn_10_3 = var9 >> 1 & 8355711;
          }
          SoftwareRasterizer.fillCircle(stackIn_9_0, stackIn_9_1, stackIn_9_2, stackIn_10_3);
          SoftwareRasterizer.drawCircleOutline(var6, var7, 7, 0);
          stackIn_12_0 = SpellProjectile.field_B;
          stackIn_12_1 = "?";
          stackIn_12_2 = var6;
          stackIn_12_3 = var7 - (-(SpellProjectile.field_B.field_C / 2) + SpellProjectile.field_B.field_m / 2);
          if (!ConditionalTextValue.field_f) {
            stackIn_13_4 = 8421504;
          } else {
            stackIn_13_4 = 16777215;
          }
          ((BinaryBitmapFont) (Object) stackIn_12_0).drawCentered(stackIn_12_1, stackIn_12_2, stackIn_12_3, stackIn_13_4, 0);
          var10 = -EmailLoginCredentials.field_g + var6;
          var11 = var7 - MenuButtonPanel.field_I;
          if (var11 * var11 + var10 * var10 < 81 &&
            param1) {
            mf.field_g = -2;
            SoftwareRasterizer.fillCircleAlpha(var6, var7, 9, 16777215, 128);
            var18 = ValidationStatusIcon.field_L;
            SpellProjectile.field_B.drawText(var18, 5 + var6, -1 + var7, 0, 0);
            SpellProjectile.field_B.drawText(var18, var6 + 4, var7, 0, 0);
            SpellProjectile.field_B.drawText(var18, 5 + var6 + 1, var7, 0, 0);
            SpellProjectile.field_B.drawText(var18, var6 + 5, 1 + var7, 0, 0);
            SpellProjectile.field_B.drawText(var18, 5 + var6, var7, 16777215, 0);
          }
          if (Checkbox.field_J.getArenaTheme(-31497) == 8 &&
            12 < lm.field_f.length) {
            var4 -= 6;
            var3 -= 40;
          }
          for (var12 = param0; var12 < lm.field_f.length; var12++) {
            if (lm.field_f[var12] > -1) {
              if (Checkbox.field_J.getArenaTheme(param0 - 31497) == 8 &&
                lm.field_f.length > 12) {
                if (0 != (var12 & 1)) {
                  var4 -= 16;
                } else {
                  var4 += 16;
                }
                var3 -= 4;
              } else {
                if ((1 & var12) == 0) {
                  var4 += 8;
                } else {
                  var4 -= 8;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              SoftwareRasterizer.fillCircleAlpha(2 + var3, var4 + 2, var5, 0, 128);
              SoftwareRasterizer.fillCircle(var3, var4, var5, 13680256);
              SoftwareRasterizer.fillCircle(var3, var4, -3 + var5, 16777215);
              SoftwareRasterizer.drawCircleOutline(var3, var4, var5, 0);
              SoftwareRasterizer.drawCircleOutline(var3, var4, var5 - 3, 0);
              bb.field_g[dd.field_f[lm.field_f[var12]]].drawHalfSize(var3 - 9, -9 + var4);
              if (Checkbox.field_J.canOwnerCast(lm.field_f[var12], true, bm.field_g.field_bb)) {
                var13 = Checkbox.field_J.getSpellCharges(lm.field_f[var12], Checkbox.field_J.getCurrentPlayer(false), param0 - 770226943);
                if (var13 > 0 &&
                  0 < MouseWheelHandler.field_b[lm.field_f[var12]]) {
                  var23 = Integer.toString(var13);
                  SpellProjectile.field_B.drawRightAlignedText(var23, var3 + (var5 / 2 - 1), 10 + var4, 0, 0);
                  SpellProjectile.field_B.drawRightAlignedText(var23, var3 + var5 / 2, -1 + (10 + var4), 0, 0);
                  SpellProjectile.field_B.drawRightAlignedText(var23, var5 / 2 + var3, var4 + 10, 16777215, 0);
                }
              } else {
                SoftwareRasterizer.fillCircleAlpha(var3, var4, var5, 0, 192);
                var13 = Checkbox.field_J.getSpellCharges(lm.field_f[var12], Checkbox.field_J.getCurrentPlayer(false), -770226943);
                if (Checkbox.field_J.field_f) {
                  if (lm.field_f[var12] != 11) {
                    bb.field_g[90].drawHalfSize(var3 - 9, var4 - 9);
                  }
                } else {
                  if (var13 <= 0 &&
                    lm.field_f[var12] != 37) {
                    if (MouseWheelHandler.field_b[lm.field_f[var12]] == -1) {
                      var14_int = Checkbox.field_J.getSpellRecharge(lm.field_f[var12], param0 - 102, Checkbox.field_J.getCurrentPlayer(false));
                      if (!(var14_int <= 0)) {
                        var21 = Integer.toString(var14_int);
                        SpellProjectile.field_B.drawRightAlignedText(var21, -1 + var3 + var5 / 2, 10 + var4, 0, 0);
                        SpellProjectile.field_B.drawRightAlignedText(var21, var5 / 2 + var3, 10 + (var4 - 1), 0, 0);
                        SpellProjectile.field_B.drawRightAlignedText(var21, var5 / 2 + var3, var4 + 10, 16711680, 0);
                      }
                    } else {
                      if (MouseWheelHandler.field_b[lm.field_f[var12]] == 0 &&
                        150 != lm.field_f[var12] &&
                        104 != lm.field_f[var12] &&
                        lm.field_f[var12] != 11) {
                        var14 = "";
                        var19 = Checkbox.field_J.getUnitByOwner(bm.field_g.field_bb, true);
                        if ((lm.field_f[var12] == 124 ||
                          lm.field_f[var12] == 130) && var19.getDisplayFlag(false)) {
                          var14 = "X";
                        }
                        SpellProjectile.field_B.drawRightAlignedText(var14, var3 + var5 / 2 - 1, 10 + var4, 0, 0);
                        SpellProjectile.field_B.drawRightAlignedText(var14, var5 / 2 + var3, 10 + var4 - 1, 0, 0);
                        SpellProjectile.field_B.drawRightAlignedText(var14, var5 / 2 + var3, 10 + var4, 16711680, 0);
                      } else {
                        if ((var13 == -1)) {
                          var20 = "X";
                          var14 = var20;
                          SpellProjectile.field_B.drawRightAlignedText(var20, var5 / 2 + var3 - 1, var4 + 10, 0, 0);
                          SpellProjectile.field_B.drawRightAlignedText(var20, var5 / 2 + var3, 10 + (var4 - 1), 0, 0);
                          SpellProjectile.field_B.drawRightAlignedText(var14, var3 + var5 / 2, var4 + 10, 16711680, 0);
                        }
                      }
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (le.field_d[lm.field_f[var12]] - Checkbox.field_J.getRound((byte) -75) / Checkbox.field_J.getPlayerCount(0) > 0) {
                      var22 = Integer.toString(le.field_d[lm.field_f[var12]] - Checkbox.field_J.getRound((byte) -75) / Checkbox.field_J.getPlayerCount(0));
                      SpellProjectile.field_B.drawRightAlignedText(var22, -1 + var3 + var5 / 2, 10 + var4, 0, 0);
                      SpellProjectile.field_B.drawRightAlignedText(var22, var5 / 2 + var3, -1 + var4 + 10, 0, 0);
                      SpellProjectile.field_B.drawRightAlignedText(var22, var5 / 2 + var3, 10 + var4, 16711680, 0);
                    } else {
                      var14Lifetime2 = "X";
                      if (lm.field_f[var12] == 87 ||
                        116 == lm.field_f[var12]) {
                        var14Lifetime2 = Integer.toString(var13);
                      }
                      SpellProjectile.field_B.drawRightAlignedText(var14Lifetime2, -1 + var3 + var5 / 2, 10 + var4, 0, 0);
                      SpellProjectile.field_B.drawRightAlignedText(var14Lifetime2, var3 + var5 / 2, -1 + var4 + 10, 0, 0);
                      SpellProjectile.field_B.drawRightAlignedText(var14Lifetime2, var3 + var5 / 2, 10 + var4, 16711680, 0);
                    }
                  }
                }
              }
              if (param1 &&
                EmailLoginCredentials.field_g >= var3 - 12 &&
                var4 - 12 <= MenuButtonPanel.field_I &&
                EmailLoginCredentials.field_g < var3 + 14 &&
                var4 + 14 > MenuButtonPanel.field_I) {
                mf.field_g = var12;
              }
              var3 += 26;
            }
          }
          if (DropdownList.field_N != -1) {
            var3Lifetime1 = 22;
            var4Lifetime1 = lo.field_q + 387 + (-480 + var2_int);
            bb.field_g[dd.field_f[DropdownList.field_N]].drawTransparent(var3Lifetime1, var4Lifetime1);
            var3Lifetime1Lifetime1 = 75;
            var4Lifetime1Lifetime1 = var2_int - 480 + 430;
            CachedArchiveProvider.field_t.drawText(PasswordFieldPainter.field_w[DropdownList.field_N], var3Lifetime1Lifetime1, var4Lifetime1Lifetime1, 16777215, 0);
          }
          regionExit1: {
            if (mf.field_g > -1) {
              var3Lifetime2 = 75;
              if (ConditionalTextValue.field_f) {
                ArrayWidgetContainer.field_A = 256;
                IntrusiveNodeHashTable.field_f = vm.field_d[lm.field_f[mf.field_g]];
              }
              var4Lifetime2 = -50 + var2_int;
              if (8 == Checkbox.field_J.getArenaTheme(-31497) &&
                lm.field_f.length > 12) {
                var4Lifetime2Lifetime1 = -(16 * (1 & mf.field_g)) + 450 - 480 + var2_int;
                var3Lifetime2Lifetime1 = 50 + mf.field_g * 22;
              } else {
                var4Lifetime2Lifetime1 = -480 + var2_int + (450 - 8 * (mf.field_g & 1));
                var3Lifetime2Lifetime1 = 90 + 26 * mf.field_g;
              }
              var5Lifetime1 = 24;
              SoftwareRasterizer.fillCircleAlpha(var3Lifetime2Lifetime1 + 2, 2 + var4Lifetime2Lifetime1, var5Lifetime1, 0, 128);
              SoftwareRasterizer.fillCircle(var3Lifetime2Lifetime1, var4Lifetime2Lifetime1, var5Lifetime1, 13680256);
              SoftwareRasterizer.fillCircle(var3Lifetime2Lifetime1, var4Lifetime2Lifetime1, var5Lifetime1 - 3, 16777215);
              SoftwareRasterizer.drawCircleOutline(var3Lifetime2Lifetime1, var4Lifetime2Lifetime1, var5Lifetime1, 0);
              SoftwareRasterizer.drawCircleOutline(var3Lifetime2Lifetime1, var4Lifetime2Lifetime1, var5Lifetime1 - 3, 0);
              bb.field_g[dd.field_f[lm.field_f[mf.field_g]]].drawTransparent(-20 + var3Lifetime2Lifetime1, -20 + var4Lifetime2Lifetime1);
              var24 = PasswordFieldPainter.field_w[lm.field_f[mf.field_g]];
              var12_ref_String = var24;
              SpellProjectile.field_B.drawCentered(var12_ref_String, var3Lifetime2Lifetime1, var4Lifetime2Lifetime1 + (-1 - var5Lifetime1), 0, 0);
              SpellProjectile.field_B.drawCentered(var12_ref_String, -1 + var3Lifetime2Lifetime1, var4Lifetime2Lifetime1 - var5Lifetime1, 0, 0);
              SpellProjectile.field_B.drawCentered(var24, var3Lifetime2Lifetime1 + 1, var4Lifetime2Lifetime1 - var5Lifetime1, 0, 0);
              SpellProjectile.field_B.drawCentered(var12_ref_String, var3Lifetime2Lifetime1, var4Lifetime2Lifetime1 + 1 - var5Lifetime1, 0, 0);
              SpellProjectile.field_B.drawCentered(var12_ref_String, var3Lifetime2Lifetime1, -var5Lifetime1 + var4Lifetime2Lifetime1, 16777215, 0);
              var12Lifetime1 = Checkbox.field_J.getSpellCharges(lm.field_f[mf.field_g], Checkbox.field_J.getCurrentPlayer(false), -770226943);
              if (Checkbox.field_J.canOwnerCast(lm.field_f[mf.field_g], true, bm.field_g.field_bb)) {
                if (var12Lifetime1 > 0) {
                  stackIn_184_0 = new StringBuilder().append(var12Lifetime1);
                  if (1 >= var12Lifetime1) {
                    stackIn_185_1 = PasswordFieldPainter.field_z;
                  } else {
                    stackIn_185_1 = tk.field_s;
                  }
                  var14Lifetime1 = ((StringBuilder) (Object) stackIn_184_0).append(stackIn_185_1).toString();
                  if (-1 == MouseWheelHandler.field_b[lm.field_f[mf.field_g]]) {
                    var14Lifetime1 = StatefulTextPainter.field_x;
                  }
                  SpellProjectile.field_B.drawText(var14Lifetime1, var5Lifetime1 + var3Lifetime2Lifetime1, -1 + var4Lifetime2Lifetime1, 0, 0);
                  SpellProjectile.field_B.drawText(var14Lifetime1, var3Lifetime2Lifetime1 - (-var5Lifetime1 + 1), var4Lifetime2Lifetime1, 0, 0);
                  SpellProjectile.field_B.drawText(var14Lifetime1, var3Lifetime2Lifetime1 + var5Lifetime1 + 1, var4Lifetime2Lifetime1, 0, 0);
                  SpellProjectile.field_B.drawText(var14Lifetime1, var5Lifetime1 + var3Lifetime2Lifetime1, 1 + var4Lifetime2Lifetime1, 0, 0);
                  SpellProjectile.field_B.drawText(var14Lifetime1, var5Lifetime1 + var3Lifetime2Lifetime1, var4Lifetime2Lifetime1, 16777215, 0);
                }
              } else {
                SoftwareRasterizer.fillCircleAlpha(var3Lifetime2Lifetime1, var4Lifetime2Lifetime1, var5Lifetime1, 0, 192);
                if (11 != lm.field_f[mf.field_g] && ((93 != lm.field_f[mf.field_g] ||
                  Checkbox.field_J.getUnitByOwner(bm.field_g.field_bb, true).getType(-22625) == 33) &&
                  (lm.field_f[mf.field_g] != 95 ||
                  Checkbox.field_J.getUnitByOwner(bm.field_g.field_bb, true).getType(-22625) == 31))) {
                  if (Checkbox.field_J.field_f &&
                    !Checkbox.field_J.isArenaSpell((byte) 66, lm.field_f[mf.field_g])) {
                    var31 = IndexedSpriteState.field_a;
                    if (8 + SpellProjectile.field_B.textWidth(var31) + var5Lifetime1 + var3Lifetime2Lifetime1 > 640) {
                      var3Lifetime2Lifetime1 = 640 + (-var5Lifetime1 - SpellProjectile.field_B.textWidth(var31) - 8);
                    }
                    SpellProjectile.field_B.drawText(var31, var5Lifetime1 + var3Lifetime2Lifetime1, -1 + var4Lifetime2Lifetime1, 0, 0);
                    SpellProjectile.field_B.drawText(var31, var5Lifetime1 + (var3Lifetime2Lifetime1 - 1), var4Lifetime2Lifetime1, 0, 0);
                    SpellProjectile.field_B.drawText(var31, 1 + (var5Lifetime1 + var3Lifetime2Lifetime1), var4Lifetime2Lifetime1, 0, 0);
                    SpellProjectile.field_B.drawText(var31, var3Lifetime2Lifetime1 + var5Lifetime1, 1 + var4Lifetime2Lifetime1, 0, 0);
                    SpellProjectile.field_B.drawText(var31, var3Lifetime2Lifetime1 + var5Lifetime1, var4Lifetime2Lifetime1, 16777215, 0);
                  } else {
                    if (lm.field_f[mf.field_g] == 150) {
                      var30 = bj.field_jb;
                      if (var5Lifetime1 + (var3Lifetime2Lifetime1 - (-SpellProjectile.field_B.textWidth(var30) - 8)) > 640) {
                        var3Lifetime2Lifetime1 = -8 - (SpellProjectile.field_B.textWidth(var30) + var5Lifetime1) + 640;
                      }
                      SpellProjectile.field_B.drawText(var30, var5Lifetime1 + var3Lifetime2Lifetime1, -1 + var4Lifetime2Lifetime1, 0, 0);
                      SpellProjectile.field_B.drawText(var30, var3Lifetime2Lifetime1 + var5Lifetime1 - 1, var4Lifetime2Lifetime1, 0, 0);
                      SpellProjectile.field_B.drawText(var30, 1 + var3Lifetime2Lifetime1 + var5Lifetime1, var4Lifetime2Lifetime1, 0, 0);
                      SpellProjectile.field_B.drawText(var30, var5Lifetime1 + var3Lifetime2Lifetime1, 1 + var4Lifetime2Lifetime1, 0, 0);
                      SpellProjectile.field_B.drawText(var30, var3Lifetime2Lifetime1 + var5Lifetime1, var4Lifetime2Lifetime1, 16777215, 0);
                    } else {
                      if (var12Lifetime1 > 0) {
                        if ((MouseWheelHandler.field_b[lm.field_f[mf.field_g]] != 0)) {
                          var14_intLifetime1 = le.field_d[lm.field_f[mf.field_g]] - Checkbox.field_J.getRound((byte) -75) / Checkbox.field_J.getPlayerCount(0);
                          if (var14_intLifetime1 > 0) {
                            stackIn_166_0 = new StringBuilder().append(var14_intLifetime1);
                            if (var14_intLifetime1 > 1) {
                              stackIn_167_1 = ki.field_x;
                            } else {
                              stackIn_167_1 = DualLinkDeque.field_g;
                            }
                            var29 = ((StringBuilder) (Object) stackIn_166_0).append(stackIn_167_1).toString();
                            if (640 < SpellProjectile.field_B.textWidth(var29) + (var5Lifetime1 + var3Lifetime2Lifetime1 + 8)) {
                              var3Lifetime2Lifetime1 = -var5Lifetime1 - SpellProjectile.field_B.textWidth(var29) - 8 + 640;
                            }
                            SpellProjectile.field_B.drawText(var29, var3Lifetime2Lifetime1 + var5Lifetime1, -1 + var4Lifetime2Lifetime1, 0, 0);
                            SpellProjectile.field_B.drawText(var29, var5Lifetime1 + (var3Lifetime2Lifetime1 - 1), var4Lifetime2Lifetime1, 0, 0);
                            SpellProjectile.field_B.drawText(var29, var3Lifetime2Lifetime1 + var5Lifetime1 + 1, var4Lifetime2Lifetime1, 0, 0);
                            SpellProjectile.field_B.drawText(var29, var3Lifetime2Lifetime1 + var5Lifetime1, 1 + var4Lifetime2Lifetime1, 0, 0);
                            SpellProjectile.field_B.drawText(var29, var5Lifetime1 + var3Lifetime2Lifetime1, var4Lifetime2Lifetime1, 16777215, 0);
                            break regionExit1;
                          }
                          var15 = qa.field_k;
                          var28 = Checkbox.field_J.getUnitByOwner(bm.field_g.field_bb, true);
                          if (var28.getType(param0 ^ -22625) == 19) {
                            var15 = ValidationHelpWidget.field_T;
                          }
                          if (var28.getType(-22625) == 18) {
                            var15 = bj.field_sb;
                          }
                          if (16 == var28.getType(-22625)) {
                            var15 = oi.field_a;
                          }
                          if (cf.field_f) {
                            var15 = tk.field_p;
                          }
                          if (lm.field_f[mf.field_g] == 87 &&
                            var28.getType(-22625) != 19) {
                            var15 = ConditionalTextValue.field_g;
                          }
                          if (lm.field_f[mf.field_g] == 87 &&
                            var28.getType(param0 - 22625) == 19) {
                            var15 = LoadingTracker.field_l;
                          }
                          if (lm.field_f[mf.field_g] == 116) {
                            var15 = ConditionalTextValue.field_g;
                          }
                          if (lm.field_f[mf.field_g] == 4) {
                            var15 = "Being entangled blocks this spell.";
                          }
                          if (SpellProjectile.field_B.textWidth(var15) + var5Lifetime1 + (var3Lifetime2Lifetime1 + 8) > 640) {
                            var3Lifetime2Lifetime1 = -8 - SpellProjectile.field_B.textWidth(var15) - (var5Lifetime1 - 640);
                          }
                          SpellProjectile.field_B.drawText(var15, var3Lifetime2Lifetime1 + var5Lifetime1, var4Lifetime2Lifetime1 - 1, 0, 0);
                          SpellProjectile.field_B.drawText(var15, -1 + var5Lifetime1 + var3Lifetime2Lifetime1, var4Lifetime2Lifetime1, 0, 0);
                          SpellProjectile.field_B.drawText(var15, var3Lifetime2Lifetime1 - (-var5Lifetime1 - 1), var4Lifetime2Lifetime1, 0, 0);
                          SpellProjectile.field_B.drawText(var15, var5Lifetime1 + var3Lifetime2Lifetime1, 1 + var4Lifetime2Lifetime1, 0, 0);
                          SpellProjectile.field_B.drawText(var15, var3Lifetime2Lifetime1 + var5Lifetime1, var4Lifetime2Lifetime1, 16777215, 0);
                        }
                      } else {
                        if (MouseWheelHandler.field_b[lm.field_f[mf.field_g]] == -1) {
                          var14_intLifetime1Lifetime1 = Checkbox.field_J.getSpellRecharge(lm.field_f[mf.field_g], -102, Checkbox.field_J.getCurrentPlayer(false));
                          if (!(var14_intLifetime1Lifetime1 <= 0)) {
                            stackIn_132_0 = new StringBuilder().append(var14_intLifetime1Lifetime1);
                            if (var14_intLifetime1Lifetime1 > 1) {
                              stackIn_133_1 = ki.field_x;
                            } else {
                              stackIn_133_1 = DualLinkDeque.field_g;
                            }
                            var27 = ((StringBuilder) (Object) stackIn_132_0).append(stackIn_133_1).toString();
                            if (var5Lifetime1 + (var3Lifetime2Lifetime1 + SpellProjectile.field_B.textWidth(var27)) + 8 > 640) {
                              var3Lifetime2Lifetime1 = -8 - (var5Lifetime1 + (SpellProjectile.field_B.textWidth(var27) - 640));
                            }
                            SpellProjectile.field_B.drawText(var27, var3Lifetime2Lifetime1 + var5Lifetime1, -1 + var4Lifetime2Lifetime1, 0, 0);
                            SpellProjectile.field_B.drawText(var27, var5Lifetime1 + (var3Lifetime2Lifetime1 - 1), var4Lifetime2Lifetime1, 0, 0);
                            SpellProjectile.field_B.drawText(var27, var3Lifetime2Lifetime1 + var5Lifetime1 + 1, var4Lifetime2Lifetime1, 0, 0);
                            SpellProjectile.field_B.drawText(var27, var3Lifetime2Lifetime1 + var5Lifetime1, 1 + var4Lifetime2Lifetime1, 0, 0);
                            SpellProjectile.field_B.drawText(var27, var5Lifetime1 + var3Lifetime2Lifetime1, var4Lifetime2Lifetime1, 16777215, 0);
                          }
                        } else {
                          if (MouseWheelHandler.field_b[lm.field_f[mf.field_g]] != 0) {
                            if (!(0 <= var12Lifetime1)) {
                              var14Lifetime1 = qa.field_k;
                              var25 = Checkbox.field_J.getUnitByOwner(bm.field_g.field_bb, true);
                              if (18 == var25.getType(-22625)) {
                                var14Lifetime1 = bj.field_sb;
                              }
                              if (16 == var25.getType(-22625)) {
                                var14Lifetime1 = oi.field_a;
                              }
                              SpellProjectile.field_B.drawText(var14Lifetime1, var5Lifetime1 + var3Lifetime2Lifetime1, var4Lifetime2Lifetime1 - 1, 0, 0);
                              SpellProjectile.field_B.drawText(var14Lifetime1, var5Lifetime1 + var3Lifetime2Lifetime1 - 1, var4Lifetime2Lifetime1, 0, 0);
                              SpellProjectile.field_B.drawText(var14Lifetime1, var5Lifetime1 + (var3Lifetime2Lifetime1 + 1), var4Lifetime2Lifetime1, 0, 0);
                              SpellProjectile.field_B.drawText(var14Lifetime1, var5Lifetime1 + var3Lifetime2Lifetime1, 1 + var4Lifetime2Lifetime1, 0, 0);
                              SpellProjectile.field_B.drawText(var14Lifetime1, var3Lifetime2Lifetime1 + var5Lifetime1, var4Lifetime2Lifetime1, 16777215, 0);
                            }
                          } else {
                            var14_intLifetime1Lifetime2 = le.field_d[lm.field_f[mf.field_g]] - Checkbox.field_J.getRound((byte) -75) / Checkbox.field_J.getPlayerCount(0);
                            stackIn_111_0 = new StringBuilder().append(var14_intLifetime1Lifetime2);
                            if (var14_intLifetime1Lifetime2 > 1) {
                              stackIn_112_1 = ki.field_x;
                            } else {
                              stackIn_112_1 = DualLinkDeque.field_g;
                            }
                            var15Lifetime1 = ((StringBuilder) (Object) stackIn_111_0).append(stackIn_112_1).toString();
                            if (0 > var14_intLifetime1Lifetime2) {
                              var15Lifetime1 = "";
                            }
                            if (lm.field_f[mf.field_g] == 104) {
                              var15Lifetime1 = tk.field_p;
                            }
                            var26 = Checkbox.field_J.getUnitByOwner(bm.field_g.field_bb, true);
                            if ((lm.field_f[mf.field_g] == 124 ||
                              lm.field_f[mf.field_g] == 130) && var26.getDisplayFlag(false)) {
                              var15Lifetime1 = qn.field_kb;
                            }
                            if (var26.getType(-22625) == 18) {
                              var15Lifetime1 = bj.field_sb;
                            }
                            if (var26.getType(-22625) == 16) {
                              var15Lifetime1 = oi.field_a;
                            }
                            SpellProjectile.field_B.drawText(var15Lifetime1, var3Lifetime2Lifetime1 + var5Lifetime1, var4Lifetime2Lifetime1 - 1, 0, 0);
                            SpellProjectile.field_B.drawText(var15Lifetime1, -1 + (var5Lifetime1 + var3Lifetime2Lifetime1), var4Lifetime2Lifetime1, 0, 0);
                            SpellProjectile.field_B.drawText(var15Lifetime1, 1 + var3Lifetime2Lifetime1 + var5Lifetime1, var4Lifetime2Lifetime1, 0, 0);
                            SpellProjectile.field_B.drawText(var15Lifetime1, var5Lifetime1 + var3Lifetime2Lifetime1, 1 + var4Lifetime2Lifetime1, 0, 0);
                            SpellProjectile.field_B.drawText(var15Lifetime1, var3Lifetime2Lifetime1 + var5Lifetime1, var4Lifetime2Lifetime1, 16777215, 0);
                          }
                        }
                      }
                    }
                  }
                  break regionExit1;
                }
                var32 = "";
                var14Lifetime1 = var32;
                var14Lifetime1 = var32;
                var14Lifetime1 = var32;
                if (SpellProjectile.field_B.textWidth(var32) + var5Lifetime1 + var3Lifetime2Lifetime1 + 8 > 640) {
                  var3Lifetime2Lifetime1 = -SpellProjectile.field_B.textWidth(var32) - (var5Lifetime1 + 8) + 640;
                }
                SpellProjectile.field_B.drawText(var32, var5Lifetime1 + var3Lifetime2Lifetime1, -1 + var4Lifetime2Lifetime1, 0, 0);
                SpellProjectile.field_B.drawText(var14Lifetime1, -1 + (var3Lifetime2Lifetime1 + var5Lifetime1), var4Lifetime2Lifetime1, 0, 0);
                SpellProjectile.field_B.drawText(var32, 1 + (var3Lifetime2Lifetime1 + var5Lifetime1), var4Lifetime2Lifetime1, 0, 0);
                SpellProjectile.field_B.drawText(var32, var5Lifetime1 + var3Lifetime2Lifetime1, 1 + var4Lifetime2Lifetime1, 0, 0);
                SpellProjectile.field_B.drawText(var14Lifetime1, var5Lifetime1 + var3Lifetime2Lifetime1, var4Lifetime2Lifetime1, 16777215, 0);
              }
            }
          }
          UiTheme.field_n = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ej.L(" + param0 + ',' + param1 + ')');
        }
    }

    final void activate(int param0, int param1, int param2, int param3) {
        if (param0 > -99) {
          return;
        }
        super.activate(-114, param1, param2, param3);
        int var5 = -this.field_n + param1;
        int var6 = -this.field_j + param3;
        vl var7 = this.a(var5, (byte) 102, var6);
        if (var7 != null &&
          this.field_o != null) {
          ((TextHotspotListener) ((Object) this.field_o)).onHotspotClicked(param2, this, -1607, var7.field_j);
        }
    }

    void updatePointer(UiComponent param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointer(param0, param1, param2 ^ 0, param3);
          this.field_K = null;
          if (this.field_w) {
            var5_int = -param1 + (EmailLoginCredentials.field_g - this.field_n);
            var6 = -this.field_j + MenuButtonPanel.field_I - param3;
            this.field_K = this.a(var5_int, (byte) 102, var6);
          }
          if (param2 != 170) {
            field_Q = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ej.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_Q = "Now the Fire Ball spell is selected, you will see an aiming arc in front of your Arcanist. This arc will fill up as you hold down the mouse button, which sets the spell's initial velocity. Try shooting the target in front of you.";
        field_R = new am();
        field_N = "MOST MINIONS - ";
        field_H = "Played";
        field_M = "Book of Overlight";
        field_L = "Kick";
        field_P = "Click to buy this spell for 3 wands.";
    }
}
