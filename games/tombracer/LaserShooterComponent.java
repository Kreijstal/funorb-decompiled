/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LaserShooterComponent extends ShooterComponent {
    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        BeamShooterBehaviour var5 = null;
        Effect var6 = null;
        ModelCodec var7 = null;
        BlockModel var8 = null;
        Trap var9 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new Trap(param2, param0);
          var9.setSize((byte) -11, this.height, this.width);
          var9.setObstructionLevel(param1, 0);
          var9.addBehaviour((byte) 83, (Behaviour) (new SimpleBlockBehaviour(param2, param0)));
          var5 = new BeamShooterBehaviour(param2, param0);
          var6 = new Effect(1, 10);
          var6.setDeathMessageIndex(1, 13);
          var5.setEffect(var6, true);
          this.applyTimingPattern((byte) 43, var5, param2);
          var9.addBehaviour((byte) 83, (Behaviour) (var5));
          var7 = rm.field_a;
          var8 = (BlockModel) (var7.createModel(7, 100));
          var8.b(114, 16);
          var9.addModel(var5, (byte) 124, var8);
          this.addMuzzleLight(var9, param1 ^ 3, var5, 16777130);
          stackIn_1_0 = var9;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("ih.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    LaserShooterComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ih.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean canAppendNameChar(CharSequence param0, boolean param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!BeamShooterBehaviour.isAccountNameCharacter(62, param2)) {
            return false;
          }
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (var3_int >= 12) {
            return false;
          }
          if (PlayerModel.isNameSeparator(114, param2) &&
            0 == var3_int) {
            return false;
          }
          if (!param1) {
            LaserShooterComponent.D(97);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("ih.VB(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          return true;
        }
        return false;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          return true;
        }
        return true;
    }

    LaserShooterComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          this.getRenderLayer(60);
          return false;
        }
        return false;
    }

    final static ConsoleToken[] tokenizeCommand(byte param0, String param1) {
        int incrementValue$1 = 0;
        IntrusiveDeque var2 = null;
        RuntimeException var2_ref = null;
        ConsoleToken[] var3 = null;
        int var4 = 0;
        ConsoleToken var5 = null;
        int var6 = 0;
        ConsoleToken[] stackIn_3_0 = null;
        ConsoleToken[] stackIn_9_0 = null;
        ConsoleToken[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1.equals(S2CRoundResultPacket.field_e)) {
            stackIn_3_0 = ResultsPhase.field_n;
            return stackIn_3_0;
          }
          var2 = lp.tokenize((byte) 48, param1);
          var3 = new ConsoleToken[var2.size((byte) -16)];
          var4 = 0;
          var5 = (ConsoleToken) (var2.first(-80));
          while (var5 != null) {
            incrementValue$1 = var4;
            var4++;
            var3[incrementValue$1] = var5;
            var5 = (ConsoleToken) (var2.next(124));
          }
          if (param0 != 126) {
            stackIn_9_0 = (ConsoleToken[]) null;
            return stackIn_9_0;
          }
          ResultsPhase.field_n = var3;
          S2CRoundResultPacket.field_e = param1;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_14_0 = var2_ref;
          stackIn_14_1 = new StringBuilder().append("ih.BC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          return -4;
        }
        return 7;
    }

    final boolean usesPhaseOffset(int param0) {
        if (param0 != -23309) {
          return false;
        }
        return true;
    }

    final boolean canRandomisePhase(int param0) {
        if (param0 != 128) {
          return true;
        }
        return true;
    }

    final static void D(int param0) {
        if (param0 != 17229) {
          return;
        }
        if (null == baa.field_d) {
          return;
        }
        if (baa.field_d.b(100663296)) {
          MaskBlendOperator.d(-25405);
          return;
        }
        if (tga.field_a != null) {
          return;
        }
        if (null == baa.field_d.field_i) {
          return;
        }
        MaskBlendOperator.d(-25405);
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(112, 2097152, 2097152);
    }

    final boolean usesTimingPattern(int param0) {
        if (param0 != -1) {
          return true;
        }
        return true;
    }

    static {
    }
}
