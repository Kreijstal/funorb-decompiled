/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FourStatHiscoreRequest extends IntrusiveNode {
    int rowLimit;
    static ServerDataReadRequest field_o;
    int requestId;
    static long field_k;
    static String acceptText;

    public static void releaseStatics(int param0) {
        if (param0 != -11807) {
          FourStatHiscoreRequest.gameContainer(false);
        }
        field_o = null;
        acceptText = null;
    }

    final static void sendSessionStatistics(byte guard, int opcode, SessionStatisticsSubmission submission) {
        IsaacPacketBuffer var8 = null;
        IsaacPacketBuffer var9 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var8 = InwardSparkParticle.outgoingPacket;
          var9 = var8;
          var9.writeCipherByte(opcode, 8);
          var9.position = var9.position + 1;
          var4 = var9.position;
          var9.writeByte((byte) 55, 1);
          int var5 = 104 / ((30 - guard) / 34);
          var9.writeShort(-77, submission.requestId);
          var9.writeShort(-92, submission.tableId);
          var9.writeShort(123, submission.variantId);
          var9.writeInt(48, submission.field_n);
          var9.writeInt(48, submission.field_o);
          var9.writeInt(48, submission.field_p);
          var9.writeInt(48, submission.field_k);
          var9.writeByte((byte) 119, submission.values.length);
          for (var6 = 0; submission.values.length > var6; var6++) {
            var8.writeInt(48, submission.values[var6]);
          }
          var9.appendCrc32(var4, false);
          var9.patchByteLength(var9.position - var4, -13745);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "km.C(" + guard + ',' + opcode + ',' + (submission != null ? "{...}" : "null") + ')');
        }
    }

    final static void updateEnemySteering(byte param0) {
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        Drone var2 = null;
        Drone var3 = null;
        int var4 = 0;
        Drone var6 = null;
        int var7 = 0;
        Drone var3Lifetime1;
        Drone var3Lifetime2;
        Drone var6Lifetime1;
        Drone var6Lifetime1Lifetime1;
        Drone var6Lifetime1Lifetime2;
        int var1_intLifetime1;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null != SpriteMask.drones) {
            for (var1_int = 0; var1_int < ServerDataWriteRequest.droneSlotLimit; var1_int++) {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted0 = true;
              var2 = SpriteMask.drones[var1_int];
              var3 = var2;
              var6 = var3;
              var3Lifetime1 = var2;
              if (var2 != null &&
                var1_int != 0 &&
                !var2.isAsleep(-1)) {
                var3Lifetime2 = SpriteMask.drones[0];
                var6Lifetime1 = var3Lifetime2;
                var6Lifetime1Lifetime1 = var3Lifetime2;
                if (var3Lifetime2 != null) {
                  var4 = var2.field_a;
                  if (MessageDialog.arcadeMode) {
                    if (DroneProximitySupport.isWithinRadius(var3Lifetime2.yQ8, var4, -114, var2.xQ8, var3Lifetime2.xQ8, var2.yQ8) &&
                      var3Lifetime2.isAliveAndSpawned((byte) -63) &&
                      var3Lifetime2.hasVelocityOnBothAxes((byte) 125)) {
                      var2.steerTowardPoint(false, var3Lifetime2.yQ8, var3Lifetime2.xQ8);
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      for (var5 = 0; ServerDataWriteRequest.droneSlotLimit > var5; var5++) {
                        var6Lifetime1Lifetime2 = SpriteMask.drones[var5];
                        if (~var5 != ~var1_int &&
                          var6Lifetime1Lifetime2 != null &&
                          var6Lifetime1Lifetime2.hasVelocityOnBothAxes((byte) 125) &&
                          DroneProximitySupport.isWithinRadius(var6Lifetime1Lifetime2.yQ8, var4, -114, var2.xQ8, var6Lifetime1Lifetime2.xQ8, var2.yQ8) &&
                          var6Lifetime1Lifetime2.isAliveAndSpawned((byte) -63)) {
                          var2.steerTowardPoint(false, var3Lifetime2.yQ8, var3Lifetime2.xQ8);
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                      }
                      decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                    }
                  }
                  if ((decompiledFrameRemainder0) && (decompiledFrameCompleted0) && (DroneProximitySupport.isWithinRadius(var3Lifetime2.yQ8, var4, -115, var2.xQ8, var3Lifetime2.xQ8, var2.yQ8) &&
                    var3Lifetime2.isAliveAndSpawned((byte) -63) &&
                    var3Lifetime2.hasVelocityOnBothAxes((byte) 125))) {
                    var2.steerTowardPoint(false, var3Lifetime2.yQ8, var3Lifetime2.xQ8);
                  }
                }
              }
            }
          }
          var1_intLifetime1 = -120 / ((-61 - param0) / 63);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "km.D(" + param0 + ')');
        }
    }

    final static java.awt.Container gameContainer(boolean param0) {
        if (param0) {
          field_o = (ServerDataReadRequest) null;
        }
        if (PrimitiveType.field_c != null) {
          return (java.awt.Container) ((Object) PrimitiveType.field_c);
        }
        return (java.awt.Container) ((Object) LegacyOpenGlUnlitEffect.activeApplet(2));
    }

    private FourStatHiscoreRequest() throws Throwable {
        throw new Error();
    }

    static {
        field_o = null;
        acceptText = "Accept";
    }
}
