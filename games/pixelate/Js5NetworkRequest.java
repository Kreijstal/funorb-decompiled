/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Js5NetworkRequest extends ArchiveRequest {
    PacketBuffer field_D;
    int field_H;
    static ge field_F;
    byte field_B;
    static BufferedRandomAccessFile field_G;
    static int field_I;
    static BackgroundScene[] field_C;

    final int g(int param0) {
        if (param0 >= -92) {
          Js5NetworkRequest.i(15);
          if (this.field_D != null) {
            return this.field_D.position * 100 / (-this.field_B + this.field_D.payload.length);
          }
          return 0;
        }
        if (this.field_D != null) {
          return this.field_D.position * 100 / (-this.field_B + this.field_D.payload.length);
        }
        return 0;
    }

    final static void a(int param0, boolean param1) {
        wa.field_c.a(0, 0, 120);
        if (param0 <= 73) {
          Js5NetworkRequest.releaseStatics((byte) 4);
        }
    }

    final static TickClock j(int param0) {
        if (param0 != -30272) {
          field_G = (BufferedRandomAccessFile) null;
          return (TickClock) ((Object) new NanoTickClock());
        }
        return (TickClock) ((Object) new NanoTickClock());
    }

    final byte[] h(int param0) {
        if (this.field_v) {
          throw new RuntimeException();
        }
        if (this.field_D.position < -this.field_B + this.field_D.payload.length) {
          throw new RuntimeException();
        }
        if (param0 == 0) {
          return this.field_D.payload;
        }
        this.field_H = 39;
        return this.field_D.payload;
    }

    Js5NetworkRequest() {
    }

    final static void i(int param0) {
        int var1 = 16777215;
        gb.field_b = new Sprite(108, 100);
        int var2 = 65793;
        gb.field_b.makeRasterTarget();
        SoftwareRasterizer.fillRectangle(4, 0, SoftwareRasterizer.field_j - 8, SoftwareRasterizer.field_d, var1);
        SoftwareRasterizer.fillCircle(4, 0, 4, var2);
        SoftwareRasterizer.fillCircle(-4 + SoftwareRasterizer.field_j - 1, 0, 4, var2);
        SoftwareRasterizer.fillCircle(4, SoftwareRasterizer.field_d, 4, var2);
        SoftwareRasterizer.fillCircle(-4 + (SoftwareRasterizer.field_j - 1), SoftwareRasterizer.field_d, 4, var2);
        SoftwareRasterizer.drawVerticalLine(4, 0, SoftwareRasterizer.field_d, var2);
        SoftwareRasterizer.drawVerticalLine(5, 0, SoftwareRasterizer.field_d, var2);
        if (param0 == 7902) {
          SoftwareRasterizer.drawVerticalLine(-5 + SoftwareRasterizer.field_j, 0, SoftwareRasterizer.field_d, var2);
          SoftwareRasterizer.drawVerticalLine(-2 + SoftwareRasterizer.field_j - 4, 0, SoftwareRasterizer.field_d, var2);
          SoftwareRasterizer.drawHorizontalLine(4, 0, -8 + SoftwareRasterizer.field_j, var2);
          SoftwareRasterizer.drawHorizontalLine(4, -1 + SoftwareRasterizer.field_d, SoftwareRasterizer.field_j - 8, var2);
          HighscoresScreen.field_q = new Sprite(gb.field_b.field_A, 4);
          HighscoresScreen.field_q.makeRasterTarget();
          SoftwareRasterizer.fillCircle(4, SoftwareRasterizer.field_d, 4, var2);
          SoftwareRasterizer.fillCircle(SoftwareRasterizer.field_j - 5, SoftwareRasterizer.field_d, 4, var2);
          SoftwareRasterizer.drawHorizontalLine(4, -1 + SoftwareRasterizer.field_d, -8 + SoftwareRasterizer.field_j, var2);
          of.field_h = new Sprite(HighscoresScreen.field_q.field_A, HighscoresScreen.field_q.field_B);
          of.field_h.makeRasterTarget();
          HighscoresScreen.field_q.drawVerticalFlip(0, 0);
          ClientException.field_f.a(19692);
          return;
        }
        field_C = (BackgroundScene[]) null;
        SoftwareRasterizer.drawVerticalLine(-5 + SoftwareRasterizer.field_j, 0, SoftwareRasterizer.field_d, var2);
        SoftwareRasterizer.drawVerticalLine(-2 + SoftwareRasterizer.field_j - 4, 0, SoftwareRasterizer.field_d, var2);
        SoftwareRasterizer.drawHorizontalLine(4, 0, -8 + SoftwareRasterizer.field_j, var2);
        SoftwareRasterizer.drawHorizontalLine(4, -1 + SoftwareRasterizer.field_d, SoftwareRasterizer.field_j - 8, var2);
        HighscoresScreen.field_q = new Sprite(gb.field_b.field_A, 4);
        HighscoresScreen.field_q.makeRasterTarget();
        SoftwareRasterizer.fillCircle(4, SoftwareRasterizer.field_d, 4, var2);
        SoftwareRasterizer.fillCircle(SoftwareRasterizer.field_j - 5, SoftwareRasterizer.field_d, 4, var2);
        SoftwareRasterizer.drawHorizontalLine(4, -1 + SoftwareRasterizer.field_d, -8 + SoftwareRasterizer.field_j, var2);
        of.field_h = new Sprite(HighscoresScreen.field_q.field_A, HighscoresScreen.field_q.field_B);
        of.field_h.makeRasterTarget();
        HighscoresScreen.field_q.drawVerticalFlip(0, 0);
        ClientException.field_f.a(19692);
    }

    public static void releaseStatics(byte param0) {
        field_G = null;
        field_F = null;
        field_C = null;
        if (param0 > -44) {
          Js5NetworkRequest.releaseStatics((byte) -123);
        }
    }

    static {
        field_F = new ge();
        field_C = new BackgroundScene[8];
    }
}
