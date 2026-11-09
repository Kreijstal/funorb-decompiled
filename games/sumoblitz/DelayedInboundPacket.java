/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedInboundPacket extends IntrusiveNode {
    byte[] payload;
    int opcode;
    long deliveryTimeMillis;

    final static void updatePlayerControls(int param0) {
        int stackIn_9_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_1 = 0;
        Drone var1;
        int var2;
        int var3;
        int var4;
        Drone var5;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var5 = SpriteMask.drones[0];
        var1 = var5;
        if (param0 < 18) {
          return;
        }
        if (ar.field_G != 1) {
          if (!hw.field_b[99] &&
            !hw.field_b[Sumoblitz.field_I]) {
            stackIn_9_0 = 0;
          } else {
            stackIn_9_0 = 256;
          }
          if (!hw.field_b[98] &&
            !hw.field_b[nv.field_c]) {
            stackIn_13_1 = 0;
          } else {
            stackIn_13_1 = -256;
          }
          var3 = stackIn_9_0 + stackIn_13_1;
          if (!hw.field_b[96] &&
            !hw.field_b[SoftwareRenderContext.field_d]) {
            stackIn_17_0 = 0;
          } else {
            stackIn_17_0 = -256;
          }
          if (!hw.field_b[97] &&
            !hw.field_b[LegacyOpenGlGraphicsHeap.field_o]) {
            stackIn_22_1 = 0;
          } else {
            stackIn_22_1 = 256;
          }
          var2 = stackIn_17_0 + stackIn_22_1;
          if (var2 != 0 &&
            var3 != 0) {
            var5.steerNormalized(-109, var3 / 22, var2 / 22);
            kp.field_a = true;
            if (!hw.field_b[83]) {
              var5.resetBlastButtonHold(-95);
              return;
            }
            if (var5.isBlastButtonHoldComplete(123)) {
              var5.activateBlast((byte) -90);
              return;
            }
            var5.advanceBlastButtonHold(false);
            if (var5.blastButtonHeldTicks != 1) {
              return;
            }
            if (!var5.isBlastReady(20)) {
              gn.a(33, true);
            } else {
              gn.a(29, true);
            }
            return;
          }
          if (var2 != 0) {
            var5.steerNormalized(-119, var3, var2);
            kp.field_a = true;
          } else {
            if (var3 != 0) {
              var5.steerNormalized(-119, var3, var2);
              kp.field_a = true;
              if (!hw.field_b[83]) {
                var5.resetBlastButtonHold(-95);
                return;
              }
              if (var5.isBlastButtonHoldComplete(123)) {
                var5.activateBlast((byte) -90);
                return;
              }
              var5.advanceBlastButtonHold(false);
              if (var5.blastButtonHeldTicks != 1) {
                return;
              }
              if (!var5.isBlastReady(20)) {
                gn.a(33, true);
              } else {
                gn.a(29, true);
              }
              return;
            }
          }
        } else {
          var5.steerTowardPoint(false, pi.field_e << 8, ko.field_p << 8);
          kp.field_a = true;
        }
        if (!hw.field_b[83]) {
          var5.resetBlastButtonHold(-95);
          return;
        }
        if (var5.isBlastButtonHoldComplete(123)) {
          var5.activateBlast((byte) -90);
          return;
        }
        var5.advanceBlastButtonHold(false);
        if (var5.blastButtonHeldTicks != 1) {
          return;
        }
        if (!var5.isBlastReady(20)) {
          gn.a(33, true);
        } else {
          gn.a(29, true);
        }
    }

    DelayedInboundPacket(long deliveryTimeMillis, int opcode, byte[] payload) {
        try {
          this.opcode = opcode;
          this.payload = payload;
          this.deliveryTimeMillis = deliveryTimeMillis;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ub.<init>(" + deliveryTimeMillis + ',' + opcode + ',' + (payload != null ? "{...}" : "null") + ')');
        }
    }

    final static Sprite[] a(ResourceArchive param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite[] stackIn_2_0 = null;
        Sprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.groupId(0, param1);
          if (param2 != -56) {
            stackIn_2_0 = (Sprite[]) null;
            return stackIn_2_0;
          }
          var5 = param0.fileId(var4_int, param3, (byte) 126);
          stackIn_4_0 = kr.a(19889, param0, var5, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ub.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
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
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
    }
}
