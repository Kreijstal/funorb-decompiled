/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TreasureValuesOverlay extends MatchOverlay {
    private int field_j;
    private int field_m;
    static Object field_l;
    static String field_k;
    private int field_n;

    final void b(byte param0) {
        int var9 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        int var15;
        int var11;
        int var12;
        int var13;
        int var14;
        var15 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_i.getViewedPlayerIndex(106);
        if (param0 >= -13) {
          return;
        }
        var3 = 16776960;
        var4 = 11184810;
        var5 = 20;
        var6 = 50 + this.field_g.playersRemaining * var5;
        var7 = this.field_j;
        var8 = var7 + 40;
        SecondaryNodeDequeIterator.a(192, var6, 3145728, this.field_n, (byte) 47, var7 - 16, this.field_m - this.field_n / 2);
        WhiteLightShooterComponent.a(-(this.field_n / 2) + this.field_m, (byte) -85, var7 - 16, 5242880, 2, var6, this.field_n);
        MembersUpsellMenu.a(wj.field_b, 16777215, kn.field_p, -1, var7 + 4, this.field_m, 0);
        for (var9 = 0; var9 < this.field_g.players.length; var9++) {
          var10 = this.field_g.field_e.field_b[var9];
          if (var10 != -1) {
            if (var10 == var2) {
              var11 = var3;
            } else {
              var11 = var4;
            }
            var12 = this.field_g.players[var10].getTotal(false);
            var13 = this.field_g.players[var10].j(false);
            var14 = var13 + var12;
            MembersUpsellMenu.a(rka.a(1 + var9, 114) + "  " + this.field_i.getPlayerName(var10, false) + "  " + PrimMazeGenerator.field_c + ": " + var14 + " (" + var12 + "+" + var13 + ")", var11, kn.field_p, -1, var8 + var9 * var5, this.field_m, 0);
          }
        }
    }

    public static void releaseStatics(int param0) {
        field_k = null;
        if (param0 != -28) {
          field_l = (Object) null;
        }
        field_l = null;
    }

    final static TextureOperator createTextureOperator(byte param0, int param1) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 > 0) {
          TreasureValuesOverlay.releaseStatics(-61);
        }
        var2 = param1;
        if (var2 == 0) {
          return (TextureOperator) ((Object) new MonochromeFillOperator());
        }
        if (var2 == 1) {
          return (TextureOperator) ((Object) new ColourFillOperator());
        }
        if (var2 == 2) {
          return (TextureOperator) ((Object) new HorizontalGradientOperator());
        }
        if (var2 == 3) {
          return (TextureOperator) ((Object) new VerticalGradientOperator());
        }
        if (var2 == 4) {
          return (TextureOperator) ((Object) new BrickOperator());
        }
        if (var2 == 5) {
          return (TextureOperator) ((Object) new BoxBlurOperator());
        }
        if (var2 == 6) {
          return (TextureOperator) ((Object) new ClampOperator());
        }
        if (var2 == 7) {
          return (TextureOperator) ((Object) new BlendModeOperator());
        }
        if (var2 == 8) {
          return (TextureOperator) ((Object) new CurveOperator());
        }
        if (var2 == 9) {
          return (TextureOperator) ((Object) new FlipOperator());
        }
        if (var2 == 10) {
          return (TextureOperator) ((Object) new ColourGradientOperator());
        }
        if (var2 == 11) {
          return (TextureOperator) ((Object) new ColouriseOperator());
        }
        if (var2 == 12) {
          return (TextureOperator) ((Object) new WaveformOperator());
        }
        if (var2 == 13) {
          return (TextureOperator) ((Object) new WhiteNoiseOperator());
        }
        if (var2 == 14) {
          return (TextureOperator) ((Object) new BevelOperator());
        }
        if (var2 == 15) {
          return (TextureOperator) ((Object) new VoronoiNoiseOperator());
        }
        if (var2 == 16) {
          return (TextureOperator) ((Object) new WeaveOperator());
        }
        if (var2 == 17) {
          return (TextureOperator) ((Object) new HslAdjustOperator());
        }
        if (var2 == 18) {
          return (TextureOperator) ((Object) new SpriteTileOperator());
        }
        if (var2 == 19) {
          return (TextureOperator) ((Object) new DisplacementOperator());
        }
        if (var2 == 20) {
          return (TextureOperator) ((Object) new TileOperator());
        }
        if (var2 == 21) {
          return (TextureOperator) ((Object) new MaskBlendOperator());
        }
        if (var2 == 22) {
          return (TextureOperator) ((Object) new InvertOperator());
        }
        if (var2 == 23) {
          return (TextureOperator) ((Object) new KaleidoscopeOperator());
        }
        if (24 == var2) {
          return (TextureOperator) ((Object) new GreyscaleOperator());
        }
        if (var2 == 25) {
          return (TextureOperator) ((Object) new ColourKeyOperator());
        }
        if (var2 == 26) {
          return (TextureOperator) ((Object) new ThresholdOperator());
        }
        if (var2 == 27) {
          return (TextureOperator) ((Object) new StripesOperator());
        }
        if (28 == var2) {
          return (TextureOperator) ((Object) new RandomBrickOperator());
        }
        if (29 == var2) {
          return (TextureOperator) ((Object) new RasterizerOperator());
        }
        if (var2 == 30) {
          return (TextureOperator) ((Object) new RangeOperator());
        }
        if (var2 == 31) {
          return (TextureOperator) ((Object) new MandelbrotOperator());
        }
        if (32 == var2) {
          return (TextureOperator) ((Object) new EmbossOperator());
        }
        if (var2 == 33) {
          return (TextureOperator) ((Object) new NormalMapOperator());
        }
        if (var2 == 34) {
          return (TextureOperator) ((Object) new PerlinNoise2D());
        }
        if (var2 == 35) {
          return (TextureOperator) ((Object) new EdgeDetectOperator());
        }
        if (var2 == 36) {
          return (TextureOperator) ((Object) new TextureSampleOperator());
        }
        if (var2 == 37) {
          return (TextureOperator) ((Object) new CrossedSineBandsOperator());
        }
        if (38 == var2) {
          return (TextureOperator) ((Object) new LineNoiseOperator());
        }
        if (39 == var2) {
          return (TextureOperator) ((Object) new SpriteSampleOperator());
        }
        return null;
    }

    final static void a(int param0, boolean param1, String param2, String param3, String param4, int param5) {
        gqa var6 = null;
        try {
          if (!param1) {
            String var7 = (String) null;
            TreasureValuesOverlay.a(-67, true, (String) null, (String) null, (String) null, 15);
          }
          var6 = new gqa(param5, param2, param0, param4, param3);
          DivisionMazeGenerator.appendChatHistory(16599, var6);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gu.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    TreasureValuesOverlay(MatchScreen param0) {
        super(param0);
        this.field_j = 350;
        this.field_m = 320;
        this.field_n = 300;
    }

    final void a(byte param0) {
        if (param0 > -107) {
          this.a((byte) -84);
        }
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = -43 % ((29 - param2) / 57);
        return false;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return true;
        }
        return false;
    }

    static {
        field_k = "Hold <img=8><img=9> while walking into a moveable block to grab it, then push or pull it around the room. Release <img=8><img=9> to let go.";
    }
}
