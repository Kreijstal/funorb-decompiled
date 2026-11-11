/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SnakePitModel extends TrapModel {
    private SnakePitBehaviour field_p;
    private int field_q;
    private int field_o;
    private PitSnakeModel[] field_s;
    private SnakePitTile[][] field_r;
    static String field_m;
    static jua field_t;
    private int field_u;
    static byte[] field_n;

    final static AntialiasedBitmapFont loadAntialiasedFont(ResourceArchive param0, ResourceArchive param1, boolean param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        AntialiasedBitmapFont stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param0.getGroupId(param3, -7768);
          if (param2) {
            field_n = (byte[]) null;
          }
          var6 = param0.getFileId(true, param4, var5_int);
          stackIn_3_0 = sv.loadAntialiasedFont(param1, var5_int, param0, 24876, var6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("oo.I(");
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
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void removeFromLayer(int param0, RenderScene param1, byte param2) {
        int var5 = 0;
        int var4_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var4_intLifetime1;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_r != null) {
            for (var4_int = 0; var4_int < this.field_o; var4_int++) {
              for (var5 = 0; this.field_q > var5; var5++) {
                param1.removeFromLayer(param0, this.field_r[var4_int][var5], (byte) -33);
              }
            }
          }
          if (null != this.field_s) {
            var7 = 0;
            var4_intLifetime1 = var7;
            while (var7 < this.field_s.length) {
              param1.removeFromLayer(2, this.field_s[var7], (byte) -33);
              var7++;
            }
          }
          if (param2 <= 40) {
            field_m = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("oo.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final int getOccupancyLayer(byte param0) {
        if (param0 >= -63) {
          return -82;
        }
        return 0;
    }

    private final void buildTiles(int param0) {
        int var6 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int var3;
        int var4;
        int var5;
        int var7;
        SnakePitTile var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        Room var17;
        var16 = TombRacer.field_G ? 1 : 0;
        if (param0 != -3440) {
          this.field_r = (SnakePitTile[][]) null;
        }
        var17 = this.getRoom(param0 + 3494);
        var3 = this.body.getX(3);
        var4 = this.body.getY(9648);
        this.field_o = this.body.getWidth(param0 ^ 3403) / C2SSubmitSettingsPacket.field_a;
        this.field_q = this.body.getHeight((byte) 55) / C2SSubmitSettingsPacket.field_a;
        this.field_r = new SnakePitTile[this.field_o][this.field_q];
        var5 = -(this.body.getHeight((byte) 55) / 2) + (var4 + C2SSubmitSettingsPacket.field_a / 2);
        for (var6 = 0; var6 < this.field_q; var6++) {
          var7 = var3 - this.body.getWidth(-60) / 2 + C2SSubmitSettingsPacket.field_a / 2;
          for (var8 = 0; this.field_o > var8; var8++) {
            var9 = new SnakePitTile();
            this.field_r[var8][var6] = var9;
            stackIn_9_0 = (var8 <= 0) ? 0 : 1;
            var10 = stackIn_9_0;
            stackIn_12_0 = (var8 >= this.field_o - 1) ? 0 : 1;
            var11 = stackIn_12_0;
            stackIn_15_0 = (var6 <= 0) ? 0 : 1;
            var12 = stackIn_15_0;
            stackIn_18_0 = (this.field_q - 1 <= var6) ? 0 : 1;
            var13 = stackIn_18_0;
            var14 = 0;
            if (var10 != 0) {
              var14++;
            }
            if (var11 != 0) {
              var14++;
            }
            if (var12 != 0) {
              var14++;
            }
            if (var13 != 0) {
              var14++;
            }
            var15 = 0;
            switch (var14) {
              case 4:
                var9.field_f = 2;
                break;
              case 3:
                var9.field_f = 0;
                if (var12 == 0) {
                  var15 = 1024;
                } else {
                  if (var13 == 0) {
                    var15 = 0;
                  } else {
                    var15 = (var11 == 0) ? -512 : 512;
                  }
                }
                break;
              default:
                var9.field_f = 2;
                break;
              case 2:
                if (var10 == 0 &&
                  var12 == 0) {
                  var15 = 512;
                } else {
                  if (var10 == 0 &&
                    var13 == 0) {
                    var15 = 0;
                    var9.field_f = 1;
                    break;
                  }
                  if (var11 == 0 &&
                    var12 == 0) {
                    var15 = 1024;
                    var9.field_f = 1;
                    break;
                  }
                  if (var11 == 0) {
                    if (var13 != 0) {
                      var9.field_f = 1;
                      break;
                    }
                    var15 = -512;
                    var9.field_f = 1;
                    break;
                  }
                }
                var9.field_f = 1;
                break;
            }
            var9.field_c = var17.getSeededRandom(true).nextBounded(100, param0 + 3440);
            var9.snakePit = this;
            var9.field_e = GameScreen.positiveModulo(var15 + OpenGlTexture.field_d[var9.field_f], 2048, -78);
            var9.field_d = -var4 + var5;
            var9.field_b = var7 - var3;
            var7 = var7 + C2SSubmitSettingsPacket.field_a;
          }
          var5 = var5 + C2SSubmitSettingsPacket.field_a;
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param2 != 0) {
          field_m = (String) null;
        }
        return param1 / (1 << param0) * param3;
    }

    SnakePitModel(int param0) {
        super(param0);
        this.field_u = 20;
    }

    final int getSceneLayer(byte param0) {
        if (param0 != -99) {
          return -7;
        }
        return 2;
    }

    final void addToScene(int param0, RenderScene param1) {
        try {
          if (this.field_r == null) {
            this.buildTiles(-3440);
          }
          if (null == this.field_s) {
            this.createSnakeModels(-20687);
          }
          super.addToScene(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "oo.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void addToLayer(byte param0, int param1, RenderScene param2) {
        int var5 = 0;
        int var4_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var4_intLifetime1;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 <= 50) {
            this.getSceneLayer((byte) -70);
          }
          if (this.field_r != null) {
            for (var4_int = 0; this.field_o > var4_int; var4_int++) {
              for (var5 = 0; this.field_q > var5; var5++) {
                param2.addToLayer((byte) -100, param1, this.field_r[var4_int][var5]);
              }
            }
          }
          if (null != this.field_s) {
            var7 = 0;
            var4_intLifetime1 = var7;
            while (var7 < this.field_s.length) {
              param2.addToLayer((byte) -88, 2, this.field_s[var7]);
              var7++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("oo.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        field_m = null;
        int var1 = 93 / ((-49 - param0) / 61);
        field_t = null;
    }

    final void drawAt(Camera param0, int param1, int param2, int param3, byte param4) {
        try {
          int var6_int = 23 % ((param4 + 38) / 47);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "oo.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void mirror(int param0) {
        int var2 = 0;
        int var3 = 0;
        SnakePitTile var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        super.mirror(106);
        if (this.field_r == null) {
          return;
        }
        if (param0 < 0) {
          return;
        }
        for (var2 = 0; this.field_o > var2; var2++) {
          for (var3 = 0; this.field_q > var3; var3++) {
            var4 = this.field_r[var2][var3];
            var5 = OpenGlTexture.field_d[var4.field_f];
            var4.field_e = GameScreen.positiveModulo(var5 - var4.field_e, 2048, -102);
            var4.field_b = -var4.field_b;
          }
        }
    }

    static long bitwiseXor(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          var6_int = 8 + param3 + 8 + (param2 + 487);
          MatchProtocol.field_i.setBounds(var6_int - 6, -6 + era.field_e.field_t, -23776, 3, 3);
          var7 = -5 + MatchProtocol.field_i.field_t;
          if (param1 != -104) {
            SnakePitModel.a(-101, -90, 0, -88);
          }
          RotaterMountComponent.field_K.setBounds(2 + (485 + param2 + param3), param5, param1 - 23672, var7 - param5, 5);
          CharacterChoiceFactory.field_g.setBounds(-param2 + RotaterMountComponent.field_K.field_G - ComponentMount.field_b.field_G, param5, -23776, 0, param2);
          var7 = var7 - (2 + param5);
          ComponentMount.field_b.setBounds(ComponentMount.field_b.field_G, param5, -23776, 0, param2 + CharacterChoiceFactory.field_g.field_G);
          ne.field_d.setPaneBounds(param3 + (2 + param2) + 485, 2, (byte) 127, 5, param3, -5 + var7, 5);
          if (apa.field_c != null) {
            apa.field_c.setBounds((byte) -31, ne.field_d.field_G, ne.field_d.field_t, ne.field_d.field_qb, ne.field_d.field_T);
          }
          var8 = era.field_e.field_G - (param2 + var6_int);
          var9 = var8 / 2;
          var10 = var9 + (param0 + param2);
          var11 = 0;
          for (var12 = 0; var12 < 6; var12++) {
            if (var12 >= 5 ||
              null != OpenGlSceneLight.field_p[var12]) {
              var13 = 3 + var11 * (era.field_e.field_t - 6 + 2) / (gka.field_g + 1);
              var11++;
              var7Lifetime1 = -2 + (3 + var11 * (era.field_e.field_t - 6 + 2) / (1 + gka.field_g)) - var13;
              if (var12 >= 5) {
                ara.field_ub.setBounds(var8, var7Lifetime1, -23776, var13, var6_int);
              } else {
                OpenGlSceneLight.field_p[var12].setBounds(var8, var7Lifetime1, -23776, var13, var6_int);
                PitSnakeModel.field_c[var12].setBounds(var9 - param2, var7Lifetime1, -23776, 0, param2);
                MembersUpsellMenu.field_y[var12].setBounds(param0, -param4 + (var7Lifetime1 - param4), -23776, param4, var9);
                PitModel.field_p[var12].setBounds(-var10 + (var8 - param2), -param4 + (var7Lifetime1 - param4), -23776, param4, var10);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var6), "oo.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    SnakePitModel(int param0, Room param1, BitPacketBuffer param2) {
        super(param0, param1, param2);
        this.field_u = 20;
    }

    private final void createSnakeModels(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_p == null) {
          this.field_s = new PitSnakeModel[]{};
          return;
        }
        this.field_s = new PitSnakeModel[this.field_p.getSnakeCount(3)];
        if (param0 != -20687) {
          return;
        }
        for (var2 = 0; var2 < this.field_s.length; var2++) {
          this.field_s[var2] = new PitSnakeModel();
          this.field_s[var2].snakePit = this;
          this.field_s[var2].snake = this.field_p.getSnake(45, var2);
        }
    }

    final void tick(int param0) {
        SoundEventPlayer var2;
        int var3_int;
        Trap var3;
        Player var4;
        PlayerAnimator var5;
        int var6;
        SoundEventPlayer var7;
        var6 = TombRacer.field_G ? 1 : 0;
        super.tick(param0 ^ 0);
        if (this.field_s == null) {
          return;
        }
        var7 = (SoundEventPlayer) (this.getRoom(47).soundQueue);
        var2 = var7;
        if (var2 == null) {
          return;
        }
        if (0 < this.field_u) {
          this.field_u = this.field_u - 1;
        } else {
          this.field_u = uca.cosmeticRandom.nextBounded(100, 0) + 50;
          var3_int = uca.cosmeticRandom.nextBounded(this.field_s.length, ~param0);
          if (this.field_s[var3_int].snake.isScared(0)) {
            var2.play(new SoundEvent(24, this.field_s[var3_int].getRenderX((byte) -123), this.field_s[var3_int].getRenderY((byte) 94), this.field_s[var3_int].getRenderZ((byte) -112)), param0 - 57);
          } else {
            var7.play(new SoundEvent(23, this.field_s[var3_int].getRenderX((byte) -83), this.field_s[var3_int].getRenderY((byte) 122), this.field_s[var3_int].getRenderZ((byte) -107)), param0 - 57);
          }
        }
        var3 = (Trap) (this.body);
        if (var3 == null) {
          return;
        }
        var4 = var3.getPlayer(3);
        if (param0 != -1) {
          this.field_q = -26;
        }
        if (var4 == null) {
          return;
        }
        if (var3.intersectsRect((byte) 110, var4.getY(param0 ^ -9649), var4.getX(3), var4.getHeight((byte) 55), var4.getWidth(-30))) {
          var5 = var4.getAnimator((byte) -98);
          if (var5 == null) {
            return;
          }
          ((PlayerModel) (var5)).field_k = 1;
        }
        return;
    }

    final ToolkitModel getTileModel(boolean param0, SnakePitTile param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RenderScene var4 = null;
        ToolkitModel stackIn_9_0 = null;
        ToolkitModel stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var4 = (RenderScene) null;
            this.addToLayer((byte) -92, -110, (RenderScene) null);
          }
          var3_int = param1.field_f;
          if (var3_int != 0) {
            if (1 == var3_int) {
              if (param1.field_c >= 50) {
                return RevolverItemComponent.field_J[43];
              }
              stackIn_13_0 = RevolverItemComponent.field_J[42];
              return stackIn_13_0;
            }
            if (var3_int == 2) {
              return RevolverItemComponent.field_J[44];
            }
          }
          if (param1.field_c >= 50) {
            return RevolverItemComponent.field_J[41];
          }
          stackIn_9_0 = RevolverItemComponent.field_J[40];
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("oo.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int getWideOccupancyMode(byte param0) {
        int var2 = 94 / ((param0 - 15) / 45);
        return -1;
    }

    final void removeFromScene(RenderScene param0, int param1) {
        super.removeFromScene(param0, 118);
        if (param1 <= 82) {
          return;
        }
        try {
          this.field_r = (SnakePitTile[][]) null;
          this.field_s = null;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "oo.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void attach(TrapPart param0, WorldBody param1, byte param2) {
        try {
          super.attach(param0, param1, param2);
          if (param0 instanceof SnakePitBehaviour) {
            this.field_p = (SnakePitBehaviour) (param0);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "oo.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_m = "Status";
    }
}
