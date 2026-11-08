/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MarkerSlider extends TextButton {
    int field_R;
    static String field_Q;
    int field_T;
    static int field_U;
    static String[] field_S;
    static int[] field_Y;
    static NineSliceFrame field_N;
    static RequestState field_X;
    static int[] field_O;
    private int field_P;
    static int field_V;
    private GrowableIntList field_W;

    final static boolean isOverlayOpen(byte param0) {
        boolean stackIn_9_0 = false;
        if (param0 < 108) {
          field_U = -99;
        }
        stackIn_9_0 = (null != ProxySocketConnector.field_n) || (ConditionalTextValue.isAccountNamePromptOpen(-10093)) || (null != AccountTermsPanel.field_M) || (CanvasRasterBuffer.hasPopupOrQuickChat(12742));
        return stackIn_9_0;
    }

    final int getMarkerCount(byte param0) {
        int var2 = 108 / ((9 - param0) / 53);
        return this.field_W.size(1);
    }

    final static void returnToLoginStage(int param0) {
        if (!IconTextComponent.field_Nb) {
          throw new IllegalStateException();
        }
        AlphaContainer.field_I = true;
        if (param0 != -20822) {
          MarkerSlider.returnToLoginStage(-68);
        }
        NodeHashTable.reopenLoginDialog(0, true);
        EmailValidationState.field_b = 0;
    }

    final int getMarker(byte param0, int param1) {
        if (param1 < 0 ||
          param1 >= this.field_W.size(1)) {
          return -1;
        }
        if (param0 > -84) {
          field_U = -103;
        }
        return this.field_W.get(param1, -124);
    }

    final int getRange(int param0) {
        if (param0 != -1) {
          MarkerSlider.storeIncomingPacketBlock((byte) 62);
        }
        return this.field_P;
    }

    final boolean handlePointerPress(byte param0, UiComponent param1, int param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Pixelate.field_H ? 1 : 0;
        try {
          if (!super.handlePointerPress(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_R - param5 + param4;
          var9 = this.field_E - 2 * this.field_R;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = this.field_P * var8_int / var9;
          if (1 != param2) {
            if (param2 != 2) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; var12 < this.field_W.size(1); var12++) {
              var13 = this.field_W.get(var12, -69) - var8_int;
              var13 = var13 * var13;
              if (var10 > var13) {
                var11 = var12;
                var10 = var13;
              }
            }
            if (var11 >= 0) {
              this.field_W.removeAt((byte) -84, var11);
            }
          } else {
            this.field_W.add(true, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_28_0 = var8;
          stackIn_28_1 = new StringBuilder().append("tm.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void storeIncomingPacketBlock(byte param0) {
        try {
          if (null != MusicCrossfadeStream.field_p) {
            try {
              MusicCrossfadeStream.field_p.seek(0L, -112);
              MusicCrossfadeStream.field_p.write(24, MusicCrossfadeStream.field_o.position, (byte) -121, MusicCrossfadeStream.field_o.payload);
            } catch (Exception exception) {
            }
          }
          if (param0 >= -45) {
            field_N = (NineSliceFrame) null;
          }
          MusicCrossfadeStream.field_o.position = MusicCrossfadeStream.field_o.position + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(byte param0) {
        field_Q = null;
        field_O = null;
        field_X = null;
        if (param0 != -89) {
          return;
        }
        field_Y = null;
        field_S = null;
        field_N = null;
    }

    private MarkerSlider() throws Throwable {
        throw new Error();
    }

    final static int reverseBits(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          var3_int = 0;
          if (param1 != -23439) {
            field_O = (int[]) null;
          }
          while (param2 > 0) {
            var3_int = param0 & 1 | var3_int << 1;
            param2--;
            param0 = param0 >>> 1;
          }
          stackIn_6_0 = var3_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var3), "tm.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_Q = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_V = -1;
        field_U = -1;
        field_Y = new int[]{5, 24, 50};
    }
}
