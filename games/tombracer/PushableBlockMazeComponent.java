/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PushableBlockMazeComponent extends MazeComponent {
    static String field_K;
    static boolean field_L;

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          if (param0) {
            field_K = (String) null;
          }
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "uc.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    PushableBlockMazeComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final boolean supportsItems(int param0) {
        if (param0 != 0) {
          BitPacketBuffer var3 = (BitPacketBuffer) null;
          this.encode(false, (BitPacketBuffer) null);
          return true;
        }
        return true;
    }

    final Trap createOpenCellTrap(Room param0, boolean param1, boolean param2) {
        RuntimeException var4 = null;
        Trap stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return null;
          }
          stackIn_3_0 = (Trap) null;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("uc.VB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final Trap createFilledCellTrap(int param0, boolean param1, Room param2) {
        RuntimeException var4 = null;
        SimpleBlockBehaviour var5 = null;
        DamageableBehaviour var6 = null;
        FlagSet var7 = null;
        ModelCodec var8 = null;
        BlockModel var9 = null;
        Trap var10 = null;
        Trap stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new Trap(param2, param1);
          var10.setSize((byte) -11, 2097152, 2097152);
          var10.setWeight((byte) -3, 4);
          var10.setObstructionLevel(3, 0);
          var10.setPushable(true, param0 + 116);
          var10.setPushMode(124, 1);
          var10.setFloating((byte) 17, false);
          var10.setAttachedToParent(false, 11468);
          var10.setCollisionLevel(1, (byte) -12, true);
          var5 = new SimpleBlockBehaviour(param2, param1);
          var10.addBehaviour((byte) 83, (Behaviour) (var5));
          var10.setCrushThreshold(25, -1);
          var6 = new DamageableBehaviour(param2, param1);
          var6.setTargetsOwnTrap((byte) 0, true);
          var6.setHealthParameters(1, 50, param0 - 5);
          var7 = var6.getVulnerabilities((byte) -112);
          var7.setAll(false, 67);
          var7.set(0, -17075, true);
          var10.addBehaviour((byte) 83, (Behaviour) (var6));
          if (param0 != 5) {
            field_L = true;
          }
          var8 = rm.field_a;
          var9 = (BlockModel) (var8.createModel(7, 75));
          var9.setVariant(124, 0);
          var10.addModel((TrapPart) null, (byte) 124, var9);
          stackIn_3_0 = var10;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("uc.SB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean C(int param0) {
        if (param0 != 1) {
          PushableBlockMazeComponent.releaseStatics(94);
          return true;
        }
        return true;
    }

    PushableBlockMazeComponent(Room param0, int param1) {
        super(param0, param1);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 7) {
          PushableBlockMazeComponent.releaseStatics(126);
          field_K = null;
          return;
        }
        field_K = null;
    }

    static {
        field_K = "Hold to grab and drag objects. Press to drop a carried object.";
    }
}
