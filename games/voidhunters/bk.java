/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends UiSingleChildContainer {
    static IsaacPacketBuffer field_w;
    static PrimitiveType field_v;

    final void refreshChildLayout(int param0) {
        int var2 = 43 / ((-80 - param0) / 42);
        this.child.refreshLayout(false);
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (param1 == 0) {
          if (null == this.renderer) {
            if (param2 < 47) {
              return;
            }
            if (this.width == 0) {
              return;
            }
            if (this.height != 0) {
              GetDebrisMax.field_s.a(this.y + param3 + this.height, (byte) 123, this.width + this.x + param0, param3 + this.y, param0 + this.x);
              this.child.drawLayer(param0 + this.x, param1, 63, param3 + this.y);
              GetDebrisMax.field_s.a((byte) 92);
              return;
            }
            return;
          }
          this.renderer.drawComponent(92, (UiComponent) (this), param0, param3, true);
        }
        if (param2 < 47) {
          return;
        }
        if (this.width == 0) {
          return;
        }
        if (this.height != 0) {
          GetDebrisMax.field_s.a(this.y + param3 + this.height, (byte) 123, this.width + this.x + param0, param3 + this.y, param0 + this.x);
          this.child.drawLayer(param0 + this.x, param1, 63, param3 + this.y);
          GetDebrisMax.field_s.a((byte) 92);
          return;
        }
    }

    public static void clearSharedReferences(int param0) {
        field_v = null;
        if (param0 <= 40) {
          bk.clearSharedReferences(87);
          field_w = null;
          return;
        }
        field_w = null;
    }

    final boolean handleMousePress(int param0, int param1, int param2, int param3, UiComponent param4, int param5, byte param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 >= -17) {
            this.drawLayer(90, -56, -39, 108);
          }
          stackIn_6_0 = (this.containsPoint(param2, param1, param0, param5, (byte) 22)) && (super.handleMousePress(param0, param1, param2, param3, param4, param5, (byte) -123));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("bk.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    bk(int param0, int param1, int param2, int param3, UiRenderer param4, UiComponent param5) {
        super(param0, param1, param2, param3, param4, (UiListener) null);
        try {
          this.child = param5;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = new IsaacPacketBuffer(1048576);
        field_v = new PrimitiveType();
    }
}
