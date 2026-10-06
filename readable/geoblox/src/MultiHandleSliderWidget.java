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
        int handleLookupGuardQuotient = 34 / ((methodGuard - 88) / 32);
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
        int handleSearchIndex = 0;
        RuntimeException pointerPressFailureBeforeDescription = null;
        StringBuilder pointerPressMessagePrefix = null;
        String eventContextDescription = null;
        RuntimeException caughtPointerPressFailure = null;
        int pointerPressGuardResidue = 0;
        RuntimeException pointerPressFailureForContext = null;
        int railOffsetThenHandleValue = 0;
        int usableRailWidth = 0;
        int smallestSquaredDistance = 0;
        int selectedHandleIndex = 0;
        int valueDeltaThenSquaredDistance = 0;
        int clientControlFlowSnapshot = 0;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          pointerPressGuardResidue = -89 % ((-3 - methodGuard) / 38);
          if (!super.handlePointerPress(parentY, 93, parentX, pointerButton, pointerX, pointerY, eventContext)) {
            return false;
          }
          railOffsetThenHandleValue = -parentX + pointerX - this.railInset;
          usableRailWidth = this.widgetWidth - 2 * this.railInset;
          if (usableRailWidth < railOffsetThenHandleValue) {
            railOffsetThenHandleValue = usableRailWidth;
          }
          if (0 > railOffsetThenHandleValue) {
            railOffsetThenHandleValue = 0;
          }
          railOffsetThenHandleValue = this.maximumValue * railOffsetThenHandleValue / usableRailWidth;
          if (pointerButton != 1) {
            if (pointerButton == 2) {
              smallestSquaredDistance = 2147483647;
              selectedHandleIndex = -1;
              for (handleSearchIndex = 0; handleSearchIndex < this.handleValues.size((byte) 48); handleSearchIndex++) {
                valueDeltaThenSquaredDistance = this.handleValues.get(handleSearchIndex, (byte) 94) - railOffsetThenHandleValue;
                valueDeltaThenSquaredDistance = valueDeltaThenSquaredDistance * valueDeltaThenSquaredDistance;
                if (~smallestSquaredDistance < ~valueDeltaThenSquaredDistance) {
                  smallestSquaredDistance = valueDeltaThenSquaredDistance;
                  selectedHandleIndex = handleSearchIndex;
                }
              }
              if (0 <= selectedHandleIndex) {
                this.handleValues.removeAt(0, selectedHandleIndex);
              }
            }
          } else {
            this.handleValues.add(railOffsetThenHandleValue, (byte) -93);
          }
          return true;
        } catch (java.lang.RuntimeException pointerPressFailure) {
          caughtPointerPressFailure = pointerPressFailure;
          pointerPressFailureForContext = caughtPointerPressFailure;
          pointerPressFailureBeforeDescription = pointerPressFailureForContext;
          pointerPressMessagePrefix = new StringBuilder().append("ol.D(").append(parentY).append(',').append(methodGuard).append(',').append(parentX).append(',').append(pointerButton).append(',').append(pointerX).append(',').append(pointerY).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerPressFailureBeforeDescription), ((StringBuilder) (Object) pointerPressMessagePrefix).append(eventContextDescription).append(')').toString());
        }
    }

    final int handleCount(byte methodGuard) {
        int handleCountGuardQuotient = -85 / ((36 - methodGuard) / 49);
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
