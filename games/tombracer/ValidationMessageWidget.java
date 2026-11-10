/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationMessageWidget extends HotspotTextWidget {
    static int field_K;
    private nua field_I;
    static String field_J;
    private int field_F;
    private Sprite field_H;
    static int field_G;
    private String field_E;

    final static int a(char param0, byte param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param2.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (param2.charAt(var5) == param0) {
              var3_int++;
            }
          }
          if (param1 != 93) {
            field_G = 37;
          }
          stackIn_11_0 = var3_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("sd.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean requestKeyboardFocus(UiWidget param0, boolean param1) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          var4 = (CharSequence) null;
          ValidationMessageWidget.a('+', (byte) -127, (CharSequence) null);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("sd.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void updatePointerState(int param0, int param1, UiWidget param2, int param3) {
        try {
          this.field_F = this.field_F + 1;
          super.updatePointerState(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void renderLayer(int param0, int param1, int param2, int param3) {
        it var6;
        int var9;
        int var10;
        int var13;
        String var17;
        Object var18;
        Sprite var19;
        Sprite var20;
        Object var22;
        Object var27;
        Object var31;
        Object var36;
        Object var40;
        Object var44;
        Object var50;
        WidgetTextLayout var54;
        String var5;
        int var11;
        int var12;
        Sprite var16;
        Sprite var21;
        Sprite var23;
        Sprite var24;
        Sprite var25;
        String var26;
        Sprite var28;
        Sprite var29;
        Sprite var30;
        Sprite var32;
        Sprite var33;
        Sprite var34;
        String var35;
        Sprite var37;
        Sprite var38;
        Sprite var39;
        Sprite var41;
        Sprite var42;
        Sprite var43;
        Sprite var45;
        Sprite var46;
        Sprite var47;
        Sprite var51;
        Sprite var52;
        Sprite var53;
        WidgetTextLayout var55;
        WidgetTextLayout var56;
        WidgetTextLayout var57;
        WidgetTextLayout var58;
        WidgetTextLayout var59;
        WidgetTextLayout var60;
        WidgetTextLayout var61;
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
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var9Lifetime5;
        int var10Lifetime5;
        int var11Lifetime5;
        int var12Lifetime5;
        int var9Lifetime1Lifetime1;
        int var9Lifetime2Lifetime1;
        int var10Lifetime1Lifetime1;
        int var10Lifetime2Lifetime1;
        int var11Lifetime1Lifetime1;
        int var11Lifetime2Lifetime1;
        int var12Lifetime1Lifetime1;
        int var12Lifetime2Lifetime1;
        it var6Lifetime1;
        it var6Lifetime2;
        it var6Lifetime3;
        String var5Lifetime1;
        it var6Lifetime1Lifetime1;
        var18 = null;
        var22 = null;
        var27 = null;
        var31 = null;
        var36 = null;
        var40 = null;
        var44 = null;
        var50 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        var6 = this.field_I.b(-4666);
        if (var6 == BevelOperator.field_p) {
          var17 = ko.field_g;
          if (!var17.equals(this.field_o)) {
            this.field_o = var17;
            this.b(18758);
            super.renderLayer(param0, param1, param2, param3);
            var6 = this.field_I.b(-4666);
            var54 = (WidgetTextLayout) ((Object) this.field_r);
            var9 = this.field_i + param0;
            var10 = var54.textTop(param1, (UiWidget) (this), (byte) -89) + (var54.ensureTextLayout((UiWidget) (this), 14157).getLayoutHeight(param2 - 117) >> 1);
            if (BevelOperator.field_p != var6 &&
              var6 != tea.field_b) {
              if (fp.field_c == var6) {
                var19 = CharacterChoiceFactory.field_b[2];
                var19.drawAdditive(var9, -(var19.field_q >> 1) + var10, 256);
                return;
              }
              if (var6 != LightSource.field_k) {
                return;
              }
              var20 = CharacterChoiceFactory.field_b[1];
              var20.drawAdditive(var9, -(var20.field_q >> 1) + var10, 256);
              return;
            }
            var21 = CharacterChoiceFactory.field_b[0];
            var11 = var21.field_n << 1;
            var12 = var21.field_k << 1;
            if (this.field_H != null &&
              this.field_H.field_m >= var11 &&
              var12 <= this.field_H.field_q) {
              nm.a(this.field_H, (byte) 120);
              SoftwareRasterizer.clear();
            } else {
              this.field_H = new Sprite(var11, var12);
              nm.a(this.field_H, (byte) 121);
            }
            var21.drawRotatedScaled(112, 144, var21.field_n << 4, var21.field_k << 4, -this.field_F << 10, 4096);
            pfa.a(1);
            this.field_H.drawAdditive(var9 - (var21.field_n >> 1), var10 - var21.field_k, 256);
            return;
          }
          super.renderLayer(param0, param1, param2, param3);
          var6 = this.field_I.b(-4666);
          var55 = (WidgetTextLayout) ((Object) this.field_r);
          var9Lifetime5 = this.field_i + param0;
          var10Lifetime5 = var55.textTop(param1, (UiWidget) (this), (byte) -89) + (var55.ensureTextLayout((UiWidget) (this), 14157).getLayoutHeight(param2 - 117) >> 1);
          if (BevelOperator.field_p != var6 &&
            var6 != tea.field_b) {
            if (fp.field_c == var6) {
              var23 = CharacterChoiceFactory.field_b[2];
              var23.drawAdditive(var9Lifetime5, -(var23.field_q >> 1) + var10Lifetime5, 256);
              return;
            }
            if (var6 != LightSource.field_k) {
              return;
            }
            var24 = CharacterChoiceFactory.field_b[1];
            var24.drawAdditive(var9Lifetime5, -(var24.field_q >> 1) + var10Lifetime5, 256);
            return;
          }
          var25 = CharacterChoiceFactory.field_b[0];
          var11Lifetime5 = var25.field_n << 1;
          var12Lifetime5 = var25.field_k << 1;
          if (this.field_H == null) {
            this.field_H = new Sprite(var11Lifetime5, var12Lifetime5);
            nm.a(this.field_H, (byte) 121);
          } else {
            if (this.field_H.field_m < var11Lifetime5) {
              this.field_H = new Sprite(var11Lifetime5, var12Lifetime5);
              nm.a(this.field_H, (byte) 121);
            } else {
              if (var12Lifetime5 <= this.field_H.field_q) {
                nm.a(this.field_H, (byte) 120);
                SoftwareRasterizer.clear();
              } else {
                this.field_H = new Sprite(var11Lifetime5, var12Lifetime5);
                nm.a(this.field_H, (byte) 121);
              }
            }
          }
          var25.drawRotatedScaled(112, 144, var25.field_n << 4, var25.field_k << 4, -this.field_F << 10, 4096);
          pfa.a(1);
          this.field_H.drawAdditive(var9Lifetime5 - (var25.field_n >> 1), var10Lifetime5 - var25.field_k, 256);
          return;
        }
        if (tea.field_b == var6) {
          var26 = ko.field_g;
          if (!var26.equals(this.field_o)) {
            this.field_o = var26;
            this.b(18758);
            super.renderLayer(param0, param1, param2, param3);
            var6 = this.field_I.b(-4666);
            var56 = (WidgetTextLayout) ((Object) this.field_r);
            var9Lifetime1 = this.field_i + param0;
            var10Lifetime1 = var56.textTop(param1, (UiWidget) (this), (byte) -89) + (var56.ensureTextLayout((UiWidget) (this), 14157).getLayoutHeight(param2 - 117) >> 1);
            if (BevelOperator.field_p != var6 &&
              var6 != tea.field_b) {
              if (fp.field_c == var6) {
                var28 = CharacterChoiceFactory.field_b[2];
                var28.drawAdditive(var9Lifetime1, -(var28.field_q >> 1) + var10Lifetime1, 256);
                return;
              }
              if (var6 != LightSource.field_k) {
                return;
              }
              var29 = CharacterChoiceFactory.field_b[1];
              var29.drawAdditive(var9Lifetime1, -(var29.field_q >> 1) + var10Lifetime1, 256);
              return;
            }
            var30 = CharacterChoiceFactory.field_b[0];
            var11Lifetime1 = var30.field_n << 1;
            var12Lifetime1 = var30.field_k << 1;
            if (this.field_H != null &&
              this.field_H.field_m >= var11Lifetime1 &&
              var12Lifetime1 <= this.field_H.field_q) {
              nm.a(this.field_H, (byte) 120);
              SoftwareRasterizer.clear();
            } else {
              this.field_H = new Sprite(var11Lifetime1, var12Lifetime1);
              nm.a(this.field_H, (byte) 121);
            }
            var30.drawRotatedScaled(112, 144, var30.field_n << 4, var30.field_k << 4, -this.field_F << 10, 4096);
            pfa.a(1);
            this.field_H.drawAdditive(var9Lifetime1 - (var30.field_n >> 1), var10Lifetime1 - var30.field_k, 256);
            return;
          }
          super.renderLayer(param0, param1, param2, param3);
          var6 = this.field_I.b(-4666);
          var57 = (WidgetTextLayout) ((Object) this.field_r);
          var9Lifetime1Lifetime1 = this.field_i + param0;
          var10Lifetime1Lifetime1 = var57.textTop(param1, (UiWidget) (this), (byte) -89) + (var57.ensureTextLayout((UiWidget) (this), 14157).getLayoutHeight(param2 - 117) >> 1);
          if (BevelOperator.field_p != var6 &&
            var6 != tea.field_b) {
            if (fp.field_c == var6) {
              var32 = CharacterChoiceFactory.field_b[2];
              var32.drawAdditive(var9Lifetime1Lifetime1, -(var32.field_q >> 1) + var10Lifetime1Lifetime1, 256);
              return;
            }
            if (var6 != LightSource.field_k) {
              return;
            }
            var33 = CharacterChoiceFactory.field_b[1];
            var33.drawAdditive(var9Lifetime1Lifetime1, -(var33.field_q >> 1) + var10Lifetime1Lifetime1, 256);
            return;
          }
          var34 = CharacterChoiceFactory.field_b[0];
          var11Lifetime1Lifetime1 = var34.field_n << 1;
          var12Lifetime1Lifetime1 = var34.field_k << 1;
          if (this.field_H == null) {
            this.field_H = new Sprite(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
            nm.a(this.field_H, (byte) 121);
          } else {
            if (this.field_H.field_m < var11Lifetime1Lifetime1) {
              this.field_H = new Sprite(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
              nm.a(this.field_H, (byte) 121);
            } else {
              if (var12Lifetime1Lifetime1 <= this.field_H.field_q) {
                nm.a(this.field_H, (byte) 120);
                SoftwareRasterizer.clear();
              } else {
                this.field_H = new Sprite(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
                nm.a(this.field_H, (byte) 121);
              }
            }
          }
          var34.drawRotatedScaled(112, 144, var34.field_n << 4, var34.field_k << 4, -this.field_F << 10, 4096);
          pfa.a(1);
          this.field_H.drawAdditive(var9Lifetime1Lifetime1 - (var34.field_n >> 1), var10Lifetime1Lifetime1 - var34.field_k, 256);
          return;
        }
        var5 = this.field_I.a(101);
        if (var5 != null) {
          if (var5.equals(this.field_o)) {
            super.renderLayer(param0, param1, param2, param3);
            var6Lifetime1 = this.field_I.b(-4666);
            var61 = (WidgetTextLayout) ((Object) this.field_r);
            var9Lifetime2 = this.field_i + param0;
            var10Lifetime2 = var61.textTop(param1, (UiWidget) (this), (byte) -89) + (var61.ensureTextLayout((UiWidget) (this), 14157).getLayoutHeight(param2 - 117) >> 1);
            if (BevelOperator.field_p != var6Lifetime1 &&
              var6Lifetime1 != tea.field_b) {
              if (fp.field_c == var6Lifetime1) {
                var51 = CharacterChoiceFactory.field_b[2];
                var51.drawAdditive(var9Lifetime2, -(var51.field_q >> 1) + var10Lifetime2, 256);
                return;
              }
              if (var6Lifetime1 != LightSource.field_k) {
                return;
              }
              var52 = CharacterChoiceFactory.field_b[1];
              var52.drawAdditive(var9Lifetime2, -(var52.field_q >> 1) + var10Lifetime2, 256);
              return;
            }
            var53 = CharacterChoiceFactory.field_b[0];
            var11Lifetime2 = var53.field_n << 1;
            var12Lifetime2 = var53.field_k << 1;
            if (this.field_H != null &&
              this.field_H.field_m >= var11Lifetime2 &&
              var12Lifetime2 <= this.field_H.field_q) {
              nm.a(this.field_H, (byte) 120);
              SoftwareRasterizer.clear();
            } else {
              this.field_H = new Sprite(var11Lifetime2, var12Lifetime2);
              nm.a(this.field_H, (byte) 121);
            }
            var53.drawRotatedScaled(112, 144, var53.field_n << 4, var53.field_k << 4, -this.field_F << 10, 4096);
            pfa.a(1);
            this.field_H.drawAdditive(var9Lifetime2 - (var53.field_n >> 1), var10Lifetime2 - var53.field_k, 256);
            return;
          }
          this.field_o = var5;
          this.b(18758);
          super.renderLayer(param0, param1, param2, param3);
          var6Lifetime1Lifetime1 = this.field_I.b(-4666);
          var60 = (WidgetTextLayout) ((Object) this.field_r);
          var9Lifetime2Lifetime1 = this.field_i + param0;
          var10Lifetime2Lifetime1 = var60.textTop(param1, (UiWidget) (this), (byte) -89) + (var60.ensureTextLayout((UiWidget) (this), 14157).getLayoutHeight(param2 - 117) >> 1);
          if (BevelOperator.field_p != var6Lifetime1Lifetime1 &&
            var6Lifetime1Lifetime1 != tea.field_b) {
            if (fp.field_c == var6Lifetime1Lifetime1) {
              var45 = CharacterChoiceFactory.field_b[2];
              var45.drawAdditive(var9Lifetime2Lifetime1, -(var45.field_q >> 1) + var10Lifetime2Lifetime1, 256);
              return;
            }
            if (var6Lifetime1Lifetime1 != LightSource.field_k) {
              return;
            }
            var46 = CharacterChoiceFactory.field_b[1];
            var46.drawAdditive(var9Lifetime2Lifetime1, -(var46.field_q >> 1) + var10Lifetime2Lifetime1, 256);
            return;
          }
          var47 = CharacterChoiceFactory.field_b[0];
          var16 = var47;
          var11Lifetime2Lifetime1 = var47.field_n << 1;
          var12Lifetime2Lifetime1 = var47.field_k << 1;
          if (this.field_H == null) {
            this.field_H = new Sprite(var11Lifetime2Lifetime1, var12Lifetime2Lifetime1);
            nm.a(this.field_H, (byte) 121);
          } else {
            if (this.field_H.field_m < var11Lifetime2Lifetime1) {
              this.field_H = new Sprite(var11Lifetime2Lifetime1, var12Lifetime2Lifetime1);
              nm.a(this.field_H, (byte) 121);
            } else {
              if (var12Lifetime2Lifetime1 <= this.field_H.field_q) {
                nm.a(this.field_H, (byte) 120);
                SoftwareRasterizer.clear();
              } else {
                this.field_H = new Sprite(var11Lifetime2Lifetime1, var12Lifetime2Lifetime1);
                nm.a(this.field_H, (byte) 121);
              }
            }
          }
          var47.drawRotatedScaled(112, 144, var47.field_n << 4, var47.field_k << 4, -this.field_F << 10, 4096);
          pfa.a(1);
          this.field_H.drawAdditive(var9Lifetime2Lifetime1 - (var47.field_n >> 1), var10Lifetime2Lifetime1 - var47.field_k, 256);
          return;
        }
        var35 = this.field_E;
        var5Lifetime1 = var35;
        if (!var35.equals(this.field_o)) {
          this.field_o = var35;
          this.b(18758);
          super.renderLayer(param0, param1, param2, param3);
          var6Lifetime2 = this.field_I.b(-4666);
          var58 = (WidgetTextLayout) ((Object) this.field_r);
          var9Lifetime3 = this.field_i + param0;
          var10Lifetime3 = var58.textTop(param1, (UiWidget) (this), (byte) -89) + (var58.ensureTextLayout((UiWidget) (this), 14157).getLayoutHeight(param2 - 117) >> 1);
          if (BevelOperator.field_p != var6Lifetime2 &&
            var6Lifetime2 != tea.field_b) {
            if (fp.field_c == var6Lifetime2) {
              var37 = CharacterChoiceFactory.field_b[2];
              var37.drawAdditive(var9Lifetime3, -(var37.field_q >> 1) + var10Lifetime3, 256);
              return;
            }
            if (var6Lifetime2 != LightSource.field_k) {
              return;
            }
            var38 = CharacterChoiceFactory.field_b[1];
            var38.drawAdditive(var9Lifetime3, -(var38.field_q >> 1) + var10Lifetime3, 256);
            return;
          }
          var39 = CharacterChoiceFactory.field_b[0];
          var11Lifetime3 = var39.field_n << 1;
          var12Lifetime3 = var39.field_k << 1;
          if (this.field_H != null &&
            this.field_H.field_m >= var11Lifetime3 &&
            var12Lifetime3 <= this.field_H.field_q) {
            nm.a(this.field_H, (byte) 120);
            SoftwareRasterizer.clear();
          } else {
            this.field_H = new Sprite(var11Lifetime3, var12Lifetime3);
            nm.a(this.field_H, (byte) 121);
          }
          var39.drawRotatedScaled(112, 144, var39.field_n << 4, var39.field_k << 4, -this.field_F << 10, 4096);
          pfa.a(1);
          this.field_H.drawAdditive(var9Lifetime3 - (var39.field_n >> 1), var10Lifetime3 - var39.field_k, 256);
          return;
        }
        super.renderLayer(param0, param1, param2, param3);
        var6Lifetime3 = this.field_I.b(-4666);
        var59 = (WidgetTextLayout) ((Object) this.field_r);
        var9Lifetime4 = this.field_i + param0;
        var10Lifetime4 = var59.textTop(param1, (UiWidget) (this), (byte) -89) + (var59.ensureTextLayout((UiWidget) (this), 14157).getLayoutHeight(param2 - 117) >> 1);
        if (BevelOperator.field_p != var6Lifetime3 &&
          var6Lifetime3 != tea.field_b) {
          if (fp.field_c == var6Lifetime3) {
            var41 = CharacterChoiceFactory.field_b[2];
            var41.drawAdditive(var9Lifetime4, -(var41.field_q >> 1) + var10Lifetime4, 256);
            return;
          }
          if (var6Lifetime3 != LightSource.field_k) {
            return;
          }
          var42 = CharacterChoiceFactory.field_b[1];
          var42.drawAdditive(var9Lifetime4, -(var42.field_q >> 1) + var10Lifetime4, 256);
          return;
        }
        var43 = CharacterChoiceFactory.field_b[0];
        var11Lifetime4 = var43.field_n << 1;
        var12Lifetime4 = var43.field_k << 1;
        if (this.field_H == null) {
          this.field_H = new Sprite(var11Lifetime4, var12Lifetime4);
          nm.a(this.field_H, (byte) 121);
        } else {
          if (this.field_H.field_m < var11Lifetime4) {
            this.field_H = new Sprite(var11Lifetime4, var12Lifetime4);
            nm.a(this.field_H, (byte) 121);
          } else {
            if (var12Lifetime4 > this.field_H.field_q) {
              this.field_H = new Sprite(var11Lifetime4, var12Lifetime4);
              nm.a(this.field_H, (byte) 121);
            } else {
              nm.a(this.field_H, (byte) 120);
              SoftwareRasterizer.clear();
            }
          }
        }
        var43.drawRotatedScaled(112, 144, var43.field_n << 4, var43.field_k << 4, -this.field_F << 10, 4096);
        pfa.a(1);
        this.field_H.drawAdditive(var9Lifetime4 - (var43.field_n >> 1), var10Lifetime4 - var43.field_k, 256);
        return;
    }

    ValidationMessageWidget(nua param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, nk.a(-21819));
        try {
          this.field_I = param0;
          this.field_E = param1;
          this.setBounds((byte) -31, param4, param5, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 10) {
          field_J = (String) null;
          field_J = null;
          return;
        }
        field_J = null;
    }

    final String getHoverText(byte param0) {
        int var2 = -89 / ((param0 + 58) / 60);
        return null;
    }

    static {
        field_J = "ESC - cancel this line";
    }
}
