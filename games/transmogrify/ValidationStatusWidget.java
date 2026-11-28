/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationStatusWidget extends RichTextWidget {
    static long field_G;
    private String field_J;
    private int field_K;
    static String field_I;
    private FieldValidator field_L;
    static String field_M;
    private Sprite field_H;
    static String field_F;

    final void updatePointer(int param0, byte param1, UiWidget param2, int param3) {
        try {
          this.field_K = this.field_K + 1;
          super.updatePointer(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "ob.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final String getTooltipText(int param0) {
        if (param0 == 4) {
          return null;
        }
        return (String) null;
    }

    final void drawWidget(int param0, int param1, int param2, byte param3) {
        String var5;
        rc var6;
        int var7;
        TextWidgetRenderer var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        Sprite var15;
        Sprite var16;
        Sprite var17;
        rc var6Lifetime1;
        regionExit1: {
          regionExit2: {
            regionExit3: {
              var14 = Transmogrify.field_A ? 1 : 0;
              var6 = this.field_L.getValidationStatus(27835);
              if (var6 != ek.field_a &&
                SingleChildWidgetContainer.field_u != var6) {
                var5 = this.field_L.getValidationMessage(30523);
                if (var5 == null) {
                  var5 = this.field_J;
                  break regionExit3;
                }
                if (!var5.equals(this.field_k)) {
                  break regionExit2;
                }
                break regionExit1;
              }
              var5 = bj.field_X;
            }
            if (var5.equals(this.field_k)) {
              break regionExit1;
            }
          }
          this.field_k = var5;
          this.rebuildHotspotBounds(-108);
        }
        var7 = 97 % ((77 - param3) / 34);
        super.drawWidget(param0, param1, param2, (byte) 111);
        var6Lifetime1 = this.field_L.getValidationStatus(27835);
        var9 = (TextWidgetRenderer) ((Object) this.field_q);
        var10 = param0 + this.field_p;
        var11 = var9.getTextOriginY((UiWidget) (this), 68, param1) + (var9.getTextLayout((UiWidget) (this), -2).getLayoutHeight(126) >> 1);
        if (ek.field_a != var6Lifetime1 &&
          SingleChildWidgetContainer.field_u != var6Lifetime1) {
          if (SocketConnector.field_d == var6Lifetime1) {
            var16 = ai.field_b[2];
            var16.drawAdditive(var10, var11 - (var16.field_m >> 1), 256);
          } else if (hi.field_b == var6Lifetime1) {
            var17 = ai.field_b[1];
            var17.drawAdditive(var10, -(var17.field_m >> 1) + var11, 256);
          }
        } else {
          var15 = ai.field_b[0];
          var12 = var15.field_r << 1;
          var13 = var15.field_s << 1;
          if (null != this.field_H &&
            this.field_H.field_n >= var12 &&
            var13 <= this.field_H.field_m) {
            CrossfadingMidiPcmStream.a(this.field_H, 256);
            SoftwareRasterizer.clearRaster();
          } else {
            this.field_H = new Sprite(var12, var13);
            CrossfadingMidiPcmStream.a(this.field_H, 256);
          }
          var15.drawRotatedAbout(112, 144, var15.field_r << 4, var15.field_s << 4, -this.field_K << 10, 4096);
          SingleChildWidgetContainer.c(true);
          this.field_H.drawAdditive(var10 - (var15.field_r >> 1), var11 - var15.field_s, 256);
        }
    }

    ValidationStatusWidget(FieldValidator param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, MouseWheelInput.b(true));
        try {
          this.field_J = param1;
          this.field_L = param0;
          this.setBounds(62, param3, param2, param4, param5);
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, LetterTile param2, int param3) {
        int var6 = 0;
        int var9 = 0;
        int incrementValue$0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        IndexedSprite var11 = null;
        IndexedSprite var12 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          if (null == TextLayout.field_c[param1]) {
            TextLayout.field_c[param1] = new IndexedSprite(AccountRegistrationPanel.field_K.field_n, AccountRegistrationPanel.field_K.field_m, 256);
            TextLayout.field_c[param1].field_h = hk.field_a.field_y;
          }
          if (null == tj.field_s) {
            tj.field_s = new Sprite(AccountRegistrationPanel.field_K.field_n, AccountRegistrationPanel.field_K.field_m);
          }
          tj.field_s.bindAsRenderTarget();
          SoftwareRasterizer.clearRaster();
          param2.draw(param3, -param2.y, 1, -param2.x);
          var11 = TextLayout.field_c[param1];
          var12 = var11;
          var11.field_j[0] = 0;
          var5 = param0;
          for (var6 = 0; var6 < SoftwareRasterizer.field_h.length; var6++) {
            var7 = SoftwareRasterizer.field_h[var6];
            var8 = -1;
            for (var9 = 0; var5 > var9; var9++) {
              if (~var12.field_j[var9] != ~var7) {
                continue;
              }
              var8 = var9;
              break;
            }
            if (var8 == -1) {
              var8 = var5;
              incrementValue$0 = var5;
              var5++;
              var12.field_j[incrementValue$0] = var7;
            }
            var12.field_i[var6] = (byte)var8;
          }
          DualLinkNode.field_k.setAsRasterTarget(104);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("ob.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean takeFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -11) {
            return false;
          }
          this.field_L = (FieldValidator) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ob.M(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearDeclaredStaticReferences(int param0) {
        field_M = null;
        int var1 = -3 % ((-60 - param0) / 57);
        field_F = null;
        field_I = null;
    }

    final static String a(byte param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var5Lifetime1;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          var2_int = param1.length();
          if (20 < var2_int) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(97 + (-65 + var5));
            } else if ((var5 < 97 ||
              122 < var5) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          var5Lifetime1 = -67 / ((50 - param0) / 38);
          stackIn_20_0 = new String(var8);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("ob.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static void l(int param0) {
        int var1 = -55 / ((16 - param0) / 35);
        SecondaryNodeDequeIterator.field_f = new IntrusiveDeque();
    }

    static {
        field_I = "Passwords must be between 5 and 20 characters long";
        field_M = "Previous";
    }
}
