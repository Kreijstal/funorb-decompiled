/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BoulderComponent extends PathMoverComponent {
    static UiComponent field_M;

    final boolean storesSpeed(int param0) {
        if (param0 != 1760) {
          field_M = (UiComponent) null;
          return true;
        }
        return true;
    }

    final static void b(int param0, int param1, boolean param2) {
        mu var3 = null;
        PlayerContextMenu var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        mu var3Lifetime1;
        PlayerContextMenu var4Lifetime1;
        String var5_ref_StringLifetime1;
        PlayerContextMenu var4Lifetime2;
        PlayerContextMenu var4Lifetime1Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param1 < -76) {
          var3 = IntrusiveDeque.a(param2, param0, -117);
          if (var3 != null) {
            hka.field_b.populateItems((byte) -22, false);
            var4 = hka.field_b;
            var5_ref_String = ai.field_d;
            var4.field_f.addItem((byte) -101, 5, var5_ref_String);
            var4Lifetime2 = hka.field_b;
            var5 = PasswordValidator.field_m;
            var6 = RidgedNoise3D.field_p;
            var4Lifetime2.field_f.openAt(var6, 0, -100, 0, var5);
          }
          iea.a(param2, (byte) -56, param0);
          return;
        }
        String var7 = (String) null;
        BoulderComponent.loadSpritesByName((ResourceArchive) null, (String) null, -33, (String) null);
        var3Lifetime1 = IntrusiveDeque.a(param2, param0, -117);
        if (var3Lifetime1 != null) {
          hka.field_b.populateItems((byte) -22, false);
          var4Lifetime1 = hka.field_b;
          var5_ref_StringLifetime1 = ai.field_d;
          var4Lifetime1.field_f.addItem((byte) -101, 5, var5_ref_StringLifetime1);
          var4Lifetime1Lifetime1 = hka.field_b;
          var5Lifetime1 = PasswordValidator.field_m;
          var6Lifetime1 = RidgedNoise3D.field_p;
          var4Lifetime1Lifetime1.field_f.openAt(var6Lifetime1, 0, -100, 0, var5Lifetime1);
        }
        iea.a(param2, (byte) -56, param0);
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "uka.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static Sprite[] loadSpritesByName(ResourceArchive param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.getGroupId(param1, -7768);
          if (param2 != 5) {
            field_M = (UiComponent) null;
          }
          var5 = param0.getFileId(true, param3, var4_int);
          stackIn_3_0 = FocusableWidget.loadSprites(param0, var5, var4_int, (byte) -82);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("uka.BC(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          field_M = (UiComponent) null;
          return true;
        }
        return true;
    }

    final static void snapshotMouseInput(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = ColourGradientOperator.field_n;
        synchronized (var1) {
          if (param0 != -44) {
            BoulderComponent.releaseStatics((byte) 73);
          }
          MatchScoringObserver.field_h = MatchScoringObserver.field_h + 1;
          RangeOperator.field_p = tka.field_n;
          AgeValidator.field_j = ena.field_n;
          GridWidgetContainer.field_B = ee.field_a;
          ProceduralTextureProvider.field_c = PlayerContextMenu.field_c;
          PlayerContextMenu.field_c = false;
          PlayerModel.field_b = DisplaySettingsDialog.field_X;
          PasswordValidator.field_m = cr.field_d;
          RidgedNoise3D.field_p = TestModel.field_m;
          DisplaySettingsDialog.field_X = 0;
        }
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        ConstantEffectBehaviour var5 = null;
        Effect var6 = null;
        SimpleBlockBehaviour var7 = null;
        PathMoveLocomotor var8 = null;
        ModelCodec var9 = null;
        HazardModel var10 = null;
        Trap var11 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new Trap(param2, param0);
          var11.setSize((byte) -11, this.height, this.width);
          var11.setObstructionLevel(param1, 0);
          var11.setCollisionLevel(3, (byte) -12, true);
          var11.setWeight((byte) -3, 10);
          var11.setFloating((byte) 17, false);
          var11.setPushMode(108, 2);
          var11.setStatCategory(2, 146366800);
          var5 = new ConstantEffectBehaviour(param2, param0);
          var6 = new Effect(0, 10);
          var6.setDeathMessageIndex(1, 14);
          var5.setEffect(true, var6);
          var11.addBehaviour((byte) 83, (Behaviour) (var5));
          var7 = new SimpleBlockBehaviour(param2, param0);
          var11.addBehaviour((byte) 83, (Behaviour) (var7));
          var8 = this.createPathMove((byte) -30, param2, param0);
          var11.addLocomotor(var8, 0);
          var9 = rm.field_a;
          var10 = (HazardModel) (var9.createModel(8, param1 ^ 76));
          var10.setVariant(false, 0);
          var11.addModel(var5, (byte) 124, var10);
          stackIn_1_0 = var11;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("uka.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          field_M = (UiComponent) null;
          return false;
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= 60) {
          field_M = (UiComponent) null;
          field_M = null;
          return;
        }
        field_M = null;
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          field_M = (UiComponent) null;
          return false;
        }
        return false;
    }

    BoulderComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    BoulderComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          return true;
        }
        return false;
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          BoulderComponent.snapshotMouseInput((byte) -23);
          return 7;
        }
        return 7;
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(-110, 4194304, 4194304);
    }

    final boolean A(int param0) {
        int var2 = -18 / ((param0 - 0) / 60);
        return true;
    }

    static {
    }
}
