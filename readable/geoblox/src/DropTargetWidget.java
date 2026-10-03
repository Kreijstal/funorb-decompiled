/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidget extends SingleChildWidget {
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
          stackIn_7_0 = var2;
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

    private DropTargetWidget(int x, int y, int width, int height, WidgetRenderer renderer, WidgetListener listener, UiWidget child) {
        super(x, y, width, height, renderer, listener);
        try {
            this.child = child;
        } catch (RuntimeException dropTargetConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) dropTargetConstructionFailure), "fk.<init>(" + x + ',' + y + ',' + width + ',' + height + ',' + (renderer != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ',' + (child != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(int param0) {
        field_B = null;
        if (param0 != 14512) {
            field_B = (ck) null;
        }
    }

    final void handlePointerRelease(int parentX, int pointerX, boolean releaseGuard, UiWidget eventContext, int parentY, int pointerY) {
        DraggableWidget draggedWidget = null;
        try {
            super.handlePointerRelease(parentX, pointerX, releaseGuard, eventContext, parentY, pointerY);
            draggedWidget = lh.activeDragWidget;
            if (draggedWidget != null && this.containsPointer(pointerX, -1, pointerY, parentY, parentX)) {
                if (this.listener instanceof DropListener) {
                    ((DropListener) ((Object) this.listener)).onDrop((DropTargetWidget) (this), draggedWidget, 22176);
                    lh.activeDragWidget = null;
                    return;
                }
                if (!(draggedWidget.listener instanceof DropListener)) {
                    return;
                }
                ((DropListener) ((Object) draggedWidget.listener)).onDrop((DropTargetWidget) (this), draggedWidget, 22176);
                lh.activeDragWidget = null;
            }
        } catch (RuntimeException dropReleaseFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) dropReleaseFailure), "fk.TA(" + parentX + ',' + pointerX + ',' + releaseGuard + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentY + ',' + pointerY + ')');
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
                initializedPreferredBuffer = preferredRasterBuffer;
                return initializedPreferredBuffer;
              } catch (java.lang.Throwable preferredImplementationThrowable) {
                caughtFactoryThrowable = preferredImplementationThrowable;
                preferredImplementationFailure = caughtFactoryThrowable;
                fallbackRasterBuffer = new ImageProducerRasterBuffer();
                ((AwtRasterBuffer) ((Object) fallbackRasterBuffer)).initialize(height, component, width, (byte) 117);
                initializedFallbackBuffer = fallbackRasterBuffer;
                return (AwtRasterBuffer) ((Object) initializedFallbackBuffer);
              }
            } catch (java.lang.RuntimeException caughtBufferFactoryFailure) {
              caughtFactoryThrowable = caughtBufferFactoryFailure;
              bufferFactoryFailure = (RuntimeException) (Object) caughtFactoryThrowable;
              factoryFailureBeforeComponentDescription = bufferFactoryFailure;
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
