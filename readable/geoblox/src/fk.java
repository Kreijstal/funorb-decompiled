/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends SingleChildWidget {
    static ck field_B;

    final static byte[] readTextResourceBytes(int readGuard, String resourceKey) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (readGuard == 2229) {
            stackIn_4_0 = ImageProducerRasterBuffer.activeTextArchive.getNamedFile(0, resourceKey, "");
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var2);
          stackIn_7_1 = new StringBuilder().append("fk.F(").append(readGuard).append(',');
          if (resourceKey == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.addMouseListener(pg.pointerListener);
            if (param1 != 1) {
                field_B = (ck) null;
            }
            param0.addMouseMotionListener(pg.pointerListener);
            param0.addFocusListener(pg.pointerListener);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "fk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private fk(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.child = param6;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "fk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(int param0) {
        field_B = null;
        if (param0 != 14512) {
            field_B = (ck) null;
        }
    }

    final void a(int param0, int param1, boolean param2, UiWidget param3, int param4, int param5) {
        la var7 = null;
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            var7 = lh.field_b;
            if (var7 != null && this.containsPointer(param1, -1, param5, param4, param0)) {
                if (this.listener instanceof rg) {
                    ((rg) ((Object) this.listener)).a((fk) (this), var7, 22176);
                    lh.field_b = null;
                    return;
                }
                if (!(var7.listener instanceof rg)) {
                    return;
                }
                ((rg) ((Object) var7.listener)).a((fk) (this), var7, 22176);
                lh.field_b = null;
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "fk.TA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static AwtRasterBuffer createCanvasRasterBuffer(boolean returnNullGuard, java.awt.Component component, int height, int width) {
        try {
            Class bufferImplementationClass = null;
            Throwable preferredImplementationFailure = null;
            RuntimeException bufferFactoryFailure = null;
            AwtRasterBuffer preferredRasterBuffer = null;
            ImageProducerRasterBuffer fallbackRasterBuffer = null;
            AwtRasterBuffer nullBufferForGuard = null;
            AwtRasterBuffer initializedPreferredBuffer = null;
            ImageProducerRasterBuffer initializedFallbackBuffer = null;
            RuntimeException factoryFailureBeforeComponentDescription = null;
            StringBuilder factoryMessagePrefix = null;
            String componentArgumentDescription = null;
            Throwable caughtFactoryThrowable = null;
            try {
              try {
                bufferImplementationClass = Class.forName("ve");
                if (returnNullGuard) {
                  nullBufferForGuard = (AwtRasterBuffer) null;
                  return nullBufferForGuard;
                }
                preferredRasterBuffer = (AwtRasterBuffer) (bufferImplementationClass.newInstance());
                preferredRasterBuffer.initialize(height, component, width, (byte) 127);
                initializedPreferredBuffer = (AwtRasterBuffer) (preferredRasterBuffer);
                return initializedPreferredBuffer;
              } catch (java.lang.Throwable preferredImplementationThrowable) {
                caughtFactoryThrowable = preferredImplementationThrowable;
                preferredImplementationFailure = caughtFactoryThrowable;
                fallbackRasterBuffer = new ImageProducerRasterBuffer();
                ((AwtRasterBuffer) ((Object) fallbackRasterBuffer)).initialize(height, component, width, (byte) 117);
                initializedFallbackBuffer = (ImageProducerRasterBuffer) (fallbackRasterBuffer);
                return (AwtRasterBuffer) ((Object) initializedFallbackBuffer);
              }
            } catch (java.lang.RuntimeException caughtBufferFactoryFailure) {
              caughtFactoryThrowable = caughtBufferFactoryFailure;
              bufferFactoryFailure = (RuntimeException) (Object) caughtFactoryThrowable;
              factoryFailureBeforeComponentDescription = (RuntimeException) (bufferFactoryFailure);
              factoryMessagePrefix = new StringBuilder().append("fk.E(").append(returnNullGuard).append(',');
              if (component == null) {
                componentArgumentDescription = "null";
              } else {
                componentArgumentDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) factoryFailureBeforeComponentDescription), ((StringBuilder) (Object) factoryMessagePrefix).append(componentArgumentDescription).append(',').append(height).append(',').append(width).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedFactoryFailure) {
            throw uncheckedFactoryFailure;
        } catch (Throwable unexpectedCheckedFactoryFailure) {
            throw new RuntimeException(unexpectedCheckedFactoryFailure);
        }
    }

    static {
        field_B = new ck(11, 0, 1, 2);
    }
}
