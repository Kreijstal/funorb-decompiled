/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModelFactory implements ModelCodec {
    static jta field_a;

    final static boolean a(int param0, int param1, int param2) {
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == -17) {
            stackIn_7_0 = (0 != (2048 & param2));
            return stackIn_7_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wu.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final TrapModel readModel(Room param0, BitPacketBuffer param1, boolean param2) {
        TestModel stackIn_41_0 = null;
        LegacySwitchModel stackIn_43_0 = null;
        FurnitureModel stackIn_45_0 = null;
        LightSourceModel stackIn_47_0 = null;
        DoorwayModel stackIn_49_0 = null;
        BlockModel stackIn_51_0 = null;
        HazardModel stackIn_53_0 = null;
        SwitchModel stackIn_55_0 = null;
        PitModel stackIn_57_0 = null;
        CrusherModel stackIn_59_0 = null;
        ItemModel stackIn_61_0 = null;
        SnakePitModel stackIn_63_0 = null;
        PlantModel stackIn_65_0 = null;
        WallModel stackIn_67_0 = null;
        TrapBaseModel stackIn_69_0 = null;
        PlatformModel stackIn_71_0 = null;
        MonsterModel stackIn_73_0 = null;
        BridgeModel stackIn_75_0 = null;
        GasVentModel stackIn_77_0 = null;
        DirectRenderModel stackIn_79_0 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        String stackIn_88_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param1.readBits((byte) 44, 6);
          if (param2) {
            field_a = (jta) null;
          }
          var5 = var4_int;
          if (1 == var5) {
            stackIn_41_0 = new TestModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_41_0);
          }
          if (3 == var5) {
            stackIn_43_0 = new LegacySwitchModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_43_0);
          }
          if (var5 == 4) {
            stackIn_45_0 = new FurnitureModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_45_0);
          }
          if (5 == var5) {
            stackIn_47_0 = new LightSourceModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_47_0);
          }
          if (var5 == 6) {
            stackIn_49_0 = new DoorwayModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_49_0);
          }
          if (var5 == 7) {
            stackIn_51_0 = new BlockModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_51_0);
          }
          if (var5 == 8) {
            stackIn_53_0 = new HazardModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_53_0);
          }
          if (9 == var5) {
            stackIn_55_0 = new SwitchModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_55_0);
          }
          if (10 == var5) {
            stackIn_57_0 = new PitModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_57_0);
          }
          if (var5 == 11) {
            stackIn_59_0 = new CrusherModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_59_0);
          }
          if (var5 == 12) {
            stackIn_61_0 = new ItemModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_61_0);
          }
          if (var5 == 13) {
            stackIn_63_0 = new SnakePitModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_63_0);
          }
          if (var5 == 14) {
            stackIn_65_0 = new PlantModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_65_0);
          }
          if (var5 == 15) {
            stackIn_67_0 = new WallModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_67_0);
          }
          if (16 == var5) {
            stackIn_69_0 = new TrapBaseModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_69_0);
          }
          if (17 == var5) {
            stackIn_71_0 = new PlatformModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_71_0);
          }
          if (var5 == 18) {
            stackIn_73_0 = new MonsterModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_73_0);
          }
          if (19 == var5) {
            stackIn_75_0 = new BridgeModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_75_0);
          }
          if (var5 == 20) {
            stackIn_77_0 = new GasVentModel(var4_int, param0, param1);
            return (TrapModel) ((Object) stackIn_77_0);
          }
          stackIn_79_0 = new DirectRenderModel(var4_int, param0, param1);
          return (TrapModel) ((Object) stackIn_79_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_83_0 = var4;
          stackIn_83_1 = new StringBuilder().append("wu.A(");
          if (param0 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_87_0 = stackIn_83_0;
          stackIn_87_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',');
          if (param1 == null) {
            stackIn_88_0 = stackIn_87_0;
            stackIn_88_2 = "null";
          } else {
            stackIn_88_0 = stackIn_83_0;
            stackIn_88_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_88_0), ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void writeModel(int param0, BitPacketBuffer param1, TrapModel param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 15682) {
            field_a = (jta) null;
          }
          param1.writeBits((byte) -128, param2.getCategory((byte) 81), 6);
          param2.encode((byte) 88, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("wu.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_0 = stackIn_7_0;
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_2 = "null";
          } else {
            stackIn_12_0 = stackIn_7_0;
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final TrapModel createModel(int param0, int param1) {
        TestModel stackIn_41_0 = null;
        LegacySwitchModel stackIn_43_0 = null;
        FurnitureModel stackIn_45_0 = null;
        LightSourceModel stackIn_47_0 = null;
        DoorwayModel stackIn_49_0 = null;
        BlockModel stackIn_51_0 = null;
        HazardModel stackIn_53_0 = null;
        SwitchModel stackIn_55_0 = null;
        PitModel stackIn_57_0 = null;
        CrusherModel stackIn_59_0 = null;
        ItemModel stackIn_61_0 = null;
        SnakePitModel stackIn_63_0 = null;
        PlantModel stackIn_65_0 = null;
        WallModel stackIn_67_0 = null;
        TrapBaseModel stackIn_69_0 = null;
        PlatformModel stackIn_71_0 = null;
        MonsterModel stackIn_73_0 = null;
        BridgeModel stackIn_75_0 = null;
        GasVentModel stackIn_77_0 = null;
        DirectRenderModel stackIn_79_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        BitPacketBuffer var5 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 < 73) {
            var5 = (BitPacketBuffer) null;
            this.readModel((Room) null, (BitPacketBuffer) null, false);
          }
          var3_int = param0;
          if (var3_int == 1) {
            stackIn_41_0 = new TestModel(param0);
            return (TrapModel) ((Object) stackIn_41_0);
          }
          if (var3_int == 3) {
            stackIn_43_0 = new LegacySwitchModel(param0);
            return (TrapModel) ((Object) stackIn_43_0);
          }
          if (var3_int == 4) {
            stackIn_45_0 = new FurnitureModel(param0);
            return (TrapModel) ((Object) stackIn_45_0);
          }
          if (var3_int == 5) {
            stackIn_47_0 = new LightSourceModel(param0);
            return (TrapModel) ((Object) stackIn_47_0);
          }
          if (var3_int == 6) {
            stackIn_49_0 = new DoorwayModel(param0);
            return (TrapModel) ((Object) stackIn_49_0);
          }
          if (var3_int == 7) {
            stackIn_51_0 = new BlockModel(param0);
            return (TrapModel) ((Object) stackIn_51_0);
          }
          if (var3_int == 8) {
            stackIn_53_0 = new HazardModel(param0);
            return (TrapModel) ((Object) stackIn_53_0);
          }
          if (var3_int == 9) {
            stackIn_55_0 = new SwitchModel(param0);
            return (TrapModel) ((Object) stackIn_55_0);
          }
          if (10 == var3_int) {
            stackIn_57_0 = new PitModel(param0);
            return (TrapModel) ((Object) stackIn_57_0);
          }
          if (11 == var3_int) {
            stackIn_59_0 = new CrusherModel(param0);
            return (TrapModel) ((Object) stackIn_59_0);
          }
          if (var3_int == 12) {
            stackIn_61_0 = new ItemModel(param0);
            return (TrapModel) ((Object) stackIn_61_0);
          }
          if (var3_int == 13) {
            stackIn_63_0 = new SnakePitModel(param0);
            return (TrapModel) ((Object) stackIn_63_0);
          }
          if (var3_int == 14) {
            stackIn_65_0 = new PlantModel(param0);
            return (TrapModel) ((Object) stackIn_65_0);
          }
          if (var3_int == 15) {
            stackIn_67_0 = new WallModel(param0);
            return (TrapModel) ((Object) stackIn_67_0);
          }
          if (var3_int == 16) {
            stackIn_69_0 = new TrapBaseModel(param0);
            return (TrapModel) ((Object) stackIn_69_0);
          }
          if (var3_int == 17) {
            stackIn_71_0 = new PlatformModel(param0);
            return (TrapModel) ((Object) stackIn_71_0);
          }
          if (var3_int == 18) {
            stackIn_73_0 = new MonsterModel(param0);
            return (TrapModel) ((Object) stackIn_73_0);
          }
          if (var3_int == 19) {
            stackIn_75_0 = new BridgeModel(param0);
            return (TrapModel) ((Object) stackIn_75_0);
          }
          if (var3_int != 20) {
            stackIn_79_0 = new DirectRenderModel(param0);
            return (TrapModel) ((Object) stackIn_79_0);
          }
          stackIn_77_0 = new GasVentModel(param0);
          return (TrapModel) ((Object) stackIn_77_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wu.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        try {
          if (param0 != 91) {
            field_a = (jta) null;
          }
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wu.D(" + param0 + ')');
        }
    }

    public ModelFactory() {
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          bb.modelCategoryNames = new String[21];
          for (var1_int = 0; var1_int < 21; var1_int++) {
            bb.modelCategoryNames[var1_int] = "(unused, placeholder)";
          }
          bb.modelCategoryNames[8] = "Hazard";
          bb.modelCategoryNames[9] = "Switch";
          bb.modelCategoryNames[19] = "Bridge";
          bb.modelCategoryNames[13] = "SnakePit";
          bb.modelCategoryNames[18] = "Monster";
          bb.modelCategoryNames[0] = "OLD directrender";
          bb.modelCategoryNames[17] = "Platform";
          bb.modelCategoryNames[15] = "Wall";
          bb.modelCategoryNames[3] = "OLD switch";
          bb.modelCategoryNames[6] = "Doorway";
          bb.modelCategoryNames[14] = "Plant";
          bb.modelCategoryNames[12] = "Item";
          bb.modelCategoryNames[4] = "Furniture";
          bb.modelCategoryNames[5] = "Light Source";
          bb.modelCategoryNames[16] = "Trap Base";
          bb.modelCategoryNames[1] = "TEMP model test";
          bb.modelCategoryNames[7] = "Block";
          bb.modelCategoryNames[10] = "Pit";
          bb.modelCategoryNames[11] = "Crusher";
          bb.modelCategoryNames[20] = "Gas Vent";
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "wu.<init>()");
        }
    }

    public final TrapModel a(TrapPart param0, WorldBody param1, int param2) {
        TrapModel stackIn_31_0 = null;
        TrapModel stackIn_33_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        TrapModel var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4_int = 0;
          if (!(param1 instanceof db)) {
            if (param1 instanceof Trap) {
              if (param0 instanceof SnakePitBehaviour) {
                var4_int = 13;
              } else {
                if (param0 instanceof PitBehaviour) {
                  var4_int = 10;
                } else {
                  if (param0 instanceof CrusherBehaviour) {
                    var4_int = 11;
                  } else {
                    if (!(param0 instanceof ItemBehaviour)) {
                      if (!(param0 instanceof mra)) {
                        if (param0 instanceof SimpleBlockBehaviour &&
                          ((Trap) (param1)).d(true)) {
                          var4_int = 16;
                        } else {
                          if (!(param0 instanceof TouchSwitchBehaviour) &&
                            !(param0 instanceof PressureSwitchBehaviour)) {
                            if (param0 instanceof SwitchSource &&
                              !(param0 instanceof PlayerSensorBehaviour) &&
                              !(param0 instanceof TripBeamBehaviour)) {
                              var4_int = 3;
                            } else {
                              if (!(param0 instanceof PlatformBehaviour) &&
                                !(param0 instanceof PortalBehaviour)) {
                                var4_int = 0;
                              } else {
                                var4_int = 17;
                              }
                            }
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            var4_int = 9;
                          }
                        }
                      } else {
                        var4_int = 7;
                      }
                    } else {
                      var4_int = 12;
                    }
                  }
                }
              }
            }
          } else {
            var4_int = 15;
          }
          if (param2 >= -87) {
            stackIn_31_0 = (TrapModel) null;
            return stackIn_31_0;
          }
          var5 = this.createModel(var4_int, 118);
          var5.a(param1, -2159, param0);
          stackIn_33_0 = var5;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_37_0 = var4;
          stackIn_37_1 = new StringBuilder().append("wu.F(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_41_0 = stackIn_37_0;
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param1 == null) {
            stackIn_42_0 = stackIn_41_0;
            stackIn_42_2 = "null";
          } else {
            stackIn_42_0 = stackIn_37_0;
            stackIn_42_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
