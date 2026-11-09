/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PointLight extends IntrusiveNode {
    private int x;
    private int y;
    private float intensity;
    private int z;
    private int color;
    static IntrusiveDeque recycledRasterFrames;
    private int radius;
    static int mouseX;

    final static void resendProgressAndArrayRequests(int guard, int opcode) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        GameProgressUpdate var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4 = (GameProgressUpdate) (SoftwareRenderTarget.field_f.first(-101));
          while (var4 != null) {
            ToolkitRasterStateStack.sendProgressUpdate(opcode, 1, var4);
            var4 = (GameProgressUpdate) (SoftwareRenderTarget.field_f.next((byte) 18));
          }
          if (guard != 0) {
            recycledRasterFrames = (IntrusiveDeque) null;
          }
          var2 = CheckboxWidget.field_E.first(-105);
          while (var2 != null) {
            ScreenNameValidator.sendServerIntArrayRead(125, opcode);
            var2 = CheckboxWidget.field_E.next((byte) 18);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "ko.A(" + guard + ',' + opcode + ')');
        }
    }

    final int color(byte guard) {
        if (guard != 50) {
          this.intensity = -3.14526629447937f;
          return this.color;
        }
        return this.color;
    }

    final int getY(byte guard) {
        if (guard != 109) {
          PointLight.resendProgressAndArrayRequests(39, 19);
          return this.y;
        }
        return this.y;
    }

    final int getX(byte guard) {
        if (guard < 71) {
          return -46;
        }
        return this.x;
    }

    final int radius(int guard) {
        if (guard != 0) {
          this.getZ(false);
          return this.radius;
        }
        return this.radius;
    }

    public static void releaseStatics(int guard) {
        if (guard != 0) {
          PointLight.resendProgressAndArrayRequests(-33, -26);
          recycledRasterFrames = null;
          return;
        }
        recycledRasterFrames = null;
    }

    private PointLight() throws Throwable {
        throw new Error();
    }

    final int getZ(boolean guard) {
        if (!guard) {
          return -61;
        }
        return this.z;
    }

    final float intensity(int guard) {
        if (guard != 0) {
          this.intensity = 0.354354590177536f;
          return this.intensity;
        }
        return this.intensity;
    }

    static {
        recycledRasterFrames = new IntrusiveDeque();
        mouseX = 0;
    }
}
