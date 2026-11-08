/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class SingleChildWidget extends UiWidget implements WidgetContainerMarker {
    static LoadingStepTracker field_L;
    UiWidget field_J;
    static String field_I;
    static int field_K;
    static String field_M;

    void updatePointer(UiWidget param0, int param1, int param2, boolean param3) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointer(param0, param1, param2, param3);
          if (null != this.field_J) {
            this.field_J.updatePointer(param0, this.field_t + param1, this.field_w + param2, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("en.MA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int getLastRenderPass(int param0) {
        if (param0 > -114) {
          field_K = 50;
        }
        return null != this.field_J ? this.field_J.getLastRenderPass(-127) : 0;
    }

    final static RasterBuffer createRasterBuffer(int param0, java.awt.Component param1, int param2, byte param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          RasterBuffer var5 = null;
          ImageProducerRasterBuffer var5_ref = null;
          java.awt.Component var6 = null;
          RasterBuffer stackIn_3_0 = null;
          ImageProducerRasterBuffer stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("BufferedImageRasterBuffer");
              if (param3 != -103) {
                var6 = (java.awt.Component) null;
                SingleChildWidget.createRasterBuffer(-5, (java.awt.Component) null, 72, (byte) -86);
              }
              var5 = (RasterBuffer) (var4.newInstance());
              var5.initialize(param1, 42, param2, param0);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ImageProducerRasterBuffer();
              ((RasterBuffer) ((Object) var5_ref)).initialize(param1, param3 ^ -77, param2, param0);
              stackIn_5_0 = var5_ref;
              return (RasterBuffer) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("en.Q(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_I = null;
        field_M = null;
        field_L = null;
        if (param0 <= 56) {
          CharSequence var2 = (CharSequence) null;
          SingleChildWidget.countChar(117, 'h', (CharSequence) null);
        }
    }

    void handlePointerRelease(int param0, boolean param1, UiWidget param2, int param3, int param4, int param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_J != null) {
            this.field_J.handlePointerRelease(param0, false, param2, param3 + this.field_w, param4, param5 + this.field_t);
          }
          if (param1) {
            field_M = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("en.AB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    SingleChildWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, WidgetListener param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static boolean fillIncomingBuffer(int param0, int param1) {
        try {
          if (param1 <= BackgroundSparkle.field_q.position) {
            return true;
          }
          if (TriangleSpanHelpers.field_e == null) {
            return false;
          }
          if (param0 <= 93) {
            return true;
          }
          int var2_int = TriangleSpanHelpers.field_e.available(0);
          if (var2_int > 0) {
            if (var2_int > -BackgroundSparkle.field_q.position + param1) {
              var2_int = param1 - BackgroundSparkle.field_q.position;
            }
            TriangleSpanHelpers.field_e.readFully(BackgroundSparkle.field_q.position, var2_int, BackgroundSparkle.field_q.payload, 0);
            AccountServerResult.field_k = ClockAndTextHelpers.monotonicMillis(0);
            BackgroundSparkle.field_q.position = BackgroundSparkle.field_q.position + var2_int;
            if (param1 > BackgroundSparkle.field_q.position) {
              return false;
            }
            BackgroundSparkle.field_q.position = 0;
            return true;
          }
          try {
            if (false) throw (IOException) null;
            if (var2_int >= 0 &&
              ConnectionTimingHelpers.millisecondsSinceLastReceive((byte) 127) <= 30000L) {
              return false;
            }
            SocialTabsPanel.closeGameSocket(false);
          } catch (IOException iOException) {
            SocialTabsPanel.closeGameSocket(false);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void clearKeyboardFocus(int param0) {
        if (null != this.field_J) {
          this.field_J.clearKeyboardFocus(-98);
        }
        if (param0 >= -63) {
          field_I = (String) null;
        }
    }

    final static int countChar(int param0, char param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = TetraLink.field_J;
        try {
          var3_int = 0;
          var4 = param2.length();
          for (var5 = 0; var5 < var4; var5++) {
            if (~param2.charAt(var5) == ~param1) {
              var3_int++;
            }
          }
          if (param0 > 85) {
            stackIn_12_0 = var3_int;
            return stackIn_12_0;
          }
          stackIn_10_0 = 117;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("en.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    String getTooltip(int param0) {
        String var3 = null;
        String var2 = super.getTooltip(param0);
        if (null != this.field_J) {
          var3 = this.field_J.getTooltip(param0 ^ 0);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    StringBuilder appendDebugTree(Hashtable param0, StringBuilder param1, int param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -372494750) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.beginDebugDescription(param0, param2, 119, param1)) {
            this.appendDebugProperties(-108, param1, param0, param2);
            this.appendChildDebugTrees(-31857, param2, param1, param0);
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("en.WA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean focusNext(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -384169950) {
            field_I = (String) null;
          }
          stackIn_6_0 = (this.field_J != null) && (this.field_J.focusNext(param0, -384169950));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("en.EB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean handlePointerPress(UiWidget param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -32738) {
            return false;
          }
          stackIn_7_0 = (this.field_J != null) && (this.field_J.handlePointerPress(param0, param1 + this.field_t, param2, param3 + this.field_w, param4 + 0, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("en.PA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean isFocused(int param0) {
        if (param0 != 3) {
          this.isFocused(-34);
        }
        return null != this.getFocusedChild(param0 ^ 10) ? true : false;
    }

    final void appendChildDebugTrees(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$19 = null;
        int var5_int = 0;
        StringBuilder discarded$21 = null;
        StringBuilder discarded$20 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TetraLink.field_J;
        try {
          discarded$19 = param2.append('\n');
          if (param0 != -31857) {
            return;
          }
          for (var5_int = 0; param1 >= var5_int; var5_int++) {
            discarded$21 = param2.append(' ');
          }
          if (null != this.field_J) {
            this.field_J.appendDebugTree(param3, param2, param1 + 1, -372494750);
          } else {
            discarded$20 = param2.append("null");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("en.W(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean onFocusedKey(int param0, UiWidget param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -19137) {
            return false;
          }
          stackIn_8_0 = (this.field_J != null) && (this.field_J.isFocused(3)) && (this.field_J.onFocusedKey(param0 + 0, param1, param2, param3, param4, param5, param6));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("en.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    UiWidget getFocusedChild(int param0) {
        UiWidget var2 = this.field_J;
        if (param0 != 9) {
          this.getFocusedChild(125);
        }
        if (var2 == null) {
          return null;
        }
        if (var2.isFocused(param0 - 6)) {
          return var2;
        }
        return null;
    }

    private final boolean focusPreviousChild(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -7) {
            field_I = (String) null;
          }
          stackIn_7_0 = (this.field_J != null) && (!this.field_J.isFocused(3)) && (this.field_J.focusNext(param0, -384169950));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("en.V(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean focusNextChild(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.field_J = (UiWidget) null;
          }
          stackIn_7_0 = (null != this.field_J) && (!this.field_J.isFocused(3)) && (this.field_J.focusNext(param0, -384169950));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("en.R(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static IndexedSprite loadIndexedSprite(int param0, byte param1, Archive param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        IndexedSprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -50) {
            field_I = (String) null;
          }
          if (AccountTermsPanel.decodeSpriteSheetFromArchive(param0, param2, param3, -114)) {
            stackIn_6_0 = ArchiveFactoryHelpers.createDecodedIndexedSprite((byte) 89);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (IndexedSprite) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("en.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        if (param3 == 0 &&
          this.field_H != null) {
          this.field_H.drawWidget((UiWidget) (this), param1, param2, true, true);
        }
        if (this.field_J != null) {
          this.field_J.drawLayer(0, param1 + this.field_t, this.field_w + param2, param3);
        }
        if (param0 != 0) {
          field_I = (String) null;
        }
    }

    final boolean handleKey(int param0, char param1, int param2, UiWidget param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_J != null &&
            this.field_J.isFocused(3) &&
            this.field_J.handleKey(param0, param1, 1, param3)) {
            return true;
          }
          var5_int = param0;
          if (var5_int == 80) {
            if (ErrorPrintHelpers.field_a[81]) {
              stackIn_10_0 = this.focusNextChild(param3, 0);
            } else {
              stackIn_10_0 = this.focusPreviousChild(param3, -62);
            }
            return stackIn_10_0;
          }
          if (param2 == 1) {
            return false;
          }
          field_M = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("en.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    void refreshChildLayout(byte param0) {
        if (this.field_J != null) {
          this.field_J.reapplyBounds((byte) 118);
        }
        if (param0 <= 116) {
          field_I = (String) null;
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, -126, param3, param4);
        int var6 = 111 / ((-61 - param2) / 51);
        this.refreshChildLayout((byte) 123);
    }

    static {
        field_I = "3D";
        field_M = "Sound: ";
    }
}
