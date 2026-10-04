/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidget extends SingleChildWidget {
    static TextTemplateArgumentType textTemplateArgumentTypeEleven;

    final static byte[] readTextResourceBytes(int readGuard, String resourceKey) {
        RuntimeException resourceReadFailureForContext = null;
        byte[] nullResourceBytesForGuard = null;
        byte[] resourceBytesBeforeReturn = null;
        RuntimeException resourceReadFailureBeforeDescription = null;
        StringBuilder resourceReadMessagePrefix = null;
        String resourceKeyDescription = null;
        RuntimeException caughtResourceReadFailure = null;
        try {
          if (readGuard == 2229) {
            resourceBytesBeforeReturn = ImageProducerRasterBuffer.activeTextArchive.getNamedFile(0, resourceKey, "");
            return resourceBytesBeforeReturn;
          }
          nullResourceBytesForGuard = (byte[]) null;
          return nullResourceBytesForGuard;
        } catch (java.lang.RuntimeException resourceReadFailure) {
          caughtResourceReadFailure = resourceReadFailure;
          resourceReadFailureForContext = caughtResourceReadFailure;
          resourceReadFailureBeforeDescription = resourceReadFailureForContext;
          resourceReadMessagePrefix = new StringBuilder().append("fk.F(").append(readGuard).append(',');
          if (resourceKey == null) {
            resourceKeyDescription = "null";
          } else {
            resourceKeyDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) resourceReadFailureBeforeDescription), ((StringBuilder) (Object) resourceReadMessagePrefix).append(resourceKeyDescription).append(')').toString());
        }
    }

    final static void attachPointerInputListeners(java.awt.Component component, int methodGuard) {
        try {
            component.addMouseListener(GameplaySetupSupport.pointerListener);
            if (methodGuard != 1) {
                textTemplateArgumentTypeEleven = (TextTemplateArgumentType) null;
            }
            component.addMouseMotionListener(GameplaySetupSupport.pointerListener);
            component.addFocusListener(GameplaySetupSupport.pointerListener);
        } catch (RuntimeException pointerAttachmentFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerAttachmentFailure), "fk.C(" + (component != null ? "{...}" : "null") + ',' + methodGuard + ')');
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

    public static void releaseDropTargetSharedResources(int methodGuard) {
        textTemplateArgumentTypeEleven = null;
        if (methodGuard != 14512) {
            textTemplateArgumentTypeEleven = (TextTemplateArgumentType) null;
        }
    }

    final void handlePointerRelease(int parentX, int pointerX, boolean releaseGuard, UiWidget eventContext, int parentY, int pointerY) {
        DraggableWidget draggedWidget = null;
        try {
            super.handlePointerRelease(parentX, pointerX, releaseGuard, eventContext, parentY, pointerY);
            draggedWidget = ValidationState.activeDragWidget;
            if (draggedWidget != null && this.containsPointer(pointerX, -1, pointerY, parentY, parentX)) {
                if (this.listener instanceof DropListener) {
                    ((DropListener) ((Object) this.listener)).onDrop((DropTargetWidget) (this), draggedWidget, 22176);
                    ValidationState.activeDragWidget = null;
                    return;
                }
                if (!(draggedWidget.listener instanceof DropListener)) {
                    return;
                }
                ((DropListener) ((Object) draggedWidget.listener)).onDrop((DropTargetWidget) (this), draggedWidget, 22176);
                ValidationState.activeDragWidget = null;
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
                bufferImplementationClass = Class.forName("BufferedImageRasterBuffer");
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
        textTemplateArgumentTypeEleven = new TextTemplateArgumentType(11, 0, 1, 2);
    }
}
