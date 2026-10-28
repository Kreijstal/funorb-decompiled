/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class StatefulTextPainter extends TextWidgetPainter {
    static String field_q;
    static Calendar field_s;
    static String field_v;
    private WidgetStyleLayer[] stateLayers;
    static GameAppletShell field_r;
    static int field_y;
    private WidgetStyleLayer workingLayer;
    static ResourceArchive field_u;
    static int field_x;

    final WidgetStyleLayer createStateLayer(int state, byte guard) {
        if (guard == -53) {
          WidgetStyleLayer dupTemp$0 = new WidgetStyleLayer();
          this.stateLayers[state] = dupTemp$0;
          return dupTemp$0;
        }
        this.workingLayer = (WidgetStyleLayer) null;
        WidgetStyleLayer dupTemp$1 = new WidgetStyleLayer();
        this.stateLayers[state] = dupTemp$1;
        return dupTemp$1;
    }

    final static IndexedSprite loadIndexedSprite(ResourceArchive param0, int param1, int param2, int param3) {
        String stackIn_10_2 = null;
        try {
          if (param1 != -18109) {
            field_v = (String) null;
          }
          if (ArchivePreloader.loadSpriteSheet(param0, 96, param3, param2)) {
            IndexedSprite stackIn_6_0 = da.b((byte) 8);
            return stackIn_6_0;
          }
          Object stackIn_4_0 = null;
          return (IndexedSprite) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var4;
          StringBuilder stackIn_9_1 = new StringBuilder().append("he.Q(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void setFrameSpritesForAllStates(Sprite[] sprites, int guard) {
        String stackIn_14_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          WidgetStyleLayer[] var7 = this.stateLayers;
          WidgetStyleLayer[] var3 = var7;
          for (int var4 = 0; var7.length > var4; var4++) {
            WidgetStyleLayer var5 = var7[var4];
            if (var5 != null) {
              var5.frameSprites = sprites;
            }
          }
          if (guard == 6) {
            return;
          }
          field_v = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3_ref;
          StringBuilder stackIn_13_1 = new StringBuilder().append("he.O(");
          if (sprites == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(')').toString());
        }
    }

    public final void drawWidget(int originX, int originY, int guard, UiComponent component, boolean enabled) {
        UiComponent stackIn_3_0 = null;
        String stackIn_34_2 = null;
        try {
          if (!(component instanceof TextButton)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (UiComponent) (component);
          }
          TextButton var10 = (TextButton) (stackIn_3_0);
          rd.a(component.width + component.x + originX, originX + component.x, component.y + (originY + component.height), 19807, originY + component.y);
          if (var10 != null) {
            enabled = enabled & var10.enabled;
          }
          WidgetStyleLayer var7 = this.stateLayers[0];
          this.workingLayer.reset(true);
          var7.applyTo(originX, this.workingLayer, component, originY, 63, this);
          if (var10 != null) {
            if (var10.selected) {
              WidgetStyleLayer var11 = this.stateLayers[1];
              if (var11 != null) {
                var11.applyTo(originX, this.workingLayer, component, originY, -106, this);
              }
            }
            if (var10.hovered) {
              WidgetStyleLayer var12 = this.stateLayers[3];
              if (0 != var10.field_t &&
                var12 != null) {
                var12.applyTo(originX, this.workingLayer, component, originY, -124, this);
              } else {
                WidgetStyleLayer var9 = this.stateLayers[2];
                if (var9 != null) {
                  var9.applyTo(originX, this.workingLayer, component, originY, -101, this);
                }
              }
            }
          }
          if (component.isFocused(0)) {
            WidgetStyleLayer var13 = this.stateLayers[5];
            if (var13 != null) {
              var13.applyTo(originX, this.workingLayer, component, originY, 51, this);
            }
          }
          if (!enabled) {
            WidgetStyleLayer var14 = this.stateLayers[4];
            if (var14 != null) {
              var14.applyTo(originX, this.workingLayer, component, originY, -94, this);
            }
          }
          if (guard >= -14) {
            StatefulTextPainter.releaseStatics(true);
          }
          this.workingLayer.draw(this, component, originX, originY, (byte) 21);
          RasterRestoreSupport.popRasterState((byte) -8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_33_0 = var6;
          StringBuilder stackIn_33_1 = new StringBuilder().append("he.M(").append(originX).append(',').append(originY).append(',').append(guard).append(',');
          if (component == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(enabled).append(')').toString());
        }
    }

    final void setSpriteForAllStates(Sprite sprite, byte guard) {
        String stackIn_14_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          WidgetStyleLayer[] var7 = this.stateLayers;
          WidgetStyleLayer[] var3 = var7;
          for (int var4 = 0; var7.length > var4; var4++) {
            WidgetStyleLayer var5 = var7[var4];
            if (var5 != null) {
              var5.sprite = sprite;
            }
          }
          if (guard > 65) {
            return;
          }
          StatefulTextPainter.releaseStatics(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3_ref;
          StringBuilder stackIn_13_1 = new StringBuilder().append("he.R(");
          if (sprite == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(')').toString());
        }
    }

    StatefulTextPainter(StatefulTextPainter param0, boolean param1) {
        this();
        try {
          param0.copyStatesTo(param1, 123, this);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "he.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static SocketConnector createProxySocketConnector(String host, int port, byte guard) {
        String stackIn_5_2 = null;
        try {
          ProxySocketConnector var3 = new ProxySocketConnector();
          int var4 = -90 / ((guard + 5) / 40);
          ((SocketConnector) ((Object) var3)).port = port;
          ((SocketConnector) ((Object) var3)).host = host;
          ProxySocketConnector stackIn_1_0 = var3;
          return (SocketConnector) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var3_ref;
          StringBuilder stackIn_4_1 = new StringBuilder().append("he.S(");
          if (host == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(port).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(boolean guard) {
        field_v = null;
        field_u = null;
        field_q = null;
        if (!guard) {
          return;
        }
        field_s = null;
    }

    public StatefulTextPainter() {
        this.stateLayers = new WidgetStyleLayer[6];
        this.workingLayer = new WidgetStyleLayer();
        WidgetStyleLayer dupTemp$0 = new WidgetStyleLayer();
        this.stateLayers[0] = dupTemp$0;
        WidgetStyleLayer var1 = dupTemp$0;
        var1.reset(true);
    }

    private final void copyStatesTo(boolean deepCopy, int guard, StatefulTextPainter target) {
        WidgetStyleLayer stackIn_9_2 = null;
        String stackIn_19_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          super.copyStyleTo(target, 127);
          if (deepCopy) {
            for (int var4_int = 0; var4_int < 6; var4_int++) {
              WidgetStyleLayer var5 = this.stateLayers[var4_int];
              if (var5 != null) {
                WidgetStyleLayer var6 = target.stateLayers[var4_int];
                WidgetStyleLayer stackIn_8_0 = var5;
                int stackIn_8_1 = -2;
                if (var6 == null) {
                  WidgetStyleLayer dupTemp$0 = new WidgetStyleLayer();
                  target.stateLayers[var4_int] = dupTemp$0;
                  stackIn_9_2 = dupTemp$0;
                } else {
                  stackIn_9_2 = var6;
                }
                ((WidgetStyleLayer) (Object) stackIn_8_0).copyTo(stackIn_8_1, stackIn_9_2);
              } else {
                target.stateLayers[var4_int] = null;
              }
            }
          } else {
            ArraySupport.copy(this.stateLayers, 0, target.stateLayers, 0, 6);
          }
          if (guard > 120) {
            return;
          }
          field_r = (GameAppletShell) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var4;
          StringBuilder stackIn_18_1 = new StringBuilder().append("he.T(").append(deepCopy).append(',').append(guard).append(',');
          if (target == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void setStateFrameSprites(Sprite[] sprites, int state, byte guard) {
        try {
          int var4_int = state;
          if (guard != -117) {
            StatefulTextPainter var5 = (StatefulTextPainter) null;
            this.copyStatesTo(false, -105, (StatefulTextPainter) null);
          }
          if (this.stateLayers[var4_int] == null) {
            this.stateLayers[var4_int] = new WidgetStyleLayer();
          }
          this.stateLayers[state].frameSprites = sprites;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "he.L(" + (sprites != null ? "{...}" : "null") + ',' + state + ',' + guard + ')');
        }
    }

    static {
        field_v = "Tutorial";
        field_r = null;
        field_q = "Not yet achieved";
        field_s = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
