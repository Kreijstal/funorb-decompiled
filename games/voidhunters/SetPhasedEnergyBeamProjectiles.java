/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetPhasedEnergyBeamProjectiles extends ConsoleCommand {
    static String[] field_o;

    final static TextureOperation createTextureOperation(boolean param0, int param1) {
        int var2;
        int var3;
        ResourceArchive var4;
        var3 = VoidHunters.field_G;
        if (param0) {
          var4 = (ResourceArchive) null;
          SetPhasedEnergyBeamProjectiles.createToolkitForCanvas(true, (java.awt.Canvas) null, -80, (TextureProvider) null, (ResourceArchive) null, 58);
        }
        var2 = param1;
        if (0 == var2) {
          return (TextureOperation) ((Object) new ConstantMonochromeTextureOperation());
        }
        if (1 == var2) {
          return (TextureOperation) ((Object) new ConstantColorTextureOperation());
        }
        if (var2 == 2) {
          return (TextureOperation) ((Object) new HorizontalGradientTextureOperation());
        }
        if (var2 == 3) {
          return (TextureOperation) ((Object) new VerticalGradientTextureOperation());
        }
        if (var2 == 4) {
          return (TextureOperation) ((Object) new BricksTextureOperation());
        }
        if (var2 == 5) {
          return (TextureOperation) ((Object) new BoxBlurTextureOperation());
        }
        if (6 == var2) {
          return (TextureOperation) ((Object) new ClampTextureOperation());
        }
        if (7 == var2) {
          return (TextureOperation) ((Object) new BlendModesTextureOperation());
        }
        if (var2 == 8) {
          return (TextureOperation) ((Object) new CurveTextureOperation());
        }
        if (9 == var2) {
          return (TextureOperation) ((Object) new FlipTextureOperation());
        }
        if (var2 == 10) {
          return (TextureOperation) ((Object) new ColorGradientTextureOperation());
        }
        if (var2 == 11) {
          return (TextureOperation) ((Object) new ColorizeTextureOperation());
        }
        if (12 == var2) {
          return (TextureOperation) ((Object) new WaveformTextureOperation());
        }
        if (var2 == 13) {
          return (TextureOperation) ((Object) new HashNoiseTextureOperation());
        }
        if (var2 == 14) {
          return (TextureOperation) ((Object) new WeaveTextureOperation());
        }
        if (15 == var2) {
          return (TextureOperation) ((Object) new CellularNoiseTextureOperation());
        }
        if (var2 == 16) {
          return (TextureOperation) ((Object) new HerringboneTextureOperation());
        }
        if (var2 == 17) {
          return (TextureOperation) ((Object) new HslAdjustTextureOperation());
        }
        if (18 == var2) {
          return (TextureOperation) ((Object) new TiledSpriteTextureOperation());
        }
        if (var2 == 19) {
          return (TextureOperation) ((Object) new PolarDisplacementTextureOperation());
        }
        if (var2 == 20) {
          return (TextureOperation) ((Object) new TileTextureOperation());
        }
        if (var2 == 21) {
          return (TextureOperation) ((Object) new BlendTextureOperation());
        }
        if (var2 == 22) {
          return (TextureOperation) ((Object) new InvertTextureOperation());
        }
        if (var2 == 23) {
          return (TextureOperation) ((Object) new KaleidoscopeTextureOperation());
        }
        if (var2 == 24) {
          return (TextureOperation) ((Object) new GrayscaleTextureOperation());
        }
        if (var2 == 25) {
          return (TextureOperation) ((Object) new ColorKeyScaleTextureOperation());
        }
        if (var2 == 26) {
          return (TextureOperation) ((Object) new ThresholdTextureOperation());
        }
        if (var2 == 27) {
          return (TextureOperation) ((Object) new StripesTextureOperation());
        }
        if (var2 == 28) {
          return (TextureOperation) ((Object) new IrregularBricksTextureOperation());
        }
        if (var2 == 29) {
          return (TextureOperation) ((Object) new RasterShapesTextureOperation());
        }
        if (var2 == 30) {
          return (TextureOperation) ((Object) new RangeTextureOperation());
        }
        if (var2 == 31) {
          return (TextureOperation) ((Object) new MandelbrotTextureOperation());
        }
        if (var2 == 32) {
          return (TextureOperation) ((Object) new DirectionalLightingTextureOperation());
        }
        if (var2 == 33) {
          return (TextureOperation) ((Object) new NormalMapTextureOperation());
        }
        if (34 == var2) {
          return (TextureOperation) ((Object) new PerlinNoiseTextureOperation());
        }
        if (35 == var2) {
          return (TextureOperation) ((Object) new EdgeMagnitudeTextureOperation());
        }
        if (36 == var2) {
          return (TextureOperation) ((Object) new TextureSourceOperation());
        }
        if (var2 == 37) {
          return (TextureOperation) ((Object) new CrossedWaveTextureOperation());
        }
        if (var2 == 38) {
          return (TextureOperation) ((Object) new RandomLinesTextureOperation());
        }
        if (39 == var2) {
          return (TextureOperation) ((Object) new SpriteTextureOperation());
        }
        return null;
    }

    final static GraphicsToolkit createToolkitForCanvas(boolean param0, java.awt.Canvas param1, int param2, TextureProvider param3, ResourceArchive param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        java.awt.Dimension var8 = null;
        GraphicsToolkit stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 0;
          var7 = 0;
          if (param0) {
            SetPhasedEnergyBeamProjectiles.createTextureOperation(false, 23);
          }
          if (param1 != null) {
            var8 = param1.getSize();
            var7 = var8.height;
            var6_int = var8.width;
          }
          stackIn_6_0 = GraphicsToolkit.create(var7, param4, param2, var6_int, param3, param1, 111, param5);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("hr.E(").append(param0).append(',');
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
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(')').toString());
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(84, 62, arguments[0].intValue(31));
          if (obfuscationGuard > -119) {
            field_o = (String[]) null;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hr.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetPhasedEnergyBeamProjectiles(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(ShipComponent param0, int param1) {
        try {
          param0.attachToHardpoint(1, 0, new ShipComponent(13));
          param0.attachToHardpoint(1, 8, new ShipComponent(13));
          param0.attachToHardpoint(1, 9, new ShipComponent(13));
          int var2_int = 21 % ((param1 - 57) / 55);
          param0.attachToHardpoint(1, 1, new ShipComponent(42));
          param0.attachToHardpoint(1, 7, new ShipComponent(42));
          param0.attachToHardpoint(1, 4, new ShipComponent(22));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hr.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_o = null;
        if (param0 >= -18) {
          SetPhasedEnergyBeamProjectiles.clearSharedReferences(21);
        }
    }

    final static void setTextureDimensions(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = VoidHunters.field_G;
        int var3_intLifetime1;
        try {
          if (param2 >= -65) {
            field_o = (String[]) null;
          }
          if (param1 != TextHotspotRegion.textureWidth) {
            BoxBlurTextureOperation.textureXCoordinates = new int[param1];
            for (var3_int = 0; var3_int < param1; var3_int++) {
              BoxBlurTextureOperation.textureXCoordinates[var3_int] = (var3_int << 12) / param1;
            }
            SetMassDriverEnergyUsed.field_q = param1 - 1;
            AccountRequestResult.field_b = 32 * param1;
            TextHotspotRegion.textureWidth = param1;
          }
          if (param0 != GetTorpedoReload.field_o) {
            if (TextHotspotRegion.textureWidth == param0) {
              SetSalvoUsesAllEnergy.textureYCoordinates = BoxBlurTextureOperation.textureXCoordinates;
            } else {
              SetSalvoUsesAllEnergy.textureYCoordinates = new int[param0];
              for (var3_intLifetime1 = 0; param0 > var3_intLifetime1; var3_intLifetime1++) {
                SetSalvoUsesAllEnergy.textureYCoordinates[var3_intLifetime1] = (var3_intLifetime1 << 12) / param0;
              }
            }
            wf.textureHeightMask = param0 - 1;
            GetTorpedoReload.field_o = param0;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hr.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
