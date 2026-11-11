/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlantModel extends TrapModel {
    static jua field_n;
    static int field_o;
    static String field_p;
    private int field_m;

    final void decode(int param0, Room param1, BitPacketBuffer param2) {
        try {
          super.decode(127, param1, param2);
          if (param0 <= 119) {
            this.field_m = 120;
          }
          this.field_m = param2.readBits((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ki.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void encode(byte param0, BitPacketBuffer param1) {
        try {
          super.encode((byte) 115, param1);
          int var3_int = 44 / ((param0 + 8) / 40);
          param1.writeBits((byte) -125, this.field_m, 4);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ki.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    PlantModel(int param0) {
        super(param0);
    }

    final static void detachKeyboardHandler(int param0, java.awt.Component param1) {
        try {
          param1.removeKeyListener(TileOperator.field_n);
          if (param0 != -18520) {
            java.awt.Component var3 = (java.awt.Component) null;
            PlantModel.detachKeyboardHandler(-126, (java.awt.Component) null);
          }
          param1.removeFocusListener(TileOperator.field_n);
          SoftwareDepthBuffer.field_f = -1;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ki.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static Locomotor readLocomotor(BitPacketBuffer param0, byte param1, Room param2, boolean param3) {
        SimpleMoveLocomotor stackIn_26_0 = null;
        ApproachPlayerLocomotor stackIn_28_0 = null;
        ControllerLocomotor stackIn_30_0 = null;
        FleeLocomotor stackIn_32_0 = null;
        MirrorMoverLocomotor stackIn_34_0 = null;
        PathMoveLocomotor stackIn_36_0 = null;
        RotateLocomotor stackIn_38_0 = null;
        FacePlayerLocomotor stackIn_40_0 = null;
        ConstrainToCircleLocomotor stackIn_42_0 = null;
        CircleMovementLocomotor stackIn_44_0 = null;
        FacePointLocomotor stackIn_46_0 = null;
        ConstrainToRectangleLocomotor stackIn_48_0 = null;
        ConstrainToLatticeLocomotor stackIn_50_0 = null;
        ConstrainToFacingArcLocomotor stackIn_52_0 = null;
        TrackPlayerLocomotor stackIn_54_0 = null;
        TeleportLocomotor stackIn_56_0 = null;
        SweepRotateLocomotor stackIn_58_0 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2.formatVersion > 7) {
            var4_int = param0.readBits((byte) 44, 6);
          } else {
            var4_int = param0.readBits((byte) 44, 4);
          }
          var5 = 37 / ((-67 - param1) / 45);
          var6 = var4_int;
          if (var6 == 0) {
            stackIn_26_0 = new SimpleMoveLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_26_0);
          }
          if (var6 == 1) {
            stackIn_28_0 = new ApproachPlayerLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_28_0);
          }
          if (var6 == 2) {
            stackIn_30_0 = new ControllerLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_30_0);
          }
          if (3 == var6) {
            stackIn_32_0 = new FleeLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_32_0);
          }
          if (4 == var6) {
            stackIn_34_0 = new MirrorMoverLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_34_0);
          }
          if (5 == var6) {
            stackIn_36_0 = new PathMoveLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_36_0);
          }
          if (var6 == 6) {
            stackIn_38_0 = new RotateLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_38_0);
          }
          if (var6 == 7) {
            stackIn_40_0 = new FacePlayerLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_40_0);
          }
          if (var6 == 8) {
            stackIn_42_0 = new ConstrainToCircleLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_42_0);
          }
          if (var6 == 9) {
            stackIn_44_0 = new CircleMovementLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_44_0);
          }
          if (10 == var6) {
            stackIn_46_0 = new FacePointLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_46_0);
          }
          if (11 == var6) {
            stackIn_48_0 = new ConstrainToRectangleLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_48_0);
          }
          if (var6 == 12) {
            stackIn_50_0 = new ConstrainToLatticeLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_50_0);
          }
          if (var6 == 13) {
            stackIn_52_0 = new ConstrainToFacingArcLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_52_0);
          }
          if (var6 == 14) {
            stackIn_54_0 = new TrackPlayerLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_54_0);
          }
          if (15 == var6) {
            stackIn_56_0 = new TeleportLocomotor(param2, param0, param3);
            return (Locomotor) ((Object) stackIn_56_0);
          }
          if (var6 != 16) {
            throw new IllegalStateException("Unrecognised locomotor type: " + var4_int);
          }
          stackIn_58_0 = new SweepRotateLocomotor(param2, param0, param3);
          return (Locomotor) ((Object) stackIn_58_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_62_0 = var4;
          stackIn_62_1 = new StringBuilder().append("ki.F(");
          if (param0 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          stackIn_65_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param3).append(')').toString());
        }
    }

    final void attach(TrapPart param0, WorldBody param1, byte param2) {
        try {
          super.attach(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ki.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    PlantModel(int param0, Room param1, BitPacketBuffer param2) {
        super(param0, param1, param2);
    }

    final void setVariant(boolean param0, int param1) {
        this.field_m = param1;
        if (!param0) {
          field_p = (String) null;
        }
    }

    public static void releaseStatics(boolean param0) {
        field_n = null;
        if (param0) {
          field_n = (jua) null;
          field_p = null;
          return;
        }
        field_p = null;
    }

    final static void resendPendingSubmissions(boolean param0, int param1) {
        int var3 = 0;
        ScoreSubmission var4 = null;
        HiscoreTable var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          var4 = (ScoreSubmission) (nn.field_a.first(-80));
          while (var4 != null) {
            mca.writeScoreSubmission(var4, 0, param1);
            var4 = (ScoreSubmission) (nn.field_a.next(111));
          }
          if (param0) {
            PlantModel.resendPendingSubmissions(true, -117);
          }
          var5 = (HiscoreTable) (TimingPattern.field_b.first(-80));
          while (var5 != null) {
            BeamSegment.sendHiscoreTableRequest(param0, param1, var5);
            var5 = (HiscoreTable) (TimingPattern.field_b.next(122));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var2), "ki.H(" + param0 + ',' + param1 + ')');
        }
    }

    final void drawAt(Camera param0, int param1, int param2, int param3, byte param4) {
        Object var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          var7 = 31 / ((param4 + 38) / 47);
          var6 = null;
          var8 = this.field_m;
          if (var8 == 0) {
            var6 = GameApplet.field_j[0];
          } else {
            if (var8 != 1) {
              if (var8 == 2) {
                var6 = GameApplet.field_j[2];
              } else {
                if (3 == var8) {
                  var6 = GameApplet.field_j[3];
                } else {
                  if (var8 == 4) {
                    var6 = GameApplet.field_j[4];
                  }
                }
              }
            } else {
              var6 = GameApplet.field_j[1];
            }
          }
          if (var6 == null) {
            return;
          }
          var8Lifetime1 = GameScreen.positiveModulo(-this.body.getFacingAngle(-25787) + 4096 >> 2, 2048, -111);
          ChatMessage.drawModelAt(var8Lifetime1, -83584144, param1, param2, (ToolkitModel) (var6), param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("ki.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) (stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_o = 82;
        field_p = "Start Game";
    }
}
