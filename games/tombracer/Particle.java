/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Particle extends PooledObject implements Renderable {
    private int field_t;
    private int z;
    private int x;
    private int accelerationY;
    private int accelerationX;
    private int lifetime;
    private int seed;
    private int kind;
    private int y;
    private int spin;
    private int velocityZ;
    private int velocityX;
    private int velocityY;
    private int endSize;
    private boolean expired;
    private int accelerationZ;
    private String text;
    private int angle;
    private int age;
    private int startSize;

    final int getEndSize(int param0) {
        if (param0 != -6782) {
          this.accelerationX = 74;
          return this.endSize;
        }
        return this.endSize;
    }

    public final int getRenderY(byte param0) {
        if (param0 <= 91) {
          this.getKind((byte) -91);
          return this.y;
        }
        return this.y;
    }

    final int getKind(byte param0) {
        if (param0 >= -80) {
          this.angle = -75;
          return this.kind;
        }
        return this.kind;
    }

    public final boolean isRenderExpired(byte param0) {
        if (param0 != 48) {
          this.angle = -112;
          return this.expired;
        }
        return this.expired;
    }

    final void setAngle(int param0, int param1) {
        int var3 = 54 % ((param0 + 70) / 51);
        this.setRotation(param1, 0, -105);
    }

    final void tick(int param0, boolean param1) {
        String var4 = null;
        String var4Lifetime1;
        if (this.expired) {
          return;
        }
        this.age = this.age + 1;
        this.velocityX = this.velocityX + this.accelerationX;
        this.velocityY = this.velocityY + this.accelerationY;
        this.velocityZ = this.velocityZ + this.accelerationZ;
        if (this.lifetime <= this.age) {
          this.expired = true;
          this.x = this.x + this.velocityX;
          if (param0 != -1) {
            var4 = (String) null;
            Particle.loadSpritesByName((String) null, (ResourceArchive) null, (String) null, -74);
            this.z = this.z + this.velocityZ;
            this.angle = this.angle + this.spin;
            this.y = this.y + this.velocityY;
            return;
          }
          this.z = this.z + this.velocityZ;
          this.angle = this.angle + this.spin;
          this.y = this.y + this.velocityY;
          return;
        }
        this.x = this.x + this.velocityX;
        if (param0 == -1) {
          this.z = this.z + this.velocityZ;
          this.angle = this.angle + this.spin;
          this.y = this.y + this.velocityY;
          return;
        }
        var4Lifetime1 = (String) null;
        Particle.loadSpritesByName((String) null, (ResourceArchive) null, (String) null, -74);
        this.z = this.z + this.velocityZ;
        this.angle = this.angle + this.spin;
        this.y = this.y + this.velocityY;
    }

    public final int getRenderZ(byte param0) {
        if (param0 >= -86) {
          this.spin = -74;
          return this.z;
        }
        return this.z;
    }

    final int getX(boolean param0) {
        if (!param0) {
          return -121;
        }
        return this.x;
    }

    final static Sprite[] loadSpritesByName(String param0, ResourceArchive param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        jg var6 = null;
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
          if (param3 >= -25) {
            var6 = (jg) null;
            Particle.a(0.712020754814148f, -6, 74, 40, -86, (byte[]) null, 1.6334935426712036f, 88, -0.9209427833557129f, (jg) null, 0.7779105305671692f, -124, 0.9752581119537354f);
          }
          var4_int = param1.getGroupId(param2, -7768);
          var5 = param1.getFileId(true, param0, var4_int);
          stackIn_3_0 = ScrollContainer.loadRgbSprites(var5, param1, -97, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("hr.NA(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void render(int param0, Camera param1) {
        try {
          DropAnimation.roomObjectRenderer.drawParticle(param1, (byte) -27, this);
          if (param0 < 103) {
            this.accelerationZ = -7;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "hr.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final PooledObject createInstance(boolean param0) {
        if (!param0) {
          this.setAngle(66, 88);
          return (PooledObject) ((Object) new Particle());
        }
        return (PooledObject) ((Object) new Particle());
    }

    final void addToScene(RenderScene param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 5465) {
            this.spin = 51;
          }
          if (this.z < 0) {
            param0.addToLayer((byte) 34, 2, (Renderable) (this));
            return;
          }
          param0.addToLayer((byte) -124, 7, (Renderable) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("hr.AA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final int d(int param0) {
        if (param0 <= 104) {
          return 23;
        }
        return this.field_t;
    }

    final void setText(int param0, int param1, String param2) {
        try {
          this.field_t = param1;
          this.text = param2;
          if (param0 != 0) {
            this.setRotation(33, 91, 93);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "hr.FA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int getSeed(int param0) {
        if (param0 != 0) {
          RenderScene var3 = (RenderScene) null;
          this.addToScene((RenderScene) null, 121);
          return this.seed;
        }
        return this.seed;
    }

    final int getZ(boolean param0) {
        if (!param0) {
          this.setSeed(true, -89);
          return this.z;
        }
        return this.z;
    }

    final void setRotation(int param0, int param1, int param2) {
        if (param2 <= -72) {
          this.spin = param1;
          this.angle = param0;
          return;
        }
        this.z = -104;
        this.spin = param1;
        this.angle = param0;
    }

    final int getY(int param0) {
        if (param0 != 0) {
          return -115;
        }
        return this.y;
    }

    public final void updateAnimation(int param0) {
        if (param0 != -4366) {
          this.accelerationX = 74;
        }
    }

    final int getLifetime(boolean param0) {
        if (!param0) {
          this.kind = 98;
          return this.lifetime;
        }
        return this.lifetime;
    }

    final static void a(float param0, int param1, int param2, int param3, int param4, byte[] param5, float param6, int param7, float param8, jg param9, float param10, int param11, float param12) {
        int var13_int = 0;
        int var14 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var13 = null;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          for (var13_int = param3; param11 > var13_int; var13_int++) {
            sj.a((byte) 79, param11, param1, param7, param8, param0, param5, param12, param10, param9, param4, param6, param2, var13_int);
            param2 = param2 + param7 * param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_7_0 = var13;
          stackIn_7_1 = new StringBuilder().append("hr.CB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    final String getText(boolean param0) {
        if (param0) {
          return (String) null;
        }
        return this.text;
    }

    final void setSeed(boolean param0, int param1) {
        if (!param0) {
          this.getX(true);
          this.seed = param1;
          return;
        }
        this.seed = param1;
    }

    final void mirrorInRoom(Room param0, int param1) {
        this.x = param0.mirrorX(this.x, (byte) 71);
        if (param1 >= -16) {
          return;
        }
        try {
          this.velocityX = -this.velocityX;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "hr.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean isExpired(int param0) {
        if (param0 != 18407) {
          this.getSeed(-128);
          return this.expired;
        }
        return this.expired;
    }

    final void setVelocity(int param0, int param1, int param2, int param3) {
        if (param2 < -82) {
          this.setMotion(param3, 0, param1, 0, param0, 0, (byte) -20);
          return;
        }
        String var6 = (String) null;
        this.setText(-115, -2, (String) null);
        this.setMotion(param3, 0, param1, 0, param0, 0, (byte) -20);
    }

    final void setPosition(int param0, byte param1, int param2, int param3) {
        this.x = param0;
        if (param1 != -78) {
          return;
        }
        this.y = param2;
        this.z = param3;
    }

    final void setPlanarVelocity(int param0, int param1, int param2) {
        this.setVelocity(0, param2, -128, param1);
        if (param0 <= 35) {
          this.getAngle((byte) -37);
        }
    }

    public final int getRenderX(byte param0) {
        int var2 = 76 % ((-23 - param0) / 53);
        return this.x;
    }

    final boolean hasText(int param0) {
        if (param0 != -847) {
          return true;
        }
        return this.text != null ? true : false;
    }

    final void setMotion(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        this.velocityX = param2;
        if (param6 == -20) {
          this.accelerationY = param1;
          this.accelerationZ = param5;
          this.accelerationX = param3;
          this.velocityY = param0;
          this.velocityZ = param4;
          return;
        }
    }

    final void configure(boolean param0, int param1, int param2, int param3, int param4) {
        this.velocityX = 0;
        this.endSize = param1;
        this.startSize = param3;
        this.expired = param0 ? true : false;
        this.accelerationY = 0;
        this.text = null;
        this.kind = param2;
        this.accelerationZ = 0;
        this.age = 0;
        this.angle = 0;
        this.velocityZ = 0;
        this.velocityY = 0;
        this.lifetime = param4;
        this.accelerationX = 0;
        this.spin = 0;
    }

    Particle() {
    }

    final int getAngle(byte param0) {
        if (param0 != -127) {
          return -88;
        }
        return this.angle;
    }

    final int getAge(int param0) {
        if (param0 != 0) {
          this.accelerationZ = -106;
          return this.age;
        }
        return this.age;
    }

    final int getStartSize(int param0) {
        if (param0 > -65) {
          this.isRenderExpired((byte) -106);
          return this.startSize;
        }
        return this.startSize;
    }

    static {
    }
}
