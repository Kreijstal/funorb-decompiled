/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrackingCrusherComponent extends PrefabComponent {
    static String field_H;
    static int field_F;
    static boolean field_G;

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          field_F = 126;
          return false;
        }
        return false;
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          field_H = (String) null;
          return 7;
        }
        return 7;
    }

    final static void a(String param0, byte param1) {
        if (param1 > -23) {
          return;
        }
        try {
          NodeHashTable.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "wta.TB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(param0 ^ 1, 4194304, 4194304);
    }

    final static void A(int param0) {
        aca.field_h = new String[TouchSwitchBehaviour.field_n];
        aca.field_h[17] = CharacterChoiceFactory.field_d;
        aca.field_h[20] = afa.field_b;
        aca.field_h[11] = aqa.field_b;
        aca.field_h[9] = MotionTrackingModel.field_u;
        aca.field_h[21] = rua.field_jb;
        aca.field_h[19] = GrowableIntList.field_b;
        aca.field_h[5] = SoftwareRenderContext.field_g;
        aca.field_h[4] = ScoreStandings.field_d;
        aca.field_h[6] = nt.field_c;
        aca.field_h[7] = FadingDialog.field_A;
        if (param0 == 12) {
          aca.field_h[15] = MazeFrontierCell.field_h;
          aca.field_h[16] = BlendModeOperator.field_n;
          aca.field_h[18] = RemovedFromGameMenu.field_q;
          aca.field_h[13] = CourseLayout.field_c;
          return;
        }
        field_G = true;
        aca.field_h[15] = MazeFrontierCell.field_h;
        aca.field_h[16] = BlendModeOperator.field_n;
        aca.field_h[18] = RemovedFromGameMenu.field_q;
        aca.field_h[13] = CourseLayout.field_c;
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          return true;
        }
        return true;
    }

    TrackingCrusherComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        ApproachPlayerLocomotor var5 = null;
        CrusherBehaviour var6 = null;
        ModelCodec var7 = null;
        CrusherModel var8 = null;
        Trap var9 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new Trap(param2, param0);
          var9.setSize((byte) -11, this.height, this.width);
          var9.setWeight((byte) -3, 20);
          var9.setObstructionLevel(param1, 0);
          var9.setFloating((byte) 17, true);
          var9.setCollisionLevel(4, (byte) -12, true);
          var5 = new ApproachPlayerLocomotor(param2, param0);
          var5.setStopDistance(66, 0);
          var5.setSpeed(false, 262144);
          var9.addLocomotor(var5, param1 ^ 3);
          var6 = new CrusherBehaviour(param2, param0);
          var6.setTimings(25, 12, 1, 25, 12);
          var6.b((byte) 127, true);
          var9.addBehaviour((byte) 83, (Behaviour) (var6));
          var7 = rm.field_a;
          var8 = (CrusherModel) (var7.createModel(11, param1 ^ 116));
          var9.addModel(var6, (byte) 124, var8);
          stackIn_1_0 = var9;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("wta.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          field_H = (String) null;
          return false;
        }
        return false;
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 15) {
          return;
        }
        field_H = null;
    }

    TrackingCrusherComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          if (param0) {
            field_F = 80;
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "wta.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_H = "Short Flamer";
        field_F = 2;
    }
}
