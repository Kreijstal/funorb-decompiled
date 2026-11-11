/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ShaderEffect {
    static nl field_a;
    static UiComponent field_b;
    HardwareGraphicsToolkit owner;

    abstract void enable(int param0, boolean param1);

    void onTextureMatrixChanged(boolean param0) {
        if (!param0) {
          field_a = (nl) null;
        }
    }

    abstract void disable(int param0);

    abstract void bindTexture(int param0, GpuTexture param1, int param2);

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != 101) {
          Collidable var2 = (Collidable) null;
          ShaderEffect.obtainGridEntry(-92, (Collidable) null, -43, true);
        }
    }

    final static q obtainGridEntry(int param0, Collidable param1, int param2, boolean param3) {
        q var4 = null;
        RuntimeException var4_ref = null;
        q stackIn_5_0 = null;
        q stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (q) (StatefulWidgetPainter.field_n.removeFirst(27));
          if (var4 == null) {
            var4 = new q(param1, param0, param2);
          } else {
            var4.a(param0, param1, (byte) 116, param2);
          }
          if (param3) {
            stackIn_7_0 = var4;
            return stackIn_7_0;
          }
          stackIn_5_0 = (q) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("vw.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void onViewMatrixChanged(byte param0) {
        if (param0 != 107) {
          this.onViewMatrixChanged((byte) 23);
        }
    }

    void onFogChanged(boolean param0) {
        if (!param0) {
          this.onFogChanged(false);
        }
    }

    void onProjectionChanged(int param0) {
        if (param0 <= 64) {
          this.setParameters((byte) 45, -125, -56);
        }
    }

    ShaderEffect(HardwareGraphicsToolkit param0) {
        try {
          this.owner = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "vw.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void refreshState(boolean param0, int param1);

    abstract void setParameters(byte param0, int param1, int param2);

    void onModelMatrixChanged(boolean param0) {
        if (!param0) {
          field_b = (UiComponent) null;
        }
    }

    abstract boolean isSupported(int param0);

    static {
        field_a = new nl("email");
    }
}
