/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SweepingSpotlight extends WorldObject {
    static String[] field_G;
    static int[] field_H;
    private int field_K;
    private int field_F;
    private int field_E;
    static String field_J;
    static IntrusiveDeque field_D;
    private int field_I;

    public static void releaseStatics(int param0) {
        field_G = null;
        field_H = null;
        field_D = null;
        field_J = null;
        if (param0 != 2021978896) {
          field_G = (String[]) null;
        }
    }

    final void tick(int param0) {
        if (param0 >= 95) {
          this.field_y = (this.field_F << 16) + 4 * WorldObject.cosFixed(1311979239, AreaSelectionScreen.field_m << 5);
          this.field_x = (this.field_E << 16) + DropTargetWidget.cosine(true, AreaSelectionScreen.field_m << 6) * 4;
          return;
        }
        this.field_E = -11;
        this.field_y = (this.field_F << 16) + 4 * WorldObject.cosFixed(1311979239, AreaSelectionScreen.field_m << 5);
        this.field_x = (this.field_E << 16) + DropTargetWidget.cosine(true, AreaSelectionScreen.field_m << 6) * 4;
    }

    final void draw(byte param0, Camera param1) {
        int var3_int = param1.worldToScreenX(this.field_y >> 16, (byte) -88);
        int var4 = param1.worldToScreenY(this.field_x >> 16, 0) - WeightedLruCache.field_k[0].field_t;
        if (param0 > -76) {
          return;
        }
        try {
          if (this.field_K < this.field_I) {
            this.field_K = this.field_K + 6;
          }
          WeightedLruCache.field_k[0].drawWithOpacity(var3_int, var4, this.field_K);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "jj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static MenuScreen getScreen(int param0, int param1) {
        if (param1 < 72) {
          field_J = (String) null;
          return ArmedHuman.field_Jb[param0];
        }
        return ArmedHuman.field_Jb[param0];
    }

    SweepingSpotlight(int param0, int param1) {
        super(param0, param1, 0);
        this.field_I = 48;
        this.field_K = 0;
        this.field_F = -100 + UiContainer.field_A.getX(true);
        this.field_E = UiContainer.field_A.getY(237239984) + 40;
    }

    final static String readPacketString(int param0) {
        if (param0 < 93) {
          field_G = (String[]) null;
          return MatchingTextValidator.field_g.readNullTerminatedString(true);
        }
        return MatchingTextValidator.field_g.readNullTerminatedString(true);
    }

    final static void createSoftCircleSprite(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ZombieDawn.field_J;
        try {
          Camera.field_o = new Sprite(512, 512);
          Camera.field_o.setAsRenderTarget();
          for (var1_int = 256; var1_int > 0; var1_int--) {
            Rasterizer.fillCircle(256, 256, var1_int, -var1_int + 256);
          }
          if (param0) {
            SweepingSpotlight.releaseStatics(115);
            DisplayState.field_f.makeRasterTarget(109);
          } else {
            DisplayState.field_f.makeRasterTarget(109);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1), "jj.G(" + param0 + ')');
        }
    }

    final static String readCompressedString(int param0, int param1, PacketBuffer param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        PacketBuffer var6 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param2.readSmart((byte) -107);
            if (param0 < var3_int) {
              var3_int = param0;
            }
            var4 = new byte[var3_int];
            param2.position = param2.position + ImageProducerRasterBuffer.field_l.decompress(param2.payload, 0, var3_int, param1 ^ -28649, param2.position, var4);
            if (param1 != -23171) {
              var6 = (PacketBuffer) null;
              SweepingSpotlight.readCompressedString(57, -111, (PacketBuffer) null);
            }
            var5 = SpatialObject.decodeSingleByteText(var4, var3_int, 0, -78);
            stackIn_6_0 = var5;
            return stackIn_6_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_8_0 = "Cabbage";
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("jj.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_G = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_J = "Passwords must be between 5 and 20 letters and numbers";
        field_D = new IntrusiveDeque();
    }
}
