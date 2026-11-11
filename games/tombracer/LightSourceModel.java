/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LightSourceModel extends TrapModel {
    private int field_q;
    static int field_p;
    private jaa field_n;
    private int field_m;
    private int field_o;
    private LightSource field_s;
    private boolean field_r;

    final void tick(int param0) {
        mra var4 = null;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != -1) {
          return;
        }
        if (null == this.field_s) {
          return;
        }
        if (this.body == null) {
          this.k(param0 ^ -24643);
          return;
        }
        this.field_s.setPosition(this.getRenderZ((byte) -123), (byte) 127, this.getRenderY((byte) 105), this.getRenderX((byte) -117));
        if (this.body.isExpired(18407)) {
          this.k(24642);
          return;
        }
        if (this.part == null) {
          return;
        }
        if (this.part.isStopped((byte) 87)) {
          this.k(24642);
          return;
        }
        if (this.part instanceof mra) {
          var4 = (mra) ((Object) this.part);
          if (!var4.b(-90)) {
            this.i(94);
            return;
          }
          this.a(false);
          return;
        }
        if (!this.part.isEnabled(param0 - 85)) {
          this.i(-34);
          return;
        }
        this.a(false);
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        this.field_r = param3 ? true : false;
        this.field_o = param0;
        this.field_q = param1;
        if (param2 != 1) {
          this.field_m = -128;
        }
    }

    private final void i(int param0) {
        if (this.field_s.isDisabled(1)) {
          return;
        }
        int var2 = -54 / ((param0 - 45) / 47);
        if (this.field_s == null) {
          return;
        }
        this.field_s.setDisabled(true, 1011094480);
    }

    private final void k(int param0) {
        if (param0 != 24642) {
          return;
        }
        if (null != this.field_s) {
          this.field_s.e(2);
          this.field_s = null;
        }
    }

    private final void a(boolean param0) {
        if (!this.field_s.isDisabled(1)) {
          return;
        }
        if (!param0) {
          if (null != this.field_s) {
            this.field_s.setDisabled(false, 1011094480);
          }
          return;
        }
        RenderScene var3 = (RenderScene) null;
        this.removeFromLayer(81, (RenderScene) null, (byte) -45);
        if (null != this.field_s) {
          this.field_s.setDisabled(false, 1011094480);
        }
    }

    final int getSceneLayer(byte param0) {
        if (param0 != -99) {
          this.field_m = -101;
          return 8;
        }
        return 8;
    }

    final void addToLayer(byte param0, int param1, RenderScene param2) {
        try {
          this.j(0);
          if (param0 <= 50) {
            field_p = -20;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gaa.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void j(int param0) {
        RenderScene var3;
        RenderListener var4;
        RoomLighting var5;
        int var6;
        int var7;
        int var8;
        Room var9;
        AnimatedLight var10;
        AnimatedLight var11;
        AnimatedLight var12;
        AnimatedLight var13;
        AnimatedLight var14;
        AnimatedLight var15;
        AnimatedLight var16;
        AnimatedLight var17;
        AnimatedLight var18;
        AnimatedLight var19;
        AnimatedLight var20;
        AnimatedLight var21;
        AnimatedLight var22;
        AnimatedLight var23;
        AnimatedLight var24;
        AnimatedLight var25;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = TombRacer.field_G ? 1 : 0;
        if (this.field_s != null) {
          return;
        }
        if (this.body == null) {
          return;
        }
        var9 = this.body.getRoom((byte) -86);
        var3 = var9.getScene((byte) -105);
        if (var3 == null) {
          return;
        }
        var4 = var3.getListener((byte) 59);
        if (!(var4 instanceof RoomLighting)) {
          return;
        }
        var5 = (RoomLighting) (var4);
        var6 = 0;
        var7 = this.field_q;
        if (var7 == 0) {
          var6 = 0;
          var11 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
          this.field_s = new LightSource(var11);
          this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
          if (this.field_r) {
            this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
          }
          var5.addLightSource((byte) 45, this.field_s);
          return;
        }
        if (var7 == 1) {
          var7 = this.field_o;
          if (var7 == 0) {
            var6 = 16;
            var13 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
            this.field_s = new LightSource(var13);
            this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
            if (this.field_r) {
              this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
            }
            var5.addLightSource((byte) 45, this.field_s);
            return;
          }
          if (1 == var7) {
            var6 = 15;
            var14 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
            this.field_s = new LightSource(var14);
            this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
            if (this.field_r) {
              this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
            }
            var5.addLightSource((byte) 45, this.field_s);
            return;
          }
          if (2 != var7) {
            var12 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
            this.field_s = new LightSource(var12);
            this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
            if (this.field_r) {
              this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
            }
            var5.addLightSource((byte) 45, this.field_s);
            return;
          }
          var6 = 14;
          var15 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
          this.field_s = new LightSource(var15);
          this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
          if (this.field_r) {
            this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
          }
          var5.addLightSource((byte) 45, this.field_s);
          return;
        }
        if (var7 == 2) {
          var7 = this.field_o;
          if (var7 == 0) {
            var6 = 11;
            var17 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
            this.field_s = new LightSource(var17);
            this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
            if (this.field_r) {
              this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
            }
            var5.addLightSource((byte) 45, this.field_s);
            return;
          }
          if (var7 == 1) {
            var6 = 7;
            var18 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
            this.field_s = new LightSource(var18);
            this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
            if (this.field_r) {
              this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
            }
            var5.addLightSource((byte) 45, this.field_s);
            return;
          }
          if (2 != var7) {
            var16 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
            this.field_s = new LightSource(var16);
            this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
            if (this.field_r) {
              this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
            }
            var5.addLightSource((byte) 45, this.field_s);
            return;
          }
          var6 = 9;
          var19 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
          this.field_s = new LightSource(var19);
          this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
          if (this.field_r) {
            this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
          }
          var5.addLightSource((byte) 45, this.field_s);
          return;
        }
        if (var7 != 3) {
          if (var7 == 4) {
            var6 = 5;
            var24 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
            this.field_s = new LightSource(var24);
            this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
            if (this.field_r) {
              this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
            }
            var5.addLightSource((byte) 45, this.field_s);
            return;
          }
          if (var7 != 5) {
            var10 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
            this.field_s = new LightSource(var10);
            this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
            if (this.field_r) {
              this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
            }
            var5.addLightSource((byte) 45, this.field_s);
            return;
          }
          var6 = 4;
          var25 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
          this.field_s = new LightSource(var25);
          this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
          if (this.field_r) {
            this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
          }
          var5.addLightSource((byte) 45, this.field_s);
          return;
        }
        var7Lifetime1 = this.field_o;
        if (var7Lifetime1 == 0) {
          var6 = 10;
          var21 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
          this.field_s = new LightSource(var21);
          this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
          if (this.field_r) {
            this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
          }
          var5.addLightSource((byte) 45, this.field_s);
          return;
        }
        if (1 == var7Lifetime1) {
          var6 = 6;
          var22 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
          this.field_s = new LightSource(var22);
          this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
          if (this.field_r) {
            this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
          }
          var5.addLightSource((byte) 45, this.field_s);
          return;
        }
        if (var7Lifetime1 != 2) {
          var20 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
          this.field_s = new LightSource(var20);
          this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
          if (this.field_r) {
            this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
          }
          var5.addLightSource((byte) 45, this.field_s);
          return;
        }
        var6Lifetime1 = 8;
        var23 = new AnimatedLight(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6Lifetime1);
        this.field_s = new LightSource(var23);
        this.field_s.setPosition(this.getRenderZ((byte) -121), (byte) 110, this.getRenderY((byte) 107), this.getRenderX((byte) -95));
        if (this.field_r) {
          this.field_s.b(uca.cosmeticRandom.nextBounded(50000, 0), 0);
        }
        var5.addLightSource((byte) 45, this.field_s);
        return;
    }

    final void removeFromLayer(int param0, RenderScene param1, byte param2) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 < 40) {
            this.field_s = (LightSource) null;
            this.k(24642);
          } else {
            this.k(24642);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("gaa.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final void attach(TrapPart param0, WorldBody param1, byte param2) {
        try {
          super.attach(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gaa.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    LightSourceModel(int param0, Room param1, BitPacketBuffer param2) {
        super(param0, param1, param2);
    }

    final void encode(byte param0, BitPacketBuffer param1) {
        try {
          super.encode((byte) -65, param1);
          int var3_int = 46 / ((param0 + 8) / 40);
          param1.writeBits((byte) 0, this.field_q, 4);
          param1.writeBits((byte) 19, this.field_o, 2);
          param1.writeBits((byte) -127, this.field_r ? 1 : 0, 1);
          param1.writeBits((byte) 74, this.field_m / 8, 8);
          if (this.field_n == null) {
            this.field_n = new jaa(false, Obstacle.field_l);
          }
          this.field_n.a(0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gaa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        this.field_m = param1;
        if (param0 != 1) {
          this.field_q = -24;
        }
    }

    final void decode(int param0, Room param1, BitPacketBuffer param2) {
        super.decode(127, param1, param2);
        if (!(param1.formatVersion >= 18)) {
          return;
        }
        this.field_q = param2.readBits((byte) 44, 4);
        this.field_o = param2.readBits((byte) 44, 2);
        this.field_r = 1 == param2.readBits((byte) 44, 1) ? true : false;
        if (param0 < 119) {
          return;
        }
        try {
          this.field_r = true;
          this.field_m = param2.readBits((byte) 44, 8) * 8;
          this.field_n = new jaa(false, Obstacle.field_l, param1.formatVersion, param2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gaa.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(float param0, float param1, int param2, jg param3, int param4, int param5, float param6, int param7, int param8, float param9, float param10) {
        byte[] var11 = null;
        RuntimeException var11_ref = null;
        byte[] var12 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var12 = new byte[param7 * (param2 * param5)];
          var11 = var12;
          Particle.a(param0, param2, 0, 0, param4, var12, param1, param5, param6, param3, param9, param7, param10);
          if (param8 == 4) {
            stackIn_4_0 = var12;
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11_ref = decompiledCaughtException;
          stackIn_7_0 = var11_ref;
          stackIn_7_1 = new StringBuilder().append("gaa.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    LightSourceModel(int param0) {
        super(param0);
        this.field_n = new jaa(false, Obstacle.field_l);
        this.field_r = true;
        this.field_m = 128;
    }

    final void a(boolean param0, int param1) {
        this.field_n.a(false, param1);
        if (!param0) {
          this.j(8);
        }
    }

    final void drawAt(Camera param0, int param1, int param2, int param3, byte param4) {
        try {
          int var6_int = -34 / ((param4 + 38) / 47);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gaa.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_p = 250;
    }
}
