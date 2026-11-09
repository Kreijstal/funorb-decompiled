/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DroneDebris extends TimedSceneEffect {
    static String pleaseCheckIfAddressText;
    static int field_B;
    private int fragmentIndex;
    private int radiusPixels;
    private int droneType;
    private double spin;
    private int velocityYQ8;
    static volatile boolean field_A;
    private double rotation;
    static Calendar field_y;
    static String createYourOwnFreeText;
    static br[] field_D;
    private int velocityXQ8;
    static boolean field_C;

    DroneDebris(int lifetimeTicks, int xQ8, int yQ8, int color, double rotation, double spin, int velocityXQ8, int velocityYQ8, int droneType, int fragmentIndex, int radiusPixels) {
        super(lifetimeTicks, xQ8, yQ8, color);
        this.fragmentIndex = fragmentIndex;
        this.droneType = droneType;
        this.rotation = rotation;
        this.velocityYQ8 = velocityYQ8;
        this.velocityXQ8 = velocityXQ8;
        this.radiusPixels = radiusPixels;
        this.spin = spin;
    }

    final void render(GraphicsToolkit toolkit, int guard) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard >= -121) {
            field_A = false;
          }
          if (this.droneType == 0) {
            LegacyOpenGlTexture.field_e[2 + this.fragmentIndex].drawRotated((float)(this.x >> 8), (float)(this.y >> 8), (int)((double)this.radiusPixels / 14.0 * 3072.0), (int)(65535.0 * this.rotation), 1, 0, 2);
          } else {
            if (this.droneType == 1) {
              ContentDialog.field_ab[this.fragmentIndex + 2].drawRotated((float)(this.x >> 8), (float)(this.y >> 8), (int)((double)this.radiusPixels / 14.0 * 3072.0), (int)(this.rotation * 65535.0), 1, 0, 2);
            } else {
              if (this.droneType != 2) {
                if (this.droneType != 3) {
                  if (this.droneType == 4) {
                    MenuScreen.field_a[2 + this.fragmentIndex].drawRotated((float)(this.x >> 8), (float)(this.y >> 8), (int)((double)this.radiusPixels / 14.0 * 3072.0), (int)(this.rotation * 65535.0), 1, 0, 2);
                  } else {
                    if (this.droneType == 5) {
                      HardwareTextureCache.field_e[2 + this.fragmentIndex].drawRotated((float)(this.x >> 8), (float)(this.y >> 8), (int)(3072.0 * ((double)this.radiusPixels / 14.0)), (int)(this.rotation * 65535.0), 1, 0, 2);
                    }
                  }
                } else {
                  TextHotspot.field_n[2 + this.fragmentIndex].drawRotated((float)(this.x >> 8), (float)(this.y >> 8), (int)((double)this.radiusPixels / 14.0 * 3072.0), (int)(65535.0 * this.rotation), 1, 0, 2);
                }
              } else {
                hv.field_d[2 + this.fragmentIndex].drawRotated((float)(this.x >> 8), (float)(this.y >> 8), (int)((double)this.radiusPixels / 14.0 * 3072.0), (int)(65535.0 * this.rotation), 1, 0, 2);
              }
            }
          }
          if (90 > this.remainingTicks) {
            return;
          }
          UnderageAccountInfoPanel.field_B.drawRotated((float)(this.x >> 8), (float)(this.y >> 8), (int)((double)this.radiusPixels / 14.0 * 3072.0), (int)(65535.0 * this.rotation), 1, 0, 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("aj.C(");
          if (toolkit == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(guard).append(')').toString());
        }
    }

    final static bj a(boolean param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        bj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var3 = (String) null;
            DroneDebris.a(true, (String) null);
          }
          stackIn_3_0 = new bj(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("aj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static Object storeByteArray(byte guard, byte[] bytes, boolean copy) {
        DirectByteArrayStorage var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        DirectByteArrayStorage stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (bytes == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          if (136 < bytes.length) {
            var3 = new DirectByteArrayStorage();
            ((ByteArrayStorage) ((Object) var3)).setBytes(bytes, -112);
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (guard >= -116) {
            stackIn_8_0 = (Object) null;
            return stackIn_8_0;
          }
          if (!copy) {
            stackIn_13_0 = (byte[]) (bytes);
            return stackIn_13_0;
          }
          stackIn_11_0 = WidgetTheme.copyBytes(bytes, 0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("aj.D(").append(guard).append(',');
          if (bytes == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(copy).append(')').toString());
        }
    }

    final boolean updateAndIsExpired(int param0) {
        if (!(90 <= this.remainingTicks)) {
          this.y = this.y + this.velocityYQ8;
          this.x = this.x + this.velocityXQ8;
          this.rotation = this.rotation + this.spin;
          this.velocityXQ8 = 251 * this.velocityXQ8 / 256;
          this.velocityYQ8 = 251 * this.velocityYQ8 / 256;
          this.velocityYQ8 = this.velocityYQ8 + 1;
          this.velocityXQ8 = this.velocityXQ8 + 1;
        }
        if (param0 == -2567) {
          return super.updateAndIsExpired(-2567);
        }
        field_A = false;
        return super.updateAndIsExpired(-2567);
    }

    final static ToolkitSprite[] createToolkitSprites(SpriteData[] sprites, GraphicsToolkit toolkit, int guard) {
        int var4 = 0;
        ToolkitSprite[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        ToolkitSprite[] var6 = null;
        ToolkitSprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var6 = new ToolkitSprite[sprites.length];
          var3 = var6;
          for (var4 = 0; sprites.length > var4; var4++) {
            var6[var4] = toolkit.createSprite(sprites[var4], false);
          }
          if (guard != 28513) {
            field_B = 75;
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("aj.B(");
          if (sprites == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (toolkit == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_y = null;
        if (param0 == 2) {
          createYourOwnFreeText = null;
          pleaseCheckIfAddressText = null;
          field_D = null;
          return;
        }
        GraphicsToolkit var2 = (GraphicsToolkit) null;
        DroneDebris.createToolkitSprites((SpriteData[]) null, (GraphicsToolkit) null, -61);
        createYourOwnFreeText = null;
        pleaseCheckIfAddressText = null;
        field_D = null;
    }

    static {
        pleaseCheckIfAddressText = "Please check if address is correct";
        field_B = 0;
        createYourOwnFreeText = "Create your own free Jagex account";
        field_A = false;
        field_y = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
