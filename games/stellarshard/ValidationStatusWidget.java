/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationStatusWidget extends RichTextWidget {
    private int field_N;
    private String field_Q;
    static String field_P;
    private Sprite field_O;
    static qd field_L;
    private FieldValidator field_R;

    ValidationStatusWidget(FieldValidator param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, DialogMessagePane.a(0));
        try {
          this.field_R = param0;
          this.field_Q = param1;
          this.setBounds(param4, param2, param3, param5, 23987);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "cd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean e(byte param0) {
        if (ue.field_b == -1) {
          if (!GameEntity.b(64, 1)) {
            return false;
          }
          ue.field_b = EditableTextField.field_N.readUnsignedByte(4);
          EditableTextField.field_N.position = 0;
        }
        if (param0 <= 111) {
          ValidationStatusWidget.e((byte) -125);
          if (ue.field_b != -2) {
            return GameEntity.b(64, ue.field_b);
          }
          if (!GameEntity.b(64, 2)) {
            return false;
          }
          ue.field_b = EditableTextField.field_N.readUnsignedShort((byte) 37);
          EditableTextField.field_N.position = 0;
          return GameEntity.b(64, ue.field_b);
        }
        if (ue.field_b != -2) {
          return GameEntity.b(64, ue.field_b);
        }
        if (!GameEntity.b(64, 2)) {
          return false;
        }
        ue.field_b = EditableTextField.field_N.readUnsignedShort((byte) 37);
        EditableTextField.field_N.position = 0;
        return GameEntity.b(64, ue.field_b);
    }

    final void updatePointer(int param0, boolean param1, int param2, UiWidget param3) {
        try {
          this.field_N = this.field_N + 1;
          super.updatePointer(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "cd.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_L = null;
        field_P = null;
        int var1 = -117 % ((71 - param0) / 50);
    }

    final String getTooltipText(int param0) {
        if (param0 == 3690) {
          return null;
        }
        ValidationStatusWidget.h(9);
        return null;
    }

    final static void a(int param0, boolean param1, sk param2, int param3, boolean param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        try {
          dj.field_b[0] = ValidatedTextField.field_P.nextInt();
          dj.field_b[1] = ValidatedTextField.field_P.nextInt();
          dj.field_b[3] = (int)ob.field_a;
          AccountRequestState.field_c.position = 0;
          dj.field_b[2] = (int)(ob.field_a >> 32);
          AccountRequestState.field_c.writeInt(0, dj.field_b[0]);
          AccountRequestState.field_c.writeInt(0, dj.field_b[1]);
          AccountRequestState.field_c.writeInt(0, dj.field_b[2]);
          AccountRequestState.field_c.writeInt(0, dj.field_b[3]);
          ca.a(AccountRequestState.field_c, -23074);
          AccountRequestState.field_c.writeShort(param3, -113);
          param2.a(95, AccountRequestState.field_c);
          StandardContentDialog.field_fb.position = 0;
          var5_int = -4 / ((param0 + 7) / 61);
          if (!param4) {
            StandardContentDialog.field_fb.writeByte(false, 16);
          } else {
            StandardContentDialog.field_fb.writeByte(false, 18);
          }
          StandardContentDialog.field_fb.position = StandardContentDialog.field_fb.position + 2;
          var6 = StandardContentDialog.field_fb.position;
          StandardContentDialog.field_fb.writeInt(0, t.field_f);
          StandardContentDialog.field_fb.writeLong((byte) 127, od.field_z);
          var7 = 0;
          if (TextLineMetrics.field_f) {
            var7 = var7 | 1;
          }
          if (ProxyAuthenticationRequiredException.field_b) {
            var7 = var7 | 4;
          }
          if (param1) {
            var7 = var7 | 8;
          }
          if (null != pk.field_b) {
            var7 = var7 | 16;
          }
          StandardContentDialog.field_fb.writeByte(false, var7);
          var8 = dd.a(0, hf.a((byte) -103));
          if (var8 == null) {
            var8 = "";
          }
          StandardContentDialog.field_fb.writeString(var8, -9799);
          if (null != pk.field_b) {
            StandardContentDialog.field_fb.writePrefixedString(126, pk.field_b);
          }
          ha.a(fj.field_l, StandardContentDialog.field_fb, AccountRequestState.field_c, -104, u.field_o);
          StandardContentDialog.field_fb.backpatchShortLength(-1, StandardContentDialog.field_fb.position - var6);
          ue.a((byte) -88, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("cd.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void drawWidget(int param0, byte param1, int param2, int param3) {
        String var5;
        cg var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        String var17;
        Object var18;
        Sprite var19;
        Sprite var20;
        Sprite var21;
        String var22;
        Object var23;
        Sprite var24;
        Sprite var25;
        Sprite var26;
        String var27;
        Object var28;
        Sprite var29;
        Sprite var30;
        Sprite var31;
        Object var32;
        Sprite var33;
        Sprite var34;
        Sprite var35;
        Object var36;
        Sprite var37;
        Sprite var38;
        Sprite var39;
        Sprite var40;
        TextWidgetRenderer var41;
        TextWidgetRenderer var42;
        TextWidgetRenderer var43;
        TextWidgetRenderer var44;
        TextWidgetRenderer var45;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var12Lifetime5;
        cg var6Lifetime1;
        cg var6Lifetime2;
        cg var6Lifetime3;
        var18 = null;
        var23 = null;
        var28 = null;
        var32 = null;
        var36 = null;
        var13 = stellarshard.field_B;
        var6 = this.field_R.getValidationStatus(-28036);
        if (var6 == eh.field_c) {
          var17 = ModalDialog.field_D;
          if (!var17.equals(this.field_m)) {
            this.field_m = var17;
            this.rebuildHotspotBounds((byte) -92);
          }
          super.drawWidget(param0, param1, param2, param3);
          var6 = this.field_R.getValidationStatus(param1 ^ 28091);
          var41 = (TextWidgetRenderer) ((Object) this.field_u);
          var9 = this.field_w + param3;
          var10 = var41.getTextOriginY((byte) 117, (UiWidget) (this), param2) + (var41.getTextLayout((UiWidget) (this), (byte) 111).getLayoutHeight(17201) >> 1);
          if (eh.field_c != var6 &&
            var6 != TextLayout.field_d) {
            if (var6 == qj.field_c) {
              var21 = DualLinkNode.field_p[2];
              var21.drawAdditive(var9, -(var21.field_y >> 1) + var10, 256);
              return;
            }
            if (var6 != lg.field_c) {
              return;
            }
            var20 = DualLinkNode.field_p[1];
            var20.drawAdditive(var9, var10 - (var20.field_y >> 1), 256);
            return;
          }
          var19 = DualLinkNode.field_p[0];
          var11 = var19.field_w << 1;
          var12 = var19.field_x << 1;
          if (null == this.field_O) {
            this.field_O = new Sprite(var11, var12);
            hj.a(this.field_O, param1 ^ -58);
          } else {
            if (this.field_O.field_v < var11) {
              this.field_O = new Sprite(var11, var12);
              hj.a(this.field_O, param1 ^ -58);
            } else {
              if (var12 > this.field_O.field_y) {
                this.field_O = new Sprite(var11, var12);
                hj.a(this.field_O, param1 ^ -58);
              } else {
                hj.a(this.field_O, param1 ^ -58);
                SoftwareRasterizer.clearRaster();
              }
            }
          }
          var19.drawRotatedAboutBilinear(112, 144, var19.field_w << 4, var19.field_x << 4, -this.field_N << 10, 4096);
          DefaultTextWidgetRenderer.b((byte) -58);
          this.field_O.drawAdditive(var9 - (var19.field_w >> 1), -var19.field_x + var10, 256);
          return;
        }
        if (var6 == TextLayout.field_d) {
          var22 = ModalDialog.field_D;
          if (!var22.equals(this.field_m)) {
            this.field_m = var22;
            this.rebuildHotspotBounds((byte) -92);
          }
          super.drawWidget(param0, param1, param2, param3);
          var6 = this.field_R.getValidationStatus(param1 ^ 28091);
          var42 = (TextWidgetRenderer) ((Object) this.field_u);
          var9Lifetime1 = this.field_w + param3;
          var10Lifetime1 = var42.getTextOriginY((byte) 117, (UiWidget) (this), param2) + (var42.getTextLayout((UiWidget) (this), (byte) 111).getLayoutHeight(17201) >> 1);
          if (eh.field_c != var6 &&
            var6 != TextLayout.field_d) {
            if (var6 == qj.field_c) {
              var26 = DualLinkNode.field_p[2];
              var26.drawAdditive(var9Lifetime1, -(var26.field_y >> 1) + var10Lifetime1, 256);
              return;
            }
            if (var6 != lg.field_c) {
              return;
            }
            var25 = DualLinkNode.field_p[1];
            var25.drawAdditive(var9Lifetime1, var10Lifetime1 - (var25.field_y >> 1), 256);
            return;
          }
          var24 = DualLinkNode.field_p[0];
          var11Lifetime1 = var24.field_w << 1;
          var12Lifetime1 = var24.field_x << 1;
          if (null == this.field_O) {
            this.field_O = new Sprite(var11Lifetime1, var12Lifetime1);
            hj.a(this.field_O, param1 ^ -58);
          } else {
            if (this.field_O.field_v < var11Lifetime1) {
              this.field_O = new Sprite(var11Lifetime1, var12Lifetime1);
              hj.a(this.field_O, param1 ^ -58);
            } else {
              if (var12Lifetime1 > this.field_O.field_y) {
                this.field_O = new Sprite(var11Lifetime1, var12Lifetime1);
                hj.a(this.field_O, param1 ^ -58);
              } else {
                hj.a(this.field_O, param1 ^ -58);
                SoftwareRasterizer.clearRaster();
              }
            }
          }
          var24.drawRotatedAboutBilinear(112, 144, var24.field_w << 4, var24.field_x << 4, -this.field_N << 10, 4096);
          DefaultTextWidgetRenderer.b((byte) -58);
          this.field_O.drawAdditive(var9Lifetime1 - (var24.field_w >> 1), -var24.field_x + var10Lifetime1, 256);
          return;
        }
        var5 = this.field_R.getValidationMessage(-22773);
        if (var5 == null) {
          var27 = this.field_Q;
          var5 = var27;
          if (!var27.equals(this.field_m)) {
            this.field_m = var27;
            this.rebuildHotspotBounds((byte) -92);
          }
          super.drawWidget(param0, param1, param2, param3);
          var6Lifetime1 = this.field_R.getValidationStatus(param1 ^ 28091);
          var43 = (TextWidgetRenderer) ((Object) this.field_u);
          var9Lifetime2 = this.field_w + param3;
          var10Lifetime2 = var43.getTextOriginY((byte) 117, (UiWidget) (this), param2) + (var43.getTextLayout((UiWidget) (this), (byte) 111).getLayoutHeight(17201) >> 1);
          if (eh.field_c != var6Lifetime1 &&
            var6Lifetime1 != TextLayout.field_d) {
            if (var6Lifetime1 == qj.field_c) {
              var31 = DualLinkNode.field_p[2];
              var31.drawAdditive(var9Lifetime2, -(var31.field_y >> 1) + var10Lifetime2, 256);
              return;
            }
            if (var6Lifetime1 != lg.field_c) {
              return;
            }
            var30 = DualLinkNode.field_p[1];
            var30.drawAdditive(var9Lifetime2, var10Lifetime2 - (var30.field_y >> 1), 256);
            return;
          }
          var29 = DualLinkNode.field_p[0];
          var11Lifetime2 = var29.field_w << 1;
          var12Lifetime2 = var29.field_x << 1;
          if (null == this.field_O) {
            this.field_O = new Sprite(var11Lifetime2, var12Lifetime2);
            hj.a(this.field_O, param1 ^ -58);
          } else {
            if (this.field_O.field_v < var11Lifetime2) {
              this.field_O = new Sprite(var11Lifetime2, var12Lifetime2);
              hj.a(this.field_O, param1 ^ -58);
            } else {
              if (var12Lifetime2 <= this.field_O.field_y) {
                hj.a(this.field_O, param1 ^ -58);
                SoftwareRasterizer.clearRaster();
              } else {
                this.field_O = new Sprite(var11Lifetime2, var12Lifetime2);
                hj.a(this.field_O, param1 ^ -58);
              }
            }
          }
          var29.drawRotatedAboutBilinear(112, 144, var29.field_w << 4, var29.field_x << 4, -this.field_N << 10, 4096);
          DefaultTextWidgetRenderer.b((byte) -58);
          this.field_O.drawAdditive(var9Lifetime2 - (var29.field_w >> 1), -var29.field_x + var10Lifetime2, 256);
          return;
        }
        if (!var5.equals(this.field_m)) {
          this.field_m = var5;
          this.rebuildHotspotBounds((byte) -92);
          super.drawWidget(param0, param1, param2, param3);
          var6Lifetime2 = this.field_R.getValidationStatus(param1 ^ 28091);
          var44 = (TextWidgetRenderer) ((Object) this.field_u);
          var9Lifetime3 = this.field_w + param3;
          var10Lifetime3 = var44.getTextOriginY((byte) 117, (UiWidget) (this), param2) + (var44.getTextLayout((UiWidget) (this), (byte) 111).getLayoutHeight(17201) >> 1);
          if (eh.field_c != var6Lifetime2 &&
            var6Lifetime2 != TextLayout.field_d) {
            if (var6Lifetime2 == qj.field_c) {
              var35 = DualLinkNode.field_p[2];
              var35.drawAdditive(var9Lifetime3, -(var35.field_y >> 1) + var10Lifetime3, 256);
              return;
            }
            if (var6Lifetime2 != lg.field_c) {
              return;
            }
            var34 = DualLinkNode.field_p[1];
            var34.drawAdditive(var9Lifetime3, var10Lifetime3 - (var34.field_y >> 1), 256);
            return;
          }
          var33 = DualLinkNode.field_p[0];
          var11Lifetime3 = var33.field_w << 1;
          var12Lifetime3 = var33.field_x << 1;
          if (null == this.field_O) {
            this.field_O = new Sprite(var11Lifetime3, var12Lifetime3);
            hj.a(this.field_O, param1 ^ -58);
          } else {
            if (this.field_O.field_v < var11Lifetime3) {
              this.field_O = new Sprite(var11Lifetime3, var12Lifetime3);
              hj.a(this.field_O, param1 ^ -58);
            } else {
              if (var12Lifetime3 <= this.field_O.field_y) {
                hj.a(this.field_O, param1 ^ -58);
                SoftwareRasterizer.clearRaster();
              } else {
                this.field_O = new Sprite(var11Lifetime3, var12Lifetime3);
                hj.a(this.field_O, param1 ^ -58);
              }
            }
          }
          var33.drawRotatedAboutBilinear(112, 144, var33.field_w << 4, var33.field_x << 4, -this.field_N << 10, 4096);
          DefaultTextWidgetRenderer.b((byte) -58);
          this.field_O.drawAdditive(var9Lifetime3 - (var33.field_w >> 1), -var33.field_x + var10Lifetime3, 256);
          return;
        }
        super.drawWidget(param0, param1, param2, param3);
        var6Lifetime3 = this.field_R.getValidationStatus(param1 ^ 28091);
        var45 = (TextWidgetRenderer) ((Object) this.field_u);
        var9Lifetime4 = this.field_w + param3;
        var10Lifetime4 = var45.getTextOriginY((byte) 117, (UiWidget) (this), param2) + (var45.getTextLayout((UiWidget) (this), (byte) 111).getLayoutHeight(17201) >> 1);
        if (eh.field_c == var6Lifetime3) {
          var38 = DualLinkNode.field_p[0];
          var11Lifetime4 = var38.field_w << 1;
          var12Lifetime4 = var38.field_x << 1;
          if (null == this.field_O) {
            this.field_O = new Sprite(var11Lifetime4, var12Lifetime4);
            hj.a(this.field_O, param1 ^ -58);
          } else {
            if (this.field_O.field_v < var11Lifetime4) {
              this.field_O = new Sprite(var11Lifetime4, var12Lifetime4);
              hj.a(this.field_O, param1 ^ -58);
            } else {
              if (var12Lifetime4 <= this.field_O.field_y) {
                hj.a(this.field_O, param1 ^ -58);
                SoftwareRasterizer.clearRaster();
              } else {
                this.field_O = new Sprite(var11Lifetime4, var12Lifetime4);
                hj.a(this.field_O, param1 ^ -58);
              }
            }
          }
          var38.drawRotatedAboutBilinear(112, 144, var38.field_w << 4, var38.field_x << 4, -this.field_N << 10, 4096);
          DefaultTextWidgetRenderer.b((byte) -58);
          this.field_O.drawAdditive(var9Lifetime4 - (var38.field_w >> 1), -var38.field_x + var10Lifetime4, 256);
          return;
        }
        if (var6Lifetime3 != TextLayout.field_d) {
          if (var6Lifetime3 == qj.field_c) {
            var40 = DualLinkNode.field_p[2];
            var40.drawAdditive(var9Lifetime4, -(var40.field_y >> 1) + var10Lifetime4, 256);
            return;
          }
          if (var6Lifetime3 != lg.field_c) {
            return;
          }
          var39 = DualLinkNode.field_p[1];
          var39.drawAdditive(var9Lifetime4, var10Lifetime4 - (var39.field_y >> 1), 256);
          return;
        }
        var37 = DualLinkNode.field_p[0];
        var11Lifetime5 = var37.field_w << 1;
        var12Lifetime5 = var37.field_x << 1;
        if (null != this.field_O &&
          this.field_O.field_v >= var11Lifetime5) {
          if (var12Lifetime5 <= this.field_O.field_y) {
            hj.a(this.field_O, param1 ^ -58);
            SoftwareRasterizer.clearRaster();
          } else {
            this.field_O = new Sprite(var11Lifetime5, var12Lifetime5);
            hj.a(this.field_O, param1 ^ -58);
          }
        } else {
          this.field_O = new Sprite(var11Lifetime5, var12Lifetime5);
          hj.a(this.field_O, param1 ^ -58);
        }
        var37.drawRotatedAboutBilinear(112, 144, var37.field_w << 4, var37.field_x << 4, -this.field_N << 10, 4096);
        DefaultTextWidgetRenderer.b((byte) -58);
        this.field_O.drawAdditive(var9Lifetime4 - (var37.field_w >> 1), -var37.field_x + var10Lifetime4, 256);
    }

    final static String h(int param0) {
        if (DiskCacheWorker.field_f < 2) {
          return IntrusiveDequeCursor.field_d;
        }
        if (null != StandardContentDialog.field_db) {
          if (!StandardContentDialog.field_db.ensureIndexLoaded((byte) -36)) {
            return RichTextWidget.field_I;
          }
          return kf.field_d;
        }
        if (!TextFieldValidator.field_i.ensureIndexLoaded((byte) -36)) {
          return lg.field_e;
        }
        if (!TextFieldValidator.field_i.tryLoadGroupByName("commonui", (byte) -109)) {
          return am.field_e + " - " + TextFieldValidator.field_i.getGroupLoadPercentByName(0, "commonui") + "%";
        }
        if (!wf.field_e.ensureIndexLoaded((byte) -36)) {
          return mb.field_c;
        }
        if (param0 != -1064120735) {
          field_L = (qd) null;
        }
        if (!wf.field_e.tryLoadGroupByName("commonui", (byte) -109)) {
          return le.field_l + " - " + wf.field_e.getGroupLoadPercentByName(0, "commonui") + "%";
        }
        if (!am.field_g.ensureIndexLoaded((byte) -36)) {
          return ve.field_b;
        }
        if (!am.field_g.tryLoadAllGroups((byte) -111)) {
          return DisplayNameSelectionPanel.field_B + " - " + am.field_g.getArchiveLoadPercent((byte) 1) + "%";
        }
        return ContentTransitionDialog.field_W;
    }

    final boolean takeFocus(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -2147483648) {
            return false;
          }
          this.field_Q = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cd.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_P = "Collect me";
    }
}
