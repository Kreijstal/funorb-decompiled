/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MonsterModel extends MotionTrackingModel {
    static String field_A;
    private int field_z;
    private bua field_C;
    private int field_x;
    private boolean field_w;
    static float field_B;
    private boolean field_y;

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var7 = 0;
        ka var8 = null;
        if (this.field_C == null) {
          return;
        }
        try {
          int var6_int = 0 % ((-38 - param4) / 47);
          var7 = this.i(-6874);
          var8 = this.field_C.a(false, -1, false, (byte) 1);
          gqa.a(var7, -83584144, param1, param2, var8, param3);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "aka.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void decode(int param0, Room param1, BitPacketBuffer param2) {
        if (param0 <= 119) {
          return;
        }
        try {
          super.decode(123, param1, param2);
          this.field_x = param2.readBits((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "aka.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1) {
        int var3;
        int var4;
        int var5_int;
        w var5;
        nta var6;
        int var5_intLifetime1;
        super.a((byte) 51, param1);
        if (null == this.field_C) {
          return;
        }
        var4 = 2 / ((7 - param0) / 36);
        var3 = 0;
        var5_int = this.field_x;
        if (var5_int == 0) {
          if (param1 == 4) {
            return;
          }
          this.field_C.a(6, -23308, 1);
          var3 = -1;
          this.field_C.a(1, true, (byte) -101, 3);
        }
        if (var3 != 0) {
          var5_intLifetime1 = this.i(-6874);
          var6 = new nta(this.getRenderX((byte) 40), this.getRenderY((byte) 123), this.getRenderZ((byte) -96), this.field_C, var5_intLifetime1, var3);
          var6.a((byte) -113, this.body.getRoom((byte) -109).getScene((byte) -118), this.getSceneLayer((byte) -99));
        }
        var5 = (w) (this.body.getRoom((byte) -99).field_G);
        if (var5 == null) {
          return;
        }
        if (param1 == 3) {
          var5.a(new fm(78, this.getRenderX((byte) 71), this.getRenderY((byte) 106), this.getRenderZ((byte) -91)), -58);
          return;
        }
        if (param1 != 2) {
          return;
        }
        var5.a(new fm(80, this.getRenderX((byte) 90), this.getRenderY((byte) 94), this.getRenderZ((byte) -108)), -58);
        return;
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= 80) {
          field_A = (String) null;
          field_A = null;
          return;
        }
        field_A = null;
    }

    final void removeFromScene(RenderScene param0, int param1) {
        try {
          if (param1 < 82) {
            this.field_C = (bua) null;
          }
          super.removeFromScene(param0, 93);
          this.field_C = null;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "aka.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void addToScene(int param0, RenderScene param1) {
        int var3_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.addToScene(param0 ^ param0, param1);
          var3_int = this.field_x;
          if (var3_int == 0) {
            this.field_C = new bua(6, 0, 0);
            this.field_C.a(1, true, (byte) -121, 1);
            this.field_C.a(false, 176);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("aka.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void j(int param0) {
        if (param0 != 28191) {
          return;
        }
        ScrollControlWidget.a(OpenGlTransform3D.field_f, 0, Corpse.field_i, rfa.field_C, WallModel.field_r);
    }

    final void attach(TrapPart param0, WorldBody param1, byte param2) {
        try {
          super.attach(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "aka.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    MonsterModel(int param0, Room param1, BitPacketBuffer param2) {
        super(param0, param1, param2);
        this.field_w = false;
        this.field_z = 0;
        this.field_y = false;
    }

    public final void updateAnimation(int param0) {
        int var2;
        int var3;
        int var4;
        int var5_int;
        w var5;
        int var7;
        int var8;
        Trap var9;
        Trap var10;
        Trap var11;
        Trap var12;
        Trap var13;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        var8 = TombRacer.field_G ? 1 : 0;
        super.updateAnimation(param0 ^ 0);
        if (null == this.field_C) {
          return;
        }
        var2 = this.isMoving(true) ? 1 : 0;
        var3 = this.b(false);
        var4 = 1;
        var5_int = this.field_x;
        if (0 == var5_int) {
          if (var2 == 0 &&
            var3 > 5) {
            var4 = 0;
          }
          this.field_C.a(1, false, (byte) -114, var4);
        }
        this.field_C.a(param0 ^ param0);
        var5 = (w) (this.body.getRoom((byte) -79).field_G);
        if (var5 == null) {
          return;
        }
        if (var4 != 1) {
          this.field_z = 0;
          if (!this.field_y) {
            if (!this.body.isFallingIntoPit(-1)) {
              var12 = (Trap) (this.body);
              if (var12 == null) {
                return;
              }
              var7 = var12.intersectsRect((byte) 110, var12.getPlayer(param0 ^ -4445).getY(param0 ^ -13502), var12.getPlayer(66).getX(param0 ^ -4367), var12.getPlayer(-128).getHeight((byte) 55), var12.getPlayer(-120).getWidth(-125)) ? 1 : 0;
              if (var7 != 0 &&
                !this.field_w) {
                var5.a(new fm(81, this.getRenderX((byte) 56), this.getRenderY((byte) 99), this.getRenderZ((byte) -117)), -58);
                this.field_w = true;
              }
              if (var7 == 0 &&
                this.field_w) {
                this.field_w = false;
              }
              return;
            }
            var5.a(new fm(79, this.getRenderX((byte) -112), this.getRenderY((byte) 121), this.getRenderZ((byte) -119)), param0 + 4308);
            this.field_y = true;
          }
          var13 = (Trap) (this.body);
          if (var13 == null) {
            return;
          }
          var7Lifetime4 = var13.intersectsRect((byte) 110, var13.getPlayer(param0 ^ -4445).getY(param0 ^ -13502), var13.getPlayer(66).getX(param0 ^ -4367), var13.getPlayer(-128).getHeight((byte) 55), var13.getPlayer(-120).getWidth(-125)) ? 1 : 0;
          if (var7Lifetime4 != 0) {
            if (this.field_w) {
              if (var7Lifetime4 == 0 &&
                this.field_w) {
                this.field_w = false;
              }
              return;
            }
            var5.a(new fm(81, this.getRenderX((byte) 56), this.getRenderY((byte) 99), this.getRenderZ((byte) -117)), -58);
            this.field_w = true;
          }
          if (var7Lifetime4 != 0) {
            return;
          }
          if (!this.field_w) {
            return;
          }
          this.field_w = false;
          return;
        }
        if (this.field_z == 20) {
          var5.a(new fm(77, this.getRenderX((byte) 49), this.getRenderY((byte) 108), this.getRenderZ((byte) -87)), -58);
          this.field_z = 0;
          if (!this.field_y &&
            this.body.isFallingIntoPit(-1)) {
            var5.a(new fm(79, this.getRenderX((byte) -112), this.getRenderY((byte) 121), this.getRenderZ((byte) -119)), param0 + 4308);
            this.field_y = true;
          }
          var11 = (Trap) (this.body);
          if (var11 == null) {
            return;
          }
          var7Lifetime1 = var11.intersectsRect((byte) 110, var11.getPlayer(param0 ^ -4445).getY(param0 ^ -13502), var11.getPlayer(66).getX(param0 ^ -4367), var11.getPlayer(-128).getHeight((byte) 55), var11.getPlayer(-120).getWidth(-125)) ? 1 : 0;
          if (var7Lifetime1 != 0) {
            if (!this.field_w) {
              var5.a(new fm(81, this.getRenderX((byte) 56), this.getRenderY((byte) 99), this.getRenderZ((byte) -117)), -58);
              this.field_w = true;
            }
            if (var7Lifetime1 == 0 &&
              this.field_w) {
              this.field_w = false;
            }
          } else {
            if (this.field_w) {
              this.field_w = false;
            }
          }
          return;
        }
        this.field_z = this.field_z + 1;
        if (this.field_y) {
          var9 = (Trap) (this.body);
          if (var9 == null) {
            return;
          }
          var7Lifetime2 = var9.intersectsRect((byte) 110, var9.getPlayer(param0 ^ -4445).getY(param0 ^ -13502), var9.getPlayer(66).getX(param0 ^ -4367), var9.getPlayer(-128).getHeight((byte) 55), var9.getPlayer(-120).getWidth(-125)) ? 1 : 0;
          if (var7Lifetime2 != 0) {
            if (!this.field_w) {
              var5.a(new fm(81, this.getRenderX((byte) 56), this.getRenderY((byte) 99), this.getRenderZ((byte) -117)), -58);
              this.field_w = true;
            }
            if (var7Lifetime2 == 0 &&
              this.field_w) {
              this.field_w = false;
            }
          } else {
            if (this.field_w) {
              this.field_w = false;
            }
          }
          return;
        }
        if (this.body.isFallingIntoPit(-1)) {
          var5.a(new fm(79, this.getRenderX((byte) -112), this.getRenderY((byte) 121), this.getRenderZ((byte) -119)), param0 + 4308);
          this.field_y = true;
        }
        var10 = (Trap) (this.body);
        if (var10 == null) {
          return;
        }
        var7Lifetime3 = var10.intersectsRect((byte) 110, var10.getPlayer(param0 ^ -4445).getY(param0 ^ -13502), var10.getPlayer(66).getX(param0 ^ -4367), var10.getPlayer(-128).getHeight((byte) 55), var10.getPlayer(-120).getWidth(-125)) ? 1 : 0;
        if (var7Lifetime3 == 0) {
          if (this.field_w) {
            this.field_w = false;
          }
        } else {
          if (!this.field_w) {
            var5.a(new fm(81, this.getRenderX((byte) 56), this.getRenderY((byte) 99), this.getRenderZ((byte) -117)), -58);
            this.field_w = true;
          }
          if (var7Lifetime3 == 0 &&
            this.field_w) {
            this.field_w = false;
          }
        }
        return;
    }

    private final int i(int param0) {
        if (param0 == -6874) {
          return GameScreen.positiveModulo(-this.body.getFacingAngle(param0 - 18913) >> 2, 2048, param0 ^ -6797);
        }
        return -83;
    }

    final void b(int param0, int param1) {
        this.field_x = param1;
        if (param0 < 28) {
          this.field_z = -120;
        }
    }

    MonsterModel(int param0) {
        super(param0);
        this.field_w = false;
        this.field_z = 0;
        this.field_y = false;
    }

    final void encode(byte param0, BitPacketBuffer param1) {
        try {
          super.encode((byte) 98, param1);
          param1.writeBits((byte) -5, this.field_x, 4);
          int var3_int = 102 % ((param0 + 8) / 40);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "aka.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_A = "Blade Launcher";
    }
}
