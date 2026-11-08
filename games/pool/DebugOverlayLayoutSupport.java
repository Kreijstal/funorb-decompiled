/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DebugOverlayLayoutSupport {
    static Calendar field_b;
    static DebugTuningSlider[] field_a;

    final static String formatPageIndicator(int param0, int param1) {
        if (param1 >= 79) {
          return param0 + 1 + "/" + ArchiveLoadSequence.instructionsPages.length;
        }
        field_b = (Calendar) null;
        return param0 + 1 + "/" + ArchiveLoadSequence.instructionsPages.length;
    }

    public static void releaseStatics(boolean param0) {
        field_b = null;
        if (param0) {
          field_a = (DebugTuningSlider[]) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static String joinCharSequences(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -52) {
            stackIn_4_0 = TutorialController.joinText(0, (byte) -112, param1, param1.length);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("aq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void detachMouseHandler(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != 0) {
          return;
        }
        if (CompressedContainerSupport.field_g == null) {
          return;
        }
        var1 = CompressedContainerSupport.field_g;
        synchronized (var1) {
          CompressedContainerSupport.field_g = null;
        }
    }

    final static void positionSharedOverlay(int param0) {
        ScrollPane.field_Ob = -Js5Transport.field_q.field_w + SoftwareRasterizer.width >> 1;
        ArrayWidgetGroup.field_M = -Js5Transport.field_q.field_A;
        MidiPcmStream.field_H = ScrollPane.field_Ob + 224;
        KillerBallSkin.b(param0, (byte) -94);
    }

    static {
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_a = null;
    }
}
