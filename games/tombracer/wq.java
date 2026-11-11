/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq implements MessagePanel {
    static String field_d;
    static String field_a;
    private cia field_b;
    private boolean field_c;

    public final int getHeight(boolean param0) {
        if (param0) {
          return 32;
        }
        return 140;
    }

    public static void releaseStatics(boolean param0) {
        field_a = null;
        if (!param0) {
          wq.releaseStatics(true);
          field_d = null;
          return;
        }
        field_d = null;
    }

    public final int getWidth(int param0) {
        if (param0 != -8660) {
          field_a = (String) null;
          return 140;
        }
        return 140;
    }

    public final void update(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (this.field_c) {
        }
        if (!this.field_c) {
          this.field_b.c(param0 ^ -7104);
        }
        var2 = this.field_b.getY((byte) 25);
        var3 = this.field_b.getX(param0 + 7726);
        var4 = 0;
        if (param0 != -7109) {
          return;
        }
        if (var2 < 0) {
          var2 = 0;
          var4 = 1;
        } else {
          if (this.getHeight(false) < var2) {
            var4 = 1;
            var2 = this.getHeight(false);
          }
        }
        if (var3 < 0) {
          var4 = 1;
          var3 = 0;
        } else {
          if (this.getWidth(-8660) < var3) {
            var4 = 1;
            var3 = this.getWidth(param0 - 1551);
          }
        }
        if (var4 == 0) {
          return;
        }
        this.field_b.setPosition(var2, var3, 1823844912);
    }

    public final void draw(int param0, int param1, int param2) {
        LegacyOpenGlSpriteTexture.a(1073807617, tga.field_a, param0, 55, 40, 40, 4, param2 + this.getHeight(false) / 2 - 20);
        LegacyOpenGlSpriteTexture.a(1073807617, tga.field_a, -40 + (param0 + this.getWidth(-8660)), 101, 40, 40, 4, this.getHeight(false) / 2 + (param2 - 20));
        LegacyOpenGlSpriteTexture.a(1073807617, tga.field_a, param0 - (-(this.getWidth(-8660) / 2) + 20), 127, 40, 40, 4, param2);
        LegacyOpenGlSpriteTexture.a(1073807617, tga.field_a, param0 + this.getWidth(-8660) / 2 - 20, 97, 40, 40, 4, -40 + (param2 + this.getHeight(false)));
        if (param1 != 20726) {
          return;
        }
        if (this.field_c) {
          if (!this.field_c) {
            SingleChildWidget.field_v.drawCentred(-6710887, param1 ^ -20727, this.getHeight(false) / 2 + param2, -16711423, param0 + 30, TextInputWidget.field_z[ConsoleToken.field_k]);
            SingleChildWidget.field_v.drawCentred(-6710887, -1, this.getHeight(false) / 2 + param2, -16711423, this.getWidth(-8660) + param0 - 10, TextInputWidget.field_z[fp.field_a]);
            SingleChildWidget.field_v.drawCentred(-6710887, -1, param2 + 20, -16711423, 10 + this.getWidth(-8660) / 2 + param0, TextInputWidget.field_z[HardwareOpenGlToolkit.field_hd]);
            SingleChildWidget.field_v.drawCentred(-6710887, param1 - 20727, -20 + (param2 + this.getHeight(false)), -16711423, 10 + (param0 + this.getWidth(param1 ^ -28966) / 2), TextInputWidget.field_z[mf.field_a]);
            this.field_b.b(param2, param0, -82);
          }
          return;
        }
        if (VerticalScrollbar.field_tb[HardwareOpenGlToolkit.field_hd]) {
          RasterBuffer.a(param2, param1 - 20724, tga.field_a, 4, -20 + (param0 + this.getWidth(-8660) / 2), 40, 1080057857, 2, 40);
          RasterBuffer.a(param2, 2, tga.field_a, 4, this.getWidth(-8660) / 2 + param0 - 20, 40, 1080057857, 2, 40);
          if (VerticalScrollbar.field_tb[ConsoleToken.field_k]) {
            RasterBuffer.a(this.getHeight(false) / 2 + (param2 - 20), param1 - 20724, tga.field_a, 4, param0, 40, 1080057857, 2, 40);
            RasterBuffer.a(param2 + this.getHeight(false) / 2 - 20, param1 - 20724, tga.field_a, 4, param0, 40, 1080057857, 2, 40);
          }
          if (VerticalScrollbar.field_tb[mf.field_a]) {
            RasterBuffer.a(-40 + (param2 + this.getHeight(false)), 2, tga.field_a, 4, this.getWidth(-8660) / 2 + param0 - 20, 40, 1080057857, 2, 40);
            RasterBuffer.a(-40 + this.getHeight(false) + param2, param1 ^ 20724, tga.field_a, 4, -20 + param0 + this.getWidth(param1 ^ -28966) / 2, 40, 1080057857, 2, 40);
          }
          if (VerticalScrollbar.field_tb[fp.field_a]) {
            RasterBuffer.a(-20 + (param2 + this.getHeight(false) / 2), 2, tga.field_a, 4, -40 + (param0 + this.getWidth(-8660)), 40, 1080057857, 2, 40);
            RasterBuffer.a(-20 + this.getHeight(false) / 2 + param2, 2, tga.field_a, 4, this.getWidth(param1 ^ -28966) + param0 - 40, 40, 1080057857, 2, 40);
          }
          if (!this.field_c) {
            SingleChildWidget.field_v.drawCentred(-6710887, param1 ^ -20727, this.getHeight(false) / 2 + param2, -16711423, param0 + 30, TextInputWidget.field_z[ConsoleToken.field_k]);
            SingleChildWidget.field_v.drawCentred(-6710887, -1, this.getHeight(false) / 2 + param2, -16711423, this.getWidth(-8660) + param0 - 10, TextInputWidget.field_z[fp.field_a]);
            SingleChildWidget.field_v.drawCentred(-6710887, -1, param2 + 20, -16711423, 10 + this.getWidth(-8660) / 2 + param0, TextInputWidget.field_z[HardwareOpenGlToolkit.field_hd]);
            SingleChildWidget.field_v.drawCentred(-6710887, param1 - 20727, -20 + (param2 + this.getHeight(false)), -16711423, 10 + (param0 + this.getWidth(param1 ^ -28966) / 2), TextInputWidget.field_z[mf.field_a]);
            this.field_b.b(param2, param0, -82);
          }
          return;
        }
        if (VerticalScrollbar.field_tb[ConsoleToken.field_k]) {
          RasterBuffer.a(this.getHeight(false) / 2 + (param2 - 20), param1 - 20724, tga.field_a, 4, param0, 40, 1080057857, 2, 40);
          RasterBuffer.a(param2 + this.getHeight(false) / 2 - 20, param1 - 20724, tga.field_a, 4, param0, 40, 1080057857, 2, 40);
        }
        if (VerticalScrollbar.field_tb[mf.field_a]) {
          RasterBuffer.a(-40 + (param2 + this.getHeight(false)), 2, tga.field_a, 4, this.getWidth(-8660) / 2 + param0 - 20, 40, 1080057857, 2, 40);
          RasterBuffer.a(-40 + this.getHeight(false) + param2, param1 ^ 20724, tga.field_a, 4, -20 + param0 + this.getWidth(param1 ^ -28966) / 2, 40, 1080057857, 2, 40);
          if (VerticalScrollbar.field_tb[fp.field_a]) {
            RasterBuffer.a(-20 + (param2 + this.getHeight(false) / 2), 2, tga.field_a, 4, -40 + (param0 + this.getWidth(-8660)), 40, 1080057857, 2, 40);
            RasterBuffer.a(-20 + this.getHeight(false) / 2 + param2, 2, tga.field_a, 4, this.getWidth(param1 ^ -28966) + param0 - 40, 40, 1080057857, 2, 40);
            if (!this.field_c) {
              SingleChildWidget.field_v.drawCentred(-6710887, param1 ^ -20727, this.getHeight(false) / 2 + param2, -16711423, param0 + 30, TextInputWidget.field_z[ConsoleToken.field_k]);
              SingleChildWidget.field_v.drawCentred(-6710887, -1, this.getHeight(false) / 2 + param2, -16711423, this.getWidth(-8660) + param0 - 10, TextInputWidget.field_z[fp.field_a]);
              SingleChildWidget.field_v.drawCentred(-6710887, -1, param2 + 20, -16711423, 10 + this.getWidth(-8660) / 2 + param0, TextInputWidget.field_z[HardwareOpenGlToolkit.field_hd]);
              SingleChildWidget.field_v.drawCentred(-6710887, param1 - 20727, -20 + (param2 + this.getHeight(false)), -16711423, 10 + (param0 + this.getWidth(param1 ^ -28966) / 2), TextInputWidget.field_z[mf.field_a]);
              this.field_b.b(param2, param0, -82);
            }
            return;
          }
          if (!this.field_c) {
            SingleChildWidget.field_v.drawCentred(-6710887, param1 ^ -20727, this.getHeight(false) / 2 + param2, -16711423, param0 + 30, TextInputWidget.field_z[ConsoleToken.field_k]);
            SingleChildWidget.field_v.drawCentred(-6710887, -1, this.getHeight(false) / 2 + param2, -16711423, this.getWidth(-8660) + param0 - 10, TextInputWidget.field_z[fp.field_a]);
            SingleChildWidget.field_v.drawCentred(-6710887, -1, param2 + 20, -16711423, 10 + this.getWidth(-8660) / 2 + param0, TextInputWidget.field_z[HardwareOpenGlToolkit.field_hd]);
            SingleChildWidget.field_v.drawCentred(-6710887, param1 - 20727, -20 + (param2 + this.getHeight(false)), -16711423, 10 + (param0 + this.getWidth(param1 ^ -28966) / 2), TextInputWidget.field_z[mf.field_a]);
            this.field_b.b(param2, param0, -82);
          }
          return;
        }
        if (!VerticalScrollbar.field_tb[fp.field_a]) {
          if (!this.field_c) {
            SingleChildWidget.field_v.drawCentred(-6710887, param1 ^ -20727, this.getHeight(false) / 2 + param2, -16711423, param0 + 30, TextInputWidget.field_z[ConsoleToken.field_k]);
            SingleChildWidget.field_v.drawCentred(-6710887, -1, this.getHeight(false) / 2 + param2, -16711423, this.getWidth(-8660) + param0 - 10, TextInputWidget.field_z[fp.field_a]);
            SingleChildWidget.field_v.drawCentred(-6710887, -1, param2 + 20, -16711423, 10 + this.getWidth(-8660) / 2 + param0, TextInputWidget.field_z[HardwareOpenGlToolkit.field_hd]);
            SingleChildWidget.field_v.drawCentred(-6710887, param1 - 20727, -20 + (param2 + this.getHeight(false)), -16711423, 10 + (param0 + this.getWidth(param1 ^ -28966) / 2), TextInputWidget.field_z[mf.field_a]);
            this.field_b.b(param2, param0, -82);
          }
          return;
        }
        RasterBuffer.a(-20 + (param2 + this.getHeight(false) / 2), 2, tga.field_a, 4, -40 + (param0 + this.getWidth(-8660)), 40, 1080057857, 2, 40);
        RasterBuffer.a(-20 + this.getHeight(false) / 2 + param2, 2, tga.field_a, 4, this.getWidth(param1 ^ -28966) + param0 - 40, 40, 1080057857, 2, 40);
        if (!this.field_c) {
          SingleChildWidget.field_v.drawCentred(-6710887, param1 ^ -20727, this.getHeight(false) / 2 + param2, -16711423, param0 + 30, TextInputWidget.field_z[ConsoleToken.field_k]);
          SingleChildWidget.field_v.drawCentred(-6710887, -1, this.getHeight(false) / 2 + param2, -16711423, this.getWidth(-8660) + param0 - 10, TextInputWidget.field_z[fp.field_a]);
          SingleChildWidget.field_v.drawCentred(-6710887, -1, param2 + 20, -16711423, 10 + this.getWidth(-8660) / 2 + param0, TextInputWidget.field_z[HardwareOpenGlToolkit.field_hd]);
          SingleChildWidget.field_v.drawCentred(-6710887, param1 - 20727, -20 + (param2 + this.getHeight(false)), -16711423, 10 + (param0 + this.getWidth(param1 ^ -28966) / 2), TextInputWidget.field_z[mf.field_a]);
          this.field_b.b(param2, param0, -82);
        }
    }

    final static int writeHuffmanString(String param0, PacketBuffer param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param1.position;
          var5 = (CharSequence) ((Object) param0);
          var4 = us.encodeCp1252(var5, false);
          param1.writeUnsignedSmart(var4.length, (byte) 111);
          param1.position = param1.position + nma.field_m.encode((byte) -109, param1.payload, param2, param1.position, var4.length, var4);
          stackIn_1_0 = param1.position - var3_int;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("wq.F(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public wq() {
        this.field_b = new cia();
        this.field_b.setPosition(this.getHeight(false) / 2, 15 + this.getWidth(-8660) / 2, 1823844912);
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param2 == 8000) {
          return (param1 & 65536) != 0 ? true : false;
        }
        field_d = (String) null;
        return (param1 & 65536) != 0 ? true : false;
    }

    public final boolean handleKey(int param0, int param1, char param2) {
        if (param0 != -18602) {
          return true;
        }
        return false;
    }

    static {
        field_d = "Difficulty: ";
        field_a = "This game has been updated! Please reload this page.";
    }
}
