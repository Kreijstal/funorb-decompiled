/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MultiHandleSliderWidget extends ButtonWidget {
    private GrowableIntList handleValues;
    int railInset;
    int railOffsetY;
    private int maximumValue;
    static String sessionServerHost;

    final static void writeAchievementSubmissionPacket(int packetOpcode, AchievementSubmission submission, int methodGuard) {
        PacketBuffer packet = CacheReference.outgoingSessionBuffer;
        packet.writeCipherByte(packetOpcode, (byte) -88);
        packet.position = packet.position + 1;
        int payloadStart = packet.position;
        packet.writeByte((byte) -55, 1);
        packet.writeByte((byte) -31, submission.achievementId);
        packet.writeByte((byte) -104, submission.achievementCheckByte);
        packet.writeIntBE((byte) 95, submission.trackingBitsSnapshot);
        packet.writeIntBE((byte) 95, submission.trackingAccumulatorSnapshot);
        packet.writeIntBE((byte) 95, submission.primaryTrackingCounterSnapshot);
        packet.writeIntBE((byte) 95, submission.secondaryTrackingCounterSnapshot);
        packet.appendCrc32(127, payloadStart);
        if (methodGuard != 30175) {
            return;
        }
        try {
            packet.backpatchLengthByte(11700, -payloadStart + packet.position);
        } catch (RuntimeException packetWriteFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) packetWriteFailure), "ol.A(" + packetOpcode + ',' + (submission != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        sessionServerHost = null;
        if (methodGuard != 0) {
            sessionServerHost = (String) null;
        }
    }

    final int handleValueAt(int methodGuard, int index) {
        if (index < 0 || this.handleValues.size((byte) 101) <= index) {
            return -1;
        }
        int var3 = 34 / ((methodGuard - 88) / 32);
        return this.handleValues.get(index, (byte) 94);
    }

    final static int parseSignedDecimalInt(boolean clearSessionServerHost, CharSequence numberText) {
        RuntimeException parseFailureForContext = null;
        int parsedValueBeforeReturn = 0;
        RuntimeException parseFailureBeforeDescription = null;
        StringBuilder parseMessagePrefix = null;
        String numberDescription = null;
        RuntimeException caughtParseFailure = null;
        try {
          if (clearSessionServerHost) {
            sessionServerHost = (String) null;
          }
          parsedValueBeforeReturn = ReflectionCheckRequest.parseSignedInt(numberText, (byte) 39, 10, true);
          return parsedValueBeforeReturn;
        } catch (java.lang.RuntimeException parseFailure) {
          caughtParseFailure = parseFailure;
          parseFailureForContext = caughtParseFailure;
          parseFailureBeforeDescription = parseFailureForContext;
          parseMessagePrefix = new StringBuilder().append("ol.G(").append(clearSessionServerHost).append(',');
          if (numberText == null) {
            numberDescription = "null";
          } else {
            numberDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) parseFailureBeforeDescription), ((StringBuilder) (Object) parseMessagePrefix).append(numberDescription).append(')').toString());
        }
    }

    final boolean handlePointerPress(int parentY, int methodGuard, int parentX, int pointerButton, int pointerX, int pointerY, UiWidget eventContext) {
        int var13 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = Geoblox.clientControlFlowFlag;
        try {
          var8_int = -89 % ((-3 - methodGuard) / 38);
          if (!super.handlePointerPress(parentY, 93, parentX, pointerButton, pointerX, pointerY, eventContext)) {
            return false;
          }
          var9 = -parentX + pointerX - this.railInset;
          var10 = this.widgetWidth - 2 * this.railInset;
          if (var10 < var9) {
            var9 = var10;
          }
          if (0 > var9) {
            var9 = 0;
          }
          var9 = this.maximumValue * var9 / var10;
          if (pointerButton != 1) {
            if (pointerButton == 2) {
              var11 = 2147483647;
              var12 = -1;
              for (var13 = 0; var13 < this.handleValues.size((byte) 48); var13++) {
                var14 = this.handleValues.get(var13, (byte) 94) - var9;
                var14 = var14 * var14;
                if (~var11 < ~var14) {
                  var11 = var14;
                  var12 = var13;
                }
              }
              if ((0 <= var12)) {
                this.handleValues.removeAt(0, var12);
              }
            }
          } else {
            this.handleValues.add(var9, (byte) -93);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_26_0 = var8;
          stackIn_26_1 = new StringBuilder().append("ol.D(").append(parentY).append(',').append(methodGuard).append(',').append(parentX).append(',').append(pointerButton).append(',').append(pointerX).append(',').append(pointerY).append(',');
          if (eventContext == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int handleCount(byte methodGuard) {
        int var2 = -85 / ((36 - methodGuard) / 49);
        return this.handleValues.size((byte) 76);
    }

    final int maximumValue(int methodGuard) {
        if (methodGuard >= -121) {
            return -39;
        }
        return this.maximumValue;
    }

    private MultiHandleSliderWidget() throws Throwable {
        throw new Error();
    }

    static {
    }
}
