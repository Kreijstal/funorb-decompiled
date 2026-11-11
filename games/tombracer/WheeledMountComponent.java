/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WheeledMountComponent extends PathMoverComponent {
    static AudioOutput field_P;
    static String field_N;
    static String field_O;
    static int[] field_M;
    private int field_Q;

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return false;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          this.hasSize(-100);
          return true;
        }
        return true;
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(104, 2097152, 2097152);
        this.setMounts((byte) 125, new ComponentMount[]{new ComponentMount(0, 0, 2097152, 0, 40)});
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          field_N = (String) null;
          return true;
        }
        return true;
    }

    final static void updateSounds(byte param0) {
        int var1_int = 0;
        PlayingSound var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          ValidatedTextInputWidget.pumpAudio(-16310);
          var1_int = -106 / ((-7 - param0) / 37);
          var2 = (PlayingSound) (LoginMethod.field_f.first(-80));
          while (var2 != null) {
            var2.fadeOutStep(-97);
            if (var2.field_h <= 0) {
              VariantMask.removeSoundStream(var2.field_i, (byte) -42);
              var2.unlink(25);
            }
            var2 = (PlayingSound) (LoginMethod.field_f.next(107));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var1), "ipa.UB(" + param0 + ')');
        }
    }

    final boolean storesSpeed(int param0) {
        if (param0 != 1760) {
          return false;
        }
        return true;
    }

    final static boolean isGraphicsSettingAvailable(GraphicsQuality param0, boolean param1, RendererMode param2) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        boolean stackIn_11_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_18_0 = false;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            WheeledMountComponent.releaseStatics(8);
          }
          if (param2 == WeaponShooterBehaviour.field_r) {
            if (param0 == baa.field_e) {
              stackIn_6_0 = HuffmanCodec.field_a.field_c;
              return stackIn_6_0;
            }
            if (tia.field_d != param0) {
              stackIn_11_0 = UsernameSuggestionsPanel.field_x.field_c;
              return stackIn_11_0;
            }
            stackIn_9_0 = DateInputWidget.field_z.field_c;
            return stackIn_9_0;
          }
          if (param0 == baa.field_e) {
            stackIn_15_0 = ControllerLocomotor.field_t.field_c;
            return stackIn_15_0;
          }
          if (tia.field_d != param0) {
            stackIn_20_0 = CharacterSelection.field_d.field_c;
            return stackIn_20_0;
          }
          stackIn_18_0 = vea.field_c.field_c;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("ipa.TB(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    WheeledMountComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
        this.field_Q = 4;
        try {
          this.field_Q = param2.readBits((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ipa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          this.storesSpeed(8);
          return false;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        field_P = null;
        field_M = null;
        field_O = null;
        field_N = null;
        if (param0 != 4) {
          field_O = (String) null;
        }
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        PathMoveLocomotor var5 = null;
        ModelCodec var6 = null;
        TrapBaseModel var7 = null;
        Trap var8 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new Trap(param2, param0);
          var8.setSize((byte) -11, this.height, this.width);
          var8.setObstructionLevel(param1, 0);
          var8.setCollisionLevel(1, (byte) -12, true);
          var8.setWeight((byte) -3, 6);
          var8.setFloating((byte) 17, false);
          var8.setPushMode(126, 2);
          var8.addBehaviour((byte) 83, (Behaviour) (new SimpleBlockBehaviour(param2, param0)));
          var5 = this.createPathMove((byte) -41, param2, param0);
          var5.setTurnsToFaceWaypoint(true, -606738686);
          var5.setStopsWhileTurning(4, true);
          var5.setTurnSpeed(this.field_Q * 8, -60);
          var8.addLocomotor(var5, 0);
          var6 = rm.field_a;
          var7 = (TrapBaseModel) (var6.createModel(16, param1 + 71));
          var7.setVariant(8022, 0);
          var8.addModel((TrapPart) null, (byte) 124, var7);
          stackIn_1_0 = var8;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("ipa.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) -19, this.field_Q, 4);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ipa.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          this.field_Q = 41;
          return 7;
        }
        return 7;
    }

    WheeledMountComponent(Room param0, int param1) {
        super(param0, param1);
        this.field_Q = 4;
    }

    final boolean storesLoopFlag(int param0) {
        int var2 = 21 / ((0 - param0) / 60);
        return true;
    }

    static {
        field_O = "Tips";
        field_M = new int[8192];
        field_N = "You have declined the invitation.";
    }
}
