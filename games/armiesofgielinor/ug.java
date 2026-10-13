/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ug extends IOException {
    static UiSelectionState field_c;
    static int field_b;
    static int field_a;

    final static void a(int param0, Battlefield param1, boolean param2) {
        int var3_int = param1.localPlayer;
        int var4 = param1.computeStateChecksum(true, var3_int);
        System.out.println("--- STATE DUMP REQUESTED - SERVER CHECKSUM: " + Integer.toString(RadialSummonMenu.field_d, 16) + " SERVER CHECKSUM: " + Integer.toString(param1.computeStateChecksum(true, var3_int), 16) + " ---");
        System.out.println(param1.describeBattlefield(var3_int, -248));
        if (param0 != 0) {
          return;
        }
        try {
          System.out.println("--- STATE DUMP ENDS: " + Integer.toString(RadialSummonMenu.field_d, 16) + " ---");
          EmailValidator.outgoingPacket.writeCipheredOpcode(32161, 72);
          EmailValidator.outgoingPacket.writeInt((byte) -117, RadialSummonMenu.field_d);
          EmailValidator.outgoingPacket.writeInt((byte) -98, var4);
          if (param2) {
            hb.$cfr$intArgs$a$e9dea5688aa5(116, 0);
            dj.a((byte) -125);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ug.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static java.awt.Frame openFullscreenFrame(int bitDepth, int refreshRate, int obfuscationGuard, PlatformTaskService platformService, int width, int height) {
        int modeIndex = 0;
        Object unavailableFrame = null;
        Object unmatchedFrame = null;
        Object failedFrame = null;
        java.awt.Frame openedFrame = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String serviceDescription = null;
        RuntimeException caughtFailure = null;
        FullscreenDisplayMode[] displayModes = null;
        RuntimeException failure = null;
        int matchedMode = 0;
        java.awt.Frame frame = null;
        int obfuscationControl = 0;
        CharSequence guardText = null;
        FullscreenDisplayMode[] returnedModes = null;
        PlatformTask enterTask = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != -1) {
            guardText = (CharSequence) null;
            ug.a(99, (CharSequence) null);
          }
          if (!platformService.supportsFullscreen(false)) {
            return null;
          }
          if (bitDepth == 0) {
            returnedModes = ValidatedTextWidget.getFullscreenDisplayModes(obfuscationGuard ^ 109, platformService);
            displayModes = returnedModes;
            if (displayModes == null) {
              unavailableFrame = null;
              return (java.awt.Frame) (unavailableFrame);
            }
            matchedMode = 0;
            for (modeIndex = 0; returnedModes.length > modeIndex; modeIndex++) {
              if (width == returnedModes[modeIndex].width &&
                height == returnedModes[modeIndex].height && ((refreshRate == 0 ||
                returnedModes[modeIndex].refreshRate == refreshRate) &&
                (matchedMode == 0 ||
                !(returnedModes[modeIndex].bitDepth <= bitDepth)))) {
                bitDepth = returnedModes[modeIndex].bitDepth;
                matchedMode = 1;
              }
            }
            if (matchedMode == 0) {
              unmatchedFrame = null;
              return (java.awt.Frame) (unmatchedFrame);
            }
          }
          enterTask = platformService.enterFullscreenAsync(true, height, width, refreshRate, bitDepth);
          while (enterTask.status == 0) {
            SpriteButtonPainter.a(10L, 0);
          }
          frame = (java.awt.Frame) (enterTask.result);
          if (frame == null) {
            return null;
          }
          if (2 != enterTask.status) {
            openedFrame = frame;
            return openedFrame;
          }
          ViewportManager.exitFullscreen(frame, platformService, -2);
          failedFrame = null;
          return (java.awt.Frame) (failedFrame);
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ug.A(").append(bitDepth).append(',').append(refreshRate).append(',').append(obfuscationGuard).append(',');
          if (platformService == null) {
            serviceDescription = "null";
          } else {
            serviceDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(serviceDescription).append(',').append(width).append(',').append(height).append(')').toString());
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 16) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var2 = BattleViewportResizeHandler.decodeBase37DisplayName(0, DraggableWidgetContainer.a(param1, 0));
          if (var2 == null) {
            var2 = "";
          }
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("ug.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 16) {
          field_c = (UiSelectionState) null;
        }
    }

    ug(String param0) {
        super(param0);
    }

    static {
        field_c = new UiSelectionState(1);
    }
}
