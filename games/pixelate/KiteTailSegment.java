/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KiteTailSegment {
    static int field_e;
    private double field_l;
    static String field_a;
    private int field_n;
    static SceneWidget field_k;
    int field_h;
    private int field_p;
    int field_g;
    private double field_q;
    static String field_m;
    static String field_b;
    static int field_f;
    static int field_d;
    static int field_j;
    static String field_c;
    private int field_o;
    private int field_i;

    private final void updateTip(byte param0) {
        this.field_g = this.field_i + (int)((double)this.field_o * Math.sin(this.field_l));
        if (param0 <= -97) {
          this.field_h = this.field_p + (int)((double)this.field_o * Math.cos(this.field_l));
          return;
        }
        field_d = 71;
        this.field_h = this.field_p + (int)((double)this.field_o * Math.cos(this.field_l));
    }

    final static void readSavedDataPacket(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        SaveDataRequest var4_ref_og = null;
        Object var5 = null;
        int var6 = 0;
        byte[] var8 = null;
        SavedDataRequest var9 = null;
        CipherPacketBuffer var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 < 14) {
            field_a = (String) null;
          }
          var10 = MusicCrossfadeStream.field_o;
          var2 = var10.readUnsignedByte(255);
          if (var2 != 0) {
            if (1 != var2) {
              CheckboxPainter.reportClientError(1, "A1: " + Cloud.describePacketHistory(-26), (Throwable) null);
              GameSocketHelpers.closeGameSocket(true);
              return;
            }
            var3 = var10.readInt(0);
            var4_ref_og = (SaveDataRequest) (EmailLoginCredentials.field_g.first(1504642273));
            while (var4_ref_og != null) {
              if (var4_ref_og.field_m != var3) {
                var4_ref_og = (SaveDataRequest) (EmailLoginCredentials.field_g.next(1504642273));
                continue;
              }
              break;
            }
            if (var4_ref_og != null) {
              var4_ref_og.unlink(2779);
              return;
            }
            GameSocketHelpers.closeGameSocket(true);
            return;
          }
          var9 = (SavedDataRequest) (LegacyMenuBuilder.field_a.first(1504642273));
          if (var9 == null) {
            GameSocketHelpers.closeGameSocket(true);
            return;
          }
          var4 = var10.readUnsignedByte(255);
          if (var4 != 0) {
            var12 = new byte[var4];
            var11 = var12;
            var8 = var11;
            var5 = var8;
            var10.readBytes(var12, 0, -89, var4);
          } else {
            var5 = null;
          }
          var10.position = var10.position + 4;
          if (!var10.verifyCrc32((byte) 124)) {
            GameSocketHelpers.closeGameSocket(true);
            return;
          }
          var9.field_p = true;
          var9.field_n = (byte[]) (var5);
          var9.unlink(2779);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1), "ki.E(" + param0 + ')');
        }
    }

    final void swingTo(int param0, byte param1, int param2) {
        int var4;
        int var5;
        double var6;
        double var8;
        int var10;
        double stackIn_3_0 = 0.0;
        var10 = Pixelate.field_H ? 1 : 0;
        var4 = 2 + ((-this.field_n + 4096) * 4 >> 12);
        var5 = var4 * (this.field_i - param2);
        this.field_i = param2;
        var6 = (double)var5 / 300.0;
        this.field_p = param0;
        stackIn_3_0 = (0.0 > this.field_l) ? 0.001 : -0.001;
        var8 = stackIn_3_0;
        if (param1 != 48) {
          this.field_o = -95;
        }
        this.field_q = this.field_q + var8;
        if (0.0 > this.field_q) {
          this.field_q = this.field_q + 0.0006;
        } else {
          this.field_q = this.field_q - 0.0006;
        }
        this.field_l = this.field_l + (var6 + this.field_q);
        if (0.1 < this.field_q) {
          this.field_q = 0.1;
        }
        if (3.141592653589793 < this.field_l) {
          this.field_l = this.field_l - 6.283185307179586;
        } else {
          if (-3.141592653589793 > this.field_l) {
            this.field_l = this.field_l + 6.283185307179586;
          }
        }
        if (this.field_q < -0.1) {
          this.field_q = -0.1;
        }
        this.updateTip((byte) -104);
    }

    final void drawKite(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == 3887) {
          var2 = (int)(this.field_l * 32768.0 / 3.141592653589793);
          ContentTransitionDialog.field_hb.rotateNearest(672, 160, this.field_g << 4, this.field_h << 4, var2, this.field_n);
          return;
        }
        this.drawKite(19);
        var2Lifetime1 = (int)(this.field_l * 32768.0 / 3.141592653589793);
        ContentTransitionDialog.field_hb.rotateNearest(672, 160, this.field_g << 4, this.field_h << 4, var2Lifetime1, this.field_n);
    }

    final void drawString(boolean param0) {
        SoftwareRasterizer.drawLine(this.field_i, this.field_p, this.field_g, this.field_h, 6710784);
        if (!param0) {
          SoftwareRasterizer.drawLine(this.field_i + 1, this.field_p, 1 + this.field_g, this.field_h, 3355392);
          SoftwareRasterizer.drawLine(this.field_i - 1, this.field_p, -1 + this.field_g, this.field_h, 3355392);
          return;
        }
        field_a = (String) null;
        SoftwareRasterizer.drawLine(this.field_i + 1, this.field_p, 1 + this.field_g, this.field_h, 3355392);
        SoftwareRasterizer.drawLine(this.field_i - 1, this.field_p, -1 + this.field_g, this.field_h, 3355392);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 25335) {
          return;
        }
        field_a = null;
        field_b = null;
        field_k = null;
        field_c = null;
        field_m = null;
    }

    final static void spawnScorePopup(int param0, int param1, int param2, int param3) {
        if (param1 == -1) {
          AlternateNameCredentials.startScorePopup(param1 + 1, param3, param0, Integer.toString(param2));
          return;
        }
        KiteTailSegment.releaseStatics(-60);
        AlternateNameCredentials.startScorePopup(param1 + 1, param3, param0, Integer.toString(param2));
    }

    KiteTailSegment(int param0, int param1, int param2, int param3) {
        this.field_o = param2;
        this.field_n = param3;
        this.field_p = param1;
        this.field_l = -1.5707963267948966;
        this.field_i = param0;
        this.updateTip((byte) -112);
    }

    static {
        field_f = 0;
        field_m = "Puzzle";
        field_a = "This option cannot be combined with the current '<%0>' setting.";
        field_d = -1;
        field_b = "Full";
        field_c = "This password contains your email address, and would be easy to guess";
        field_j = 0;
    }
}
