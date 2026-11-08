/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class StatusBar {
    static String field_b;
    static int[] field_a;
    int field_h;
    private int field_g;
    private int field_e;
    static byte[] field_d;
    static ConnectionState field_l;
    static String field_f;
    static BitmapFont field_j;
    static String field_i;
    static String field_c;
    static int field_k;

    final static void sendNameRequest(long param0, int param1, int param2) {
        int var5 = 0;
        CipherPacketBuffer var4 = ChatMessage.field_f;
        int var5Lifetime1;
        var4.writeOpcode(param1, 15514);
        if (param2 == -26231) {
          var4.position = var4.position + 1;
          var5 = var4.position;
          var4.writeByte(160, 6);
          var4.writeLong(false, param0);
          var4.backpatchByteLength(var4.position - var5, -1);
          return;
        }
        StatusBar.sendNameRequest(18L, -62, 23);
        var4.position = var4.position + 1;
        var5Lifetime1 = var4.position;
        var4.writeByte(160, 6);
        var4.writeLong(false, param0);
        var4.backpatchByteLength(var4.position - var5Lifetime1, -1);
    }

    void tick(byte param0) {
        int var2;
        this.field_e = this.field_e + this.field_g;
        var2 = HelpPopup.field_Gb.field_A << 16;
        if (this.field_e > var2) {
          this.field_e = this.field_e - var2;
        }
        if (0 < this.field_h) {
          this.field_h = this.field_h - 12;
          if (this.field_h < 0) {
            this.field_h = 0;
          }
        }
        if (param0 == 21) {
          return;
        }
        this.setFlashIntensity(38);
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_d = null;
        field_l = null;
        field_f = null;
        if (param0 < -63) {
          field_b = null;
          field_j = null;
          field_c = null;
          field_i = null;
          return;
        }
    }

    final static void readUsernameParameter(int param0, java.applet.Applet param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 123 % ((51 - param0) / 41);
          var3 = param1.getParameter("username");
          if (var3 != null) {
            var4 = (CharSequence) ((Object) var3);
            if (Base37NameHelpers.encodeBase37Name(var4, -29667) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("bg.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void setResultsKind(int param0) {
        DateOfBirthValidator.field_j = param0;
    }

    final void setScrollSpeed(int param0, int param1) {
        this.field_g = param0;
        if (param1 > -21) {
          this.setScrollSpeed(-61, 51);
        }
    }

    final void drawBarFrame(int param0, int param1, int param2, int param3) {
        int var5 = -(param3 / 2) + 320;
        if (param0 <= 9) {
          return;
        }
        int var6 = Cp1252DecodeHelpers.field_f.field_A + var5;
        int var7 = var5 - (-param3 + Cp1252DecodeHelpers.field_f.field_A);
        SoftwareRasterizer.fillRectangle(var6, param2, param3 - 2 * Cp1252DecodeHelpers.field_f.field_A, 25, 16711935);
        SoftwareRasterizer.saveClip(PicturePreview.field_r);
        SoftwareRasterizer.setClip(0, 0, 320, 480);
        Cp1252DecodeHelpers.field_f.drawTransparent(var5, param2);
        SoftwareRasterizer.setClip(320, 0, 640, 480);
        Cp1252DecodeHelpers.field_f.drawHorizontalFlip(var7, param2);
        SoftwareRasterizer.restoreClip(PicturePreview.field_r);
        SoftwareRasterizer.drawHorizontalLine(var6, param2, -(2 * Cp1252DecodeHelpers.field_f.field_A) + param3, 0);
        SoftwareRasterizer.drawHorizontalLine(var6, 25 + param2 - 1, param3 - 2 * Cp1252DecodeHelpers.field_f.field_A, 0);
        int var8 = this.field_e >> 16;
        QuickChatOpenHelpers.drawBarTexture(param2, MainScreenWidgetGlobals.field_h[param1], var8 - HelpPopup.field_Gb.field_A, 0);
        QuickChatOpenHelpers.drawBarTexture(param2, MainScreenWidgetGlobals.field_h[param1], var8, 0);
        SoftwareRasterizer.saveClip(PicturePreview.field_r);
        SoftwareRasterizer.setClip(0, 0, 320, 480);
        NameAvailabilityValidator.field_q.drawAlpha(var5 + 2, param2, 128);
        SoftwareRasterizer.setClip(320, 0, 640, 480);
        NumberFormatHelpers.field_c.drawAlpha(-1 + param3 + (var5 - NumberFormatHelpers.field_c.field_A), param2, 128);
        SoftwareRasterizer.restoreClip(PicturePreview.field_r);
        if (var7 <= var6) {
          return;
        }
        int var9 = -4 + (param3 - Cp1252DecodeHelpers.field_f.field_A * 2);
        SoftwareRasterizer.drawHorizontalLineAlpha(2 + var6, param2 + 3, var9, 16777215, 128);
        SoftwareRasterizer.drawHorizontalLineAlpha(2 + var6, 25 + param2 - 2, var9, 16777215, 128);
        SoftwareRasterizer.drawHorizontalLineAlpha(var6 + 2, param2 + 2, var9, 0, 128);
        SoftwareRasterizer.drawHorizontalLineAlpha(2 + var6, param2 + 22, var9, 0, 128);
        SpriteEffectHelpers.drawGlowLine(var6, 7 + param2, var7, param2 + 7, 4, 7, MainScreenWidgetGlobals.field_b);
        if (this.field_h <= 0) {
          return;
        }
        int var10 = MainScreenWidgetGlobals.field_c.length * this.field_h >> 8;
        var10 -= 2;
        if (var10 <= 0) {
          return;
        }
        SpriteEffectHelpers.drawGlowLine(var6, 12 + param2, var7, param2 + 12, 12, var10, MainScreenWidgetGlobals.field_c);
    }

    abstract void draw(int param0);

    final void setFlashIntensity(int param0) {
        this.field_h = param0;
    }

    StatusBar() {
        this.field_g = 65536;
        this.field_h = 0;
        this.field_e = 0;
    }

    static {
        field_b = "Try again";
        field_a = new int[12];
        field_f = "<%0> has entered a game.";
        field_l = new ConnectionState();
        field_i = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_c = "You can join this game";
        field_k = 0;
    }
}
