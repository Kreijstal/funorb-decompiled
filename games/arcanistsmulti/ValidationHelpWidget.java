/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationHelpWidget extends TextHotspotWidget {
    private Sprite field_Y;
    static String field_S;
    static aj field_W;
    private int field_X;
    private ValidationProvider field_J;
    private String field_ab;
    static String field_Z;
    static int[] field_U;
    static boolean field_V;
    static String field_T;
    static String field_bb;

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        String var17 = null;
        WidgetTextLayout var35 = null;
        Sprite var19 = null;
        Sprite var20 = null;
        Sprite var21 = null;
        WidgetTextLayout var36 = null;
        Sprite var23 = null;
        Sprite var24 = null;
        Sprite var29 = null;
        Sprite var30 = null;
        Sprite var32 = null;
        Sprite var33 = null;
        String var5 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var18 = null;
        Object var22 = null;
        Object var31 = null;
        int var13 = ArcanistsMulti.field_G ? 1 : 0;
        ValidationState var6 = this.field_J.getValidationState(-92);
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var11Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        if (da.field_f == var6) {
          var17 = DiskCacheRequest.field_D;
          if (!var17.equals(this.field_g)) {
            this.field_g = var17;
            this.g((byte) 63);
          }
          super.drawLayer((byte) -58, param1, param2, param3);
          if (param0 > -52) {
            this.field_Y = (Sprite) null;
          }
          var6 = this.field_J.getValidationState(-103);
          var35 = (WidgetTextLayout) ((Object) this.field_r);
          var9 = this.field_n + param1;
          var10 = var35.getTextY(param3, -13372, (UiComponent) (this)) + (var35.getTextLayout((UiComponent) (this), -126).height((byte) -58) >> 1);
          if (da.field_f != var6 &&
            IsaacCipher.field_c != var6) {
            if (var6 == ra.field_k) {
              var19 = ContentTransitionDialog.field_lb[2];
              var19.drawAdditive(var9, var10 - (var19.field_y >> 1), 256);
              return;
            }
            if (CacheEntry.field_s == var6) {
              var20 = ContentTransitionDialog.field_lb[1];
              var20.drawAdditive(var9, var10 - (var20.field_y >> 1), 256);
              return;
            }
            return;
          }
          var21 = ContentTransitionDialog.field_lb[0];
          var11 = var21.field_n << 1;
          var12 = var21.field_w << 1;
          if (null == this.field_Y) {
            this.field_Y = new Sprite(var11, var12);
            fk.setSpriteRasterTarget(this.field_Y, -23095);
            var21.drawRotatedAboutPivot(112, 144, var21.field_n << 4, var21.field_w << 4, -this.field_X << 10, 4096);
            oo.popClipState(-15405);
            this.field_Y.drawAdditive(-(var21.field_n >> 1) + var9, var10 - var21.field_w, 256);
            return;
          }
          if (var11 > this.field_Y.field_q) {
            this.field_Y = new Sprite(var11, var12);
            fk.setSpriteRasterTarget(this.field_Y, -23095);
            var21.drawRotatedAboutPivot(112, 144, var21.field_n << 4, var21.field_w << 4, -this.field_X << 10, 4096);
            oo.popClipState(-15405);
            this.field_Y.drawAdditive(-(var21.field_n >> 1) + var9, var10 - var21.field_w, 256);
            return;
          }
          if (this.field_Y.field_y >= var12) {
            fk.setSpriteRasterTarget(this.field_Y, -23095);
            SoftwareRasterizer.clear();
            var21.drawRotatedAboutPivot(112, 144, var21.field_n << 4, var21.field_w << 4, -this.field_X << 10, 4096);
            oo.popClipState(-15405);
            this.field_Y.drawAdditive(-(var21.field_n >> 1) + var9, var10 - var21.field_w, 256);
            return;
          }
          this.field_Y = new Sprite(var11, var12);
          fk.setSpriteRasterTarget(this.field_Y, -23095);
          var21.drawRotatedAboutPivot(112, 144, var21.field_n << 4, var21.field_w << 4, -this.field_X << 10, 4096);
          oo.popClipState(-15405);
          this.field_Y.drawAdditive(-(var21.field_n >> 1) + var9, var10 - var21.field_w, 256);
          return;
        }
        if (IsaacCipher.field_c == var6) {
          var5 = DiskCacheRequest.field_D;
        } else {
          var5 = this.field_J.getValidationMessage(26146);
          if (var5 == null) {
            var5 = this.field_ab;
          }
        }
        if (!var5.equals(this.field_g)) {
          this.field_g = var5;
          this.g((byte) 63);
        }
        super.drawLayer((byte) -58, param1, param2, param3);
        if (param0 <= -52) {
          var6 = this.field_J.getValidationState(-103);
          var36 = (WidgetTextLayout) ((Object) this.field_r);
          var9Lifetime1 = this.field_n + param1;
          var10Lifetime1 = var36.getTextY(param3, -13372, (UiComponent) (this)) + (var36.getTextLayout((UiComponent) (this), -126).height((byte) -58) >> 1);
          if (da.field_f == var6) {
            var23 = ContentTransitionDialog.field_lb[0];
            var11Lifetime1 = var23.field_n << 1;
            var12Lifetime1 = var23.field_w << 1;
            if (null == this.field_Y) {
              this.field_Y = new Sprite(var11Lifetime1, var12Lifetime1);
              fk.setSpriteRasterTarget(this.field_Y, -23095);
              var23.drawRotatedAboutPivot(112, 144, var23.field_n << 4, var23.field_w << 4, -this.field_X << 10, 4096);
              oo.popClipState(-15405);
              this.field_Y.drawAdditive(-(var23.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var23.field_w, 256);
              return;
            }
            if (var11Lifetime1 > this.field_Y.field_q) {
              this.field_Y = new Sprite(var11Lifetime1, var12Lifetime1);
              fk.setSpriteRasterTarget(this.field_Y, -23095);
              var23.drawRotatedAboutPivot(112, 144, var23.field_n << 4, var23.field_w << 4, -this.field_X << 10, 4096);
              oo.popClipState(-15405);
              this.field_Y.drawAdditive(-(var23.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var23.field_w, 256);
              return;
            }
            if (this.field_Y.field_y >= var12Lifetime1) {
              fk.setSpriteRasterTarget(this.field_Y, -23095);
              SoftwareRasterizer.clear();
              var23.drawRotatedAboutPivot(112, 144, var23.field_n << 4, var23.field_w << 4, -this.field_X << 10, 4096);
              oo.popClipState(-15405);
              this.field_Y.drawAdditive(-(var23.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var23.field_w, 256);
              return;
            }
            this.field_Y = new Sprite(var11Lifetime1, var12Lifetime1);
            fk.setSpriteRasterTarget(this.field_Y, -23095);
            var23.drawRotatedAboutPivot(112, 144, var23.field_n << 4, var23.field_w << 4, -this.field_X << 10, 4096);
            oo.popClipState(-15405);
            this.field_Y.drawAdditive(-(var23.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var23.field_w, 256);
            return;
          }
          if (IsaacCipher.field_c == var6) {
            var24 = ContentTransitionDialog.field_lb[0];
            Sprite var16 = var24;
            var11Lifetime1Lifetime1 = var24.field_n << 1;
            var12Lifetime1Lifetime1 = var24.field_w << 1;
            if (null == this.field_Y) {
              this.field_Y = new Sprite(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
              fk.setSpriteRasterTarget(this.field_Y, -23095);
              var24.drawRotatedAboutPivot(112, 144, var24.field_n << 4, var24.field_w << 4, -this.field_X << 10, 4096);
              oo.popClipState(-15405);
              this.field_Y.drawAdditive(-(var24.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var24.field_w, 256);
              return;
            }
            if (var11Lifetime1Lifetime1 > this.field_Y.field_q) {
              this.field_Y = new Sprite(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
              fk.setSpriteRasterTarget(this.field_Y, -23095);
              var24.drawRotatedAboutPivot(112, 144, var24.field_n << 4, var24.field_w << 4, -this.field_X << 10, 4096);
              oo.popClipState(-15405);
              this.field_Y.drawAdditive(-(var24.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var24.field_w, 256);
              return;
            }
            if (this.field_Y.field_y < var12Lifetime1Lifetime1) {
              this.field_Y = new Sprite(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
              fk.setSpriteRasterTarget(this.field_Y, -23095);
              var24.drawRotatedAboutPivot(112, 144, var24.field_n << 4, var24.field_w << 4, -this.field_X << 10, 4096);
              oo.popClipState(-15405);
              this.field_Y.drawAdditive(-(var24.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var24.field_w, 256);
              return;
            }
            fk.setSpriteRasterTarget(this.field_Y, -23095);
            SoftwareRasterizer.clear();
            var24.drawRotatedAboutPivot(112, 144, var24.field_n << 4, var24.field_w << 4, -this.field_X << 10, 4096);
            oo.popClipState(-15405);
            this.field_Y.drawAdditive(-(var24.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var24.field_w, 256);
            return;
          }
          if (var6 == ra.field_k) {
            var29 = ContentTransitionDialog.field_lb[2];
            var29.drawAdditive(var9Lifetime1, var10Lifetime1 - (var29.field_y >> 1), 256);
            return;
          }
          if (CacheEntry.field_s != var6) {
            return;
          }
          var30 = ContentTransitionDialog.field_lb[1];
          var30.drawAdditive(var9Lifetime1, var10Lifetime1 - (var30.field_y >> 1), 256);
          return;
        }
        this.field_Y = (Sprite) null;
        var6 = this.field_J.getValidationState(-103);
        WidgetTextLayout var37 = (WidgetTextLayout) ((Object) this.field_r);
        var9Lifetime2 = this.field_n + param1;
        var10Lifetime2 = var37.getTextY(param3, -13372, (UiComponent) (this)) + (var37.getTextLayout((UiComponent) (this), -126).height((byte) -58) >> 1);
        if (da.field_f != var6 &&
          IsaacCipher.field_c != var6) {
          if (var6 == ra.field_k) {
            var32 = ContentTransitionDialog.field_lb[2];
            var32.drawAdditive(var9Lifetime2, var10Lifetime2 - (var32.field_y >> 1), 256);
            return;
          }
          if (CacheEntry.field_s != var6) {
            return;
          }
          var33 = ContentTransitionDialog.field_lb[1];
          var33.drawAdditive(var9Lifetime2, var10Lifetime2 - (var33.field_y >> 1), 256);
          return;
        }
        Sprite var34 = ContentTransitionDialog.field_lb[0];
        var11Lifetime2 = var34.field_n << 1;
        var12Lifetime2 = var34.field_w << 1;
        if (null == this.field_Y) {
          this.field_Y = new Sprite(var11Lifetime2, var12Lifetime2);
          fk.setSpriteRasterTarget(this.field_Y, -23095);
          var34.drawRotatedAboutPivot(112, 144, var34.field_n << 4, var34.field_w << 4, -this.field_X << 10, 4096);
          oo.popClipState(-15405);
          this.field_Y.drawAdditive(-(var34.field_n >> 1) + var9Lifetime2, var10Lifetime2 - var34.field_w, 256);
          return;
        }
        if (var11Lifetime2 > this.field_Y.field_q) {
          this.field_Y = new Sprite(var11Lifetime2, var12Lifetime2);
          fk.setSpriteRasterTarget(this.field_Y, -23095);
          var34.drawRotatedAboutPivot(112, 144, var34.field_n << 4, var34.field_w << 4, -this.field_X << 10, 4096);
          oo.popClipState(-15405);
          this.field_Y.drawAdditive(-(var34.field_n >> 1) + var9Lifetime2, var10Lifetime2 - var34.field_w, 256);
          return;
        }
        if (this.field_Y.field_y >= var12Lifetime2) {
          fk.setSpriteRasterTarget(this.field_Y, -23095);
          SoftwareRasterizer.clear();
          var34.drawRotatedAboutPivot(112, 144, var34.field_n << 4, var34.field_w << 4, -this.field_X << 10, 4096);
          oo.popClipState(-15405);
          this.field_Y.drawAdditive(-(var34.field_n >> 1) + var9Lifetime2, var10Lifetime2 - var34.field_w, 256);
          return;
        }
        this.field_Y = new Sprite(var11Lifetime2, var12Lifetime2);
        fk.setSpriteRasterTarget(this.field_Y, -23095);
        var34.drawRotatedAboutPivot(112, 144, var34.field_n << 4, var34.field_w << 4, -this.field_X << 10, 4096);
        oo.popClipState(-15405);
        this.field_Y.drawAdditive(-(var34.field_n >> 1) + var9Lifetime2, var10Lifetime2 - var34.field_w, 256);
    }

    private final static void c(boolean param0) {
        if (!param0) {
          return;
        }
        DropTargetWidget.a(IntrusiveNode.field_c, false, SectorCacheStore.field_l, mf.field_d, am.field_c);
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        String var4 = (String) null;
        BevelBoxPainter.a(param2, (String) null, param0, param1);
    }

    final static String a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 85) {
            stackIn_4_0 = PatchEnvelopeSet.decodeCp1252String(0, param1.length, (byte) -127, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("sc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 14130) {
          return;
        }
        var2 = 0;
        var3 = SoundCache.field_a;
        if (var3 < 5) {
          var2 = 8192 * (var3 * var3) / 1100;
          var4 = 1;
          var5 = 0;
          if (3 == param0) {
            var4 = -1;
          }
          if (param0 == 1) {
            var5 = 1;
          }
          if (4 == param0) {
            var5 = 1;
            var4 = 1;
          }
          if (param0 == 5) {
            var4 = -1;
            var5 = 1;
          }
          if (param0 == 6) {
            var4 = 1;
            var5 = -1;
          }
          if (7 == param0) {
            var4 = -1;
            var5 = -1;
          } else {
            if (8 == param0) {
              var4 = -1;
              var5 = -1;
            }
          }
          if (param0 == 11) {
            var4 = -1;
          }
          if (param0 == 12) {
            var4 = -1;
            var5 = -1;
          }
          if (param0 == 13) {
            var5 = -1;
            var4 = 1;
          }
          if (param0 == 14) {
            var4 = -1;
            var5 = 1;
          }
          if (param0 == 15) {
            var5 = 1;
            var4 = 1;
          }
          tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
          return;
        }
        if (var3 < 105) {
          var2 = (-40960 + 16384 * var3) / 220;
          var4Lifetime1 = 1;
          var5Lifetime1 = 0;
          if (3 == param0) {
            var4Lifetime1 = -1;
          }
          if (param0 == 1) {
            var5Lifetime1 = 1;
          }
          if (4 == param0) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          if (param0 == 5) {
            var4Lifetime1 = -1;
            var5Lifetime1 = 1;
          }
          if (param0 == 6) {
            var4Lifetime1 = 1;
            var5Lifetime1 = -1;
          }
          if (7 == param0) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          } else {
            if (8 == param0) {
              var4Lifetime1 = -1;
              var5Lifetime1 = -1;
            }
          }
          if (param0 == 11) {
            var4Lifetime1 = -1;
          }
          if (param0 == 12) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
          if (param0 == 13) {
            var5Lifetime1 = -1;
            var4Lifetime1 = 1;
          }
          if (param0 == 14) {
            var4Lifetime1 = -1;
            var5Lifetime1 = 1;
          }
          if (param0 == 15) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          tn.field_Gb = ri.a(var2 * var5Lifetime1, (byte) 66, var4Lifetime1 * var2);
          return;
        }
        if (120 <= var3) {
          var4Lifetime2 = 1;
          var5Lifetime2 = 0;
          if (3 == param0) {
            var4Lifetime2 = -1;
          }
          if (param0 == 1) {
            var5Lifetime2 = 1;
          }
          if (4 == param0) {
            var5Lifetime2 = 1;
            var4Lifetime2 = 1;
          }
          if (param0 == 5) {
            var4Lifetime2 = -1;
            var5Lifetime2 = 1;
          }
          if (param0 == 6) {
            var4Lifetime2 = 1;
            var5Lifetime2 = -1;
          }
          if (7 == param0) {
            var4Lifetime2 = -1;
            var5Lifetime2 = -1;
          } else {
            if (8 == param0) {
              var4Lifetime2 = -1;
              var5Lifetime2 = -1;
            }
          }
          if (param0 == 11) {
            var4Lifetime2 = -1;
          }
          if (param0 == 12) {
            var4Lifetime2 = -1;
            var5Lifetime2 = -1;
          }
          if (param0 == 13) {
            var5Lifetime2 = -1;
            var4Lifetime2 = 1;
          }
          if (param0 == 14) {
            var4Lifetime2 = -1;
            var5Lifetime2 = 1;
          }
          if (param0 == 15) {
            var5Lifetime2 = 1;
            var4Lifetime2 = 1;
          }
          tn.field_Gb = ri.a(var2 * var5Lifetime2, (byte) 66, var4Lifetime2 * var2);
          return;
        }
        var3 = -var3 + 120;
        var2Lifetime1 = -(8192 * var3 * var3 / 3300) + 8192;
        var4Lifetime3 = 1;
        var5Lifetime3 = 0;
        if (3 == param0) {
          var4Lifetime3 = -1;
        }
        if (param0 == 1) {
          var5Lifetime3 = 1;
        }
        if (4 == param0) {
          var5Lifetime3 = 1;
          var4Lifetime3 = 1;
        }
        if (param0 == 5) {
          var4Lifetime3 = -1;
          var5Lifetime3 = 1;
        }
        if (param0 == 6) {
          var4Lifetime3 = 1;
          var5Lifetime3 = -1;
        }
        if (7 == param0) {
          var4Lifetime3 = -1;
          var5Lifetime3 = -1;
        } else {
          if (8 == param0) {
            var4Lifetime3 = -1;
            var5Lifetime3 = -1;
          }
        }
        if (param0 == 11) {
          var4Lifetime3 = -1;
        }
        if (param0 == 12) {
          var4Lifetime3 = -1;
          var5Lifetime3 = -1;
        }
        if (param0 == 13) {
          var5Lifetime3 = -1;
          var4Lifetime3 = 1;
        }
        if (param0 == 14) {
          var4Lifetime3 = -1;
          var5Lifetime3 = 1;
        }
        if (param0 == 15) {
          var5Lifetime3 = 1;
          var4Lifetime3 = 1;
        }
        tn.field_Gb = ri.a(var2Lifetime1 * var5Lifetime3, (byte) 66, var4Lifetime3 * var2Lifetime1);
        return;
    }

    public static void releaseStatics(int param0) {
        field_Z = null;
        field_U = null;
        field_S = null;
        field_T = null;
        if (param0 == 15428) {
          field_W = null;
          field_bb = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        ValidationHelpWidget.a((byte) -71, (byte[]) null);
        field_W = null;
        field_bb = null;
    }

    final String getTooltip(boolean param0) {
        if (!param0) {
          return null;
        }
        field_Z = (String) null;
        return null;
    }

    final void updatePointer(UiComponent param0, int param1, int param2, int param3) {
        try {
          this.field_X = this.field_X + 1;
          super.updatePointer(param0, param1, param2 + 0, param3);
          if (param2 != 170) {
            ValidationHelpWidget.releaseStatics(-45);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "sc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 != 2) {
          return;
        }
        if (null == pn.field_c) {
          if (null != pn.field_c) {
            ClipState.a(pn.field_c, param0 + 0);
            return;
          }
          pn.field_c = new Sprite(param2 / 2, param1 / 2);
          pn.field_c.makeRasterTarget();
          LoginMethod.a(param2, param1, 0);
          ce.field_m.a(true);
          ClipState.a(pn.field_c, param0 + 0);
          return;
        }
        if (pn.field_c.field_n == param2 / 2) {
          if (param1 / 2 == pn.field_c.field_w) {
            if (null != pn.field_c) {
              ClipState.a(pn.field_c, param0 + 0);
              return;
            }
            pn.field_c = new Sprite(param2 / 2, param1 / 2);
            pn.field_c.makeRasterTarget();
            LoginMethod.a(param2, param1, 0);
            ce.field_m.a(true);
            ClipState.a(pn.field_c, param0 + 0);
            return;
          }
          if (mn.field_r == CheckboxPainter.field_g) {
            pn.field_c = null;
            System.gc();
          }
          if (null != pn.field_c) {
            ClipState.a(pn.field_c, param0 + 0);
            return;
          }
          pn.field_c = new Sprite(param2 / 2, param1 / 2);
          pn.field_c.makeRasterTarget();
          LoginMethod.a(param2, param1, 0);
          ce.field_m.a(true);
          ClipState.a(pn.field_c, param0 + 0);
          return;
        }
        if (mn.field_r != CheckboxPainter.field_g) {
          if (null != pn.field_c) {
            ClipState.a(pn.field_c, param0 + 0);
            return;
          }
          pn.field_c = new Sprite(param2 / 2, param1 / 2);
          pn.field_c.makeRasterTarget();
          LoginMethod.a(param2, param1, 0);
          ce.field_m.a(true);
          ClipState.a(pn.field_c, param0 + 0);
          return;
        }
        pn.field_c = null;
        System.gc();
        if (null != pn.field_c) {
          ClipState.a(pn.field_c, param0 + 0);
          return;
        }
        pn.field_c = new Sprite(param2 / 2, param1 / 2);
        pn.field_c.makeRasterTarget();
        LoginMethod.a(param2, param1, 0);
        ce.field_m.a(true);
        ClipState.a(pn.field_c, param0 + 0);
    }

    ValidationHelpWidget(ValidationProvider param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, cc.getDefaultTextPainter((byte) -65));
        try {
          this.field_J = param0;
          this.field_ab = param1;
          this.setBounds(param5, param3, param4, param2, -83);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "sc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static fk a(PcmSampleStream param0, byte param1) {
        fk var2 = null;
        RuntimeException var2_ref = null;
        fk stackIn_2_0 = null;
        fk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new fk(param0, param0);
          qn.field_mb.addLast(var2, -1);
          pc.field_e.addSubStream(param0);
          if (param1 == 68) {
            stackIn_4_0 = var2;
            return stackIn_4_0;
          }
          stackIn_2_0 = (fk) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("sc.W(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean focusNext(int param0, UiComponent param1) {
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
          stackIn_7_1 = new StringBuilder().append("sc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void i(byte param0) {
        ValidationHelpWidget.c(true);
        if (param0 >= -13) {
          ValidationHelpWidget.c(true);
        }
    }

    final static int h(byte param0) {
        if (param0 != -34) {
          ValidationHelpWidget.releaseStatics(-11);
          return qc.field_a;
        }
        return qc.field_a;
    }

    static {
        field_S = "Amid the witches' huts and rotten trees, Arcanists battle to control the arcane sources of magic within the swamp. Keep hidden, as the high concentration of power draws storms in from afar.";
        field_W = new aj(0, 2, 2, 1);
        field_U = new int[17];
        field_Z = "Waiting for graphics";
        field_T = "You cannot cast tower spells while flying";
        field_bb = "<%0> is already on your ignore list.";
    }
}
