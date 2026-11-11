/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WhiteLightShooterComponent extends ShooterComponent {
    static String field_L;
    static String field_J;
    static ToolkitSprite field_K;

    final static Room createCourseRoom(int param0, boolean param1, PlayerSimulation param2, int param3, byte param4) {
        Object var5 = null;
        RoomDefinition var5_ref = null;
        RuntimeException var5_ref2 = null;
        Room stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -120) {
            WhiteLightShooterComponent.a(106, (byte) 37, 71);
          }
          var5 = null;
          var5_ref = PlayerInputQueue.findRoomDefinition(95, param0);
          stackIn_3_0 = StringListNode.createRoom(param3, param1, var5_ref, 21789, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref2 = decompiledCaughtException;
          stackIn_6_0 = var5_ref2;
          stackIn_6_1 = new StringBuilder().append("tp.WB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          field_K = (ToolkitSprite) null;
          return false;
        }
        return false;
    }

    final boolean canRandomisePhase(int param0) {
        if (param0 != 128) {
          this.usesPhaseOffset(18);
          return true;
        }
        return true;
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          this.applyDefaults((byte) -23);
        }
        return false;
    }

    WhiteLightShooterComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final static boolean a(int param0, byte param1, int param2) {
        boolean stackIn_5_0 = false;
        boolean stackIn_10_0 = false;
        if (param1 != 3) {
          return true;
        }
        stackIn_5_0 = ((458752 & param2) != 0);
        stackIn_10_0 = !(!stackIn_5_0 | IntPoint.hasAnyMask33(param2, param0, (byte) -94)) || (C2SChooseRewardPacket.a(true, param2, param0));
        return stackIn_10_0;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          return true;
        }
        return true;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          for (var7_int = 0; var7_int < param4; var7_int++) {
            PathMoverComponent.a(param6 - 2 * var7_int, param3, param2 + var7_int, -(var7_int * 2) + param5, false, var7_int + param0);
          }
          if (param1 != -85) {
            field_L = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var7), "tp.GC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          return -57;
        }
        return 7;
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(-88, 2097152, 2097152);
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "tp.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_J = null;
        int var1 = 95 % ((param0 + 24) / 54);
        field_K = null;
        field_L = null;
    }

    final boolean usesTimingPattern(int param0) {
        if (param0 != -1) {
          field_L = (String) null;
          return true;
        }
        return true;
    }

    final boolean usesPhaseOffset(int param0) {
        if (param0 != -23309) {
          return true;
        }
        return true;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        BeamShooterBehaviour var5 = null;
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
          var5 = new BeamShooterBehaviour(param2, param0);
          var5.setEffect(new Effect(6, 10), true);
          this.applyTimingPattern((byte) 43, var5, param2);
          var4.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = rm.field_a;
          var7 = (BlockModel) (var6.createModel(7, param1 ^ 77));
          var7.setVariant(113, 15);
          var4.addModel(var5, (byte) 124, var7);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("tp.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    WhiteLightShooterComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    static {
        field_J = "Press <img=7> or <img=5> to change view";
        field_L = "This game option is not available in rated games.";
    }
}
