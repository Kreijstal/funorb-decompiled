/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StatefulTextPainter extends TextWidgetPainter {
    static byte[] field_u;
    private PainterStyle[] field_w;
    static r field_t;
    private PainterStyle field_x;
    static ResourceArchive field_y;
    static String field_r;
    static int field_v;
    static UiLayoutNode field_s;

    final PainterStyle a(int param0, int param1) {
        if (param1 != -12085) {
          return (PainterStyle) null;
        }
        PainterStyle dupTemp$0 = new PainterStyle();
        this.field_w[param0] = dupTemp$0;
        return dupTemp$0;
    }

    private final void a(StatefulTextPainter param0, boolean param1, int param2) {
        int var4_int = 0;
        PainterStyle dupTemp$0 = null;
        PainterStyle stackIn_7_0 = null;
        PainterStyle stackIn_8_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        PainterStyle var5 = null;
        PainterStyle var6 = null;
        int var7 = 0;
        UiWidget var8 = null;
        var7 = Kickabout.field_G;
        try {
          super.copyStyleTo(param0, (byte) -112);
          if (param1) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_w[var4_int];
              if (var5 == null) {
                param0.field_w[var4_int] = null;
              } else {
                var6 = param0.field_w[var4_int];
                stackIn_7_0 = var5;
                if (var6 == null) {
                  dupTemp$0 = new PainterStyle();
                  param0.field_w[var4_int] = dupTemp$0;
                  stackIn_8_1 = dupTemp$0;
                } else {
                  stackIn_8_1 = var6;
                }
                ((PainterStyle) (Object) stackIn_7_0).a(stackIn_8_1, -2147483648);
              }
            }
          } else {
            ArrayOperations.a(this.field_w, 0, param0.field_w, 0, 6);
          }
          if (param2 >= -97) {
            var8 = (UiWidget) null;
            this.drawWidget(-126, true, -77, (UiWidget) null, 67);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("id.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, CharSequence param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ws.a(param2, (byte) 121)) {
            return false;
          }
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (var3_int >= 12) {
            return false;
          }
          if (!ca.a(param0, param2)) {
            return true;
          }
          if (var3_int != 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("id.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(Sprite[] param0, int param1) {
        int var4 = 0;
        PainterStyle[] var3 = null;
        PainterStyle var5 = null;
        int var6 = 0;
        PainterStyle[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Kickabout.field_G;
        try {
          if (param1 != -23952) {
            field_u = (byte[]) null;
          }
          var7 = this.field_w;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_g = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("id.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(ResourceArchive param0, ResourceArchive param1, boolean param2, ResourceArchive param3) {
        int var11_int = 0;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        IndexedSprite[] var10 = null;
        Sprite var11 = null;
        Sprite var12 = null;
        int var13 = 0;
        IndexedSprite[] var14 = null;
        Sprite var15 = null;
        int[][] var16 = null;
        Sprite var17 = null;
        Sprite var18 = null;
        int[][] var19 = null;
        ResourceArchive stackIn_3_0 = null;
        String stackIn_3_1 = null;
        boolean stackIn_4_2 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = Kickabout.field_G;
        try {
          sk.field_a = ModalStack.a(param3, -9, "commonui", "frame_top");
          vb.field_a = ModalStack.a(param3, -120, "commonui", "frame_bottom");
          KeyedLoginCredentials.field_f = wa.a((byte) 112, "commonui", param3, "jagex_logo_grey");
          IntrusiveDequeCursor.field_a = ModalStack.a(param3, -29, "commonui", "button");
          LoggedPlayer.field_g = ng.a("validation", "commonui", 2, param3);
          EmailSyntaxValidator.field_k = (BitmapFont) ((Object) RenderedFootballer.a(param1, 10, "arezzo12", param3, "commonui"));
          gf.field_a = (BitmapFont) ((Object) RenderedFootballer.a(param1, 10, "arezzo14", param3, "commonui"));
          fj.field_b = (BitmapFont) ((Object) RenderedFootballer.a(param1, 10, "arezzo14bold", param3, "commonui"));
          var17 = new Sprite(param0.takeFileByName("", "button.gif", 34), (java.awt.Component) ((Object) ic.field_d));
          stackIn_3_0 = (ResourceArchive) (param3);
          stackIn_3_1 = "commonui";
          stackIn_4_2 = !(param2);
          MyPitchScreen.a(stackIn_3_0, stackIn_3_1, stackIn_4_2, "dropdown");
          var5 = DemoIntegersCommand.a(param3, 17369, "commonui", "screen_options");
          ConsoleEvaluationException.field_d = new IndexedSprite[4];
          BallAgent.field_f = new IndexedSprite[4];
          TriangleMesh.field_Q = new IndexedSprite[4];
          var6 = new IndexedSprite[][]{TriangleMesh.field_Q, BallAgent.field_f, ConsoleEvaluationException.field_d};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_l;
          for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_m[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
              var14[var11_int] = ul.a(var5[var9], (byte) 100, var19[var11_int]);
            }
          }
          var9Lifetime1 = var17.field_w;
          tr.d(-12974);
          var17.e();
          SoftwareRasterizer.desaturateRect(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_f);
          var15 = new Sprite(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.e();
          var17.d(0, 0);
          var11 = new Sprite(var9Lifetime1, var9Lifetime1);
          var11.e();
          var17.d(-var17.field_q + var9Lifetime1, 0);
          var12 = new Sprite(-(2 * var9Lifetime1) + var17.field_q, var9Lifetime1);
          var12.e();
          var17.d(-var9Lifetime1, 0);
          TeamManagementScreen.e(119);
          IntrusiveDequeCursor.field_a = new Sprite[]{var15, var12, var11};
          if (param2) {
            StatefulTextPainter.a(false, (CharSequence) null, 'ﾺ');
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("id.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public final void drawWidget(int param0, boolean param1, int param2, UiWidget param3, int param4) {
        UiWidget stackIn_3_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        PainterStyle var7 = null;
        int var8 = 0;
        TextButton var10 = null;
        PainterStyle var11 = null;
        PainterStyle var12 = null;
        PainterStyle var13 = null;
        PainterStyle var14 = null;
        PainterStyle var15 = null;
        try {
          if (param3 instanceof TextButton) {
            stackIn_3_0 = (UiWidget) (param3);
          } else {
            stackIn_3_0 = null;
          }
          var10 = (TextButton) (stackIn_3_0);
          AuctionListing.a(param3.field_t + (param4 + param3.field_n), -22914, param3.field_t + param4, param3.field_i + (param2 + param3.field_g), param2 + param3.field_g);
          if (var10 != null) {
            param1 = param1 & var10.field_y;
          }
          var7 = this.field_w[0];
          this.field_x.a(-13136);
          var7.a(param2, -2147483648, this, param3, param4, this.field_x);
          if (var10 != null) {
            if (var10.field_A) {
              var11 = this.field_w[1];
              if (var11 != null) {
                var11.a(param2, -2147483648, this, param3, param4, this.field_x);
              }
            }
            if (var10.field_m) {
              var13 = this.field_w[3];
              if (0 != var10.field_p &&
                var13 != null) {
                var13.a(param2, -2147483648, this, param3, param4, this.field_x);
              } else {
                var12 = this.field_w[2];
                if (var12 != null) {
                  var12.a(param2, -2147483648, this, param3, param4, this.field_x);
                }
              }
            }
          }
          var8 = -44 / ((param0 - 59) / 53);
          if (param3.b(15)) {
            var14 = this.field_w[5];
            if (var14 != null) {
              var14.a(param2, -2147483648, this, param3, param4, this.field_x);
            }
          }
          if (!param1) {
            var15 = this.field_w[4];
            if (var15 != null) {
              var15.a(param2, -2147483648, this, param3, param4, this.field_x);
            }
          }
          this.field_x.a(param3, this, param2, param4, 0);
          TeamManagementScreen.e(127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_30_0 = var6;
          stackIn_30_1 = new StringBuilder().append("id.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param4).append(')').toString());
        }
    }

    public StatefulTextPainter() {
        this.field_w = new PainterStyle[6];
        this.field_x = new PainterStyle();
        PainterStyle dupTemp$0 = new PainterStyle();
        this.field_w[0] = dupTemp$0;
        PainterStyle var1 = dupTemp$0;
        var1.a(-13136);
    }

    public static void releaseStatics(int param0) {
        field_r = null;
        field_s = null;
        field_y = null;
        if (param0 > -99) {
          field_r = (String) null;
        }
        field_u = null;
        field_t = null;
    }

    StatefulTextPainter(StatefulTextPainter param0, boolean param1) {
        this();
        try {
          param0.a(this, param1, -116);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "id.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(Sprite param0, byte param1) {
        PainterStyle[] var3 = null;
        int var4 = 0;
        PainterStyle var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Kickabout.field_G;
        try {
          var3 = this.field_w;
          var4 = 0;
          if (param1 > -86) {
            StatefulTextPainter.a(false, (CharSequence) null, 'ﾴ');
          }
          while (var3.length > var4) {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_j = param0;
            }
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("id.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, Sprite[] param1, int param2) {
        int var5 = 0;
        try {
          int var4_int = -99 / ((11 - param2) / 60);
          var5 = param0;
          if (this.field_w[var5] == null) {
            this.field_w[var5] = new PainterStyle();
          }
          this.field_w[param0].field_g = param1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "id.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_u = new byte[520];
        field_t = new r();
        field_r = "Your rating is <%0>";
    }
}
