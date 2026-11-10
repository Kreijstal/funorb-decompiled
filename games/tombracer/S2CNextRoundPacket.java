/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class S2CNextRoundPacket implements GamePacket {
    static ResourceArchive field_a;

    public final void decode(BitPacketBuffer param0, byte param1) {
        try {
          if (param1 != -19) {
            MatchScreen var4 = (MatchScreen) null;
            this.apply(113, (MatchProtocol) null, (MatchScreen) null);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ua.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, GameFont param1, String param2, int param3, int param4, int param5, int param6) {
        try {
          param1.a(12199, param5, param2, fm.a(false, param4), fm.a(false, param6), param3);
          if (param0 != 4) {
            field_a = (ResourceArchive) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ua.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void apply(int param0, MatchProtocol param1, MatchScreen param2) {
        try {
          param2.startNextRound((byte) -116);
          if (param0 != 2) {
            String var5 = (String) null;
            S2CNextRoundPacket.describeGameJoinStatus(-112, (String) null, -64);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ua.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 >= -101) {
          return;
        }
        field_a = null;
    }

    public final void encode(int param0, BitPacketBuffer param1) {
        try {
          if (param0 != 200) {
            field_a = (ResourceArchive) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ua.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(Object param0, int param1, int param2, boolean param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        ByteStorage var5 = null;
        byte[] stackIn_5_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param0 instanceof byte[]) {
            var4 = (byte[]) (param0);
            stackIn_5_0 = WidgetContainer.copyByteRange(param1, 0, param2, var4);
            return stackIn_5_0;
          }
          if (param0 instanceof ByteStorage) {
            var5 = (ByteStorage) (param0);
            stackIn_9_0 = var5.a((byte) -104, param1, param2);
            return stackIn_9_0;
          }
          if (param3) {
            S2CNextRoundPacket.releaseStatics(-63);
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("ua.F(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int abs(int param0, int param1) {
        int var2 = -61 / ((-53 - param1) / 48);
        if (0 > param0) {
          return -param0;
        }
        return param0;
    }

    final static String describeGameJoinStatus(int param0, String param1, int param2) {
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_33_0 = null;
        String stackIn_37_0 = null;
        String stackIn_41_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param2 >= -9) {
            field_a = (ResourceArchive) null;
          }
          if (param0 == 1) {
            stackIn_5_0 = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(103, MatchScoringObserver.field_e, new String[]{param1});
            return stackIn_5_0;
          }
          if (param0 == 2) {
            stackIn_9_0 = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(96, S2CRoundResultPacket.field_f, new String[]{param1});
            return stackIn_9_0;
          }
          if (param0 == 3) {
            stackIn_13_0 = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(102, np.field_V, new String[]{param1});
            return stackIn_13_0;
          }
          if (param0 == 4) {
            stackIn_17_0 = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(117, TouchSwitchBehaviour.field_o, new String[]{param1});
            return stackIn_17_0;
          }
          if (5 == param0) {
            stackIn_21_0 = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(85, TextureSampleOperator.field_o, new String[]{param1});
            return stackIn_21_0;
          }
          if (param0 == 6) {
            stackIn_24_0 = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(93, PrefabComponent.field_C, new String[]{param1});
            return stackIn_24_0;
          }
          if (param0 == 7) {
            stackIn_27_0 = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(110, TrackMountComponent.field_H, new String[]{param1});
            return stackIn_27_0;
          }
          if (8 == param0) {
            stackIn_30_0 = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(125, Locomotor.field_m, new String[]{param1});
            return stackIn_30_0;
          }
          if (11 == param0) {
            stackIn_33_0 = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(112, LegacySwitchModel.field_m, new String[]{param1});
            return stackIn_33_0;
          }
          if (12 == param0) {
            stackIn_37_0 = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(82, TestModel.field_p, new String[]{param1});
            return stackIn_37_0;
          }
          if (param0 != 13) {
            return null;
          }
          stackIn_41_0 = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(96, DoorwayModel.field_n, new String[]{param1});
          return stackIn_41_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("ua.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        cga var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          var4 = (cga) (aba.field_a.first(-80));
          while (var4 != null) {
            wj.a(var4, param0, -121);
            var4 = (cga) (aba.field_a.next(114));
          }
          if (param1 != 2) {
            return;
          }
          var2 = MovingWallComponent.field_N.first(-80);
          while (var2 != null) {
            TouchSwitchBehaviour.b(param0, param1 ^ -117);
            var2 = MovingWallComponent.field_N.next(param1 + 105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "ua.E(" + param0 + ',' + param1 + ')');
        }
    }

    static {
    }
}
