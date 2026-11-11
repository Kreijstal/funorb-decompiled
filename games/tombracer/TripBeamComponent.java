/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TripBeamComponent extends SwitchComponent {
    static int[][] field_K;
    static String field_J;

    public static void releaseStatics(byte param0) {
        field_J = null;
        field_K = (int[][]) null;
        if (param0 != 25) {
          field_K = (int[][]) null;
        }
    }

    final static void playMusicTrack(int param0, int param1) {
        int var4 = 0;
        MusicTrack var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (null == MenuEntry.field_j) {
            return;
          }
          var2 = MenuEntry.field_j[param1];
          if (var2 == null) {
            DateInputWidget.loadMusicTrack(false, param1);
            var2 = MenuEntry.field_j[param1];
          }
          var3 = 32;
          if (param1 == 2 ||
            param1 == 3) {
            var3 = var3 << 2;
          }
          PortalBehaviour.a(9, true, var2, var3);
          if (param0 != 1) {
            return;
          }
          for (var4 = 0; 16 > var4; var4++) {
            MatchProtocol.fadeMusicChannelIn(var4, 0);
          }
          if (param1 != 1) {
            return;
          }
          S2CPlayerProfilePacket.fadeMusicChannelOut(112, 1);
          S2CPlayerProfilePacket.fadeMusicChannelOut(45, 2);
          S2CPlayerProfilePacket.fadeMusicChannelOut(param0 ^ 61, 3);
          S2CPlayerProfilePacket.fadeMusicChannelOut(61, 4);
          S2CPlayerProfilePacket.fadeMusicChannelOut(59, 5);
          S2CPlayerProfilePacket.fadeMusicChannelOut(125, 6);
          S2CPlayerProfilePacket.fadeMusicChannelOut(param0 ^ 57, 7);
          S2CPlayerProfilePacket.fadeMusicChannelOut(122, 8);
          S2CPlayerProfilePacket.fadeMusicChannelOut(param0 ^ 125, 13);
          S2CPlayerProfilePacket.fadeMusicChannelOut(84, 14);
          S2CPlayerProfilePacket.fadeMusicChannelOut(105, 15);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var2_ref), "er.TB(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          field_J = (String) null;
          return false;
        }
        return false;
    }

    TripBeamComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        TripBeamBehaviour var5 = null;
        ModelCodec var6 = null;
        BlockModel var7 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new Trap(param2, param0);
          var4.setSize((byte) -11, this.height, this.width);
          var4.setObstructionLevel(param1, 0);
          var4.addBehaviour((byte) 83, (Behaviour) (new SimpleBlockBehaviour(param2, param0)));
          var5 = new TripBeamBehaviour(param2, param0);
          var5.setTimingPattern((byte) -8, new TimingPattern(new int[]{}));
          var5.setMaxBeamLength(0, 636);
          this.bindSwitchState(var5, (byte) -107);
          var4.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = rm.field_a;
          var7 = (BlockModel) (var6.createModel(7, 82));
          var7.setVariant(119, 16);
          var4.addModel(var5, (byte) 124, var7);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("er.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean hasInitialState(byte param0) {
        if (param0 != 93) {
          return true;
        }
        return true;
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(-77, 2097152, 2097152);
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          field_K = (int[][]) null;
          return false;
        }
        return false;
    }

    TripBeamComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          field_K = (int[][]) null;
          return 7;
        }
        return 7;
    }

    final static boolean hasAnyMask52(int param0, int param1, int param2) {
        if (param2 == 52) {
          return (param0 & 52) != 0 ? true : false;
        }
        field_K = (int[][]) null;
        return (param0 & 52) != 0 ? true : false;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          if (param0) {
            BitPacketBuffer var4 = (BitPacketBuffer) null;
            this.encode(false, (BitPacketBuffer) null);
          }
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "er.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          return false;
        }
        return true;
    }

    final int getMaxTargets(int param0) {
        if (param0 != 31609) {
          return 59;
        }
        return 3;
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          this.getMaxTargets(-5);
          return false;
        }
        return false;
    }

    static {
        field_J = "Moveable blocks";
    }
}
