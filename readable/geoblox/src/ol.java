/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends ButtonWidget {
    private sj field_F;
    int field_H;
    int field_G;
    private int field_E;
    static String field_I;

    final static void writeAchievementSubmissionPacket(int packetOpcode, AchievementSubmission submission, int methodGuard) {
        PacketBuffer packet = fj.field_q;
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

    public static void f(int param0) {
        field_I = null;
        if (param0 != 0) {
            field_I = (String) null;
        }
    }

    final int c(int param0, int param1) {
        if (param1 < 0 || this.field_F.a((byte) 101) <= param1) {
            return -1;
        }
        int var3 = 34 / ((param0 - 88) / 32);
        return this.field_F.a(param1, (byte) 94);
    }

    final static int a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_I = (String) null;
          }
          stackIn_3_0 = eg.a(param1, (byte) 39, 10, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ol.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
          var9 = -parentX + pointerX - this.field_H;
          var10 = this.widgetWidth - 2 * this.field_H;
          if (var10 < var9) {
            var9 = var10;
          }
          if (0 > var9) {
            var9 = 0;
          }
          var9 = this.field_E * var9 / var10;
          if (pointerButton != 1) {
            if (pointerButton == 2) {
              var11 = 2147483647;
              var12 = -1;
              for (var13 = 0; var13 < this.field_F.a((byte) 48); var13++) {
                var14 = this.field_F.a(var13, (byte) 94) - var9;
                var14 = var14 * var14;
                if (~var11 < ~var14) {
                  var11 = var14;
                  var12 = var13;
                }
              }
              if (!(0 > var12)) {
                this.field_F.a(0, var12);
              }
            }
          } else {
            this.field_F.b(var9, (byte) -93);
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

    final int a(byte param0) {
        int var2 = -85 / ((36 - param0) / 49);
        return this.field_F.a((byte) 76);
    }

    final int g(int param0) {
        if (param0 >= -121) {
            return -39;
        }
        return this.field_E;
    }

    private ol() throws Throwable {
        throw new Error();
    }

    static {
    }
}
