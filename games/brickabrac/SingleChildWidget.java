/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SingleChildWidget extends Widget implements WidgetContainer {
    Widget child;
    static boolean[] field_D;
    static String[] field_F;
    static IndexedSprite[] field_C;

    public static void f(byte param0) {
        field_C = null;
        field_F = null;
        if (param0 > -82) {
          String var2 = (String) null;
          SingleChildWidget.a((String) null, false);
        }
        field_D = null;
    }

    private final boolean b(boolean param0, Widget param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          stackIn_8_0 = (this.child != null) && (!this.child.isFocused(-124)) && (this.child.tryFocus(true, param1));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("h.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        SoundPlayback var2 = null;
        int var3 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        SoundPlayback var2Lifetime1;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          BackgroundScene.masterSoundGain = param1;
          if (param0 != 13894) {
            SingleChildWidget.a(-92, -23);
          }
          var2 = (SoundPlayback) (QuickChatPhraseDefinition.soundPlaybacks.first(param0 ^ -13940));
          while (var2 != null) {
            if (!var2.sourceNode.isLinked(0)) {
              var2.unlink((byte) 111);
            } else {
              var2.stream.setGain(BackgroundScene.masterSoundGain * var2.baseGain + 128 >> 8);
            }
            var2 = (SoundPlayback) (QuickChatPhraseDefinition.soundPlaybacks.next((byte) 116));
          }
          if (WidgetLayer.field_M != null) {
            var2Lifetime1 = (SoundPlayback) (WidgetLayer.field_M.first(param0 - 13977));
            while (var2Lifetime1 != null) {
              stackIn_14_0 = var2Lifetime1.sourceNode.isLinked(0);
              if (stackIn_14_0) {
                var2Lifetime1.stream.setGain(var2Lifetime1.baseGain * BackgroundScene.masterSoundGain + 128 >> 8);
              } else {
                var2Lifetime1.unlink((byte) 111);
              }
              var2Lifetime1 = (SoundPlayback) (WidgetLayer.field_M.next((byte) 116));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2_ref), "h.V(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.child != null &&
            this.child.isFocused(-127) &&
            this.child.handleWidgetKey(keyCode, (byte) 110, focusRoot, character)) {
            return true;
          }
          var5_int = keyCode;
          if (var5_int != 80) {
            if (obfuscationGuard == 110) {
              return false;
            }
            field_C = (IndexedSprite[]) null;
            return false;
          }
          if (IntArrayRequest.heldKeys[81]) {
            stackIn_9_0 = this.a(focusRoot, (byte) -35);
          } else {
            stackIn_9_0 = this.b(true, focusRoot);
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("h.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(character).append(')').toString());
        }
    }

    SingleChildWidget(int x, int y, int width, int height, WidgetRenderer renderer, WidgetListener listener) {
        super(x, y, width, height, renderer, listener);
    }

    String getTooltip(int obfuscationGuard) {
        String var3 = null;
        if (obfuscationGuard <= 6) {
          field_C = (IndexedSprite[]) null;
        }
        String var2 = super.getTooltip(66);
        if (null != this.child) {
          var3 = this.child.getTooltip(61);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final void setBounds(int height, int x, int y, byte obfuscationGuard, int width) {
        super.setBounds(height, x, y, obfuscationGuard, width);
        this.a((byte) -19);
    }

    final void clearFocus(boolean obfuscationGuard) {
        if (null != this.child) {
          this.child.clearFocus(obfuscationGuard);
        }
        if (obfuscationGuard) {
          this.isFocused(-98);
        }
    }

    final int e(byte param0) {
        int var2 = 100 / ((-17 - param0) / 43);
        return this.child != null ? this.child.e((byte) -71) : 0;
    }

    StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 24) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param3, param2 ^ 1595638000, param0, param1)) {
            this.a(param1, param0, param2 - 24, param3);
            this.a(param3, true, param1, param0);
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("h.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        try {
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
          if (null != this.child) {
            this.child.updatePointer(focusRoot, (byte) 0, parentX + this.x, parentY + this.y);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "h.WA(" + (focusRoot != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + parentX + ',' + parentY + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, Widget param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 > -125) {
            this.e((byte) 12);
          }
          stackIn_7_0 = (null != this.child) && (this.child.isFocused(-83)) && (this.child.a(param0, param1, param2, -126, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("h.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    void handlePointerRelease(int pointerY, int pointerX, int parentY, Widget focusRoot, int obfuscationGuard, int parentX) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (null != this.child) {
            this.child.handlePointerRelease(pointerY, pointerX, this.y + parentY, focusRoot, 19223, this.x + parentX);
          }
          if (obfuscationGuard != 19223) {
            field_C = (IndexedSprite[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("h.GA(").append(pointerY).append(',').append(pointerX).append(',').append(parentY).append(',');
          if (focusRoot == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(',').append(parentX).append(')').toString());
        }
    }

    final static void orderFacesByGroup(int bucketCountScratch, int faceIdScratch, byte obfuscationGuard, byte[] faceGroups, int[] groupOffsets) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = 0;
          if (obfuscationGuard != 114) {
            field_F = (String[]) null;
          }
          while (true) {
            if (var5_int >= ArcticBackground.faceDepthBucketCounts.length) {
              return;
            }
            bucketCountScratch = ArcticBackground.faceDepthBucketCounts[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = bucketCountScratch;
              bucketCountScratch--;
              if (0 == incrementValue$0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              faceIdScratch = ek.sortedFaceIds[incrementValue$1];
              dupTemp$2 = faceGroups[faceIdScratch];
              dupTemp$3 = groupOffsets[dupTemp$2];
              groupOffsets[dupTemp$2] = dupTemp$3 + 1;
              ek.sortedFaceIds[dupTemp$3] = faceIdScratch;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("h.FB(").append(bucketCountScratch).append(',').append(faceIdScratch).append(',').append(obfuscationGuard).append(',');
          if (faceGroups == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (groupOffsets == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(StringBuilder param0, boolean param1, Hashtable param2, int param3) {
        StringBuilder discarded$3 = null;
        int var5_int = 0;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          discarded$3 = param0.append('\n');
          for (var5_int = 0; param3 >= var5_int; var5_int++) {
            discarded$5 = param0.append(' ');
          }
          if (!param1) {
            return;
          }
          if (this.child == null) {
            discarded$4 = param0.append("null");
          } else {
            this.child.a(1 + param3, param2, 24, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("h.JB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean tryFocus(boolean obfuscationGuard, Widget focusRoot) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!obfuscationGuard) {
            return false;
          }
          stackIn_7_0 = (this.child != null) && (this.child.tryFocus(true, focusRoot));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("h.CA(").append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        if (layer == 0 &&
          null != this.renderer) {
          this.renderer.paintWidget(true, -20618, parentX, (Widget) (this), parentY);
        }
        if (null != this.child) {
          this.child.drawLayer(this.y + parentY, parentX + this.x, layer, (byte) -11);
        }
        if (obfuscationGuard != -11) {
          field_C = (IndexedSprite[]) null;
        }
    }

    Widget h(byte param0) {
        boolean discarded$0 = false;
        Widget var2 = this.child;
        if (param0 != 25) {
          Widget var3 = (Widget) null;
          discarded$0 = this.b(true, (Widget) null);
        }
        if (var2 == null) {
          return null;
        }
        if (!var2.isFocused(-95)) {
          return null;
        }
        return var2;
    }

    final static boolean a(int param0, int param1, int param2, byte param3, int param4, boolean param5, int param6) {
        if (param3 > -122) {
          return true;
        }
        if (DualLinkDeque.a(-4858)) {
          hc.a(param5, -7812, param4, param1);
          if (bm.contextActions != null &&
            bm.contextActions.pollAndDispatchAction(-2, param1, param6, param0, param5)) {
            cr.f((byte) -124);
            param5 = false;
          }
          SoundCache.a(124, param1, param5);
          Paddle.a(param2, param5, 124);
          param5 = false;
        }
        return param5;
    }

    private final boolean a(Widget param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -35) {
            field_C = (IndexedSprite[]) null;
          }
          stackIn_7_0 = (this.child != null) && (!this.child.isFocused(-117)) && (this.child.tryFocus(true, param0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("h.GB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean handlePointerPress(Widget focusRoot, int pointerX, int parentX, int parentY, int button, int pointerY, int obfuscationGuard) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 0) {
            this.h((byte) -11);
          }
          stackIn_6_0 = (this.child != null) && (this.child.handlePointerPress(focusRoot, pointerX, this.x + parentX, parentY + this.y, button, pointerY, 0));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("h.MA(");
          if (focusRoot == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(pointerX).append(',').append(parentX).append(',').append(parentY).append(',').append(button).append(',').append(pointerY).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    void a(byte param0) {
        if (param0 > -7) {
          field_D = (boolean[]) null;
        }
        if (this.child != null) {
          this.child.relayout(1);
        }
    }

    final boolean isFocused(int obfuscationGuard) {
        if (obfuscationGuard >= -49) {
          return true;
        }
        return null != this.h((byte) 25) ? true : false;
    }

    final static lo a(String param0, boolean param1) {
        lo stackIn_3_0 = null;
        lo stackIn_6_0 = null;
        lo stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        lo stackIn_24_0 = null;
        lo stackIn_37_0 = null;
        lo stackIn_42_0 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = la.field_a;
            return stackIn_3_0;
          }
          if (var2_int > 64) {
            stackIn_6_0 = BitPacketBuffer.field_r;
            return stackIn_6_0;
          }
          if (param0.charAt(0) == 34) {
            if (param0.charAt(var2_int - 1) != 34) {
              stackIn_11_0 = GameCanvas.field_c;
              return stackIn_11_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param0.charAt(var4);
              if (92 == var5) {
                stackIn_20_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_20_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_24_0 = GameCanvas.field_c;
                  return stackIn_24_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = param1 ? 1 : 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                -1 + var2_int != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_37_0 = GameCanvas.field_c;
                return stackIn_37_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (-1 == NinjaBackground.field_v.indexOf(var5Lifetime1)) {
                stackIn_42_0 = GameCanvas.field_c;
                return stackIn_42_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_48_0 = var2;
          stackIn_48_1 = new StringBuilder().append("h.W(");
          if (param0 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void g(byte param0) {
        RectangleBody.field_q = new UiComponent(0L, (UiComponent) null);
        if (param0 != -24) {
          return;
        }
        if (vd.field_e) {
          RectangleBody.field_q.addChild(DraggableWidget.field_N, 0);
        }
        RectangleBody.field_q.addChild(Ball.field_A, 0);
        ap.field_b = new vj(ArcticBackground.field_u, RectangleBody.field_q);
        fe.field_gb = new UiComponent(0L, (UiComponent) null);
        fe.field_gb.addChild(ap.field_b.field_d, 0);
        fe.field_gb.addChild(HighscorePackSelector.field_k, 0);
        NanoGameClock.b(param0 + 44);
    }

    static {
    }
}
