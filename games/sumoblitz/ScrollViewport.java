/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollViewport extends SingleChildWidget {
    static SpriteData[] field_C;
    static int[] field_z;
    static int[] field_B;

    ScrollViewport(int param0, int param1, int param2, int param3, WidgetRenderer param4, UiWidget param5) {
        super(param0, param1, param2, param3, param4, (WidgetListener) null);
        try {
          this.child = param5;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "we.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        if (guard >= -35) {
          ScrollViewport.handleAccountConnectionLoss((byte) -109);
          if (layer != 0) {
            if (this.width == 0) {
              return;
            }
            if (this.height != 0) {
              HardwareTurbulentWaterNoise.widgetTheme.pushClip(this.height + parentY + this.y, parentX + this.x, this.y + parentY, (byte) -106, parentX + this.x + this.width);
              this.child.renderLayer(this.x + parentX, this.y + parentY, (byte) -95, layer);
              HardwareTurbulentWaterNoise.widgetTheme.popRasterState((byte) -84);
              return;
            }
            return;
          }
          if (this.renderer == null) {
            if (this.width == 0) {
              return;
            }
            if (this.height != 0) {
              HardwareTurbulentWaterNoise.widgetTheme.pushClip(this.height + parentY + this.y, parentX + this.x, this.y + parentY, (byte) -106, parentX + this.x + this.width);
              this.child.renderLayer(this.x + parentX, this.y + parentY, (byte) -95, layer);
              HardwareTurbulentWaterNoise.widgetTheme.popRasterState((byte) -84);
              return;
            }
            return;
          }
          this.renderer.renderWidget((UiWidget) (this), parentY, 5592405, true, parentX);
          if (this.width == 0) {
            return;
          }
          if (this.height == 0) {
            return;
          }
          HardwareTurbulentWaterNoise.widgetTheme.pushClip(this.height + parentY + this.y, parentX + this.x, this.y + parentY, (byte) -106, parentX + this.x + this.width);
          this.child.renderLayer(this.x + parentX, this.y + parentY, (byte) -95, layer);
          HardwareTurbulentWaterNoise.widgetTheme.popRasterState((byte) -84);
          return;
        }
        if (layer == 0 &&
          this.renderer != null) {
          this.renderer.renderWidget((UiWidget) (this), parentY, 5592405, true, parentX);
          if (this.width == 0) {
            return;
          }
          if (this.height == 0) {
            return;
          }
          HardwareTurbulentWaterNoise.widgetTheme.pushClip(this.height + parentY + this.y, parentX + this.x, this.y + parentY, (byte) -106, parentX + this.x + this.width);
          this.child.renderLayer(this.x + parentX, this.y + parentY, (byte) -95, layer);
          HardwareTurbulentWaterNoise.widgetTheme.popRasterState((byte) -84);
          return;
        }
        if (this.width == 0) {
          return;
        }
        if (this.height == 0) {
          return;
        }
        HardwareTurbulentWaterNoise.widgetTheme.pushClip(this.height + parentY + this.y, parentX + this.x, this.y + parentY, (byte) -106, parentX + this.x + this.width);
        this.child.renderLayer(this.x + parentX, this.y + parentY, (byte) -95, layer);
        HardwareTurbulentWaterNoise.widgetTheme.popRasterState((byte) -84);
    }

    final boolean onPointerPressed(UiWidget root, int guard, int pointerY, int button, int parentX, int pointerX, int parentY) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard > -42) {
            field_C = (SpriteData[]) null;
          }
          stackIn_6_0 = (this.containsPoint(pointerX, -1, parentX, pointerY, parentY)) && (super.onPointerPressed(root, -55, pointerY, button, parentX, pointerX, parentY));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("we.R(");
          if (root == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(',').append(pointerY).append(',').append(button).append(',').append(parentX).append(',').append(pointerX).append(',').append(parentY).append(')').toString());
        }
    }

    final static boolean canRenderClientUi(int guard) {
        if (guard != -1) {
          return false;
        }
        if (10 > LoginDialogNavigation.field_a) {
          return false;
        }
        if (TextureCoordinateGeneration.clientPreparationPhase >= 13) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(boolean param0) {
        field_C = null;
        field_B = null;
        field_z = null;
        if (param0) {
          field_C = (SpriteData[]) null;
        }
    }

    final void layoutChild(boolean guard) {
        this.child.refreshLayout(guard);
    }

    final static void readAccountDisplayName(byte guard) {
        QueuedIntArrayRequest.accountDisplayName = NativeLibraryExtractor.incomingPacket.readCp1252String(-1);
        int var1 = 74 % ((60 - guard) / 52);
        CharSequence var2 = (CharSequence) ((Object) QueuedIntArrayRequest.accountDisplayName);
        PasswordValidator.normalizedAccountDisplayName = AccountCreationProgressDialog.normalizeAccountName(-1, var2);
    }

    final static void handleAccountConnectionLoss(byte guard) {
        if (LoginDialogNavigation.field_a == 10) {
          LegacyWaterTextureResources.showConnectionLost(0);
          LoginDialogNavigation.field_a = 11;
        } else {
          if (!LegacyOpenGlReflectionEffect.c(1)) {
            LegacyWaterTextureResources.showConnectionLost(0);
            LoginDialogNavigation.field_a = 11;
          }
        }
        if (guard <= 10) {
          return;
        }
        LegacyWaterTextureResources.field_h = true;
    }

    static {
        field_z = new int[8192];
    }
}
