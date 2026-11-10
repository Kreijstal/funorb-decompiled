/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SkeletonComponent extends dna {
    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (!ej.a(false, param0, param1)) {
            return false;
          }
          var3_int = 0;
          while (true) {
            if (param1.length() <= var3_int) {
              if (param2 == 1617) {
                return true;
              }
              return false;
            }
            if (SwitchComponent.a(false, param1.charAt(var3_int))) {
              var3_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("lg.VB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    SkeletonComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        this.setSize(-71, 2097152, 2097152);
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        ApproachPlayerLocomotor var5 = null;
        FacePlayerLocomotor var6 = null;
        SimpleBlockBehaviour var7 = null;
        DamageableBehaviour var8 = null;
        FlagSet var9 = null;
        ModelCodec var10 = null;
        MonsterModel var11 = null;
        Trap var12 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var12 = new Trap(param2, param0);
          var12.setSize((byte) -11, this.height, this.width);
          var12.setObstructionLevel(2, 0);
          var12.setCollisionLevel(2, (byte) -12, true);
          var12.setWeight((byte) -3, 1);
          var12.setFloating((byte) 17, false);
          var12.setPushable(true, 124);
          var12.setCrushThreshold(1, -1);
          var5 = new ApproachPlayerLocomotor(param2, param0);
          var5.a(false, 98304);
          var12.addLocomotor(var5, 0);
          var6 = new FacePlayerLocomotor(param2, param0);
          var6.a(256, (byte) 124);
          var12.addLocomotor(var6, 0);
          var7 = new SimpleBlockBehaviour(param2, param0);
          var7.b((byte) -114, true);
          var7.a(8, (byte) -22);
          var12.addBehaviour((byte) 83, (Behaviour) (var7));
          var8 = new DamageableBehaviour(param2, param0);
          var8.b(0, 5, param1 - 3);
          var8.a(0, 0, 36, 0);
          var9 = var8.getVulnerabilities((byte) -114);
          var9.setAll(false, param1 ^ 102);
          var9.set(0, -17075, true);
          var9.set(param1, -17075, true);
          var9.set(2, param1 ^ -17074, true);
          var12.addBehaviour((byte) 83, (Behaviour) (var8));
          var10 = rm.field_a;
          var11 = (MonsterModel) (var10.createModel(18, 98));
          var11.b(param1 + 87, 0);
          var12.a((TrapPart) null, (byte) 124, var11);
          var12.e(0, 122);
          stackIn_1_0 = var12;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("lg.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    SkeletonComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lg.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
